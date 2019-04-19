package swing1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * @author 万水千山
 * @date 2019/04/19
 */
public class COLOR implements MenuListener {
    JFrame frame;
    JButton btu[][];
    JTextArea text1;

    public void set(JFrame frame, JButton btu[][], JTextArea text1) {
        this.frame = frame;
        this.btu = btu;
        this.text1 = text1;
    }

    /* （非 Javadoc）
     * @see javax.swing.event.MenuListener#menuCanceled(javax.swing.event.MenuEvent)
     */
    @Override
    public void menuCanceled(MenuEvent e) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see javax.swing.event.MenuListener#menuDeselected(javax.swing.event.MenuEvent)
     */
    @Override
    public void menuDeselected(MenuEvent e) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see javax.swing.event.MenuListener#menuSelected(javax.swing.event.MenuEvent)
     */
    @Override
    public void menuSelected(MenuEvent e) {
        // TODO Auto-generated method stub
        Color newcolorColor = JColorChooser.showDialog(frame, "计算器颜色", btu[0][0].getBackground());
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                JButton jButton = btu[i][j];
                jButton.setBackground(newcolorColor);
            }
        }
    }

}
