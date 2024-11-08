package application;

import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class SampleController {

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
    @FXML
    private Button loginbutton;

    @FXML
    private TextField ptf;

    @FXML
    private Button registerbutton;

    @FXML
    private TextField utf;

    @FXML
    void login(ActionEvent event) {
    		 String username=utf.getText();
    		 String password=ptf.getText();
    		 if(username.equals("")&&password.equals(""))
    		 JOptionPane.showMessageDialog(null,"Enter Username and password");
    		 else
    		 {
    		 try
    		 {
    		 Class.forName("com.mysql.cj.jdbc.Driver");

    		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		 pst=con.prepareStatement("select * from customer where username=? and password=?");
    		 pst.setString(1, username);
    		 pst.setString(2, password);
    		 
    		 rs=pst.executeQuery();
    		 if(rs.next())
    		 {
    		     //System.out.println("Login Success");
    		     String cid = (String)rs.getString(1);
    		     String Cfname= (String)rs.getString(2);
    		     String Clname = (String)rs.getString(3);
    		     String phoneno =(String)rs.getString(5); 
    		     String email =  (String)rs.getString(6);
    		     try
    		     {
    		         FXMLLoader loader=new FXMLLoader();
    		         loader.setLocation(getClass().getResource("/application/homepage.fxml"));
    		         
    		         Parent root=loader.load();
    		         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
    		         
    		         Scene scene=new Scene(root,1440,1024);
    		         homeController controller=loader.getController();
    		         //controller.getID(cid, fname, lname, phone, email, location, user, pts);
    		         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		         arg0.setScene(scene);
    		        // arg0.setResizable(false);
    		arg0.show();
    		     }
    		     catch(Exception e) 
    		                {
    		e.printStackTrace();
    		}
    		 }
    		 else {
    		 JOptionPane.showMessageDialog(null,"Login Failed");
    		 utf.setText("");
    		 ptf.setText("");
    		 utf.requestFocus();
    		 ptf.requestFocus();
    		 }
    		 }catch(ClassNotFoundException | SQLException e)
    		 {
    		 System.out.println("Connection failed");
    		 System.out.println(e);
    		 }
    		 } 
    }

    @FXML
    void register(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/Sample2.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         registerController controller=loader.getController();
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
