import java.util.Scanner;

public class RudeQuestions{
  public static void main (String[] args ) {
    String name, eggs;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? ");
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old.");
    System.out.print( "How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!");
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");

    System.out.print( "Do you watch GoT? ");
    eggs = keyboard.next();

    System.out.println( eggs + " ?" + " I can't wait for the next season.");

    //No, the program does not blow up when you enter an integer when the program
    //is expecting a double because floating point variables can hold integers
    //No, the program does not blow up when you enter a numeric value when the program
    //is expecting a string because a string input can be a numeric value
    //If I enter an import statement, for example, the import statement for the
    //scanner library, the program blows up after the first question because this is
    //part of the code and it probably confuses the program

  }
}
