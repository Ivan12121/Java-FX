package com.example.delcraetestud;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick() {
        welcomeText.setText("Добавьте или удалите студента");
    }

    @FXML
    void openCreateWindow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("create-student.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 550);
        stage.setTitle("create");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openDeleteWindow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("delete-student.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 550);
        stage.setTitle("delete");
        stage.setScene(scene);
        stage.show();
    }
}