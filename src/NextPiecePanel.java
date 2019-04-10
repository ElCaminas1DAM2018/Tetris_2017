
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class NextPiecePanel  extends JPanel {
    
    private Shape nextShape;
    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 5;
    
    
    public NextPiecePanel() {
        System.out.println("Constructor");
        nextShape = new Shape();
        repaint();
    }
    
    public Shape getNextShape() {
        return nextShape;
    }
    
    public void createNewShape() {
        nextShape = new Shape();
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=0; i<4; i++) {
            Board.drawSquare(g, 2 + nextShape.getY(i), 2 + nextShape.getX(i),
                                nextShape.getShape(), getSize().width/NUM_COLS, 
                                getSize().height/NUM_ROWS);
        }
    }
    
}
