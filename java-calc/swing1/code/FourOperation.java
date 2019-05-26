 package swing1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 * @author 万水千山
 * @date 2019/04/10
 */
public class FourOperation implements MouseListener{
    JTextArea text1;
    JButton operation;
    public void set(JTextArea text1,JButton operation) {
        this.text1=text1;
        this.operation =operation;
    }
    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
         text1.append(" "+operation.getText()+" ");
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
