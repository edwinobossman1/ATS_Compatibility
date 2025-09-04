package com.ats.app.controller;

import com.ats.app.model.DictionaryManager;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

import java.util.List;

public class DictionaryController {

    @FXML private CheckBox chkTech, chkSoft, chkProtocols, chkTools, chkMethods;
    @FXML private TextArea txtOutput;

    @FXML
    public void initialize() {
        updateView();
    }

    @FXML
    private void updateView() {
        StringBuilder sb = new StringBuilder();
        if (chkTech.isSelected()) sb.append("TECHNOLOGIES: ").append(DictionaryManager.getDictionary("TECHNOLOGIES")).append("\n");
        if (chkSoft.isSelected()) sb.append("SOFTSKILLS: ").append(DictionaryManager.getDictionary("SOFTSKILLS")).append("\n");
        if (chkProtocols.isSelected()) sb.append("PROTOCOLS: ").append(DictionaryManager.getDictionary("PROTOCOLS")).append("\n");
        if (chkTools.isSelected()) sb.append("TOOLS: ").append(DictionaryManager.getDictionary("TOOLS")).append("\n");
        if (chkMethods.isSelected()) sb.append("ITMETHODOLOGIES: ").append(DictionaryManager.getDictionary("ITMETHODOLOGIES")).append("\n");

        txtOutput.setText(sb.toString());
    }

    @FXML
    private void handleSearch() {
        List<String> toSearch = List.of("Java", "AWS", "Linux"); // Simulacion
        String result = DictionaryManager.searchMultiple("TECHNOLOGIES", toSearch);
        txtOutput.appendText("\nResultado búsqueda: " + result);
    }
}
