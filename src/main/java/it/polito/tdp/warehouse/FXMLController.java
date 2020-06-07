package it.polito.tdp.warehouse;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.warehouse.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtLocali;

    @FXML
    private ChoiceBox<?> boxStrategia;

    @FXML
    private Button btnCarica;

    @FXML
    private Button btnSimula;

    @FXML
    private TextArea txtResult;

    @FXML
    void doOccupazione(ActionEvent event) {

    }

    @FXML
    void doSimula(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtLocali != null : "fx:id=\"txtLocali\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert boxStrategia != null : "fx:id=\"boxStrategia\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert btnCarica != null : "fx:id=\"btnCarica\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert btnSimula != null : "fx:id=\"btnSimula\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Warehouse.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
