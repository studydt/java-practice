 package swing2;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 * @author ��ˮǧɽ
 * @date 2019/05/27
 */
public class WHERE {
    ResultSet resultSet ;
    public  WHERE(Mysql mysql,JFrame frame,String text1,String text2,JTextPane text) {
        try {
            if (text1.equals("")) {
                resultSet = mysql.post(2,"select * from student where class="+text2+";");
            } else if(text2.equals("")){
                resultSet = mysql.post(2,"select * from student where sno="+text1+";");
            }else {
                resultSet = mysql.post(2,"select * from student where (sno="+text1+" AND class="+text2+");");
            }
            text.setText("ѧ��  ����  רҵ  �༶\n");
            while (resultSet.next()) {
                Document docs = text.getDocument();//����ı�����
                try {
                    docs.insertString(docs.getLength(),resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+"\n", null);//���ı�����׷��
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }
}
