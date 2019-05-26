 package swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

/**
 * @author ÍòË®Ç§É½
 * @date 2019/05/24
 */
public class System {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTable table;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    System window = new System();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public System() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 775, 605);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new CardLayout(0, 0));
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        frame.getContentPane().add(tabbedPane, "name_11663379484751");
        
        Panel panel = new Panel();
        tabbedPane.addTab("\u6DFB\u52A0", null, panel, null);
        panel.setLayout(null);
        
        JButton btnNewButton = new JButton("\u6DFB\u52A0");
        btnNewButton.setBounds(345, 225, 113, 27);
        panel.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(134, 124, 113, 27);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(273, 124, 113, 27);
        panel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(418, 125, 113, 27);
        panel.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(562, 125, 113, 27);
        panel.add(textField_3);
        
        JLabel label = new JLabel("\u6DFB\u52A0\u5B66\u751F\u6570\u636E");
        label.setBounds(14, 128, 90, 18);
        panel.add(label);
        
        JLabel label_1 = new JLabel("\u5B66\u53F7");
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setBounds(155, 93, 72, 18);
        panel.add(label_1);
        
        JLabel label_2 = new JLabel("\u59D3\u540D");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setBounds(298, 93, 72, 18);
        panel.add(label_2);
        
        JLabel label_3 = new JLabel("\u4E13\u4E1A");
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setBounds(442, 94, 72, 18);
        panel.add(label_3);
        
        JLabel label_4 = new JLabel("\u73ED\u7EA7");
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setBounds(584, 93, 72, 18);
        panel.add(label_4);
        
        JLabel label_28 = new JLabel("\u6CE8\u610F: \u6570\u636E\u4E0D\u80FD\u4E3A\u7A7A\u4E14\u5B66\u53F7\u552F\u4E00");
        label_28.setBounds(50, 229, 225, 18);
        panel.add(label_28);
        
        Panel panel_1 = new Panel();
        tabbedPane.addTab("\u5220\u9664", null, panel_1, null);
        panel_1.setLayout(null);
        
        JButton button = new JButton("\u5220\u9664");
        button.setBounds(365, 285, 113, 27);
        panel_1.add(button);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(154, 184, 113, 27);
        panel_1.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(293, 184, 113, 27);
        panel_1.add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(438, 185, 113, 27);
        panel_1.add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(582, 185, 113, 27);
        panel_1.add(textField_7);
        
        JLabel label_5 = new JLabel("\u5220\u9664\u5B66\u751F\u6570\u636E");
        label_5.setBounds(34, 188, 90, 18);
        panel_1.add(label_5);
        
        JLabel label_6 = new JLabel("\u5B66\u53F7");
        label_6.setHorizontalAlignment(SwingConstants.CENTER);
        label_6.setBounds(175, 153, 72, 18);
        panel_1.add(label_6);
        
        JLabel label_7 = new JLabel("\u59D3\u540D");
        label_7.setHorizontalAlignment(SwingConstants.CENTER);
        label_7.setBounds(318, 153, 72, 18);
        panel_1.add(label_7);
        
        JLabel label_8 = new JLabel("\u4E13\u4E1A");
        label_8.setHorizontalAlignment(SwingConstants.CENTER);
        label_8.setBounds(462, 154, 72, 18);
        panel_1.add(label_8);
        
        JLabel label_9 = new JLabel("\u73ED\u7EA7");
        label_9.setHorizontalAlignment(SwingConstants.CENTER);
        label_9.setBounds(604, 153, 72, 18);
        panel_1.add(label_9);
        
        JLabel label_10 = new JLabel("\u6CE8\u610F: \u82E5\u4E3A\u7A7A,\u5219\u5168\u90E8\u5220\u9664");
        label_10.setBounds(34, 289, 194, 18);
        panel_1.add(label_10);
        
        Panel panel_2 = new Panel();
        tabbedPane.addTab("\u67E5\u770B", null, panel_2, null);
        panel_2.setLayout(null);
        
        JButton button_1 = new JButton("\u67E5\u627E");
        button_1.setBounds(387, 97, 113, 27);
        panel_2.add(button_1);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(167, 47, 113, 27);
        panel_2.add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(306, 47, 113, 27);
        panel_2.add(textField_9);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(451, 48, 113, 27);
        panel_2.add(textField_10);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(595, 48, 113, 27);
        panel_2.add(textField_11);
        
        JLabel label_11 = new JLabel("\u67E5\u627E\u5B66\u751F\u6570\u636E");
        label_11.setBounds(47, 51, 90, 18);
        panel_2.add(label_11);
        
        JLabel label_12 = new JLabel("\u5B66\u53F7");
        label_12.setHorizontalAlignment(SwingConstants.CENTER);
        label_12.setBounds(188, 16, 72, 18);
        panel_2.add(label_12);
        
        JLabel label_13 = new JLabel("\u59D3\u540D");
        label_13.setHorizontalAlignment(SwingConstants.CENTER);
        label_13.setBounds(331, 16, 72, 18);
        panel_2.add(label_13);
        
        JLabel label_14 = new JLabel("\u4E13\u4E1A");
        label_14.setHorizontalAlignment(SwingConstants.CENTER);
        label_14.setBounds(475, 17, 72, 18);
        panel_2.add(label_14);
        
        JLabel label_15 = new JLabel("\u73ED\u7EA7");
        label_15.setHorizontalAlignment(SwingConstants.CENTER);
        label_15.setBounds(617, 16, 72, 18);
        panel_2.add(label_15);
        
        JLabel label_16 = new JLabel("\u6CE8\u610F: \u82E5\u4E3A\u7A7A, \u5219\u5168\u90E8\u67E5\u627E");
        label_16.setBounds(67, 103, 199, 18);
        panel_2.add(label_16);
        
        table = new JTable();
        table.setBounds(38, 150, 671, 348);
        panel_2.add(table);
        
        Panel panel_3 = new Panel();
        tabbedPane.addTab("\u66F4\u65B0", null, panel_3, null);
        panel_3.setLayout(null);
        
        JButton button_2 = new JButton("\u66F4\u65B0");
        button_2.setBounds(379, 255, 113, 27);
        panel_3.add(button_2);
        
        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(156, 63, 113, 27);
        panel_3.add(textField_12);
        
        textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(295, 63, 113, 27);
        panel_3.add(textField_13);
        
        textField_14 = new JTextField();
        textField_14.setColumns(10);
        textField_14.setBounds(440, 64, 113, 27);
        panel_3.add(textField_14);
        
        textField_15 = new JTextField();
        textField_15.setColumns(10);
        textField_15.setBounds(584, 64, 113, 27);
        panel_3.add(textField_15);
        
        JLabel label_17 = new JLabel("\u65E7\u5B66\u751F\u6570\u636E");
        label_17.setBounds(36, 67, 90, 18);
        panel_3.add(label_17);
        
        JLabel label_18 = new JLabel("\u5B66\u53F7");
        label_18.setHorizontalAlignment(SwingConstants.CENTER);
        label_18.setBounds(177, 32, 72, 18);
        panel_3.add(label_18);
        
        JLabel label_19 = new JLabel("\u59D3\u540D");
        label_19.setHorizontalAlignment(SwingConstants.CENTER);
        label_19.setBounds(320, 32, 72, 18);
        panel_3.add(label_19);
        
        JLabel label_20 = new JLabel("\u4E13\u4E1A");
        label_20.setHorizontalAlignment(SwingConstants.CENTER);
        label_20.setBounds(464, 33, 72, 18);
        panel_3.add(label_20);
        
        JLabel label_21 = new JLabel("\u73ED\u7EA7");
        label_21.setHorizontalAlignment(SwingConstants.CENTER);
        label_21.setBounds(606, 32, 72, 18);
        panel_3.add(label_21);
        
        textField_16 = new JTextField();
        textField_16.setColumns(10);
        textField_16.setBounds(158, 163, 113, 27);
        panel_3.add(textField_16);
        
        textField_17 = new JTextField();
        textField_17.setColumns(10);
        textField_17.setBounds(297, 163, 113, 27);
        panel_3.add(textField_17);
        
        textField_18 = new JTextField();
        textField_18.setColumns(10);
        textField_18.setBounds(442, 164, 113, 27);
        panel_3.add(textField_18);
        
        textField_19 = new JTextField();
        textField_19.setColumns(10);
        textField_19.setBounds(586, 164, 113, 27);
        panel_3.add(textField_19);
        
        JLabel label_22 = new JLabel("\u65B0\u5B66\u751F\u6570\u636E");
        label_22.setBounds(38, 167, 90, 18);
        panel_3.add(label_22);
        
        JLabel label_23 = new JLabel("\u5B66\u53F7");
        label_23.setHorizontalAlignment(SwingConstants.CENTER);
        label_23.setBounds(175, 126, 72, 18);
        panel_3.add(label_23);
        
        JLabel label_24 = new JLabel("\u59D3\u540D");
        label_24.setHorizontalAlignment(SwingConstants.CENTER);
        label_24.setBounds(318, 126, 72, 18);
        panel_3.add(label_24);
        
        JLabel label_25 = new JLabel("\u4E13\u4E1A");
        label_25.setHorizontalAlignment(SwingConstants.CENTER);
        label_25.setBounds(462, 127, 72, 18);
        panel_3.add(label_25);
        
        JLabel label_26 = new JLabel("\u73ED\u7EA7");
        label_26.setHorizontalAlignment(SwingConstants.CENTER);
        label_26.setBounds(604, 126, 72, 18);
        panel_3.add(label_26);
        
        JLabel label_27 = new JLabel("\u6CE8\u610F: \u82E5\u4E3A\u7A7A, \u5219\u4E0D\u8FDB\u884C\u66F4\u65B0");
        label_27.setBounds(51, 258, 206, 18);
        panel_3.add(label_27);
    }
}
