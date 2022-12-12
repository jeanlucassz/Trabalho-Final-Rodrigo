package trabalho1;

import javax.swing.JOptionPane;

public class JFrameWithdrawAccount extends javax.swing.JFrame {
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textNAccount;
    private javax.swing.JTextField textAmmount;

    Account account;
    SavingsAccount savingsAccount;
    SpecialAccount specialAccount;

    /**
     *
     * @param account
     * @param savingsAccount
     * @param specialAccount
     */
    public JFrameWithdrawAccount ( Account account, SavingsAccount savingsAccount, SpecialAccount specialAccount ) {
        this.account = account;
        this.savingsAccount = savingsAccount;
        this.specialAccount = specialAccount;
        initComponents();
        this.setLocationRelativeTo( null );
    }

    @SuppressWarnings( "unchecked" )
    private void initComponents () {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNAccount = new javax.swing.JTextField();
        textAmmount = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

        jLabel1.setFont( new java.awt.Font( "Ubuntu", 1, 20 ) );
        jLabel1.setText( "Saque:" );

        jLabel2.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) );
        jLabel2.setText( "Nº da account:" );

        jLabel3.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) );
        jLabel3.setText( "Valor R$:" );

        buttonOk.setText( "Ok" );
        buttonOk.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonOkActionPerformed( evt );
            }
        } );

        buttonMenu.setText( "Menu" );
        buttonMenu.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonMenuActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap( 0, 0, Short.MAX_VALUE )
                            .addComponent( jLabel1 )
                            .addGap( 90, 90, 90 ) )
                        .addGroup( layout.createSequentialGroup()
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( jLabel2 )
                                .addComponent( jLabel3 )
                                .addComponent( buttonOk, javax.swing.GroupLayout.Alignment.TRAILING ) )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                .addComponent( textAmmount, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE )
                                .addComponent( buttonMenu )
                                .addComponent( textNAccount ) )
                            .addContainerGap( 38, Short.MAX_VALUE ) ) ) )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent( jLabel1 )
                    .addGap( 18, 18, 18 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( textNAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( jLabel2 ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( textAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( jLabel3 ) )
                    .addGap( 53, 53, 53 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( buttonOk )
                        .addComponent( buttonMenu ) )
                    .addContainerGap( 21, Short.MAX_VALUE ) )
        );

        pack();
    }

    private void buttonOkActionPerformed ( java.awt.event.ActionEvent evt ) {
        int flag;
        if ( Integer.parseInt( textNAccount.getText() ) == account.getNumber() ) {
            //FLAG RECEIVES THE VALUE CHOSEN BY THE USER
            flag = JOptionPane.showConfirmDialog( null, account.getName() + ", você confirma essa operação ?", "Saque", JOptionPane.YES_NO_OPTION );
            if ( flag == JOptionPane.YES_OPTION ) {
                JFrameStart inicio = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
                // VERIFY IF THE BALANCE IS LESS THAN THE REQUESTED WITHDRAWAL AMOUNT..
                if ( account.getBalance() < Double.parseDouble( textAmmount.getText() ) ) {
                    JOptionPane.showMessageDialog( null, "Saldo insuficiente.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                } else {
                    account.withdrawAccount( Double.parseDouble( textAmmount.getText() ) );
                    JOptionPane.showMessageDialog( null, "Saque efetuado com sucesso.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                }
                // CLOSE WINDOW AND RETURN MENU
                this.setVisible( false );
                inicio.setVisible( true );
            } else {// OPERATION CANCELED
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Saque", JOptionPane.INFORMATION_MESSAGE );
            }

        } else// VERIFY IF ACCOUNT NUMBER IS EQUAL
            if ( Integer.parseInt( textNAccount.getText() ) == savingsAccount.getNumber() ) {
                flag = JOptionPane.showConfirmDialog( null, savingsAccount.getName() + ", você confirma essa operação ?", "Saque", JOptionPane.YES_NO_OPTION );
                if ( flag == JOptionPane.YES_OPTION ) {
                    JFrameStart inicio = new JFrameStart( this.account, savingsAccount, this.specialAccount );

                    if ( savingsAccount.getBalance() < Double.parseDouble( textAmmount.getText() ) ) {
                        JOptionPane.showMessageDialog( null, "Saldo insuficiente.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                    } else {
                        savingsAccount.withdrawAccount( Double.parseDouble( textAmmount.getText() ) );
                        JOptionPane.showMessageDialog( null, "Saque efetuado com sucesso.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                    }
                    this.setVisible( false );
                    inicio.setVisible( true );
                } else {
                    JOptionPane.showMessageDialog( null, "Operação cancelada.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                }

            } else
                if ( Integer.parseInt( textNAccount.getText() ) == specialAccount.getNumber() ) {
                    flag = JOptionPane.showConfirmDialog( null, specialAccount.getName() + ", você confirma essa operação ?", "Saque", JOptionPane.YES_NO_OPTION );
                    if ( flag == JOptionPane.YES_OPTION ) {
                        JFrameStart inicio = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
                        if ( specialAccount.getBalance() < Double.parseDouble( textAmmount.getText() ) ) {
                            if ( ( specialAccount.getBalance() + specialAccount.getLimit() ) >= Double.parseDouble( textAmmount.getText() ) ) {
                                specialAccount.withdrawAccount( Double.parseDouble( textAmmount.getText() ) );
                                specialAccount.discount( specialAccount.getFine() );
                                JOptionPane.showMessageDialog( null, "Saque efetuado usando cheque especial.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                            } else
                                JOptionPane.showMessageDialog( null, "Saldo insuficiente.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                        } else {
                            specialAccount.withdrawAccount( Double.parseDouble( textAmmount.getText() ) );
                            JOptionPane.showMessageDialog( null, "Saque efetuado com sucesso.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                        }
                        this.setVisible( false );
                        inicio.setVisible( true );
                    } else {
                        JOptionPane.showMessageDialog( null, "Operação cancelada.", "Saque", JOptionPane.INFORMATION_MESSAGE );
                    }
                } else {
                    JOptionPane.showMessageDialog( null, "Número da account inválido.", "Warning", JOptionPane.WARNING_MESSAGE );
                }

    }

    private void buttonMenuActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameStart inicio = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        inicio.setVisible( true );
    }


}
