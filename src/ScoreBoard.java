
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class ScoreBoard extends javax.swing.JPanel {
    
    private int score;
    
    
    

    /**
     * Creates new form ScoreBoard
     */
    public ScoreBoard() {
        initComponents();
        score = 0;
    }

    public void reset() {
        score = 0;
        increment(0);
        scoreLabel.setForeground(Color.black);
    }
    
    public void increment(int inc) {
        score += inc;
        scoreLabel.setText("Sore: "+score);
    }
    
    public void displayGameOver() {
        scoreLabel.setText("GAME OVER. " + score + " points");
        scoreLabel.setForeground(Color.red);
    }
    
    public int getScore() {
        return score;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();

        scoreLabel.setText("Score: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(scoreLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}