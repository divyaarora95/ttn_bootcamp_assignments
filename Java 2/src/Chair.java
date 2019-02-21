abstract class Chair {
    Chair()
    {
        System.out.println("Chair Created!!");
    }
}

class WoodenChair extends Chair implements Furniture{
    WoodenChair()
    {
        System.out.println("Wodden Chair Created!!");
    }
    
    public void fireTest(){
        System.out.println("Fire Resistance: low");
    }
    
    public void stressTest(){
        System.out.println("Stress Resistance: moderate");
    }
}

class MetallicChair extends Chair implements Furniture{
    
    public MetallicChair() {
        System.out.println("Metallic Chair Created!!");
    }
    
    public void fireTest(){
        System.out.println("Fire Resistance: high");
    }
    
    public void stressTest(){
        System.out.println("Stress Resistance: high ");
    }
}
