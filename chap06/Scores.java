//
import java.util.Scanner;
class Scores{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int[][] a = new int[6][2];

    System.out.println("please enter the English scores of 6 students.");
    for (int i = 0, j = 0; i < 6; i++){
      System.out.print("please enter the score of student " + (i + 1) + ": ");
      a[i][j] = stdIn.nextInt();
    }

    System.out.println("please enter the math scores of 6 students.");
    for (int i = 0, j = 1; i < 6; i++){
      System.out.print("please enter the score of student " + (i + 1) + ": ");
      a[i][j] = stdIn.nextInt();
    }

    System.out.println("English  math");
    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 2; j++)
        System.out.printf("%6d", a[i][j]);
      System.out.println();
    }

    int total_english = 0; int total_math = 0;
    for (int i = 0; i < 6; i++){
      total_english += a[i][0];
      total_math += a[i][1];
    }
    System.out.println("total English scores is: " + total_english);
    System.out.println("total math scores is: " + total_math);

    //for (int i = 0, j = 1; i < 6; i++){
      //total_math += a[i][j];
    //}
    //System.out.println("total math scores is: " + total_math);

    int[] student_scores = new int[6];
    double[] student_ave = new double[6];
    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 2; j++){
        student_scores[i] += a[i][j];
      }
      student_ave[i] = student_scores[i] / 2;
      System.out.println("the student " + (i + 1) + " average scores is: "  + student_ave[i]);
    }

    double math_ave; double english_ave; //int student_ave;
    math_ave = (double)total_math / 6;
    english_ave = (double)total_english / 6;
    //student_ave = student_scores / 2;
    System.out.println("the math average scores is: " + math_ave);
    System.out.println("the English average scores is: " + english_ave);
    //System.out.println("the student average scores is: " + student_ave);
  }
}
