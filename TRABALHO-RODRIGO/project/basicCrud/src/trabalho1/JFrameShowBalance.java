package trabalho1;

public class JFrameShowBalance extends javax.swing.JFrame {
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textNumber1;
    private javax.swing.JTextField textNumber2;
    private javax.swing.JTextField textNumber3;
    private javax.swing.JButton textOk;
    private javax.swing.JTextField textBalance1;
    private javax.swing.JTextField textBalance2;
    private javax.swing.JTextField textBalance3;
    private javax.swing.JTextField textType1;
    private javax.swing.JTextField textType2;
    private javax.swing.JTextField textType3;

    Account account;
    SavingsAccount savingsAccount;
    SpecialAccount specialAccount;

    /**
     * @param account
     * @param savingsAccount
     * @param specialAccount
     */
    public JFrameShowBalance ( Account account, SavingsAccount savingsAccount, SpecialAccount specialAccount ) {
        this.account = account;
        this.savingsAccount = savingsAccount;
        this.specialAccount = specialAccount;
        initComponents();
        this.setLocationRelativeTo( null );

        textNumber1.setText( Integer.toString( account.getNumber() ) );
        textNumber2.setText( Integer.toString( savingsAccount.getNumber() ) );
        textNumber3.setText( Integer.toString( specialAccount.getNumber() ) );

        textBalance1.setText( "R$ " + account.getBalance() );
        textBalance2.setText( "R$ " + savingsAccount.getBalance() );
        textBalance3.setText( "R$ " + specialAccount.getBalance() );

        textType1.setText( account.typeAccount() );
        textType2.setText( savingsAccount.typeAccount() );
        textType3.setText( specialAccount.typeAccount() );
    }

    @SuppressWarnings( "unchecked" )
    private void initComponents () {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textNumber1 = new javax.swing.JTextField();
        textNumber2 = new javax.swing.JTextField();
        textNumber3 = new javax.swing.JTextField();
        textType1 = new javax.swing.JTextField();
        textType2 = new javax.swing.JTextField();
        textType3 = new javax.swing.JTextField();
        textBalance1 = new javax.swing.JTextField();
        textBalance2 = new javax.swing.JTextField();
        textBalance3 = new javax.swing.JTextField();

        jLabel1.setText( "jLabel1" );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

        jLabel2.setFont( new java.awt.Font( "Ubuntu", 1, 20 ) );
        jLabel2.setText( "Saldos:" );

        jLabel5.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) );
        jLabel5.setText( "Número:" );

        jLabel6.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) );
        jLabel6.setText( "Saldo:" );

        textOk.setText( "Ok" );
        textOk.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                textOkActionPerformed( evt );
            }
        } );

        jLabel3.setFont( new java.awt.Font( "Ubuntu", 1, 15 ) );
        jLabel3.setText( "Tipo:" );

        textNumber1.setEditable( false );

        textNumber2.setEditable( false );

        textNumber3.setEditable( false );

        textType1.setEditable( false );

        textType2.setEditable( false );

        textType3.setEditable( false );

        textBalance1.setEditable( false );

        textBalance2.setEditable( false );

        textBalance3.setEditable( false );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( jLabel5 )
                                .addComponent( jLabel3 )
                                .addComponent( jLabel6 ) )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                .addComponent( textNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE )
                                .addComponent( textType1 )
                                .addComponent( textBalance1 ) )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                .addComponent( textNumber2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE )
                                .addComponent( textType2 )
                                .addComponent( textBalance2 ) )
                            .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( textNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addComponent( textType3 )
                                .addComponent( textBalance3 ) )
                            .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap( 0, 102, Short.MAX_VALUE )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent( textOk )
                                    .addGap( 118, 118, 118 ) )
                                .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent( jLabel2 )
                                    .addGap( 104, 104, 104 ) ) ) ) ) )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addGap( 10, 10, 10 )
                    .addComponent( jLabel2 )
                    .addGap( 18, 18, 18 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel3 )
                        .addComponent( textType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( textType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( textType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addGap( 18, 18, 18 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel5 )
                        .addComponent( textNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( textNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( textNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addGap( 18, 18, 18 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( jLabel6 )
                        .addComponent( textBalance1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( textBalance2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                        .addComponent( textBalance3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE )
                    .addComponent( textOk )
                    .addGap( 27, 27, 27 ) )
        );

        pack();
    }

    private void textOkActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameStart start = new JFrameStart( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        start.setVisible( true );
    }

}
