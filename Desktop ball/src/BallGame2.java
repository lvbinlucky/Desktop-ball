import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desktop.jpg");
    
    double x = 100;    //С��ĺ�����
    double y = 100;    //С���������
    
    double degree = 3.14/3;   //���ȣ� 60�ȡ�
    //�����ڵķ���
    public void paint(Graphics g){
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        
         x  = x+ 10*Math.cos(degree);
         y  = y +10*Math.sin(degree); 
             
            //�������±߽�
        if(y>500-40-30||y<40+40){//500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������ĸ߶�
               degree = -degree;
          }
             
            //�������ұ߽�
         if(x<40||x>856-40-30){
               degree = 3.14 - degree;
          }
             
        }
         
        
    //���ڼ���
    void lauchFrame() {
        setSize(856,500);        //���ڵĿ�͸�     
        setLocation(100,100);   //��λ���ڵĿ�͸�
        setVisible(true);
    
     //�ػ�����,ÿ�뻭25��
    while(true){
        repaint(); 
        try{
            Thread.sleep(40);   //40ms,   1��=1000����.  ��Լһ�뻭25�δ���
        }catch(Exception e){
            e.printStackTrace();
        }
         
    }
     
}
                
    //main�����ǳ���ִ�е����
    public static void main(String[] args) {
    	
    	
        System.out.println("�ۻ�");
        BallGame2 game = new BallGame2();
        game.lauchFrame();
        
    }
    
}
