import javax.swing.*;
import java.awt.*;

public class MainScene extends JPanel {
    private Car car1;
    private Car car2;
    public Car getCar1() {
        return car1;
    }
    public MainScene(int x, int y, int width, int heigth){
        this.setBounds(x,y,width,heigth);
        this.setBackground(Color.DARK_GRAY);
        this.car1=new Car(500,70);
        this.car2=new Car(350,175);
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(new MovementListener(this));
    }
protected void paintComponent(Graphics g){
        super.paintComponent(g);
    g.fillRect(10,160,100,10);
    g.fillRect(10,260,100,10);
    g.fillRect(10,360,100,10);
    g.fillRect(10,460,100,10);
    g.fillRect(210,160,100,10);
    g.fillRect(410,160,100,10);
    g.fillRect(210,260,100,10);
    g.fillRect(410,260,100,10);
    g.fillRect(210,360,100,10);
    g.fillRect(410,360,100,10);
    g.fillRect(210,460,100,10);
    g.fillRect(410,460,100,10);
    g.fillRect(610,160,100,10);
    g.fillRect(810,160,100,10);
    g.fillRect(610,260,100,10);
    g.fillRect(810,260,100,10);
    g.fillRect(610,360,100,10);
    g.fillRect(810,360,100,10);
    g.fillRect(610,460,100,10);
    g.fillRect(810,460,100,10);
        this.car1.paint(g);
        this.car2.paint(g);
}
}
