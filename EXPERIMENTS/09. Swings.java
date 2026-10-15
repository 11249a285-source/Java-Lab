PROGRAM 9.1 — BorderDemo.java
  
import javax.swing.*;
 import java.awt.*;

 public class BorderDemo {
     public static void main(String[] args) {
         JFrame f = new JFrame("BorderLayout");
         f.setLayout(new BorderLayout());
         f.add(new JButton("NORTH"), BorderLayout.NORTH);
         f.add(new JButton("SOUTH"), BorderLayout.SOUTH);
         f.add(new JButton("EAST"),   BorderLayout.EAST);
         f.add(new JButton("WEST"),   BorderLayout.WEST);
         f.add(new JButton("CENTER"), BorderLayout.CENTER);
         f.setSize(350, 220);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
     }
 }

PROGRAM 9.2 — GridDemo.java
  
 import javax.swing.*;

 import java.awt.*;

 public class GridDemo {
     public static void main(String[] args) {
         JFrame f = new JFrame("GridLayout 4 x 3");
         f.setLayout(new GridLayout(4, 3, 5, 5));
         String[] keys = { "1","2","3","4","5","6","7","8","9","*","0","#" };
         for (String k : keys)
             f.add(new JButton(k));
         f.setSize(260, 300);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
     }
 }

PROGRAM 9.3 — FlowDemo.java
  
import javax.swing.*;
 import java.awt.*;

 public class FlowDemo {
     public static void main(String[] args) {
         JFrame f = new JFrame("FlowLayout");
         f.setLayout(new FlowLayout());
         String[] b = { "New", "Open", "Save", "Print", "Exit" };
         for (String s : b)
             f.add(new JButton(s));
         f.setSize(300, 120);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
     }
 }

PROGRAM 9.4 — LoginForm.java 
  
import javax.swing.*;
 import java.awt.*;

 public class LoginForm {
     public static void main(String[] args) {
         JFrame f = new JFrame("Login");
         f.setLayout(new FlowLayout());
         JTextField user = new JTextField(12);
         JPasswordField pass = new JPasswordField(12);
         JButton ok = new JButton("Login");
         JLabel msg = new JLabel(" ");
         f.add(new JLabel("User Name")); f.add(user);
         f.add(new JLabel("Password ")); f.add(pass);
         f.add(ok);
         f.add(msg);
         ok.addActionListener(e -> {
             String pwd = new String(pass.getPassword());
             if (user.getText().equals("cse") && pwd.equals("java"))
                  msg.setText("Login successful");
             else
                  msg.setText("Invalid user or password");
         });
         f.setSize(230, 180);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
     }
 }
