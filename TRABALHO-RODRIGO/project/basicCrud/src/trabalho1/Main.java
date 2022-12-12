package trabalho1;

import javax.swing.JOptionPane;


public class Main {

    /**
     *
     */
    public static Account account = new Account();

    /**
     *
     */
    public static SavingsAccount savingsAccount = new SavingsAccount();

    /**
     *
     */
    public static SpecialAccount specialAccount = new SpecialAccount();

    /**
     * @param args
     */
    public static void main ( String args[] ) {
        JFrameStart inicio = new JFrameStart( Main.account, Main.savingsAccount, Main.specialAccount );

        JOptionPane.showMessageDialog( null, "BEM VINDO!" );

        JOptionPane.showMessageDialog( null, "Em seguida digite as informações da "
            + "CONTA-COMUM.", null, JOptionPane.INFORMATION_MESSAGE );

        account.setName( JOptionPane.showInputDialog( null, "Digite o nome do titular:"
            , "conta-comum", JOptionPane.QUESTION_MESSAGE ) );

        account.setNumber( Integer.parseInt( JOptionPane.showInputDialog( null, "Digite "
            + "o número da conta (Ex: 6040):", "conta-comum", JOptionPane.QUESTION_MESSAGE ) ) );

        account.setBalance( Double.parseDouble( JOptionPane.showInputDialog( null, "Digit"
            + "e o saldo inicial R$:", "conta-comum", JOptionPane.QUESTION_MESSAGE ) ) );

        JOptionPane.showMessageDialog( null, "Em seguida digite as informações da "
            + "conta-poupança", null, JOptionPane.INFORMATION_MESSAGE );

        savingsAccount.setName( JOptionPane.showInputDialog( null, "Digite o nome do titular:"
            , "conta-poupança.", JOptionPane.QUESTION_MESSAGE ) );

        savingsAccount.setNumber( Integer.parseInt( JOptionPane.showInputDialog( null, "Digite "
            + "o número da conta (Ex: 6040):", "conta-poupança", JOptionPane.QUESTION_MESSAGE ) ) );

        savingsAccount.setBalance( Double.parseDouble( JOptionPane.showInputDialog( null, "Digit"
            + "e o saldo inicial R$:", "conta-poupança", JOptionPane.QUESTION_MESSAGE ) ) );

        savingsAccount.readjust( Double.parseDouble( JOptionPane.showInputDialog( null, "Digit"
            + "e a taxa (Ex: 5%):", "conta-poupança", JOptionPane.QUESTION_MESSAGE ) ) );
        //FIM Recebendo Conta Poupança


        //Recebendo Conta Especial
        JOptionPane.showMessageDialog( null, "Em seguida digite as informações da "
            + "conta-especial", null, JOptionPane.INFORMATION_MESSAGE );

        specialAccount.setName( JOptionPane.showInputDialog( null, "Digite o nome do titular:"
            , "conta-especial.", JOptionPane.QUESTION_MESSAGE ) );

        specialAccount.setNumber( Integer.parseInt( JOptionPane.showInputDialog( null, "Digite "
            + "o número da conta: (Ex: 6040)", "conta-especial", JOptionPane.QUESTION_MESSAGE ) ) );

        specialAccount.setBalance( Double.parseDouble( JOptionPane.showInputDialog( null, "Digit"
            + "e o saldo inicial R$:", "conta-especial", JOptionPane.QUESTION_MESSAGE ) ) );

        specialAccount.setLimit( Integer.parseInt( JOptionPane.showInputDialog( null, "Digit"
            + "e o limite R$:", "conta-especial", JOptionPane.QUESTION_MESSAGE ) ) );

        specialAccount.setFine( Integer.parseInt( JOptionPane.showInputDialog( null, "Digit"
            + "e a multa: (Ex: 10%):", "conta-especial", JOptionPane.QUESTION_MESSAGE ) ) );
        //FIM Recebendo Conta Especial


        inicio.setVisible( true );
    }
}
