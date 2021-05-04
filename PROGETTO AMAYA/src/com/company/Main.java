package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
    Stage finestra1;
    public static void main(String[] args) {
        launch(args);
    }

    //PAGINA INIZIALE CON INSERIMENTO DEL NOME
    @Override
    public void start(Stage primaryStage) throws Exception {
        //DICHIARAZIONI
        Introduzione intro = new Introduzione();
        Close chiudi = new Close();

        finestra1 = primaryStage;
        finestra1.setTitle("Le scelte di Amaya");
        // prova
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10,10, 10));
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        Label saluto = new Label("Amaya's Visual Novel. \n");

        GridPane.setConstraints(saluto, 0, 3);

        TextField inserisciNome = new TextField("Inserisci qui il tuo nome");
        GridPane.setConstraints(inserisciNome, 0, 12);

        //bottone inizio
        Button start = new Button("START");
        start.setOnAction(event -> finestra1.setScene(intro.intro(finestra1)));
        GridPane.setConstraints(start, 0, 13);

        //bottone chiusura e escita tramite X
        Button close = new Button("EXIT");
        //new BorderPane(close);
        GridPane.setConstraints(close, 1, 14);
        //chiusura finestra
        close.setOnAction(event -> chiudi.closeX(finestra1));
        finestra1.setOnCloseRequest(event -> {
            event.consume();
            chiudi.closeX(finestra1);
        });

        grid.getChildren().addAll(saluto, inserisciNome, start, close);
        Scene scene1  = new Scene(grid, 700, 500);
        finestra1.setScene(scene1);

        //fine
        finestra1.show();
    }
}





