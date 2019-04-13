package swing1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author 万水千山
 * @date 2019/04/10
 */
public class Result implements MouseListener {
    JTextArea text1;
    JFrame frame;

    public void setText(JTextArea text1, JFrame frame) {
        this.text1 = text1;
        this.frame = frame;
    }

    /* （非 Javadoc）
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // long a[]= {0};
        double sum = 0;
        int number = 0;
        try {
            String[] str = text1.getText().split(" ");
            number = str.length;
            sum = 0;
            for (int i = 0; i < number; i++) {

                if (i % 2 == 1) {
                    double n = Double.parseDouble(str[i - 1]);
                    double m = Double.parseDouble(str[i + 1]);
                    if (str[i].equals("\u00F7")) {
                        str[i - 1] = Double.toString((n / m));
                        for (int j = i; j < number - 2; j++) {
                            str[j] = str[j + 2];
                        }
                        number -= 2;
                        i -= 2;
                    } else if (str[i].equals("\u00D7")) {
                        str[i - 1] = Double.toString((m * n));
                        for (int j = i; j < number - 2; j++) {
                            str[j] = str[j + 2];
                        }
                        number -= 2;
                        i -= 2;
                    }
                }
            }
            int n1 = 0;
            sum = Double.parseDouble(str[0]);
            for (int num = 1; num < number; num += 2) {
                double m = Double.parseDouble(str[num + 1]);
                if (str[num].equals("+")) {
                    sum += m;
                    n1 = 1;
                } else if (str[num].equals("-")) {
                    sum -= m;
                    n1 = 1;
                }
            }
            if (n1 == 0) {
                text1.setText(str[0]);
            } else {
                text1.setText(Double.toString(sum));
            }

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
