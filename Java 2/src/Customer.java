public class Customer {
    String customerId;
    String tokenNumber;
    
    public Customer(String customerId, String tokenNumber) {
        this.customerId = customerId;
        this.tokenNumber = tokenNumber;
    }
    
    
    void placeOrder(Cashier cashier){
//        tokenNumber = cashier.createNewOrder();
//        place order
    }
    
    void enjoyDrink(){
        System.out.println("enjoy your coffee...Thank you for visiting us!!");
    }
    
}
