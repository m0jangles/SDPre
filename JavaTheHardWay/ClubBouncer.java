public class  ClubBouncer{
  public static void main(String[] args ){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals ("F") && allure >= 8)){
      System.out.println( "You are allowed to enter the clube. ");
    }
    System.out.println( "Testy McTesterson");
    else {
      System.out.println("You are not allowed to enter the club");
    }

    //code does not complie with println statement after the if
    //statement.  Code requires an if statement before it will print

    }
  }

}
