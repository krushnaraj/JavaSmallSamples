import java.awt.*;
import java.applet.*;
public class ScrollMsg extends Applet implements Runnable
{
   int x,y,oldx,oldy;
   int direct=1; int i=10;
   Thread imgThread;
   public void init()
   {
	setBackground(Color.black);
	setForeground(Color.white);
     x=900; y=250; //oldx=50; //oldy=500;
   }
   public void start()
   {
     if(imgThread==null)
     {
       imgThread=new Thread(this);
       imgThread.start();
     }
   }
   public void stop()
   {
     imgThread.stop();
     imgThread=null;
   }
   public void paint(Graphics g)
   {
      g.drawString("Scrolling Message from Right to Left",x,y);   
   }
   public void run()
   {
     for(;;)
     {
        repaint();
        oldx=x; oldy=y; 
        if(direct==1)
        {
          x=x-10;
          if(x==900)
          {
             direct=0;
          }
        } 
       else
         {
             x=x-10;
             if(x==0)
             { 
                direct=1;
              }
         }
         //x=x+2;
         if(x==-200)
        {
            x=900;
        } 


       
         try
         {
           Thread.sleep(50);
         }
         catch(InterruptedException e)
         {}
       }
     }
   }
  
/* <Applet code="ScrollMsg.class" height=500 width=1024 >
   </Applet> */
