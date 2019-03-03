//2. Implement Factory Pattern to get the Polygon of differnt type.
interface Polygon {
    void generatePolygon();
}

class Quadrilateral implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a square, which is a kind of polygon");
    }
}

class Pentagon implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a pentagon, which is a kind of polygon");
    }
}

class Hexagon implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a hexagon, which is a kind of polygon");
    }
}

class PolygonFactory {
    static Polygon getPolygonFactory(String polygonType) {
        switch (polygonType) {
            
            case "quadrilateral":
                return new Quadrilateral();
            
            case "pentagon":
                return new Pentagon();
            
            case "hexagon":
                return new Hexagon();
            
            default:
                return null;
        }
    }
}

public class FactoryPatternTest {
    public static void main(String[] args) {
        Polygon hexagonalPolygon = PolygonFactory.getPolygonFactory("hexagon");
        hexagonalPolygon.generatePolygon();
        Polygon pentagonalPolygon = PolygonFactory.getPolygonFactory("pentagon");
        pentagonalPolygon.generatePolygon();
    }
}

