public class SBI extends Bank {
    SBI(String bankName, double rateOfInterest){
        super(bankName, rateOfInterest);
        
    }
    
    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Bnk name: "+bankName);
        System.out.println("Rate of Interest: "+rateOfInterest);
    
    }
}
