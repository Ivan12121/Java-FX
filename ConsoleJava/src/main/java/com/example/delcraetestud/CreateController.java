package com.example.delcraetestud;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField idInStudentName;

    @FXML
    private Button confirmCreateButton;

    @FXML
    void initialize() {
        DataBaseHandler dbHand = new DataBaseHandler();

        confirmCreateButton.setOnAction(event -> {
            try {
                dbHand.signStudent(idInStudentName.getText());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

    }

}
