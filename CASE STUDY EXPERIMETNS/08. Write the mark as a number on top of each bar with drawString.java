Program:

import java.awt.*;
import java.awt.event.*;

public class BarChart extends Frame {
    int[] marks = {78, 91, 45, 66, 88};
    String msg = "Click a bar";

    public BarChart() {
        setTitle("Bar Chart");
        setSize(350, 220);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int i = (e.getX() - 20) / 50;

                if (i >= 0 && i < 5) {
                    msg = "Subject " + (i + 1) + " = " + marks[i];
                    repaint();
                }
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 60);

        for (int i = 0; i < marks.length; i++) {
            int x = 20 + i * 50;
            int height = marks[i];

            g.setColor(marks[i] >= 50 ? Color.GREEN : Color.RED);
            g.fillRect(x, 180 - height, 35, height);

            g.setColor(Color.BLACK);
            g.drawString(String.valueOf(marks[i]), x, 170 - height);
            g.drawString(String.valueOf(i + 1), x + 12, 195);
        }
    }

    public static void main(String[] args) {
        new BarChart();
    }
}
