package FactoryPattern;

public class ShapeFactory {

    /*** Shape is an interface so shape factory here using has-A relation with shape interface */
    Shape getShape(String input){

        switch (input){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;

        }

    }
}
