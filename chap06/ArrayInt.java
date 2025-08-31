//
import java.util.Random;
import java.util.Scanner;
class ArrayInt{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random  rand  = new Random();

    System.out.print("please enter the number of elements: ");
    int   n = stdIn.nextInt();
    int[] a = new int[n];

    //System.out.println("now, please enter the value of element.");
    for (int i = 0; i < n; i++){
      //System.out.print("the value of element " + i + ": ");
      a[i] = rand.nextInt(1,11);
      //System.out.println();
    }
    for (int i = 0; i < n; i++){
      System.out.println("a[" + i + "] = " + a[i]);
    }
    System.out.println();
  }
}
