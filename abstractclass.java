public class abstractclass{
    public static void main(String arg[])
    {
       Fish f1=new Fish();
       f1.legs();
       }
}
abstract class Animal
{
    void eat()
    {
        System.out.print("it can eat");
    }
  abstract void legs();
}
class Fish extends Animal
{
  void legs()
  {
    System.out.print("It has no legs");
  }
}
class Bird extends Animal{
     void legs()
     {
        System.out.print("It has four legs");
     }
}


