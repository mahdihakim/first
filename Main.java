import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    //Define variables
    Scanner mynumber = new Scanner(System.in);
    int f=1 , n;

    //Get n
    System.out.println("donner un nombre n:"); 
    n = mynumber.nextInt();   

    //Compute sum 
    for(int i=1;i<=n;i++)
    f=f*i ;
      
  
    System.out.println("f="+f);
}
}