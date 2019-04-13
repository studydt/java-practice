 package swing1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author 万水千山
 * @date 2019/04/11
 */
public class Not implements MouseListener{
    JTextArea text1;
    JFrame frame;

    public void setText(JTextArea text1, JFrame frame) {
        this.text1 = text1;
        this.frame = frame;
    }
    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        try {
            double num=Double.parseDouble(text1.getText());
            num = -num;
            text1.setText(Double.toString(num));
        } catch (Exception e2) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(frame, "警告:输入格式错误", "警告", JOptionPane.WARNING_MESSAGE);
        }
         
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
