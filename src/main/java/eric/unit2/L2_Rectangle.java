package eric.unit2;

/*
Given the public class rectangle with two public variables width and height,
code four overloaded constructors and a method to print both measures (width and height).

The default constructor
A constructor that receives the width of the rectangle
A constructor that receives both dimension of the rectangle
A public method with no return that prints width and height.
 */

class Rectangle {
    public int width = 10;
    public int height = 20;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.print("width="+width+", height="+height);
    }
}