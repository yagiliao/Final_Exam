
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JPanel;

public class Renderer extends JPanel{
    private static final long serioLVersionUID=1L;

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }

}