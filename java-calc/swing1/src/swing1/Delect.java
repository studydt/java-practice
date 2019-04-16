package swing1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 * @author 万水千山
 * @date 2019/04/10
 */
public class Delect implements MouseListener {
    JTextArea text1;
    JButton btu;

    public void set(JTextArea text1, JButton btu) {
        this.text1 = text1;
        this.btu = btu;
    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        try {
            String string = btu.getText();
            if (string.equals("CE")) {
                text1.setText("");
            } else if (string.equals("C")) {
                String[] str = text1.getText().split(" ");
                str[str.length - 1] = "";
                text1.setText("");
                for (int i = 0; i < str.length; i++) {
                    text1.append(str[i] + " ");
                }
            } else {
                String str = text1.getText();
                int a = str.length() - 1;
                str = str.substring(0, a);
                    text1.setText(str);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    /**
     * @param lastIndexOf
     * @return
     */

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

}
