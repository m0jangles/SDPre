import java.util.Scanner;

public class ComparingNumbers {
  public static void main(String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print( "Second: ");
    second = keyboard.nextDouble();

    if (first < second){
      System.out.println(first + " is LESS THAN " + second);
    }
    if (first <= second ){
      System.out.println(first + " is LESS THAN/EQUAL TO " + second);
    }
    if (first == second){
      System.out.println(first + " is EQUAL TO " + second);
    }
    if (first >= second){
      System.out.println(first + " is GREATER THAN/EQUAL TO " + second);
    }
    if (first > second){
      System.out.println(first + " is GREATER THAN " + second);
      }
    if (first != second){
      System.out.println(first + " is NOT EQUAL TO " + second);
      System.out.println( "Hey. ");
    //Drill #1, hey is not part of the body of the last statement
    //and will always print in this code
    //if you add curley braces and include the "hey" statement
    //in the body of the last statement, it will get skipped
    //if the statement is not true, it will print if the statement
    //is true
  }
  }
}
