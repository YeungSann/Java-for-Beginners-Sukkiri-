//
import java.util.Scanner;
import java.util.Random;
class LinearSearch2{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random  rand  = new Random();

    final int n = rand.nextInt(1, 31);
    int[] a = new int[n];

    System.out.print("the all elements is a = {");
    for (int j = 0; j < n; j++){
      a[j] = rand.nextInt(20);
      if (j < (n - 1)) {System.out.print(a[j] + ", ");}
      else {System.out.println(a[j] + "}");}
    }
    System.out.print("please enter the value you want to searched: ");
    int key = stdIn.nextInt();

    int i;
    for (i = (n - 1); i >= 0; i--){
      if (a[i] == key)
        break;
    }
    if (i >= 0) {System.out.println("the element of the key you entered is: " + i);}
    else {System.out.println("the element does not exist.");}
  }
}
