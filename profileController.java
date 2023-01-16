package application;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.sql.*;

public class profileController {

	Connection con1;
	PreparedStatement ps1;
	ResultSet rs1;
	int custid;
	
	String first, last, phone, mail, username;
	
    @FXML
    private Button back;

    @FXML
    private TextField cno;

    @FXML
    private Button editp;

    @FXML
    private TextField fname;

    @FXML
    private Button home;

    @FXML
    private Button save;
    
    @FXML
    private Label Lcno;

    @FXML
    private Label Lemail;

    @FXML
    private Label Lfname;

    @FXML
    private Label Llname;

    @FXML
    private Label Luname;

    @FXML
    private TextField emails;

    @FXML
    private TextField lname;

    @FXML
    private TextField uname;

    @FXML
    public void initialize()
    {
	    	try
	        {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
		
		        ps1=con1.prepareStatement("select * from customer order by cid desc limit 1");
		        rs1=ps1.executeQuery();
		        while(rs1.next())
		        {
			        Lfname.setText(rs1.getString(2));
			        Llname.setText(rs1.getString(3));
			        Luname.setText(rs1.getString(4));
			        Lcno.setText(rs1.getString(5));
			        Lemail.setText(rs1.getString(6));
			
			        fname.setText(rs1.getString(2));
			        lname.setText(rs1.getString(3));
			        uname.setText(rs1.getString(4));
			        cno.setText(rs1.getString(5));
			        emails.setText(rs1.getString(6));
			        
			        custid = rs1.getInt(1);
			        
			        fname.setVisible(false);
					lname.setVisible(false);
					uname.setVisible(false);
					cno.setVisible(false);
					emails.setVisible(false);
					save.setDisable(true);
		        }
        

	        }

		    catch(ClassNotFoundException | SQLException ex)
		    {
		        System.out.println("Connection failed");
		        System.out.println(ex);
            }
    }
    
    @FXML
    void edit(ActionEvent event) {
	        save.setDisable(false);
	        editp.setDisable(true);
	        
		    fname.setVisible(true);
		    lname.setVisible(true);
		    uname.setVisible(true);
		    cno.setVisible(true);
		    emails.setVisible(true); 
		    
		    Lfname.setVisible(false);
		    Llname.setVisible(false);
		    Luname.setVisible(false);
		    Lcno.setVisible(false);
		    Lemail.setVisible(false); 
    }
        
    @FXML
    void save(ActionEvent event) {
	    save.setDisable(true);
	    editp.setDisable(false);
	
	    fname.setVisible(false);
		lname.setVisible(false);
		uname.setVisible(false);
		cno.setVisible(false);
		emails.setVisible(false);
	
		Lfname.setVisible(true);
	    Llname.setVisible(true);
	    Luname.setVisible(true);
	    Lcno.setVisible(true);
	    Lemail.setVisible(true); 
	    
	    first = fname.getText();
		last = lname.getText();
		username = uname.getText();
		phone = cno.getText();
		mail = emails.getText();
	
		Lfname.setText(first);
		Llname.setText(last);
		Luname.setText(username);
		Lcno.setText(phone);
		Lemail.setText(mail);
	
	   try
	   {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
	    
	    
	    ps1=con1.prepareStatement("update customer set Cfname=?, Clname=?, username=?, phoneno=?, email=? where CID = ?");
	    ps1.setString(1,first);
	    ps1.setString(2,last);
	    ps1.setString(4,phone);
	    ps1.setString(5,mail);
	    ps1.setString(3,username);
	    ps1.setInt(6,custid);
	    ps1.execute();
	   
	   }
	   catch(Exception ex)
	   {
	    ex.printStackTrace();
	   }
	    
    }
    @FXML
    void goback(ActionEvent event) {
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
    void gohome(ActionEvent event) {
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
