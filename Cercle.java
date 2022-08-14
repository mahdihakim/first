import java.util.Scanner;
public class Cercle {
    Scanner myobj=new Scanner(System.in);
    Point center;
    Double r;
    Cercle()
    {
        center=new Point();
        System.out.println("donner r:");
        r=myobj.nextDouble();
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
        center.afficher();
        System.out.println("r="+r);
        System.out.println("surface="+Surface());
    }
    public static void main(String[] args) {
        Cercle c=new Cercle();
        c.center.x=3;
        c.r=4.0;
        c.afficher();
        
    }
}
