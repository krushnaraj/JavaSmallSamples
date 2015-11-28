import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class record extends JFrame implements ActionListener
{
	JLabel lblName,lblNo;
	JTextField txtName,txtNo;
	JButton btnInsert,btnUpdate,btnDelete,btnClear;
	ResultSet rs;
	record()
	{
		lblName=new JLabel("NAME");
		lblNo=new JLabel("Number");
		txtName=new JTextField(10);
		txtNo=new JTextField(10);
		btnInsert=new JButton("INSERT");
		btnUpdate=new JButton("UPDATE");
		btnDelete=new JButton("DELETE");
		btnClear=new JButton("CLEAR");
		

		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(lblName);
		c.add(txtName);
		c.add(lblNo);
		c.add(txtNo);
		c.add(btnInsert);
		c.add(btnUpdate);
		c.add(btnDelete);
		c.add(btnClear);

		setSize(600,500);
		setVisible(true);
		show();

		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnClear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("Jdbc:Odbc:record");
			if(ae.getSource()==btnInsert)
			{
				String strName,strNo,strSql;
				strName=txtName.getText();
				strNo=txtNo.getText();
				strSql="insert into record values(?,?)";
				PreparedStatement pstm=c.prepareStatement(strSql);
					pstm.setString(1,strName);
					pstm.setString(2,strNo);
					pstm.executeUpdate();

				JOptionPane.showMessageDialog(null,"Record Inserted");
			}
			if(ae.getSource()==btnUpdate)
			{
				String strName,strNo,strSql;
				strName=txtName.getText();
				strNo=txtNo.getText();
				strSql="update record set no=? where name=?";
				PreparedStatement pstm=c.prepareStatement(strSql);
					pstm.setString(2,strName);
					pstm.setString(1,strNo);
					pstm.executeUpdate();

				JOptionPane.showMessageDialog(null,"Record Updated");
			}
			if(ae.getSource()==btnDelete)
			{
				String strName,strNo,strSql;
				strName=txtName.getText();
				strNo=txtNo.getText();
				strSql="delete from record where name=?";
				PreparedStatement pstm=c.prepareStatement(strSql);
					pstm.setString(1,strName);
					pstm.executeUpdate();

				JOptionPane.showMessageDialog(null,"Record Deleted");
			}
			if(ae.getSource()==btnClear)
			{
				txtName.setText("");
				txtNo.setText("");
			}
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String args[])
	{
		record r=new record();
	}
}