public class Sphere extends Cercle {
    Sphere(){
        System.out.println("constructeur de la class Sphere");
    }
    double volume()
    {
        return (4/3)*Math.PI*r*r*r;
    }   
    void afficher()
    {
        super.afficher();
        System.out.println("le volume est: "+volume());
        
    } 
    public static void main(String args[]){
        Sphere S=new Sphere();
        S.center.x=8;
        S.r=3.0;
        S.afficher();
    }
        
    }
    
