package com.ats.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

    @FXML
    private Button btnHistorial, btnIniciar, btnDiccionario;

    @FXML
    public void handleHistorial(ActionEvent event) {
        System.out.println("Historial presionado");
    }

    @FXML
    public void handleIniciar(ActionEvent event) {
        System.out.println("Iniciar ATS presionado");
    }

    @FXML
    public void handleDiccionario(ActionEvent event) {
        System.out.println("Diccionario presionado");
    }
}
