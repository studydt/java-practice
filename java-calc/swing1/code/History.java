package swing1;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * @author 万水千山
 * @date 2019/04/17
 */
public class History implements MenuListener {
    JFrame frame;
    File file;

    public void set(JFrame frame, File file) {
        this.frame = frame;
        this.file = file;
    }

    /* （非 Javadoc）
     * @see javax.swing.event.MenuListener#menuSelected(javax.swing.event.MenuEvent)
     */
    @Override
    public void menuSelected(MenuEvent e) {
        // TODO Auto-generated method stub
        JDialog dialog = new JDialog();
        JTextArea text2 = new JTextArea();
        JScrollPane jsp = new JScrollPane(text2);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        text2.setFont(new Font("宋体", Font.PLAIN, 35));
        dialog.setLocation(600, 200);
        dialog.setSize(400, 300);
        dialog.add(jsp);

        dialog.setVisible(true);

        try {
            FileReader inFileReader = new FileReader(file);
            @SuppressWarnings("resource")
            BufferedReader inBufferedReader2 = new BufferedReader(inFileReader);
            String s = null;
            while ((s = inBufferedReader2.readLine()) != null) {
                text2.append(s + '\n');
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    /* （非 Javadoc）
     * @see javax.swing.event.MenuListener#menuCanceled(javax.swing.event.MenuEvent)
     */
    @Override
    public void menuCanceled(MenuEvent arg0) {
        // TODO Auto-generated method stub

    }

    /* （非 Javadoc）
     * @see javax.swing.event.MenuListener#menuDeselected(javax.swing.event.MenuEvent)
     */
    @Override
    public void menuDeselected(MenuEvent arg0) {
        // TODO Auto-generated method stub

    }

}
