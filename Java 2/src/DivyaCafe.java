import java.util.LinkedList;
import java.util.Queue;

public class DivyaCafe {

//    private static Customer customerQueue;
    private Barista barista;
    private Cashier cashier;
    Queue<Customer> customerQueue;
    Queue<Order> orderQueue = new LinkedList<>();
    
    public DivyaCafe() {
        System.out.println("Welcome to Divya's Cafe...!!");
        this.orderQueue = new LinkedList<>();
    }
    
    
    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }

    public void setOrderQueue(Queue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    
    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void startServingCustomers(Cashier cashier)
    {
        for(Customer c: this.customerQueue){
            c.placeOrder();
        }
    }

    public static void main(String[] args) {
        DivyaCafe divyaCafe =  new DivyaCafe();
        Barista barista = new Barista("b1");
        Cashier cashier = new Cashier("c1");
        divyaCafe.setBarista(barista);
        divyaCafe.setCashier(cashier);
//       create customers
        Customer customer1 = new Customer("cst1", "t1");
        Customer customer2 = new Customer("cst2", "t2");
        Customer customer3 = new Customer("cst3", "t3");
        Customer customer4 = new Customer("cst4", "t4");
//        adding customers to the custome Queue
        divyaCafe.customerQueue.add(customer1);
        divyaCafe.customerQueue.add(customer2);
        divyaCafe.customerQueue.add(customer3);
        divyaCafe.customerQueue.add(customer4);
        Queue<Customer> customerQueue = new LinkedList<>();
        divyaCafe.setCustomerQueue(customerQueue);
//        orders
        Order order1 = new Order("O1", "abc", 100);
        Order order2 = new Order("O2", "xyz", 500);
        Order order3 = new Order("O3", "efg", 700);
        Order order4 = new Order("O4", "rst", 200);
//          adding orders to the order queue
        divyaCafe.orderQueue.add(order1);
        divyaCafe.orderQueue.add(order2);
        divyaCafe.orderQueue.add(order3);
        divyaCafe.orderQueue.add(order4);
        Queue<Order>  orderQueue = new LinkedList<>();
        divyaCafe.setOrderQueue(orderQueue);
        
//        Begin opeations
        divyaCafe.startServingCustomers(cashier);
    
    }
}
