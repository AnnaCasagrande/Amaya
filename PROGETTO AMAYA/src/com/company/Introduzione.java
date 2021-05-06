package com.company;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Introduzione extends Close {
    Scene scene2, inizio1, inizio2;
    Button avanti, chiudi, avanti1, chiudi1, avanti2, chiudi2;
    Close close= new Close();
    public Scene intro(Stage finestra1 /*String nome*/){
        avanti = new Button("AVANTI");
        chiudi = new Button("EXIT");

        Label testo = new Label("Bene"+ ", la tua missione è aiutare Amaya a superare un\n " +
                "momento critico della sua adolescenza, affrontando eventi piuttosto comuni e poco \n" +
                "piacevoli e cercando di uscirne nel modo migliore. Buona fortuna!\n\n" +
                "Amaya: ragazza di 15 anni, frequentante la seconda " +
                "superiore e con un carattere piuttosto introverso, a causa di una critica " +
                "situazione familiare. Non ha molti amici, fatta eccezione per Gwen e Harrison, " +
                "suoi compagni di classe.\n");

        inizio1 = inizio1(finestra1);
        avanti.setOnAction(event -> finestra1.setScene(inizio1));

        chiudi.setOnAction(event -> close.closeX(finestra1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(testo, avanti, chiudi);
        scene2 = new Scene(layout2, 700, 500);



        return scene2;
    }

    public Scene inizio1(Stage finestra1){


        avanti1 = new Button("AVANTI");
        chiudi1 = new Button("EXIT");

        Label testo = new Label("Amaya torna da scuola,\n è in autobus e" +
                " le arriva una notifica dal social MyView:\n“Sei stata taggata in un post pubblicato da @Parnoid “," +
                " aprendo la notifica scopre che era una foto imbarazzante di lei, con una caption offensiva,\n l’inserzione" +
                " stava raggiungendo sempre più visualizzazioni, " +
                "e i commenti di derisione crescevano di conseguenza.\n\n");

        inizio2=inizio2(finestra1);
        avanti1.setOnAction(event -> finestra1.setScene(inizio2));

        chiudi1.setOnAction(event -> close.closeX(finestra1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(testo, avanti1, chiudi1);
        inizio1 = new Scene(layout2, 700, 500);

        return inizio1;

    }

    public Scene inizio2(Stage finestra1){


        avanti2 = new Button("AVANTI");
        chiudi2 = new Button("EXIT");

        Label testo = new Label("Una volta arrivata a casa sente suonare il telefono:\n " +
                "è Gwen, la sua amica che la invita ad uscire per affrontare la questione.\n");

        //avanti2.setOnAction(event -> finestra1.setScene());

        chiudi2.setOnAction(event -> close.closeX(finestra1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(testo, avanti2, chiudi2);
        inizio2 = new Scene(layout2, 700, 500);

        return inizio2;

    }




}
