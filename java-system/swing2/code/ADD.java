 package swing2;
import javax.swing.JFrame;

/**
 * @author ÍòË®Ç§É½
 * @date 2019/05/27
 */
public class ADD {
    public  ADD(Mysql mysql,JFrame frame,String text1,String text2,String text3,String text4) {
        try {
            mysql.post(1,"insert into student values ("+text1+","+text2+","+text3+","+text4+");");
        } catch (Exception e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }
}
