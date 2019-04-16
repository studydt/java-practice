package swing1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import java.lang.*;

/**
 * @author 万水千山
 * @date 2019/04/09
 */
public class Test1 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test1 window = new Test1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void Police(JTextArea text1, JButton num) {
        // 声明事件
        Number police = new Number();
        police.set(text1, num);
        num.addMouseListener(police);
    }

    public void Operation(JTextArea text1, JButton operation) {
        FourOperation operation2 = new FourOperation();
        operation2.set(text1, operation);
        operation.addMouseListener(operation2);
    }

    public void result(JFrame frame, JTextArea text1, JButton btu) {
        Result result1 = new Result();
        result1.setText(text1, frame);
        btu.addMouseListener(result1);
    }

    public void other(JFrame frame, JTextArea text1, JButton btu) {
        Other other1 = new Other();
        other1.set(frame, text1, btu);
        btu.addMouseListener(other1);
    }

    public void delect(JTextArea text1, JButton btu) {
        Delect del = new Delect();
        del.set(text1, btu);
        btu.addMouseListener(del);
    }

    public void not(JFrame frame, JTextArea text1, JButton btu) {
        Not not1 = new Not();
        not1.setText(text1, frame);
        btu.addMouseListener(not1);
    }

    public void menu(JFrame frame, JMenuItem item1) {
        About about = new About();
        about.set(frame);
        item1.addActionListener(about);
    }
    public void SetButton(JTextArea text1,JPanel panel) {
        JButton[][] btu = new JButton[6][5];
        String[][] str = {{"%", "\u221A", "x\u00B2", "1/x"}, {"CE", "C", "<-", "÷"}, {"7", "8", "9", "×"},
            {"4", "5", "6", "-"}, {"1", "2", "3", "+"}, {"+/-", "0", ".", "="}};
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 3; k++) {
                btu[i][k] = new JButton(str[i][k]);
                btu[i][k].setFont(new Font("宋体", Font.PLAIN, 45));
                panel.add(btu[i][k]);
            }
        }
        not(frame, text1, btu[5][0]);
        result(frame, text1, btu[5][3]);
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j < 3; j++) {
                Police(text1, btu[i][j]);
                if(i==2) {
                delect(text1, btu[1][j]);
                }
            }
        }
        Police(text1, btu[5][1]);
        Police(text1, btu[5][2]);
        for (int i = 0; i < 4; i++) {
            other(frame, text1, btu[0][i]);
            Operation(text1, btu[i+1][3]); 
        }
    }
    /**
     * Create the application.
     */
    public Test1() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();

        frame.setBounds(100, 100, 570, 669);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel_big = new Panel();
        frame.getContentPane().add(panel_big, BorderLayout.CENTER);
        panel_big.setLayout(new BorderLayout(0, 0));

        JTextArea text1 = new JTextArea();
        text1.setAlignmentX(Component.LEFT_ALIGNMENT);
        text1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        panel_big.add(text1, BorderLayout.NORTH);
        text1.setFont(new Font("Monospaced", Font.PLAIN, 55));

        JPanel panel = new JPanel();
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel_big.add(panel);
        panel.setLayout(new GridLayout(6, 4));

        JMenuBar menuBar = new JMenuBar();
        frame.getContentPane().add(menuBar, BorderLayout.NORTH);

        JMenu mnNewMenu = new JMenu("Help");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("About");
        mnNewMenu.add(mntmNewMenuItem);
        menu(frame, mntmNewMenuItem);
        
        SetButton(text1, panel);
    }

}
