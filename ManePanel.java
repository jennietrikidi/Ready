import javax.swing.*;
import java.awt.*;

public class ManePanel extends JPanel {
    public ManePanel(int x, int y, int width,int heigth){
        this.setBounds(x,y,width,heigth);
        this.setBackground(Color.LIGHT_GRAY);
GridLayout gridLayout = new GridLayout(6,1);
this.setLayout(gridLayout);
this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());

    }

}
