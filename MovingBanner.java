
import java.applet.Applet;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class MovingBanner extends Applet implements Runnable {
    String msg = "This is a moving banner! ";
    char ch;
    boolean stopFlag = true;
    Thread t = null;
    
    public void start()
    {
        t = new Thread(this);
        stopFlag=false;
        t.start();
    }
    public void run()
    {
        for(;;)
        {
            try{
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg=msg.substring(1,msg.length());
                msg=msg+ch;
                if(stopFlag)
                    break;
            }
            catch(InterruptedException e){
            }
        }
    }
       public void stop(){
           stopFlag = true;
           t =null;
      }
      public void paint(Graphics g){
          g.drawString(msg,80,30);
      }  
      
    }
    

