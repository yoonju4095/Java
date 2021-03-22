import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Name extends JFrame implements ActionListener {

	static Label num, name, telNo;
	static TextField num_t, name_t, telNo_t;
	JButton reloaddown, reloadup,save,update,delete;
	Panel pan1, pan2, pan3, pan4;
	static String driver, url;
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static String tmpstr;
	static long count = 0;

	public Name(String title) {
		super(title);
		setLayout(new GridLayout(4, 1));
		num = new Label("��ȣ");
		name = new Label("�̸�");
		telNo = new Label("��ȭ");

		num_t = new TextField(20);
		name_t = new TextField(20);
		telNo_t = new TextField(20);

		reloaddown = new JButton("<");
		reloaddown.addActionListener(this);
		reloadup = new JButton(">");
		reloadup.addActionListener(this);		
		save = new JButton("����");		
		save.addActionListener(this);
		update = new JButton("����");
		update.addActionListener(this);
		delete = new JButton("����");
		delete.addActionListener(this);

		pan1 = new Panel();
		pan2 = new Panel();
		pan3 = new Panel();
		pan4 = new Panel();

		pan1.add(num);
		pan1.add(num_t);
		pan2.add(name);
		pan2.add(name_t);
		pan3.add(telNo);
		pan3.add(telNo_t);
		pan4.add(reloaddown);
		pan4.add(reloadup);
		pan4.add(save);
		pan4.add(update);
		pan4.add(delete);

		add(pan1);
		add(pan2);
		add(pan3);
		add(pan4);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);

	}

	public static void dbConnect() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("����̹� �˻� ����!");        
    	}catch(ClassNotFoundException e){
    		System.err.println("error = " + e);
    	}
        
    	
        url = "jdbc:odbc:namecard";
        
        
        
        String url = "jdbc:mysql://localhost/shopping?useUnicode=yes&characterEncoding=UTF8";
        String sql = "Select * From member";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("�����ͺ��̽� ���� ����!");            
         
        }
        catch(Exception e) {
            System.out.println("�����ͺ��̽� ���� ����!");
        }
	}

	public static void query(String order, String sql) throws SQLException {
		if (order == "select") {
			rs = stmt.executeQuery(sql);
		} 
		else {
			stmt.executeUpdate(sql);
		}
	}

	public static void viewData() throws SQLException {
		if(!rs.next()){
			System.out.println("!rs.next()");
			count--;
		}
		else{		
				System.out.println("rs.next()");
				num_t.setText(String.valueOf(rs.getLong("num")));
	
				name_t.setText(rs.getString("name"));
					
				telNo_t.setText(rs.getString("telNo"));
		}
	}

	public static void dbDis(){
		try {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			System.out.println("�����ͺ��̽� ���� ����!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws SQLException {

		new Name("���԰���");
		dbConnect();
		query("select", "select * from phone where num = 1");
		count = 1;
		viewData();
		dbDis();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(num_t.getText());
		if (e.getSource() == save) {
			dbConnect();
			try {
				query("insert", "insert into phone values('"+a+"','"+name_t.getText()+"','"+telNo_t.getText()+"')");
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}			
			System.out.println("���׸� �߰��Ϸ�");
			dbDis();

			num_t.setText("");
			name_t.setText("");
			telNo_t.setText("");
		} 
		else if (e.getSource() == reloaddown) {
			dbConnect();
			try	{

				count--;
				if(count < 1){
					System.out.println("count error");
					count++;
				}
				num_t.setText(String.valueOf(count));
				query("select", "select * from member where num = " +count + "");
				viewData();
				System.out.println("�����ͺ��̽� �ε�Ϸ�");
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			dbDis();
		}
		else if (e.getSource() == reloadup) {
			dbConnect();
			try {
				count++;
				num_t.setText(String.valueOf(count));
				query("select", "select * from phone where num = " +count + "");
				viewData();
				System.out.println("�����ͺ��̽� �ε�Ϸ�");
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			dbDis();
		}
		else if (e.getSource() == update) {
			dbConnect();
			try {
				query("update", "update phone set telNo = '" + telNo_t.getText() + "' , name = '" + name_t.getText() + "' where num = " + count + "");
				//viewData();
				System.out.println("�����ͺ��̽� �����Ϸ�");
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			dbDis();
		}
		else if (e.getSource() == delete) {
			dbConnect();
			try {
				query("delete", "delete from phone where num = " +num_t.getText() + " ");
				//viewData();
				System.out.println("�����ͺ��̽� �����Ϸ�");
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			dbDis();
		}
	}
}
