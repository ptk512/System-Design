package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
//        Shape shapeObj = shapeFactoryObj.getShape("Circle");
//        Shape shapeObj = shapeFactoryObj.getShape("Rectangle");
        Shape shapeObj = shapeFactoryObj.getShape("Square");
        shapeObj.draw();
    }
}
