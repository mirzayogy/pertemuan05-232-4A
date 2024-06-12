import javax.swing.JFrame;

public class MyFrame extends JFrame{

    public static void main(String[] args) {
        MyFrame m = new MyFrame();
        m.setVisible(true);
        m.setSize(460,320);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}