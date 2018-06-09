public class MathOperations {
  public static void main(String[] args ) {
    int a, b, c, d, e, f, g, thing1;
    double x, y,z, thing2;
    String one, two, both;

    a = 10;
    b = 27;
    System.out.println( "a is " + a + ", b is " + b);
    c = a + b;
    System.out.println( "a+b is " + c);
    d = a - b;
    System.out.println( "a - b is " + d);
    e = a+b*3;
    System.out.println( "a+b*3 is " + e);
    f = b/2;
    System.out.println( "b/2 is " + f);
    g = b%10;
    System.out.println( "b%10 is " + g);

    x = 1.1;
    System.out.println( "\nx is " + x);
    y = x*x;
    System.out.println( "x*x is " +y);
    System.out.println();

    one = "dog";
    two = "house";
    both = one + two;

    thing1 = 5;
    thing2 = 1.24;

    System.out.println( both );
    System.out.println( "5*5 is " + (thing1*thing1) + "\n" + "10/5 is " + (a/thing1) + "\n" + "5-1.24 is " + (thing1-thing2) + "\n");
    System.out.println( "5 + 27 is " +(thing1 + b) + "\n" + "The remainder of 27/5 is " + (b%thing1));

  }
}
