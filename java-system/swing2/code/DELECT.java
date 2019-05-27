 package swing2;

import javax.swing.JFrame;

/**
 * @author ÍòË®Ç§É½
 * @date 2019/05/27
 */
public class DELECT {
    public  DELECT(Mysql mysql,JFrame frame,String text1,String text2) {
        try {
            if (text1.equals("")) {
                mysql.post(1,"delete from student where class="+text2+";");
            } else if(text2.equals("")){
                mysql.post(1,"delete from student where sno="+text1+";");
            }else {
                mysql.post(1,"delete from student where (sno="+text1+" AND class="+text2+");");
            }
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }
}
