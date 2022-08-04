import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    //Define variables
    Scanner mynumber = new Scanner(System.in);
    int s=1 , n;

    //Get n
    System.out.println("donner un nombre n:"); 
    n = mynumber.nextInt();   

    //Compute sum 
    int i = n;
    while (i > 0) {
     s=s*i;
      i--;
    }
    System.out.println("s="+s);
}
}