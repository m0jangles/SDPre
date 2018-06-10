import java.util.Scanner;

public class BMICalculator{
  public static void main(String [] args ){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, weight;
    int feet, inches;

    System.out.print( "Your height (feet only)? ");
    feet = keyboard.nextInt();

    System.out.print( "What is your height (inches only)? ");
    inches = keyboard.nextInt();

    System.out.print( "Your weight in lbs? " );
    weight = keyboard.nextDouble();

    kg = weight * 0.453592;
    m = ((feet * 12) + inches) * 0.0254;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
