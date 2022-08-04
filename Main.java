import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    //Define variables
    Scanner mynumber = new Scanner(System.in);
    int s=0 , n;

    //Get n
    System.out.println("donner un nombre n:"); 
    n = mynumber.nextInt();   

    //Compute sum 
    int i = 0;
    while (i <= n) {
     s=s+i;
      i++;
    }
    System.out.println("s="+s);
}
}