//5. Implement Bridge Design Pattern for Color and Shape such that
// Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.
abstract class Shape{
    Color color;
    String type;
    public Shape(Color color) {
        this.color = color;
    }
}

class Square extends Shape{
    public Square(Color color) {
        super(color);
        type = "square";
    }
    
    public String toString(){
        return "Shape{ type: "+type+" of color "+color.getColor()+" }";
    }
}

class Triangle extends Shape{
    
    public Triangle(Color color) {
        super(color);
        type = "triangle";
    }
    
    public String toString(){
        return "Shape{ type: "+type+" of color "+color.getColor()+" }";
    }
}

interface Color{
    String getColor();
}

class Red implements Color{
    public String getColor(){
        return "Red";
    }
    
}

class Blue implements Color{
    public String getColor(){
        return "Blue";
    }
}

public class BridgePatternTest {
    public static void main(String[] args)
    {
        Square square = new Square(new Blue());
        System.out.println(square.toString());
        Triangle triangle = new Triangle(new Red());
        System.out.println(triangle.toString());
    }
}
