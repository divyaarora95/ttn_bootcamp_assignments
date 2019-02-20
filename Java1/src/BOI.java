public class BOI extends Bank {
    BOI(String bankName, double rateOfInterest){
        super(bankName, rateOfInterest);
    }
    
    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Bank Name"+bankName);
        System.out.println("Rate of Interest is: "+rateOfInterest);
    }
}
