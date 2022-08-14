import java.util.Scanner;
public class Point {
    double x;
    double y;
    Scanner myobj=new Scanner(System.in);
    //Déclaration des constructeur
    Point(){
        System.out.println("donner x:");
        x=myobj.nextDouble();
        System.out.println("donner y:");
        y=myobj.nextDouble();
    }
    Point(double a,double b)
    {
        x=a;
        y=b;
    }
    double distance (Point p)
    {
        double res;
        res=Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
        return res;
    }
    void deplacer(int a,int b)
    {
        x+=a;
        y+=b;
    }
    void afficher()
    {
        System.out.println("x=" +x+"y="+y);
    }
}


    
}
