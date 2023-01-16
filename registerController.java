package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.sql.*;

import javax.swing.JOptionPane;

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

public class registerController {

	Connection con;
	PreparedStatement pst, ps;
	ResultSet rs, rst;
	
    @FXML
    private Button createbtn;

    @FXML
    private TextField signupemail;

    @FXML
    private TextField signuppass;

    @FXML
    private TextField signupuname;

    @FXML
    void create(ActionEvent event) throws IOException {
         String email=signupemail.getText();
         String username=signupuname.getText();
        String password=signuppass.getText();

        
         if(email.equals("")||username.equals("")||password.equals(""))
           JOptionPane.showMessageDialog(null,"Blank fields found!!");

        else
        {
           try
           {
             Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","Johnnyenglish12");
            
            String query3="select * from Customer where email=?";
            
            pst=con.prepareStatement(query3);
            pst.setString(1, email);
            rs=pst.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Email already exists! Try logging in..");
            }else{
              String query1="insert into Customer values(?,?,?,?,?,?,?)";
              
              pst=con.prepareStatement(query1);
              
              
              pst.setString(2, null);
              pst.setString(3, null);
              pst.setString(5, null);
              pst.setString(6, email);
              pst.setString(4, username);
              pst.setString(7, password);
              String query4=("select @count:=cid from customer order by cid desc limit 1");
              ps=con.prepareStatement(query4);
              rst=ps.executeQuery();
              
              int ccount = 0;
              
              if(rst.next())
              {
                  ccount=rst.getInt(1);
              }
              
              ccount++;     
              int C_ID=ccount;
              pst.setInt(1, C_ID);
              pst.execute();
              
              
              FXMLLoader loader=new FXMLLoader();
              loader.setLocation(getClass().getResource("/application/homepage.fxml"));
              
              Parent root=loader.load();
              Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();

              Scene scene=new Scene(root,1440,1024);
               
              
              scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
              arg0.setScene(scene);
              arg0.show();
             
           }
             }catch(ClassNotFoundException | SQLException e)
             {
             System.out.println("Connection failed");
             System.out.println(e);
             
         }
    }
    }
   }
