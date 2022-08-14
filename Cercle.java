import java.util.Scanner;
public class Cercle {
    Scanner myobj=new Scanner(System.in);
    Point c;
    Double r;
    Cercle()
    {
        c=new Point();
        System.out.println("donner r:");
        myobj.nextDouble();
    }
    double Perimetre()
    {
        return 2*Math.PI*r;
    }
    double Surface() 
    {
        return Math.PI*r*r;
    }
    void afficher()
    {
        c.afficher()
        System.out.println("r="+r);
        System.out.println("surface="+Surface());
    }
}
