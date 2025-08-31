//
import java.util.Scanner;
class ReverseArray2{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("please enter the number of elements: ");
    int n = stdIn.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    System.out.println("enter the value of element.");
    for (int i = 0; i < n; i++){
      System.out.print("enter the value of element " + i + 1 + ": ");
      a[i] = stdIn.nextInt();
    }
    System.out.println();

    for (int i = 0; i < n; i++){
      b[i] = a[n - i - 1];
    }
    for (int i = 0; i < n; i++)
      System.out.println("b[" + i + "] = " + b[i]);
    System.out.println();
  }
}
