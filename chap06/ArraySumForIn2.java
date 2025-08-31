//
import java.util.Scanner;
class ArraySumForIn2{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("how many elements do you want to enter: ");
    int n = stdIn.nextInt();
    double[] a = new double[n];

    System.out.println("please enter the value of element.");
    for (int i = 0; i < n; i++) {
      System.out.print("the value of element " + (i + 1) + " : ");
      a[i] = stdIn.nextDouble();
    }System.out.println();

    double sum = 0;
    for (double i : a){
      sum += i;
    }
    double ave = (double)sum / n;
    System.out.println("the total of elements is: " + sum + ".");
    System.out.println("the average of elements is: " + ave + ".");
  }
}
