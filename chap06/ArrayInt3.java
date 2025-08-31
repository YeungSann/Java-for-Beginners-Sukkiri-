//
import java.util.Scanner;
import java.util.Random;
class ArrayInt3{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random  rand  = new Random();

    System.out.print("please enter the number of elements: ");
    int   n = stdIn.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++){
      int val;
      do{
        val = rand.nextInt(1,10) + 1;
      }while (val == a[i - i] && i > 0);
      a[i] = val;
    }

    for (int i = 0; i < n; i++){
      System.out.println("a[" + i + "] = " + a[i]);
    }
    System.out.println();
  }
}
