package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//import java.io.IOException;
import java.sql.*;



public class cartController {
	
	Connection con1, con2, con, con3, con4;
	PreparedStatement ps1, ps2, ps, ps3, ps4;
	ResultSet rs1, rst, rs3;
	int sum = 0;

	@FXML
    private Button checkout;
	
    @FXML
    private Label L00;

    @FXML
    private Label L01;
    
    @FXML
    private Label L10;
    
    @FXML
    private Label L11;

    @FXML
    private Label L20;

    @FXML
    private Label L21;

    @FXML
    private Label L30;

    @FXML
    private Label L31;

    @FXML
    private Label L40;

    @FXML
    private Label L41;

    @FXML
    private Label total;
    
    @FXML
    private Button backbtn;

    
    @FXML
    public void initialize()
    {
    	//homelabel.setText("random shit");
    	
    	try
    	{
            
	    	for(int i=1; i<=5; i++)
	    	{
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    			ps1 = con1.prepareStatement("select s.siname, s.price, s.sid from shop s, cart c where s.sid = c.sid and c.cartid=? limit 1");
	    		ps1.setInt(1, i);
    			rs1=ps1.executeQuery();
    			
    			
	    		if(i == 1)
	    		{
		    		while(rs1.next())
		    		{
		    			L00.setText(rs1.getString(1));
		    			L01.setText(rs1.getString(2));
		    			sum =  sum + rs1.getInt(2);
		    			
		    		}
	    		}
	    		if(i == 2)
	    		{
		    		while(rs1.next())
		    		{
		    			L10.setText(rs1.getString(1));
		    			L11.setText(rs1.getString(2));
		    			sum =  sum + rs1.getInt(2);
		    			
		    		}
	    		}
	    		if(i == 3)
	    		{
		    		while(rs1.next())
		    		{
		    			L20.setText(rs1.getString(1));
		    			L21.setText(rs1.getString(2));
		    			sum =  sum + rs1.getInt(2);
		    			
		    		}
	    		}
	    		if(i == 4)
	    		{
		    		while(rs1.next())
		    		{
		    			L30.setText(rs1.getString(1));
		    			L31.setText(rs1.getString(2));
		    			sum =  sum + rs1.getInt(2);
		    			
		    		}
	    		}
	    		if(i == 5)
	    		{
		    		while(rs1.next())
		    		{
		    			L40.setText(rs1.getString(1));
		    			L41.setText(rs1.getString(2));
		    			sum =  sum + rs1.getInt(2);
		    			
		    		}
	    		}
	    	}
	    	
	    	String sum1 = "Rs. " + sum;
	    	total.setText(sum1);
    	}
    	catch(ClassNotFoundException | SQLException ex)
    	{
			System.out.println("Connection failed");
			System.out.println(ex);
    	}
    }
    
    @FXML
    void leave(ActionEvent event) {
    	try
    	{
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    			ps2 = con2.prepareStatement("delete from cart where cid=?");
	    		ps2.setInt(1, 1);
    			ps2.execute();
    	}
    	catch(ClassNotFoundException | SQLException ex)
    	{
			System.out.println("Connection failed");
			System.out.println(ex);
    	}
    	
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/homepage.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         homeController controller=loader.getController();
	         //controller.getID(cid, fname, lname, phone, email, location, user, pts);
	         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	         arg0.setScene(scene);
	         //arg0.setResizable(false);
	arg0.show();
	     }
	     catch(Exception e) 
	                {
	e.printStackTrace();
	}
    	
    }
    
    @FXML
    void back(ActionEvent event) {
    	try
    	{
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    			ps2 = con2.prepareStatement("delete from cart where cid=?");
	    		ps2.setInt(1, 1);
    			ps2.execute();
    	}
    	catch(ClassNotFoundException | SQLException ex)
    	{
			System.out.println("Connection failed");
			System.out.println(ex);
    	}
    	
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/homepage.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         homeController controller=loader.getController();
	         //controller.getID(cid, fname, lname, phone, email, location, user, pts);
	         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	         arg0.setScene(scene);
	         //arg0.setResizable(false);
	arg0.show();
	     }
	     catch(Exception e) 
	                {
	e.printStackTrace();
	}

    }
    

}
