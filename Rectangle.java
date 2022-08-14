public class Rectangle {
    Point A,B;
    Rectangle(){
        A=new Point();
        B=new Point();
    }
    double Length()
    {
       Point C =new Point(A.x,B.y);
       return C.distance(A);
    }
    double Width ()
    {
        Point C =new Point(A.x,B.y);
       return C.distance(B);
    }
    double surface()
    {
        return Length()*Width();
    }
    double Perimetre()
    {
        return (Length()+Width())*2;
    }
    void afficher()
    {
        System.out.println("la surface et"+surface()+" le perimetre et"+Perimetre());
    }

public static void main(String args[])
{
    Rectangle r=new Rectangle();
    r.afficher();
}

    

}
