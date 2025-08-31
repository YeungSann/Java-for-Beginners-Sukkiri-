//
import java.util.Scanner;
class UnevennessArray2{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    int n;
    System.out.print("please enter the lines number of array: ");
    n = stdIn.nextInt();
    int[][] c = new int[n][];

    int a; //int b; int c;
    for (int i = 0; i < n; i++) {
      System.out.print("please enter the number of " + (i + 1) + " line: ");
      a = stdIn.nextInt();
      c[i] = new int[a];
    }

    System.out.println("please enter the value of elements.");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < c[i].length; j++){
        System.out.print("the value of c[" + i + "][" + j + "] = ");
        c[i][j] = stdIn.nextInt();
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < c[i].length; j++)
        System.out.printf("%3d", c[i][j]);
      System.out.println();
    }
  }
}
