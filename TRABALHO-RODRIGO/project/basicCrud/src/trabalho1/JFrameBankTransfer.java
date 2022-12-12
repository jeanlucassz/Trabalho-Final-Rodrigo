package trabalho1;

import javax.swing.JOptionPane;

public class JFrameBankTransfer extends javax.swing.JFrame {
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textDAccount;
    private javax.swing.JTextField textDValue;
    private javax.swing.JTextField textPAccount;

    Account account;
    SavingsAccount savingsAccount;
    SpecialAccount specialAccount;

    /**
     *
     * @param account
     * @param savingsAccount
     * @param specialAccount
     */
    public JFrameBankTransfer ( Account account, SavingsAccount savingsAccount, SpecialAccount specialAccount ) {
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
        buttonOk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textDAccount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textPAccount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textDValue = new javax.swing.JTextField();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

        jLabel1.setFont( new java.awt.Font( "Ubuntu", 1, 20 ) ); 
        jLabel1.setText( "Transferência:" );

        jLabel2.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) ); 
        jLabel2.setText( "De:" );

        jLabel3.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) );
        jLabel3.setText( "Para:" );

        buttonOk.setText( "Ok" );
        buttonOk.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonOkActionPerformed( evt );
            }
        } );

        jLabel5.setFont( new java.awt.Font( "Ubuntu", 0, 15 ) ); // NOI18N
        jLabel5.setText( "Nº da conta:" );

        jLabel6.setFont( new java.awt.Font( "Ubuntu", 0, 15 ) ); // NOI18N
        jLabel6.setText( "Nº da conta:" );

        jLabel7.setFont( new java.awt.Font( "Ubuntu", 0, 15 ) ); // NOI18N
        jLabel7.setText( "Valor R$:" );

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
                        .addGroup( layout.createSequentialGroup()
                            .addComponent( jLabel6 )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addComponent( textPAccount ) )
                        .addComponent( jLabel3 )
                        .addGroup( layout.createSequentialGroup()
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( jLabel5 )
                                .addComponent( jLabel7 ) )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( textDValue )
                                .addComponent( textDAccount ) ) ) )
                    .addGap( 31, 31, 31 ) )
                .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                    .addComponent( buttonOk )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addComponent( buttonMenu )
                    .addGap( 74, 74, 74 ) )
                .addGroup( layout.createSequentialGroup()
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                            .addGap( 52, 52, 52 )
                            .addComponent( jLabel1 ) )
                        .addGroup( layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent( jLabel2 ) ) )
                    .addContainerGap( 61, Short.MAX_VALUE ) )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent( jLabel1 )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addComponent( jLabel2 )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel5 )
                        .addComponent( textDAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addGap( 5, 5, 5 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel7 )
                        .addComponent( textDValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED )
                    .addComponent( jLabel3 )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel6 )
                        .addComponent( textPAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( buttonOk )
                        .addComponent( buttonMenu ) )
                    .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
        );

        pack();
    }

    private void buttonOkActionPerformed ( java.awt.event.ActionEvent evt ) {
        if ( ( Integer.parseInt( textDAccount.getText() ) == account.getNumber() ) && ( Integer.parseInt( textPAccount.getText() ) == savingsAccount.getNumber() ) ) {
            JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
            int flag;

            flag = JOptionPane.showConfirmDialog( null, account.getName() + ",você gostaria de transferir R$" + Double.parseDouble( textDValue.getText() ) + " para " + savingsAccount.getName() + " ?", "Transferencia", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {

                account.withdrawAccount( Double.parseDouble( textDValue.getText() ) );
                savingsAccount.deposit( Double.parseDouble( textDValue.getText() ) );
                JOptionPane.showMessageDialog( null, "Transferência efetuada com sucesso!", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( ( Integer.parseInt( textDAccount.getText() ) == account.getNumber() ) && ( Integer.parseInt( textPAccount.getText() ) == specialAccount.getNumber() ) ) {
            JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
            int flag;

            flag = JOptionPane.showConfirmDialog( null, account.getName() + ",você gostaria de transferir R$" + Double.parseDouble( textDValue.getText() ) + " para " + specialAccount.getName() + " ?", "Transferencia", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {

                account.withdrawAccount( Double.parseDouble( textDValue.getText() ) );
                specialAccount.deposit( Double.parseDouble( textDValue.getText() ) );
                JOptionPane.showMessageDialog( null, "Transferência efetuada com sucesso!", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( ( Integer.parseInt( textDAccount.getText() ) == savingsAccount.getNumber() ) && ( Integer.parseInt( textPAccount.getText() ) == account.getNumber() ) ) {
            JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
            int flag;

            flag = JOptionPane.showConfirmDialog( null, savingsAccount.getName() + ",você gostaria de transferir R$" + Double.parseDouble( textDValue.getText() ) + " para " + account.getName() + " ?", "Transferencia", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {

                savingsAccount.withdrawAccount( Double.parseDouble( textDValue.getText() ) );
                account.deposit( Double.parseDouble( textDValue.getText() ) );
                JOptionPane.showMessageDialog( null, "Transferência efetuada com sucesso!", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( ( Integer.parseInt( textDAccount.getText() ) == savingsAccount.getNumber() ) && ( Integer.parseInt( textPAccount.getText() ) == specialAccount.getNumber() ) ) {
            JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
            int flag;

            flag = JOptionPane.showConfirmDialog( null, savingsAccount.getName() + ",você gostaria de transferir R$" + Double.parseDouble( textDValue.getText() ) + " para " + specialAccount.getName() + " ?", "Transferencia", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {

                savingsAccount.withdrawAccount( Double.parseDouble( textDValue.getText() ) );
                specialAccount.deposit( Double.parseDouble( textDValue.getText() ) );
                JOptionPane.showMessageDialog( null, "Transferência efetuada com sucesso!", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( ( Integer.parseInt( textDAccount.getText() ) == specialAccount.getNumber() ) && ( Integer.parseInt( textPAccount.getText() ) == account.getNumber() ) ) {
            JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
            int flag;

            flag = JOptionPane.showConfirmDialog( null, specialAccount.getName() + ",você gostaria de transferir R$" + Double.parseDouble( textDValue.getText() ) + " para " + account.getName() + " ?", "Transferencia", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {

                specialAccount.withdrawAccount( Double.parseDouble( textDValue.getText() ) );
                account.deposit( Double.parseDouble( textDValue.getText() ) );
                JOptionPane.showMessageDialog( null, "Transferência efetuada com sucesso!", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else if ( ( Integer.parseInt( textDAccount.getText() ) == specialAccount.getNumber() ) && ( Integer.parseInt( textPAccount.getText() ) == savingsAccount.getNumber() ) ) {
            JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
            int flag;

            flag = JOptionPane.showConfirmDialog( null, specialAccount.getName() + ",você gostaria de transferir R$" + Double.parseDouble( textDValue.getText() ) + " para " + savingsAccount.getName() + " ?", "Transferencia", JOptionPane.OK_CANCEL_OPTION );

            if ( flag == JOptionPane.OK_OPTION ) {

                specialAccount.withdrawAccount( Double.parseDouble( textDValue.getText() ) );
                savingsAccount.deposit( Double.parseDouble( textDValue.getText() ) );
                JOptionPane.showMessageDialog( null, "Transferência efetuada com sucesso!", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            } else {
                JOptionPane.showMessageDialog( null, "Operação cancelada.", "Transferencia", JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                start.setVisible( true );
            }
        } else {
            JOptionPane.showMessageDialog( null, "Número das contas inválido.", "Warning", JOptionPane.WARNING_MESSAGE );
        }
    }

    private void buttonMenuActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        start.setVisible( true );
    }
}
