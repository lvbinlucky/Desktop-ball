import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desktop.jpg");
    
    double x = 100;    //С��ĺ�����
    double y = 100;    //С���������
    boolean right = true;
    //�����ڵķ���
    public void paint(Graphics g){
    	System.out.println("111111111");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        
        if(right)
        {
        	x += 10;
        }else {
        	x -= 10;
        }
        if(x < 40) {
        	right = true;
        }
        if(x > 856 - 40 -30)
        {
        	right = false;
        }
    }
        
    //���ڼ���
    void lauchFrame() {
        setSize(856,500);        //���ڵĿ�͸�     
        setLocation(100,100);   //��λ���ڵĿ�͸�
        setVisible(true);
        
        while(true) {
        	repaint();
        	try {
        		Thread.sleep(40);
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
    }
                
    //main�����ǳ���ִ�е����
    public static void main(String[] args) {
        System.out.println("�ۻ�");
        BallGame game = new BallGame();
        game.lauchFrame();
        
    }
    
}
