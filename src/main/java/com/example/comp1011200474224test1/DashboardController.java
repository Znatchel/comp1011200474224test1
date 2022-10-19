package com.example.comp1011200474224test1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private Label Label1;


    @FXML
    private Label totalMoviesLabel;

    @FXML
    private TableColumn<Netflix, String> cast;

    @FXML
    private ComboBox<?> comboBox;

    @FXML
    private TableColumn<Netflix, String> director;

    @FXML
    private CheckBox moviesBox;

    @FXML
    private TableColumn<Netflix, String> rating;

    @FXML
    private TableColumn<Netflix, Integer> showId;

    @FXML
    private TableView<Netflix> tableView;

    @FXML
    private TableColumn<Netflix, String> title;

    @FXML
    private CheckBox tvShowsBox;

    @FXML
    private TableColumn<Netflix, String> type;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Here");
        showId.setCellValueFactory(new PropertyValueFactory<>("showId"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        director.setCellValueFactory(new PropertyValueFactory<>("director"));
        cast.setCellValueFactory(new PropertyValueFactory<>("cast"));

        System.out.println(DBUtility.getFlixFromDB().size());
        tableView.getItems().addAll(DBUtility.getFlixFromDB());


    }
}
