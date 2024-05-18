import java.awt.*;

public class Car {
    private int x;
    private int y;
    public static final int BODY_WEIGTH=150;
    public static final int BODY_HEIGTH=80;
    private boolean visible;
    public Car(int x, int y){
        this.x=x;
        this.y=y;
this.visible=true;

    }

    public void paint(Graphics g){
       if(this.visible) {
           g.setColor(Color.CYAN);
           g.fillRect(this.x, this.y, BODY_WEIGTH, BODY_HEIGTH);

           g.fillRect(this.x + BODY_WEIGTH, this.y + BODY_HEIGTH / 2, BODY_WEIGTH / 4, BODY_HEIGTH / 2);
           g.fillOval(this.x, this.y + BODY_HEIGTH - BODY_HEIGTH / 4 / 2, BODY_WEIGTH / 4, BODY_WEIGTH / 4);
           g.fillOval(this.x + BODY_WEIGTH - BODY_WEIGTH / 4, this.y + BODY_HEIGTH - BODY_HEIGTH / 4 / 2, BODY_WEIGTH / 4, BODY_WEIGTH / 4);
       }else{
           g.setColor(Color.RED);
g.fillRect(0,0,1000,1000);

       } }



    public void moveRight(){
        this.x++;
    }
    public void moveLeft(){
        this.x--;
    }
public void explode(){
   this.visible=false;
}
}
