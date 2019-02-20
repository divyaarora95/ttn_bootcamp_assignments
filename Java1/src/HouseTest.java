enum House {
    APARTMENT("apartment", 5000000d), BUNGLOW("bunglow", 50000000d), COTTAGE("cottage", 7500000d);
    private String name;
    private double housePrice;
    House(String name, double housePrice)
    {
        this.name = name;
        this.housePrice = housePrice;
    }
    
    public void getPrice()
    {
        System.out.println("Price of House "+name+" is "+housePrice);
    }
}
public class HouseTest{
    public static void main(String[] args) {
        House h1 = House.BUNGLOW;
        h1.getPrice();
    }
}