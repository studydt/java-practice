 package swing2;

 /**
 * @author ÍòË®Ç§É½
 * @date 2019/05/27
 */
public class UPDATE {
        public  UPDATE(Mysql mysql,JFrame frame,String text1,String text2,String text3,String text4,String text5,String text6,String text7,String text8) {
        try {
            mysql.post(1,"UPDATE student SET  sno="+text5+",sname="+text6+",profession="+text7+",class="+text8+" where (sno="+text1+",sname="+text2+",profession="+text3+",class="+text4+" );");
        } catch (Exception e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }
    }
}
