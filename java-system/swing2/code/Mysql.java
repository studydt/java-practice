package swing2;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * @author 万水千山
 * @date 2019/05/27
 */
public class Mysql {
    Frame frame;
    Connection connection;
    Statement sqlStatement;
    ResultSet resultset;

    public ResultSet post(Integer a, String s) throws SQLException {
        try {
            if (a == 1) {
                sqlStatement.execute(s);
                JOptionPane.showMessageDialog(frame, "操作成功", "mysql", JOptionPane.INFORMATION_MESSAGE);
            } else if (a == 2) {
                resultset = sqlStatement.executeQuery(s);
                JOptionPane.showMessageDialog(frame, "查询成功", "mysql", JOptionPane.INFORMATION_MESSAGE);
                return resultset;
            }

        }catch (SQLIntegrityConstraintViolationException e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(frame, "学号重复, 请重新输入", "mysql", JOptionPane.INFORMATION_MESSAGE);
        }
        return resultset;
    }

    public Mysql(Frame frame) {
        this.frame = frame;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            // System.out.println(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing2?serverTimezone=GMT%2B8",
                "root", "123456");
            JOptionPane.showMessageDialog(frame, "连接成功", "mysql", JOptionPane.INFORMATION_MESSAGE);
            sqlStatement = connection.createStatement();

            // while (resultset.next()) {
            // System.out.println(resultset.getString(1));
            // System.out.println(resultset.getString(2));
            // System.out.println(resultset.getString(3));
            // }
            // connection.close();
        } catch (SQLException e) {
            // TODO: handle exception
            /// System.out.println(e);
        }

    }

}
