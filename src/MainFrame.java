import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(String title, boolean resizable, int[] size) {
        this.setTitle(title);
        this.setResizable(resizable);
        this.setSize(size[0],size[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
    }

    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }

    public void updateInfo(String title, boolean resizable, int[] size, boolean visible) {
        this.setTitle(title);
        this.setResizable(resizable);
        this.setSize(size[0],size[1]);
        this.setVisible(visible);
    }


}
