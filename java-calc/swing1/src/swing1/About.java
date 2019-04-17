 package swing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * @author 万水千山
 * @date 2019/04/16
 */
public class About implements ActionListener{
    JFrame frame;
    public void set(JFrame frame) {
        this.frame= frame;
        
    }
    /* （非 Javadoc）
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(frame, "非常简陋的Java计算器,\n欢迎提出意见:\nhttps://github.com/studydt/java-practice/tree/master/java-calc", "About",JOptionPane.INFORMATION_MESSAGE);
    }
    

}
