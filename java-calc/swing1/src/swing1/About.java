 package swing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * @author ��ˮǧɽ
 * @date 2019/04/16
 */
public class About implements ActionListener{
    JFrame frame;
    public void set(JFrame frame) {
        this.frame= frame;
        
    }
    /* ���� Javadoc��
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(frame, "�ǳ���ª��Java������,\n��ӭ������:\nhttps://github.com/studydt/java-practice/tree/master/java-calc", "About",JOptionPane.INFORMATION_MESSAGE);
    }
    

}
