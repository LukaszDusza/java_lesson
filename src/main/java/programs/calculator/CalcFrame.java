package programs.calculator;

import javax.swing.*;
import java.awt.*;

class CalcFrame extends JFrame {
    JPanel calcPanel;

    public CalcFrame() {
        calcPanel = new CalculatorPanel();
        this.add(calcPanel);
        setPreferredSize(new Dimension(200,200));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
