package Task3;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }

        //Return null if the shape type isn't recognized
        System.out.println("Invalid shape type provided");
        return null;
    }

}
