public class Animal extends Thread {

  String name="";
    public static void main(String[] args) {
        Animal thread = new Animal("lapin");
        Animal thread2 = new Animal("tortue");
      thread.start();
      thread2.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
      for (int i=0; i<1000;i++)
        System.out.println("name = " + name + "i = "+i);

    }
    Animal(String s)
    {
      name = s;
    }
  }
  