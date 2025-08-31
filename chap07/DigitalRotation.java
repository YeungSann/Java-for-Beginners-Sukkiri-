//
import java.util.Scanner;
class DigitalRotation{

  //
  static int rRotate(int x, int n){
    for (int i = 1; i <= n; i++){
      if ((x & 1) == 1) {
        x = (x >> 1) | 0x80000000;}
      else x = x >> 1;
    }
    return x;
  }

  //
  static int lRotate(int x, int n){
    for (int i = 1; i <= n; i++){
      if ((x & 0x80000000) != 0){
        x = (x << 1) | 1;}
      else x = x <<1;
    }
    return x;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("this program can rotate the digital.");
    System.out.print("please enter the number you want to rotate: ");
    int x = stdIn.nextInt();
    System.out.print("please enter the rotate number: ");
    int n = stdIn.nextInt();

    System.out.print("right rotate: ");
    System.out.println(rRotate(x, n));

    System.out.print("left rotate: ");
    System.out.println(lRotate(x, n));
  }
}
