package swing1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 * @author 万水千山
 * @date 2019/04/10
 */
public class Other implements MouseListener {
    JTextArea text1;
    JButton btu;
    JFrame frame;

    public void set(JFrame frame, JTextArea text1, JButton btu) {
        this.frame = frame;
        this.text1 = text1;
        this.btu = btu;
    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        String string = btu.getText();
        try {
            double a = Double.parseDouble(text1.getText());
            if (string.equals("%")) {
                a /= 100;
                text1.setText(Double.toString(a) + "%");
            }
            else if(string.equals("\u221A")) {
                a=Math.sqrt(a);
                text1.setText(Double.toString(a));
            }
            else if(string.equals("x\\u00B2")) {
                a = a*a;
                text1.setText(Double.toString(a));
            }
            else {
                a=1/a;
                text1.setText(Double.toString(a));
            }
        } catch (Exception e2) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(frame, "警告:输入格式错误", "警告", JOptionPane.WARNING_MESSAGE);
        }
        // if(a) {
        // if (string.equals("%")) {
        //
        // }
    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
