import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.lang.String;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Label myLabel;
    @FXML
    public ComboBox<String> combobox;
    ObservableList<String> list = FXCollections.observableArrayList("Mark","Jon","Sarah","Rob");
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //combobox.setItems(list);
    }

    public void changeCombobox(ActionEvent event){
        combobox.getItems().addAll("Fanta","Cola","Sprite","Pepsi");
        //myLabel.setText(combobox.getValue());
    }
    public void buttonAction(ActionEvent event){
        combobox.getItems().addAll("Fanta","Cola","Sprite","Pepsi");
        //myLabel.setText(combobox.getValue());
    }
}
