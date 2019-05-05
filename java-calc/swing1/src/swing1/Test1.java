package swing1;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

/**
 * @author 万水千山
 * @date 2019/04/09
 */
public class Test1 {

    private JFrame frame;
    public JButton[][] btu = new JButton[6][5];
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

    public void result(JFrame frame, JTextArea text1, JButton btu, File file) {
        Result result1 = new Result();
        result1.setText(text1, frame, file);
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

    public void menu1(JFrame frame, JMenu menu, File file) {
        History history = new History();
        history.set(frame, file);
        menu.addMenuListener(history);
    }

    public void menu2(JFrame frame, JMenu menu, JButton btu[][],JTextArea text1) {
        COLOR cOLOR = new COLOR();
        cOLOR.set(frame,btu,text1);
        menu.addMenuListener(cOLOR);
    }
    public void menu3(JMenuItem menu) {
        Quit quit = new Quit();
        menu.addActionListener(quit);
    }
    public void SetButton(JTextArea text1, JPanel panel, File file) {
        
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
        result(frame, text1, btu[5][3], file);
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j < 3; j++) {
                Police(text1, btu[i][j]);
                if (i == 2) {
                    delect(text1, btu[1][j]);
                }
            }
        }
        Police(text1, btu[5][1]);
        Police(text1, btu[5][2]);
        for (int i = 0; i < 4; i++) {
            other(frame, text1, btu[0][i]);
            Operation(text1, btu[i + 1][3]);
        }
    }

    /**
     * Create the application.
     * 
     * @throws IOException
     */
    public Test1() throws IOException {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     * 
     * @throws IOException
     */
    private void initialize() throws IOException {
        frame = new JFrame();

        frame.setBounds(100, 100, 461, 669);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel_big = new Panel();
        frame.getContentPane().add(panel_big, BorderLayout.CENTER);
        panel_big.setLayout(new BorderLayout(0, 0));

        JTextArea text1 = new JTextArea();
        text1.setAlignmentX(Component.LEFT_ALIGNMENT);
        text1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        JScrollPane jsp1 = new JScrollPane(text1);
        jsp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        text1.setFont(new Font("Monospaced", Font.PLAIN, 55));
        panel_big.add(jsp1, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel_big.add(panel);
        panel.setLayout(new GridLayout(6, 4));

        JMenuBar menuBar = new JMenuBar();
        frame.getContentPane().add(menuBar, BorderLayout.NORTH);

        File file = new File("history.txt");
        @SuppressWarnings("resource")
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("");
        
        SetButton(text1, panel, file);
        
        JMenu mnNewMenu_3 = new JMenu("menu");
        menuBar.add(mnNewMenu_3);

        
        JMenuItem mntmQuit = new JMenuItem("quit");
        mnNewMenu_3.add(mntmQuit);
        mntmQuit.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E , java.awt.event.KeyEvent.CTRL_MASK));
        menu3(mntmQuit);
        
        JMenu mnNewMenu_1 = new JMenu("History");
        menuBar.add(mnNewMenu_1);
        menu1(frame, mnNewMenu_1, file);

        JMenu mnColor = new JMenu("color");
        menuBar.add(mnColor);
        menu2(frame, mnColor,btu,text1);
        
        JMenu mnNewMenu = new JMenu("Help");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("About");
        mnNewMenu.add(mntmNewMenuItem);
        menu(frame, mntmNewMenuItem);

        

    }

}
