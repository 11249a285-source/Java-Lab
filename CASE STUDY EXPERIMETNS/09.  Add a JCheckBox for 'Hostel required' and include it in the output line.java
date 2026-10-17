Program:

import javax.swing.*;
import java.awt.*;

public class RegisterForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setLayout(new FlowLayout());

        JTextField name = new JTextField(14);

        JComboBox<String> br = new JComboBox<>(
            new String[]{"CSE", "IT", "ECE"});

        JRadioButton m = new JRadioButton("Male", true);
        JRadioButton fe = new JRadioButton("Female");

        ButtonGroup g = new ButtonGroup();
        g.add(m);
        g.add(fe);

        JCheckBox hostel = new JCheckBox("Hostel required");

        JButton sub = new JButton("Submit");
        JLabel out = new JLabel(" ");

        f.add(new JLabel("Name"));
        f.add(name);
        f.add(new JLabel("Branch"));
        f.add(br);
        f.add(m);
        f.add(fe);
        f.add(hostel);
        f.add(sub);
        f.add(out);

        sub.addActionListener(e -> {
            if (name.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    f, "Name cannot be empty");
            } else {
                out.setText(name.getText() + " | "
                    + br.getSelectedItem() + " | "
                    + (m.isSelected() ? "Male" : "Female")
                    + " | Hostel: "
                    + (hostel.isSelected() ? "Yes" : "No"));
            }
        });

        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
