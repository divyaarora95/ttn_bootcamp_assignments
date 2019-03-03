//6. Implement Decorator pattern to decorate the Pizza with topings.
interface Pizza {
    void getMyPizza();
}

class MexicanGreenWave implements Pizza{
    String chosenCrust;
    Boolean containsExtraCheese;
    
    public MexicanGreenWave(String chosenCrust, Boolean containsExtraCheese) {
        this.chosenCrust = chosenCrust;
        this.containsExtraCheese = containsExtraCheese;
    }
    
    public void getMyPizza(){
        System.out.println("Your Pizza is: "+getClass()+" with crust: "+chosenCrust+" has Extra Cheese ? "+containsExtraCheese);
    }
}

class VeggieParadise implements Pizza{
    String chosenCrust;
    Boolean hasExtraOlives;
    
    
    public VeggieParadise(String chosenCrust, Boolean hasExtraOlives) {
        this.chosenCrust = chosenCrust;
        this.hasExtraOlives = hasExtraOlives;
    }
    
    public void getMyPizza(){
        System.out.println("Your chosen pizza is: "+getClass()+" with Crust: "+chosenCrust+" has Extra Olives? "+hasExtraOlives);
    }
}
public class DecoratorPatternTest {
    public static void main(String[] args) {
        VeggieParadise veggieParadise = new VeggieParadise("thinCrust", true);
        veggieParadise.getMyPizza();
        MexicanGreenWave mexicanGreenWave = new MexicanGreenWave("Pan base", true);
        mexicanGreenWave.getMyPizza();
    }
}
