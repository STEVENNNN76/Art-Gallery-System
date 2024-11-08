package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class shopController {
	int cid = 1;
	int cartval = 1;
	Connection con;
	PreparedStatement pst;
	

	@FXML
    private Button backbtn;

    @FXML
    private Button cartbtn;
    
    @FXML
    private Button sb1;

    @FXML
    private Button sb2;

    @FXML
    private Button sb3;

    @FXML
    private Button sb4;

    @FXML
    private Button sb5;

    @FXML
    private Button sb6;

    @FXML
    private Button sb7;

    @FXML
    private Button sb8;
    
    @FXML
    void back(ActionEvent event) {
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
    void gotocart(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/cart.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         cartController controller=loader.getController();
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
    void shopb1(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,1);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb1.setDisable(true);
    		sb1.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @FXML
    void shopb2(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,2);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb2.setDisable(true);
    		sb2.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @FXML
    void shopb3(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,3);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb3.setDisable(true);
    		sb3.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @FXML
    void shopb4(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,4);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb4.setDisable(true);
    		sb4.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @FXML
    void shopb5(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,5);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb5.setDisable(true);
    		sb5.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @FXML
    void shopb6(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,6);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb6.setDisable(true);
    		sb6.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @FXML
    void shopb7(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,7);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb7.setDisable(true);
    		sb7.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @FXML
    void shopb8(ActionEvent event) {
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
    		String query1="insert into cart values(?,?,?)";
    		pst=con.prepareStatement(query1);
    		pst.setInt(1,cid);
    		pst.setInt(2,8);
    		pst.setInt(3, cartval);
    		cartval++;
    		pst.execute();
    		sb8.setDisable(true);
    		sb8.setText("ADDED");

    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

}
