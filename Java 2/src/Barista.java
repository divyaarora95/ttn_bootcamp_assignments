public class Barista {
    String baristaId;

    
    public Barista(String baristaId) {
        this.baristaId = baristaId;
    }
    
    void getNextOrder()
    {
        System.out.println("getting the next orde from the order queue");
    }
    
    void prepareCoffee(){
        System.out.println("your coffee is being prepared");
    }
    
    void generateToken(){
        System.out.println("you have been assigned a token...your coffee will arrive soon!!");
    }
    
    void serveCoffee(){
        System.out.println("enjoy your coffee!!");
    }
    
}
