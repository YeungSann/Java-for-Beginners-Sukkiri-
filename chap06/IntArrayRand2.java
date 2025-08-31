//
import java.util.Scanner;
import java.util.Random;
class IntArrayRand2{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random  rand  = new Random();

    System.out.print("number of elements: ");
    int   n = stdIn.nextInt();
    int[] a = new int[n];

    int max = 0;
    for (int i = 0; i < n; i++){
      a[i] = rand.nextInt(10);
      if (a[i] > max) max = a[i];}

    for (int i = max; i > 0; i--){
      for (int j = 0; j < n; j++){
        if (a[j] >= i) {System.out.print(" * ");}
        else {System.out.print("   ");}
        }
        System.out.println();
        //System.out.print(" " + (i % 10) + " ");
        //System.out.println();
      }
      for (int i = 0; i < n; i++){
        System.out.print("---");
      }

      System.out.println();

      for (int i = 0; i < n; i++){
        //System.out.print("---");
        //System.out.println();
        System.out.print(" " +  (i % 10) + " ");
      }
      System.out.println();
    }
  }
