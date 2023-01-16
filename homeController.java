package application;

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

public class homeController {
	

   
	
	@FXML
    private Button galbutton;
	
	@FXML
	private Button logout;

    @FXML
    private Button profilebutton;

    @FXML
    private Button shopbutton;

    @FXML
    private Button shop2button;

    @FXML
 

    void logout(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/Sample.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         SampleController controller=loader.getController();
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
    void funshop(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/shop.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         shopController controller=loader.getController();
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
    void funshop2(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/shop2.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         shop2Controller controller=loader.getController();
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
    void artgal(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/artgallerypage.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         artgallerypageController controller=loader.getController();
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
    void profile(ActionEvent event) {
    	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/profile.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         profileController controller=loader.getController();
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



