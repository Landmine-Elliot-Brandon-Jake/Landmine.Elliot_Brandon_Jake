import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class MineSweeper {
    private static final int NUM_MINES = 100;
    private static final int SIZE = 20;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mine Sweeper | # of mines: " + NUM_MINES);
        frame.add(new MineSweeperGUI(SIZE, SIZE, NUM_MINES));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

class MineSweeperGUI extends JPanel {
    private MineGrid grid;

    public MineSweeperGUI(int numRows, int numCols, int numMines) {
        grid = new MineGrid(numRows, numCols, numMines);

        setLayout(new GridLayout(numRows, numCols));
        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j < numCols; j++) {
                JButton button = new JButton();
                add(button);
                button.addActionListener(new ButtonHandler(i,j, grid));
            }
        }
    }
}
