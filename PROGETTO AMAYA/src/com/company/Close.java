package com.company;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Close {
    public static boolean answer;



    //chiusura con X
    public void closeX(Stage finestra1){
        Boolean answer = Close.display("EXIT", "Sei sicuro di voler uscire?");
        if(answer)
            finestra1.close();
    }

    public static boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250); //lunghezza minima che può assumere la finestra

        Label label = new Label();
        label.setText(message);

        Button yesButton = new Button("SI");
        Button noButton = new Button("NO");

        yesButton.setOnAction(event -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(event -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}