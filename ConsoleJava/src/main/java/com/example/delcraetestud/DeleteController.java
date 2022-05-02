package com.example.delcraetestud;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DeleteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField idInDeleteStudent;

    @FXML
    private Button deleteStudentButton;

    @FXML
    void initialize() {
        DataBaseHandler dbHand = new DataBaseHandler();

        deleteStudentButton.setOnAction(event -> {
            try {
                dbHand.deleteStudent(Integer.parseInt(idInDeleteStudent.getText()));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
