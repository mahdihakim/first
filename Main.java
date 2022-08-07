import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    //Define variables
    Scanner mynumber = new Scanner(System.in);
   int[] t;
    int s=0,min,max ,temp, n;

    //Get size of array
    System.out.println("donner un nombre n:"); 
    n = mynumber.nextInt(); 
    // create array of int
    t=new int[n];
    //get elements
    for(int i=0;i<n;i++)
    {
      System.out.println("donner t["+i+"]:"); 
      t[i]= mynumber.nextInt(); 
    }
    //Compute sum,min and max
    min=t[0];
    max=t[0]; 
    for(int i=0;i<n;i++)
    {
      s+=t[i];
      if (t[i]<min)
          min=t[i];
      else
        if(t[i]>max)
          max=t[i];
    }
    System.out.println("s="+s+" max= "+max+ " min= "+min );
    //reverse
    int[] r;
    r=new int[n];
    for(int i=0;i<n;i++)
      r[i]=t[n-i-1];
    //print r
    for(int i=0;i<n;i++)
      System.out.print(r[i] + " ");
    System.out.println();
 

      //trie
      for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
          if(t[i]>t[j])
          {
            temp=t[i];
            t[i]=t[j];
            t[j]=temp;

          }
    //print t
    for(int i=0;i<n;i++)
      System.out.print(t[i] + " ");
    System.out.println();

      
  
  
}
}