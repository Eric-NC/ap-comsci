package eric.unit2;

/*
Create 4 object based on your java class rectangle according 
to the following requirements, and print the dimension of each one of them.

Your first rectangle object needs to use the default constructor
The dimensions should be the default one (Width = 10, height =20)
The second rectangle object must have measure 35 in one side.
Dimension should be width=35, height=20

The third rectangle object must be 50x100
Dimension should be width=50, height =100
Use any of the constructors for the last rectangle object
*/

@SuppressWarnings("unused")
class Lesson2dot2_Exercise_2 {
    public static void main(String args[]) {
        var first = new Rectangle();
        var second = new Rectangle(35, 20);
        var third = new Rectangle(50, 100);
    }
}