package GUI;

import javax.swing.JPanel;
import java.awt.*;

public class BoardPanel extends JPanel {
    final int SIZE = 600;

    BoardPanel() {
        setPreferredSize(new Dimension(SIZE,SIZE));
    }

    //paint everything here
    @Override
    protected void paintComponent(Graphics g) {

        //paint grid
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row+col)%2==1) {
                    g.setColor(Color.cyan);
                    g.fillRect(row*(SIZE/8),col*(SIZE/8),SIZE/8,SIZE/8);
                }
            }
        }
    }
}
