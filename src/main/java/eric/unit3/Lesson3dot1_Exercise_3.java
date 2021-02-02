package eric.unit3;

import java.util.Arrays;
/*
 The Internet runs on web addresses. The addresses we type represent the IP address for each site and how the computer finds an individual web page.

IP addresses are made up of four numbers, each between 0 and 255 separated by a period. For example, 128.253.21.58 is an IP address.

Write a program to enter four numbers and test if they make up a valid IP address. In other words, test to see if the numbers entered are between 0 and 255 inclusive.

* To think about: Why is it important that we test for numbers 0 and� 255 inclusive?

* Want to know more?�Read about IP and subnets at Cornell University.

Sample run 1:

Enter the first octet:�256

Enter the second octet: 168

Enter the third octet: 10

Enter the fourth octet: 25

First octet in range? false

Second octet in range? true

Third octet in range? true

Fourth octet in range? true

256.168.10.25 is a valid IP address? false

Sample run 2:

Enter the first octet: 172

Enter the second octet: 16

Enter the third octet: 11

Enter the fourth octet: 215

First octet in range? true

Second octet in range? true

Third octet in range? true

Fourth octet in range? true

172.16.11.215� is a valid IP address? true
*/
import java.util.Scanner;

class Lesson3dot1_Exercise_3 {
  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      int[] octets = new int[4];
      System.out.print("Enter the first octet:   ");
      octets[0] = scanner.nextInt();
      System.out.print("Enter the second octet:  ");
      octets[1] = scanner.nextInt();
      System.out.print("Enter the third octet:   ");
      octets[2] = scanner.nextInt();
      System.out.print("Enter the fourth octet:  ");
      octets[3] = scanner.nextInt();
      
      var asString = "";
      for (int i : octets) {
        if (asString != "")
          asString += ".";
        asString += String.valueOf(i);
      }

      System.out.println(asString + " is a valid IP address? " + Arrays.stream(octets).allMatch(i -> i >= 0 && i < 256));
    }
  }
}