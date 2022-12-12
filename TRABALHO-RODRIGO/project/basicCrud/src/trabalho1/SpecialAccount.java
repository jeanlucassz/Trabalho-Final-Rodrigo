package trabalho1;

public class SpecialAccount extends Account {
    private int limit;
    private int fine;

    /**
     * @param fine
     */
    public void discount ( double fine ) {
        withdrawAccount( this.getBalance() * ( - ( fine / 100 ) ) );
    }

    /**
     * @return
     */
    @Override
    public String typeAccount () {
        return "Especial";
    }

    /**
     * @return
     */
    public int getLimit () {
        return limit;
    }

    /**
     * @return
     */
    public int getFine () {
        return fine;
    }

    /**
     * @param limit
     */
    public void setLimit ( int limit ) {
        this.limit = limit;
    }

    /**
     * @param fine
     */
    public void setFine ( int fine ) {
        this.fine = fine;
    }
}
