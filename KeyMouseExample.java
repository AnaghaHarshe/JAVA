import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyMouseExample extends JFrame implements KeyListener, MouseListener {
    private JLabel label;

public KeyMouseExample() {
        super("Key and Mouse Example");
        setLayout(new FlowLayout());

        label = new JLabel("Press a key or click a mouse button");
        add(label);

        addKeyListener(this);
        addMouseListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override  
    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    public static void main(String[] args) {
        new KeyMouseExample();
    }
}