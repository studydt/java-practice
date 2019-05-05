 package swing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 万水千山
 * @date 2019/05/05
 */
public class Quit implements ActionListener{

    /* （非 Javadoc）
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
         System.exit(0);
    }

}
