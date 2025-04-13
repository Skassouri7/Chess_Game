import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 1200;
    private static final JFrame window = new JFrame("Chess Game");

    public GUI(){
        initialize();
    }

    public void initialize(){
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(new BoxLayout(window, BoxLayout.X_AXIS, null));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        menu();
    }

    public void menu(){
        window.add(createButton(450, 500, "Start"));
        window.add(createButton(450, 560, "Settings"));
        window.add(createButton(450, 620, "Exit"));
    }

    public JButton createButton(int x, int y, String buttonText){
        JButton button = new JButton(buttonText);
        button.setSize(100, 100);
        button.setBackground(Color.WHITE);
        button.setBounds(x, y, 300, 50);
        return button;
    }
}
