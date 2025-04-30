/*
If S is a subtype of T, then objects of type T in a program may be
replaced with objects of type S without altering any of the
desirable properties of that program.
B extends A
 */

//public static class Rectangle {
//    protected int width;
//    protected int height;
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//
//}
//
//public static class Square extends Rectangle {
//    @Override
//    public void setWidth(int width) {
//        this.width = width;
//        this.height = width;  // Square must maintain equal sides
//    }
//
//    @Override
//    public void setHeight(int height) {
//        this.height = height;
//        this.width = height;  // Square must maintain equal sides
//    }
//}
//
//// Client code
//void areaCalculator(Rectangle rectangle) {
//    rectangle.setWidth(5);
//    rectangle.setHeight(4);
//    // Expects area to be 20
//    assert rectangle.getArea() == 20;  // Fails for Square
//}
/*
=================================
Square violates LSP because it changes behavior of setWidth and setHeight
Client code expecting Rectangle behavior breaks when given a Square
Square isn't truly substitutable for Rectangle in all contexts
 */




/*
public interface Shape {
    int getArea();
}

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

// Client code
void printArea(Eatable eatable) {
    System.out.println("Area: " + eatable.eatable());
}


==========================
Each shape controls its own properties appropriately
No unexpected behavior when working with different shape types
Code is more predictable and reliable
Interface defines a clear contract that all implementations must follow
 */












public  class LSP {
}