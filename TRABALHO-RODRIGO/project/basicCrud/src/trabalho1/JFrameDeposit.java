package trabalho1;

import javax.swing.JOptionPane;

public class JFrameDeposit extends javax.swing.JFrame {
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textAccount;
    private javax.swing.JTextField textAmmount;

    Account account;
    SavingsAccount savingsAccount;
    SpecialAccount specialAccount;

    /**
     * @param account
     * @param savingsAccount
     * @param specialAccount
     */
    public JFrameDeposit ( Account account, SavingsAccount savingsAccount, SpecialAccount specialAccount ) {
        this.account = account;
        this.savingsAccount = savingsAccount;
        this.specialAccount = specialAccount;
        initComponents();
        this.setLocationRelativeTo( null );
    }

    @SuppressWarnings( "unchecked" )
    private void initComponents () {

        jLabel1 = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textAccount = new javax.swing.JTextField();
        textAmmount = new javax.swing.JTextField();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

        jLabel1.setFont( new java.awt.Font( "Ubuntu", 1, 20 ) ); 
        jLabel1.setText( "Deposito:" );

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

        jLabel2.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) ); 
        jLabel2.setText( "Nº da conta:" );

        jLabel3.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) ); 
        jLabel3.setText( "Valor R$:" );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent( jLabel2 )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addComponent( textAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                        .addGroup( layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent( jLabel3 )
                            .addGap( 34, 34, 34 )
                            .addComponent( textAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                        .addGroup( layout.createSequentialGroup()
                            .addGap( 76, 76, 76 )
                            .addComponent( buttonOk )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addComponent( buttonMenu ) )
                        .addGroup( layout.createSequentialGroup()
                            .addGap( 76, 76, 76 )
                            .addComponent( jLabel1 ) ) )
                    .addContainerGap( 38, Short.MAX_VALUE ) )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent( jLabel1 )
                    .addGap( 18, 18, 18 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel2 )
                        .addComponent( textAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( textAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( jLabel3 ) )
                    .addGap( 31, 31, 31 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( buttonMenu )
                        .addComponent( buttonOk ) )
                    .addContainerGap( 43, Short.MAX_VALUE ) )
        );

        pack();
    }

    private void buttonMenuActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        start.setVisible( true );
    }

    private void buttonOkActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
        int flag;

        if ( Integer.parseInt( textAccount.getText() ) == account.getNumber() ) {
            flag = JOptionPane.showConfirmDialog( null, account.getName() + ",você confirma essa operação ?", "Deposito", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {
                account.deposit( Double.parseDouble( textAmmount.getText() ) );
                JOptionPane.showMessageDialog( null, "Depósito efetuado com sucesso!", "Desposito", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Deposito", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( Integer.parseInt( textAccount.getText() ) == savingsAccount.getNumber() ) {
            flag = JOptionPane.showConfirmDialog( null, savingsAccount.getName() + ",você confirma essa operação ?", "Deposito", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {
                savingsAccount.deposit( Double.parseDouble( textAmmount.getText() ) );
                JOptionPane.showMessageDialog( null, "Depósito efetuado com sucesso!", "Desposito", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Deposito", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( Integer.parseInt( textAccount.getText() ) == specialAccount.getNumber() ) {
            flag = JOptionPane.showConfirmDialog( null, specialAccount.getName() + ",você confirma essa operação ?", "Deposito", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {
                specialAccount.deposit( Double.parseDouble( textAmmount.getText() ) );
                JOptionPane.showMessageDialog( null, "Depósito efetuado com sucesso!", "Desposito", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Deposito", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );

            }

        } else {
            JOptionPane.showMessageDialog( null, "Número da conta inválido.", "Warning", JOptionPane.WARNING_MESSAGE );
        }
    }
}
