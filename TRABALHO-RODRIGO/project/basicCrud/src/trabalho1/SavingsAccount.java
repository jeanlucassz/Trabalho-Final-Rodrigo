package trabalho1;

public class SavingsAccount extends Account {

    /**
     * @param taxa
     */
    public void readjust ( double taxa ) {
        this.deposit( this.getBalance() * ( taxa / 100 ) );
    }

    public void readjust () {
        this.deposit( ( this.getBalance() * 0.1 ) );
    }

    /**
     * @return
     */
    @Override
    public String typeAccount () {
        return "Poupança";
    }
}
