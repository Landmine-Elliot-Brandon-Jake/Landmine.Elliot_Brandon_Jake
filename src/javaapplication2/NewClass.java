
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//controller
class ButtonHandler implements ActionListener {
    private int row, col;
    private MineGrid grid;

    public ButtonHandler(int x, int y, MineGrid g) {
        row = x;
        col = y;
        grid = g;
    }

    public void actionPerformed(ActionEvent event) {
        if(grid.containsMineAt(row, col)) {
            JOptionPane.showMessageDialog(null, "OOOPS!!");
            System.exit(0);
        } else {
            JButton button = (JButton)event.getSource();
            button.setText(String.valueOf(grid.getInfoAt(row, col)));
        }
    }
}


