public class ICICI extends Bank{
    ICICI(String bankName, double rateOfInterest){
        super(bankName, rateOfInterest);
    }
    
    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Bank Name: "+bankName);
        System.out.println("Rate of interest: "+rateOfInterest);
    }
}
