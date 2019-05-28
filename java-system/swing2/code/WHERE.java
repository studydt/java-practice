 package swing2;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 * @author 万水千山
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
            text.setText("学号  姓名  专业  班级\n");
            while (resultSet.next()) {
                Document docs = text.getDocument();//获得文本对象
                try {
                    docs.insertString(docs.getLength(),resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+"\n", null);//对文本进行追加
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
