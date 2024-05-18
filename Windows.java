import javax.swing.*;

public class Windows extends JFrame {
    public static final int WINDOW_WIDTH=1000;
    public static final int WINDOW_HEIGTH=600;


    public Windows(){
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGTH);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
MainScene mainScene = new MainScene(WINDOW_WIDTH/8,0,WINDOW_WIDTH,WINDOW_HEIGTH);
this.add(mainScene);
//ManePanel mainPanel =new ManePanel(0,0,WINDOW_WIDTH/8,WINDOW_HEIGTH);
//this.add(mainPanel);
        this.setVisible(true);
    }

}
