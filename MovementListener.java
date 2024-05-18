import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class MovementListener implements KeyListener {

        private MainScene mainScene;



        public MovementListener(MainScene mainScene){
            this.mainScene=mainScene;
        }

        public void keyTyped(KeyEvent e) {
            System.out.println("keyPressed");
        }


        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed");
            if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                this.mainScene.getCar1().moveRight();}
            else if(e.getKeyCode()==KeyEvent.VK_LEFT){
                this.mainScene.getCar1().moveLeft();
            }
            this.mainScene.repaint();

        }


        public void keyReleased(KeyEvent e) {
            System.out.println("keyPressed");
            this.mainScene.getCar1().explode();
            this.mainScene.repaint();
        }
    }