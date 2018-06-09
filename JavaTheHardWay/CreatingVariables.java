public class CreatingVariables {
  public static void main(String [] args) {
    int x, y, age, thing1, thing2;
    double seconds, e, checking, thingx;
    String firstName, lastName, title, phrase;

    x = 10;
    y = 400;
    age = 39;
    thing1 = 7;
    thing2 = 9;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    thingx = 2.25;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    phrase = "nifty";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." ) ;
    System.out.println( "A favorite irrational # is Eurler's number: " + e);
    System.out.println( "Hopefully you have more than $" + checking + "!");
    System.out.println( "My name's " + " " + title + firstName + lastName);
    System.out.println( "9 x 7 is " + (thing1*thing2));
    System.out.println( "1 + 1.25 is " + thingx + ". " + "This is " + phrase);
  }
}
