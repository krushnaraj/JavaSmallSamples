import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Clock extends JApplet implements Runnable,ActionListener
{
	JButton b1,b2;
	JPanel p;
	Thread t1=new Thread(this);
	double x=400,y=300,r=100,theta;
	Graphics g;
	public void init()
	{
		setForeground(Color.white);
		b1=new JButton("Clock Wise");
		b2=new JButton("Anti-Clock Wise");
		t1.start();
		b1.addActionListener(this);
		b2.addActionListener(this);
		p=new JPanel();
		p.setLayout(new FlowLayout());
		p.add(b1);
		p.add(b2);
		p.setBackground(Color.black);
		add(p);
		setVisible(true);
	}
	public void run()
	{}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				repaint();
				g=getGraphics();
				for(theta=0;theta<3.14*2;theta+=0.1)
				{
					x=r*Math.cos(theta);
					y=r*Math.sin(theta);
					g.drawLine(400,300,(int)x+400,(int)y+300);
					t1.sleep(50);
				}
			}
			catch(Exception e)
			{}
		}
		if(ae.getSource()==b2)
		{
			try
			{
				repaint();
				g=getGraphics();
				for(theta=3.14*2;theta>0;theta-=0.1)
				{
					x=r*Math.cos(theta);
					y=r*Math.sin(theta);
					g.drawLine(400,300,(int)x+400,(int)y+300);
					t1.sleep(50);
				}
			}
			catch(Exception e)
			{}
		}
	}
}
/*<applet code="Clock.class" height=500 width=800></applet>*/