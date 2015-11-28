import java.awt.*;
import java.applet.*;
public class AnimatedCircle extends Applet implements Runnable
{
   int x,y,oldx,oldy;
   int direct=1; //int i=10;
   Thread imgThread;
   public void init()
   {
     x=900; y=0; oldx=500; oldy=500;
   }
   public void start()
   {
     if(imgThread==null)
     {
       imgThread=new Thread(this);
       imgThread.start();
     }
   }
   /*public void stop()
   {
     imgThread.stop();
     imgThread=null;
   }*/
   public void paint(Graphics g)
   {
	g.setColor(Color.red);
	g.fillOval(x,y,30,30);
      //g.drawString("Scrolling Message from Right to Left",x,y);   
   }
   public void run()
   {
     for(;;)
     {
        repaint();
        oldx=x; oldy=y; 
        if(direct==1)
        {
          y=y+10;
          if(y==500)
          {
             direct=0;
          }
        } 
       else
         {
             y=y-10;
             if(y==0)
             { 
                direct=1;
             }
         }
         x=x-2;
         if(y==500 && x==0)
        {
	    x=900;
            y=500;
        } 


       
         try
         {
           Thread.sleep(30);
         }
         catch(InterruptedException e)
         {}
       }
     }
   }
  
/* <Applet code="AnimatedCircle.class" height=500 width=1000 >
   </Applet> */
