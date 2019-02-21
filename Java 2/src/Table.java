abstract class Table {
    Table()
    {
        System.out.println("Table Created!!");
    }
}

class WoodenTable extends Table implements Furniture{
    WoodenTable()
    {
        System.out.println("Wooden Table Created!!");
    }
    
    public void fireTest()
    {
        System.out.println("Fire Resistance : low");
    }
    
    public void stressTest()
    {
        System.out.println("Stress Resistence : moderate");
    }
}

class MetallicTable extends Table implements Furniture{
    MetallicTable()
    {
        System.out.println("Metallic Chair Created!!");
    }
    
    public void fireTest()
    {
        System.out.println("Fire Resistance: high");
    }
    
    public void stressTest()
    {
        System.out.println("Stress Resistance: high");
    }
}


