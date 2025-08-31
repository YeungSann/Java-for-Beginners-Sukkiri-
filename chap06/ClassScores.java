//
import java.util.Scanner;
class ClassScores{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int[][] a = {
      {50, 63, 72},
      {79, 43}
    };

    int total1 = 0; int total2 = 0;
    int sum = 0; double ave1 = 0.0 ; double ave2 = 0.0;
    int j;
    for (int i = 0; i < 2; i++){
      for (j = 0; j < a[i].length; j++){
          if (i ==0) {total1 += a[0][j];}
          else {total2 += a[1][j];}
      }
      ave1 = (double)total1 / 3.0;
      ave2 = (double)total2 / 2.0;
      sum = total1 + total2;
    }
    System.out.println("the total scores of class 1 is: " + total1);
    System.out.println("the average scores of class 1 is: " + ave1);
    System.out.println("the total scores of class 2 is: " + total2);
    System.out.println("the average scores of class 2 is: " + ave2);
    System.out.println("the total scores of class 1 and 2 is: " + sum);
    System.out.println("the average scores of class 1 and 2 is: " + (sum / 5.0));
  }
}
