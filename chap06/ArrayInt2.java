//
import java.util.Scanner;
import java.util.Random;
class ArrayInt2{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random  rand  = new Random();

    System.out.print("please enter the number of elements: ");
    int n = stdIn.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++){
      a[i] = rand.nextInt(1, 11);
    }

    for (int i = 0; i < n - 1; i++){
      if (a[i] == a[i + 1]) {
        a[i + 1] += 2;
        if (a[i + 1] > 10) {a[i + 1] -= 3;}
      }
      else a[i] = a[i];
    }
    for (int i = 0; i < n; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}
