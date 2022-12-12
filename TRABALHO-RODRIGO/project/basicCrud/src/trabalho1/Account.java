package trabalho1;

public class Account {
    private String name;
    private int number;
    private double balance;

    /**
     * @param value
     */
    public void deposit ( double value ) {
        this.balance += value;
    }

    /**
     * @param value
     */
    public void withdrawAccount ( double value ) {
        this.balance -= value;
        System.out.println( "Saque efetuado com sucesso!" );
    }

    /**
     * @return
     */
    public String typeAccount () {
        return "Comum";
    }

    /**
     * @return
     */
    public String getName () {
        return name;
    }

    /**
     * @return
     */
    public int getNumber () {
        return number;
    }

    /**
     * @return
     */
    public double getBalance () {
        return balance;
    }

    /**
     * @param name
     */
    public void setName ( String name ) {
        this.name = name;
    }

    /**
     * @param number
     */
    public void setNumber ( int number ) {
        this.number = number;
    }

    /**
     * @param balance
     */
    public void setBalance ( double balance ) {
        this.balance = balance;
    }

}
