package trabalho1;

import javax.swing.JOptionPane;

public class JFrameStart extends javax.swing.JFrame {
    private javax.swing.JButton buttonDeposit;
    private javax.swing.JButton buttonReadjust;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonWithdraw;
    private javax.swing.JButton buttonBankTransfer;
    private javax.swing.JButton buttonShowBalance;
    private javax.swing.JLabel jLabel1;

    Account account;
    SavingsAccount savingsAccount;
    SpecialAccount specialAccount;

    /**
     *
     * @param account
     * @param savingsAccount
     * @param specialAccount
     */
    public JFrameStart ( Account account, SavingsAccount savingsAccount, SpecialAccount specialAccount ) {
        this.account = account;
        this.savingsAccount = savingsAccount;
        this.specialAccount = specialAccount;
        initComponents();
        this.setLocationRelativeTo( null );
    }

    @SuppressWarnings( "unchecked" )
    private void initComponents () {

        jLabel1 = new javax.swing.JLabel();
        buttonWithdraw = new javax.swing.JButton();
        buttonDeposit = new javax.swing.JButton();
        buttonBankTransfer = new javax.swing.JButton();
        buttonReadjust = new javax.swing.JButton();
        buttonShowBalance = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "Tela inicial" );

        jLabel1.setFont( new java.awt.Font( "Ubuntu", 1, 20 ) );
        jLabel1.setText( "Selecione a operação desejada:" );

        buttonWithdraw.setText( "Saque" );
        buttonWithdraw.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonWithdrawActionPerformed( evt );
            }
        } );

        buttonDeposit.setText( "Depósito" );
        buttonDeposit.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonDepositActionPerformed( evt );
            }
        } );

        buttonBankTransfer.setText( "Transferência" );
        buttonBankTransfer.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonBankTransferActionPerformed( evt );
            }
        } );

        buttonReadjust.setText( "Reajustar" );
        buttonReadjust.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonReadjustActionPerformed( evt );
            }
        } );

        buttonShowBalance.setText( "Ver saldos" );
        buttonShowBalance.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonShowBalanceActionPerformed( evt );
            }
        } );

        buttonExit.setText( "Sair" );
        buttonExit.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed ( java.awt.event.ActionEvent evt ) {
                buttonExitActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                            .addGap( 25, 25, 25 )
                            .addComponent( jLabel1 ) )
                        .addGroup( layout.createSequentialGroup()
                            .addGap( 59, 59, 59 )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                .addComponent( buttonBankTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addComponent( buttonWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addComponent( buttonShowBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                            .addGap( 18, 18, 18 )
                            .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                .addComponent( buttonDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addComponent( buttonReadjust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addComponent( buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE ) ) ) )
                    .addContainerGap( 26, Short.MAX_VALUE ) )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                .addGroup( layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent( jLabel1 )
                    .addGap( 41, 41, 41 )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( buttonWithdraw )
                        .addComponent( buttonDeposit ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( buttonBankTransfer )
                        .addComponent( buttonReadjust ) )
                    .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                    .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                        .addComponent( buttonShowBalance )
                        .addComponent( buttonExit ) )
                    .addContainerGap( 71, Short.MAX_VALUE ) )
        );

        pack();
    }

    private void buttonWithdrawActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameWithdrawAccount saqueFrame = new JFrameWithdrawAccount( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        saqueFrame.setVisible( true );

    }

    private void buttonDepositActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameDeposit depositoFrame = new JFrameDeposit( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        depositoFrame.setVisible( true );

    }

    private void buttonBankTransferActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameBankTransfer transferenciaFrame = new JFrameBankTransfer( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        transferenciaFrame.setVisible( true );
    }

    private void buttonReadjustActionPerformed ( java.awt.event.ActionEvent evt ) {
        double taxa = 0;
        int numeroConta;

        numeroConta = Integer.parseInt( JOptionPane.showInputDialog( null, "Digite o número da account poupança (Ex: 00495):", "Reajuste", JOptionPane.QUESTION_MESSAGE ) );

        try {
            taxa = Double.parseDouble( JOptionPane.showInputDialog( null, "Digite a taxa de reajuste (Ex: 1%):", "Reajuste", JOptionPane.QUESTION_MESSAGE ) );
            if ( numeroConta == savingsAccount.getNumber() ) {
                savingsAccount.readjust( taxa );
                JOptionPane.showMessageDialog( null, "Ajuste realizado com sucesso.", "Reajuste", JOptionPane.INFORMATION_MESSAGE );
            } else {
                JOptionPane.showMessageDialog( null, "Número de account poupança inválido.", "Reajuste", JOptionPane.WARNING_MESSAGE );
            }
        } catch ( java.lang.NumberFormatException e ) {
            if ( numeroConta == savingsAccount.getNumber() ) {
                savingsAccount.readjust();
                JOptionPane.showMessageDialog( null, "Ajuste realizado com sucesso.", "Reajuste", JOptionPane.INFORMATION_MESSAGE );
            } else {
                JOptionPane.showMessageDialog( null, "Número de account poupança inválido.", "Reajuste", JOptionPane.WARNING_MESSAGE );
            }
        }


        System.out.println( taxa );


    }

    private void buttonShowBalanceActionPerformed ( java.awt.event.ActionEvent evt ) {
        JFrameShowBalance verSaldoFrame = new JFrameShowBalance( this.account, this.savingsAccount, this.specialAccount );
        this.setVisible( false );
        verSaldoFrame.setVisible( true );
    }

    private void buttonExitActionPerformed ( java.awt.event.ActionEvent evt ) {
        System.exit( 0 );
    }
}
