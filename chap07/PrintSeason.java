//
import java.util.Scanner;
class PrintSeason{
  static void printSeason(int n) {
    if (n >= 3 && n <= 5)  {System.out.println("it's spring.");}
    else if (n >= 6 && n <= 8)  {System.out.println("it's summer.");}
    else if (n >= 9 && n <= 11) {System.out.println("it's fall.");}
    else if (n == 12 || n == 1 || n == 2) {System.out.println("it's winter.");}
    else {System.out.println();}
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("please enter the month of season: ");
    int n = stdIn.nextInt();
    printSeason(n);
  }
}
