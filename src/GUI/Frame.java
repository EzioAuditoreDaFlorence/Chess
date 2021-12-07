package GUI;

import javax.swing.JFrame;

public class Frame extends JFrame {

    Frame() {
        add(new BoardPanel());

        setUpFrame();
    }

    private void setUpFrame() {
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Chess");
    }
}
