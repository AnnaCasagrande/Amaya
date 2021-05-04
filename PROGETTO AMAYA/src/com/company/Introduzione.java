package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Introduzione extends Close {
    Scene scene2;
    Button bottone1;
    public Scene intro(Stage finesta1 /*String nome*/){
        bottone1 = new Button("AVANTI");

        Label inizio = new Label("Bene"+ ", la tua missione è aiutare Amaya a superare un\n " +
                "momento critico della sua adolescenza, affrontando eventi piuttosto comuni e poco \n" +
                "piacevoli e cercando di uscirne nel modo migliore. Buona fortuna!\n\n" +
                "Amaya: ragazza di 15 anni, frequentante la seconda " +
                "superiore e con un carattere piuttosto introverso, a causa di una critica " +
                "situazione familiare. Non ha molti amici, fatta eccezione per Gwen e Harrison, " +
                "suoi compagni di classe.\n");

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(inizio, bottone1);
        scene2 = new Scene(layout2, 700, 500);

        return scene2;
    }
}
