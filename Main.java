import java.util.Scanner; // import the Scanner class 


class Main {
  public static void main(String[] args) {
    //Define variables
    Scanner mynumber = new Scanner(System.in);
    int a,b,c;
    double delta,x1,x2;

    //Get a,b,c
    System.out.println("donner un nombre a:"); 
    a = mynumber.nextInt();   
       
    System.out.println("donner un nombre b:"); 
    b = mynumber.nextInt();  

    System.out.println("donner un nombre c:"); 
    c = mynumber.nextInt();  

    //Compute delta
    delta=b*b - 4*a*c;

    //Test delta value
    if(delta >0)
    {
      x1=(-b-Math.sqrt(delta))/(2*a);
      x2=(-b+Math.sqrt(delta))/(2*a);
      System.out.println("Deux racines : x1 = " +x1 + " x2 = "+x2);
    }
    else if (delta==0)
    {
      x1=-b/(2*a);
      System.out.println("solution double : x = " +x1 );      
    }
    else 
      System.out.println("pas de solution");

  }
}
