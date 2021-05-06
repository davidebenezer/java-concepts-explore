package org.example;

interface InterfaceShape {
    String COMMON_SHAPE_TEXT = "Shape is a %s color %s"; //pulic static final automatically added for instance variables

    /** We cannot have constructors in Interfaces*/
    //    InterfaceShape(){
//    }
        String getShapeAndColor();
        String setColor(String color);//methods automatically gets public and abstract
    static class InnerClassOfInterface{
        int a;
    }
}

// A marker interface to define shapes which are just set of lines combined
interface ShapesOnlyHasLines{
}

class Rectangle implements InterfaceShape{
    //Abstract class will be a better fit since some of the common items can be put in parent class
    private static final String SHAPE = "Rectangle";

    public String getShapeAndColor() {
        return String.format(COMMON_SHAPE_TEXT, color, SHAPE);
    }

    @Override
    public String setColor(String color) {
        return this.color=color;
    }


    private String color;
    Rectangle(String color){
        super();
        this.setColor(color);
        //checking what super does in case of interface implementation
    }

}

class Triangle implements InterfaceShape, ShapesOnlyHasLines{
    public static final String SHAPE = "Triangle";
    private String color;

    Triangle(String color){
        this.setColor(color);
    }

    public String getShapeAndColor() {
        return String.format(COMMON_SHAPE_TEXT, color, SHAPE);
    }

    //making setter private so that nobody can set it without using shape method
    public String setColor(String color) {
        return this.color = color;
    }

    private String shapeAndColor;

}
