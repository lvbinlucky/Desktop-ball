import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desktop.jpg");
    
    double x = 100;    //小球的横坐标
    double y = 100;    //小球的纵坐标
    boolean right = true;
    //画窗口的方法
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
        
    //窗口加载
    void lauchFrame() {
        setSize(856,500);        //窗口的宽和高     
        setLocation(100,100);   //定位窗口的宽和高
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
                
    //main方法是程序执行的入口
    public static void main(String[] args) {
        System.out.println("慧慧");
        BallGame game = new BallGame();
        game.lauchFrame();
        
    }
    
}
