//
import java.util.Scanner;
import java.util.Random;
class MentalArithmetic4{
  static Scanner stdIn = new Scanner(System.in);
  static Random  rand  = new Random();

  static boolean confirmRetry() {
    int cont;
    do {
      System.out.print("one more training? <Yes...1 / No...0>: ");
      cont = stdIn.nextInt();
    }while (cont != 0 && cont != 1);
    return cont == 1;
  }

  static int calculation(int x, int y, int z, int i) {
    //int i = rand.nextInt(4);
    int result = 0;

    switch (i) {
    case 0: {result = x + y + z;
      System.out.print(x + " + " + y + " + " + z + " = "); break;}
    case 1: {result = x + y - z;
      System.out.print(x + " + " + y + " - " + z + " = "); break;}
    case 2: {result = x - y + z;
      System.out.print(x + " - " + y + " + " + z + " = "); break;}
    case 3: {result = x - y - z;
      System.out.print(x + " - " + y + " - " + z + " = "); break;}
      }
      return result;
    }

    public static void main(String[] args){
      System.out.println("mental arithmetic training.");
      do {
        int x = rand.nextInt(900) + 100;
        int y = rand.nextInt(900) + 100;
        int z = rand.nextInt(900) + 100;
        int i = rand.nextInt(4);

        int answer = calculation(x, y, z, i);
        while (true) {
          //System.out.print("please enter the calculate result of " + calculation(x, y, z, i));
          int k = stdIn.nextInt();
          if (k == answer)
            break;
          System.out.println("your answer is wrong!");
        }
      }while (confirmRetry());
    }
}
