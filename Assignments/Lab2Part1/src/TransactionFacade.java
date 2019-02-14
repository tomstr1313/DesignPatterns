public class TransactionFacade {

    static NewBankAccount newbank = new NewBankAccount(100);
    static AtmAds atmAds = new AtmAds();
    static AtmStatus atmStatus = new AtmStatus();
    static AtmUserLog atmUserLog = new AtmUserLog();


    public int Debit(){
        atmAds.showAds();
        newbank.debit(10);
        atmUserLog.SaveUserLog();
        atmStatus.SaveAtmStatus();
       // newbank.balance();
        return newbank.balance;
    }

    public int Credit(){
        atmAds.showAds();
        newbank.credit(99);
        atmUserLog.SaveUserLog();
        atmStatus.SaveAtmStatus();
        // newbank.balance();
        return newbank.balance;
    }







}
