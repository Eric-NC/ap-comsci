package eric.unit2;

/*
 Write a Java method to compute the average of three numbers. 
 The method declaration and call must be in different classes.


Sample run: 
Input the first number: 25
Input the second number: 45
Input the third number: 65
The average value is 45.0
*/

class Class_A {
  private int num1;
  private int num2;
  private int num3;

  public Class_A(int num1, int num2, int num3) {
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
  }

  public void printAverage() {
    System.out.println("The average value is " + (num1 + num2 + num3) / 3d);
  }
}