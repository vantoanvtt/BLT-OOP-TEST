package controllers;

import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookMarkController implements Initializable {
    @FXML
    private JFXListView<String> list;

    ObservableList<String> listv = FXCollections.observableArrayList("vtt", "item 2", "item 3", "item 4");

    /*static class Cell extends ListCell<String> {
        HBox hBox = new HBox();
        Button button = new Button("delete");
        Label label = new Label();
        Pane pane = new Pane();
        Image bookmark = new Image("/screens/asset/bookmark-flat.png");
        ImageView img = new ImageView(bookmark);

        public Cell() {
            super();
            hBox.getChildren().addAll(img,label,pane, button);
        }
        public void updateItem(String word, boolean empty) {
            super.updateItem(word,empty);
            setText(null);
            setGraphic(null);

            if (word != null && !empty) {
                label.setText(word);
                setGraphic(hBox);
            }
        }
    }*/

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(listv);
        list.setCellFactory(studentListView -> new ListCellController());
    }
}
