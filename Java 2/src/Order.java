public class Order {
    String orderId;
    String itemName;
    double itemPrice;
    int orderCount;
    
    public Order(String orderId, String itemName, double itemPrice) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        addOrderToList(orderCount++);
    }
    
    void addOrderToList(int orderCount)
    {
//        some implemntation
    }
}
