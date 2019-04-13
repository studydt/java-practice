package swing1;

import java.awt.*;
import javax.swing.*;


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
        result1.setText(text1,frame);
        btu.addMouseListener(result1);
    }
    
    public void other(JFrame frame, JTextArea text1,JButton btu) {
        Other other1 = new Other();
        other1.set(frame,text1,btu);
        btu.addMouseListener(other1);
    }
    
    public void delect(JTextArea text1,JButton btu) {
        Delect del=new Delect();
        del.set(text1,btu);
        btu.addMouseListener(del);
    }
    public void not(JFrame frame,JTextArea text1,JButton btu) {
        Not not1 = new Not();
        not1.setText(text1, frame);
        btu.addMouseListener(not1);
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

        JTextArea text1 = new JTextArea();
        text1.setFont(new Font("Monospaced", Font.PLAIN, 55));
        frame.getContentPane().add(text1, BorderLayout.NORTH);

        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(6, 4));

        JButton PAH = new JButton("%");
        PAH.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(PAH);
        other(frame,text1, PAH);
        
        JButton devide = new JButton("\u221A");
        devide.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(devide);
        other(frame,text1, devide);
        
        JButton square = new JButton("x\u00B2");
        square.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(square);
        other(frame,text1, square);

        JButton fenshu = new JButton("1/x");
        fenshu.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(fenshu);
        other(frame,text1, fenshu);
        
        JButton CE = new JButton("CE");
        CE.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(CE);
        delect(text1, CE);
        
        JButton C = new JButton("C");
        C.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(C);
        delect(text1, C);
        
        JButton delect1 = new JButton("<-");
        delect1.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(delect1);
        delect(text1, delect1);
        
        JButton chu = new JButton("\u00F7");
        chu.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(chu);
        Operation(text1, chu);

        JButton seven = new JButton("7");
        seven.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(seven);
        Police(text1, seven);

        JButton eight = new JButton("8");
        eight.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(eight);
        Police(text1, eight);

        JButton nine = new JButton("9");
        nine.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(nine);
        Police(text1, nine);

        JButton cheng = new JButton("\u00D7");
        cheng.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(cheng);
        Operation(text1, cheng);

        JButton four = new JButton("4");
        four.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(four);
        Police(text1, four);

        JButton five = new JButton("5");
        five.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(five);
        Police(text1, five);

        JButton six = new JButton("6");
        six.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(six);
        Police(text1, six);

        JButton jian = new JButton("-");
        jian.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(jian);
        Operation(text1, jian);

        JButton one = new JButton("1");
        one.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(one);
        Police(text1, one);

        JButton two = new JButton("2");
        two.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(two);
        Police(text1, two);

        JButton three = new JButton("3");
        three.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(three);
        Police(text1, three);

        JButton jia = new JButton("+");
        jia.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(jia);
        Operation(text1, jia);

        JButton zhengfu = new JButton("+/-");
        zhengfu.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(zhengfu);
        not(frame, text1, zhengfu);
        
        JButton zero = new JButton("0");
        zero.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(zero);
        Police(text1, zero);

        JButton point = new JButton(".");
        point.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(point);
        Police(text1, point);
        
        JButton result2 = new JButton("=");
        result2.setFont(new Font("宋体", Font.PLAIN, 45));
        panel.add(result2);
        result(frame, text1, result2);

    }

}
