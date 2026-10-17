Program 1: Db.java

import java.sql.*;

public class Db {
    static Connection open() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/scsvmv_lab", "root", "root");
    }
}

Program 2: StudentApp.java

import java.sql.*;
import java.util.Scanner;

public class StudentApp {
    static void run(String sql, Object... v) {
        try (Connection c = Db.open();
             PreparedStatement p = c.prepareStatement(sql)) {

            for (int i = 0; i < v.length; i++)
                p.setObject(i + 1, v[i]);

            if (sql.startsWith("SELECT")) {
                ResultSet rs = p.executeQuery();

                while (rs.next())
                    System.out.println(rs.getString(1) + "  "
                        + rs.getString(2) + "  " + rs.getInt(3));

                rs.close();
            } else {
                System.out.println(
                    p.executeUpdate() + " row(s) affected.");
            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Register number to search : ");
        String reg = sc.nextLine();

        run("SELECT * FROM student WHERE reg_no = ?", reg);

        run("UPDATE student SET marks = ? WHERE reg_no = ?", 95, reg);

        run("SELECT * FROM student WHERE reg_no = ?", reg);

        System.out.print("Register number to delete : ");
        String delReg = sc.nextLine();

        run("DELETE FROM student WHERE reg_no = ?", delReg);

        System.out.println("Records after deletion:");
        run("SELECT * FROM student");

        sc.close();
    }
}
