import java.util.Scanner;

public class EnterPin{
  public static void main(String[] args ){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String word;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("ENTER YOUR PASSWORD: ");
    word = keyboard.next();

    while ( ! word.equals("password")){
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD: ");
      word = keyboard.next();
    }
    System.out.println("\nPASSWORD ACCEPTED.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
    }
}
