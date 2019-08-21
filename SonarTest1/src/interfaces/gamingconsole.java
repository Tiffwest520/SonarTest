package interfaces;

public interface gamingconsole {
    public void up();
    public void down();
    public void left();
    public void right();
}
 class MarioGame implements gamingconsole{
     @Override
     public void up() {
         System.out.println("jump");
     }

     @Override
     public void down() {
         System.out.println("duck");
     }

     @Override
     public void left() {

     }
     @Override
     public void right() {
         System.out.println("go forward");
     }
 }

 class gameRunner {
     public static void main(String[] args) {
         gamingconsole [] games = {new MarioGame()};

         for (gamingconsole game:games) {
             game.up();
             game.down();
             game.left();
             game.right();
             }
         }
     }
