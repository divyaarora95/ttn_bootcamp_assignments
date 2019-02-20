class Bank {
    String bankName;
    double rateOfInterest;
    
    Bank(String bankName, double rateOfInterest)
    {
        this.bankName = bankName;
        this.rateOfInterest = rateOfInterest;
    }
    
    void getDetails()
    {
        System.out.println("Greetings from the Bank: ");
    }
    
}
public class BankTest{
    public static void main(String[] args) {
        Bank b1 = new ICICI("ICICI", 12);
        Bank b2 = new SBI("SBI", 7);
        Bank b3 = new BOI("BOI", 10);
        
        b1.getDetails();
        b2.getDetails();
        b3.getDetails();
    }
}


