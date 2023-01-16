package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class artgallerypageController {

    @FXML
    private Button view1;

    @FXML
    private Button view2;

    @FXML
    private Button view3;

    @FXML
    private Button view4;
    
    @FXML
    private Button view5;


    @FXML
    void go1(ActionEvent event) {
      	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/artt1.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         artt1controller controller=loader.getController();
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
    void go2(ActionEvent event) {
      	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/artt2.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         art2Controller controller=loader.getController();
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
    void go3(ActionEvent event) {
      	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/artt3.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         art3controller controller=loader.getController();
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
    void go4(ActionEvent event) {
      	try
	     {
	         FXMLLoader loader=new FXMLLoader();
	         loader.setLocation(getClass().getResource("/application/artt4.fxml"));
	         
	         Parent root=loader.load();
	         Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	         
	         Scene scene=new Scene(root,1300,800);
	         art4controller controller=loader.getController();
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
    void go5(ActionEvent event) {
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
