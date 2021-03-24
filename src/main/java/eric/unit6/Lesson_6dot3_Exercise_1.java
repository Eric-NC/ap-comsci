package eric.unit6;

class Lesson_6dot3_Exercise_1 {

  public static void main(String args[]) {
    int[] arr = { 4, 1, 3, 6, 2, 9 };
    System.out.println(divBySum(arr, 3));
    System.out.println(divBySum(arr, 5));
  }

  public static int divBySum(int[] arr, int num) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % num == 0) {
        sum += arr[i];
      }
    }
    return sum;
  }
}