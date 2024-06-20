public class multipleinhertiance {
    public static void main(String arr[])
    {
       beer p=new beer();
       p.eatgreen();
       p.eatmeat();
    }

}
    interface Herbivores
    {
       void eatgreen();
    }
    interface Carnivores
    {
        void eatmeat();
    }
    class beer implements Herbivores,Carnivores{
       public  void eatgreen()
        {
            System.out.println("It eats green");
        }
        public  void eatmeat()
        {
            System.out.println("It eats meat");
        }
    }

