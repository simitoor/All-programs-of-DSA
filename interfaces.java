public class interfaces {
    public static void main(String arr[])
   {
     pawn p=new pawn();
     p.moves();
   }
}
   interface Chessplayer
   {
    void moves();
   }
   class pawn implements Chessplayer
   {
    public void moves(){
    System.out.print("up,down");
    }
   }
   class King implements Chessplayer
   {
    public void moves(){
        System.out.print("up,down,right,left");
    }
   }

