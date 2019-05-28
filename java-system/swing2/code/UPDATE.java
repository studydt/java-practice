 package swing2;

import javax.swing.JFrame;

/**
 * @author ÍòË®Ç§É½
 * @date 2019/05/27
 */
public class UPDATE {
        public  UPDATE(Mysql mysql,JFrame frame,String text1,String text2,String text3,String text4) {
        try {
            mysql.post(1,"UPDATE student SET sname="+text2+",profession="+text3+",class="+text4+" where sno="+text1+";");
        } catch (Exception e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }
}
