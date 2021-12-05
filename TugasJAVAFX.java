/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TugasJAVAFX extends Application  {
    private StackPane root = new StackPane();
    private Stage stage;
    @Override
    public void init() {
        Button btn = new Button("OPEN");
        VBox vBox = new VBox();
        vBox.setSpacing(6);
        vBox.setPadding(new Insets(12,12,12,12));
        vBox.getChildren().addAll(
                new Label("First Name"),
                new TextField(),
                new Label("Last Name"),
                new TextField(),
                new Label("E-Mail Address"),
                new TextField(),
                new Label("Contact No"),
                new TextField(),
                new Label("Password"),
                new PasswordField(),
                new Label("Confirm Password"),
                new PasswordField());
               // new Button("REGISTER"));
                
                
        root.getChildren().addAll(vBox);
        Button reg = new Button("REGISTER");
        reg.setAlignment(Pos.CENTER);
        root.getChildren().add(reg);
        

        btn.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
            stage = new Stage();
            StackPane stackPane = new StackPane();
            stage.setScene(new Scene(stackPane, 500,500));
            stage.show();
        });
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root,800,700);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Register");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
