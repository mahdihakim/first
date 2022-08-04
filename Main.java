import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    //Define variables
    Scanner mynumber = new Scanner(System.in);
    int s=0 , n;

    //Get n
    System.out.println("donner un nombre n:"); 
    n = mynumber.nextInt();   

    //compute n
    int u=2;
    for(int i=0;i<n;i++)
      u=3*u+4;
    
   System.out.println("u="+u);
}
}