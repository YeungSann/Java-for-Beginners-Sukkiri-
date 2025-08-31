//
import java.util.Scanner;
class ReadPlusInt{
  static Scanner stdIn = new Scanner(System.in);
  //
  static int printPlusInt() {
    int cont;
    do {
      System.out.print("please enter a positive integer: ");
      cont = stdIn.nextInt();
    }while (cont <= 0);
    return cont;
  }

  public static void main(String[] args){
    System.out.println("the number is: " + printPlusInt());
  }
}
