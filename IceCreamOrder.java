import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class formColor extends JInternalFrame
{
	formColor()
	{
		super("COLOR",true,true,true,true);
		setSize(300,300);
	}
}
class formCity extends JInternalFrame
{
	formCity()
	{
		super("CITY",true,true,true,true);
		setSize(300,300);
	}
}
class formFlavour extends JInternalFrame
{
	formFlavour()
	{
		super("FLAVOUR",true,true,true,true);
		setSize(300,300);
	}
}


class IceCreamOrder extends JFrame implements ActionListener
{
	JDesktopPane jdsk;
	formColor cl;
	formCity ct;
	formFlavour fl;
	JMenuBar mb,mb1,mb2,mb3;
	JMenu mnuICO,mColor,mCity,mFlavour;
	JMenuItem mnuColor,mnuCity,mnuFlavour,mnuRed,mnuGreen,mnuBlue,mnuThane,mnuMumbai,mnuNewMumbai,mnuChocolate,mnuVanilla,mnuStrawberry;
	IceCreamOrder()
	{
		super("ICE-CREAM-OREDR");
		mb=new JMenuBar();
		mnuICO=new JMenu("Ice-Cream-Order");
		mnuColor=new JMenuItem("COLOR");
		mnuCity=new JMenuItem("CITY");
		mnuFlavour=new JMenuItem("FLAVOUR");

		mnuICO.add(mnuColor);
		mnuICO.add(mnuCity);
		mnuICO.add(mnuFlavour);
		mb.add(mnuICO);

		/*mb1=new JMenuBar();
		mnuColor=new JMenuItem("COLOR");
		mnuRed=new JMenuItem("RED");
		mnuGreen=new JMenuItem("GREEN");
		mnuBlue=new JMenuItem("BLUE");

		mnuColor.add(mnuRed);
		mnuColor.add(mnuGreen);
		mnuColor.add(mnuBlue);
		mb1.add(mnuColor);

		mb2=new JMenuBar();
		mnuCity=new JMenuItem("CITY");
		mnuThane=new JMenuItem("THANE");
		mnuMumbai=new JMenuItem("MUMBAI");
		mnuNewMumbai=new JMenuItem("NEW MUMBAI");

		mnuCity.add(mnuThane);
		mnuCity.add(mnuMumbai);
		mnuCity.add(mnuNewMumbai);
		mb2.add(mnuCity);

		mb3=new JMenuBar();
		mnuFlavour=new JMenuItem("FLAVOUR");
		mnuChocolate=new JMenuItem("CHOCOLATE");
		mnuVanilla=new JMenuItem("VANILLA");
		mnuStrawberry=new JMenuItem("STRAWBERRY");

		mnuFlavour.add(mnuChocolate);
		mnuFlavour.add(mnuVanilla);
		mnuFlavour.add(mnuStrawberry);
		mb3.add(mnuFlavour);*/

		setJMenuBar(mb);

		jdsk=new JDesktopPane();

		cl=new formColor();
		ct=new formCity();
		fl=new formFlavour();

		jdsk.add(cl);
		jdsk.add(ct);
		jdsk.add(fl);

		Container c=getContentPane();
		c.add(jdsk);
		setSize(600,600);
		setVisible(true);
		show();

		mnuICO.addActionListener(this);
		mnuColor.addActionListener(this);
		mnuCity.addActionListener(this);
		mnuFlavour.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mnuColor)
		{
			cl.setVisible(true);
			ct.setVisible(false);
			fl.setVisible(false);
			cl.show();
		}
		else if(ae.getSource()==mnuCity)
		{
			cl.setVisible(false);
			ct.setVisible(true);
			fl.setVisible(false);
			ct.show();
		}
		else if(ae.getSource()==mnuFlavour)
		{
			cl.setVisible(false);
			ct.setVisible(false);
			fl.setVisible(true);
			fl.show();
		}
	}
	public static void main(String args[])
	{
		IceCreamOrder ICO=new IceCreamOrder();
	}
}