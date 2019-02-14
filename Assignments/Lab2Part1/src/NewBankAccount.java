public class NewBankAccount extends Account implements IBankAccount{
    public NewBankAccount(int i) {
        super(i);
    }

    @Override
    public void debit(int i) {
        withdraw(i);
    }

    @Override
    public void credit(int i) {
        deposit(i);
    }

    @Override
    public int balance() {
        return getBalance();
    }
}
