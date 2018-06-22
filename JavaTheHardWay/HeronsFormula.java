public class HeronsFormula{
  public static void main(String[] args ){
    double a, g;
    String tws = "A triangle with sides ";

    a = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3, 3, 3 has area " + a);

    a = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3, 4, 5 has area " + a);
    g = triangleArea(7, 8, 9);
    System.out.println(tws + "7, 8, 9 has area " + g);

    System.out.println(tws + "5, 12, 13 has area " + triangleArea(5, 12, 13) );
    System.out.println(tws + "10, 9, 11 has area " + triangleArea(10, 9, 11) );
    System.out.println(tws + "8, 15, 17 has area " + triangleArea(8, 15, 17) );
  }

  // This function computes the area of a triable with side lengths a, b, & c
  public static double triangleArea( int a, int b, int c) {
    double s, A;

    s = (a+b+c) / 2.0;
    A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
    // After computing the area, yo must "return" the computed value:

    return A;

    // the version that does not use a function is longer
    // when changing 2 to 2.0 in the long verson, you would have to
    // change it 6x instead of just the one time\
    // to find the area of a triangle with sides 9, 9, 9, we could
    // plug the numbers into the function whereas, in the long version
    // we would have to define each variable, type out the formula and print
    // the result
  }
}
