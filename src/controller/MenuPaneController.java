package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuPaneController implements Initializable {
	@FXML
	private MainController main;
	@FXML
	private ControlPaneController controlPaneController;
	@FXML
	private MenuPaneController menuPaneController;
    @FXML
    private Menu productMenu;

    @FXML
    private MenuItem newMenuItem;

    @FXML
    private MenuItem saveMenuItem;

    @FXML
    private MenuItem loadMenuItem;

    @FXML
    private MenuItem printMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private Menu procedureMenu;

    @FXML
    private MenuItem latheMenuItem;

	public MenuItem getLatheMenuItem() {
		return latheMenuItem;
	}
	@FXML
    private MenuItem drillMenuitem;

    @FXML
    private MenuItem cutMenuItem;

    @FXML
    private MenuItem otherMenuItem;

    @FXML
    private Menu optionMenu;

    @FXML
    private MenuItem settingsMenuItem;

    @FXML
    private MenuItem avaibleMenuItem;

    @FXML
    private MenuItem editSemiMenuItem;

    @FXML
    private Menu helpMenu;

    @FXML
    private MenuItem aboutMenuItem;
	@Override
	
	public void initialize(URL location, ResourceBundle resources) {
		configureMenu();
	}
	
	private void configureMenu() {
		closeMenuItem.setOnAction(x -> Platform.exit());
        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                Parent parent = null;
                try {
                    parent = FXMLLoader.load(getClass().getResource("/view/AboutPane.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.setTitle("Manufacture CAT v0.1 - informacje");
                stage.setScene(scene);
                stage.show();
            }
        });
    }
	public void init(MainController mainController) {
		main = mainController;
		
	}
	public void createLatheWindow() {
		Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/LatheAddPane.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setTitle("Dodawanie zabiegu toczenia");
        stage.setScene(scene);
        stage.show();
	}

	public MenuItem getNewMenuItem() {
		return newMenuItem;
	}

}
