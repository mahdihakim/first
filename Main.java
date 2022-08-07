import java.util.Scanner; // import the Scanner class 

class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }
  static boolean palindrome(String ch)
  {
    boolean res=false;
    return res;
  }
  static boolean existe(String ch1 , String ch2)
  {
    boolean res=false;
    return res;
  }
  static int nboccurence(String ch1 , String ch2)
  {
    int res=0;
    return res;
  }

  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String ch1,ch2;
     System.out.println("ch1:");
     ch1 = input.next();
     System.out.println("ch2:");
     ch2 = input.next();
     if (palindrome(ch1))
      System.out.println(ch1 + "est un palindrome");
    else
    System.out.println(ch1 + "n'est pas un palindrome");

    if (palindrome(ch2))
    System.out.println(ch2 + "est un palindrome");
  else
  System.out.println(ch2 + "n'est pas un palindrome");
     existe(ch1, ch2);
     nboccurence(ch1, ch2);

  }
   

}