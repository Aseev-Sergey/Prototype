package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import sample.Nodes.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Canvas canvas;
    public ListView<Node> list;
    public ObservableList<Node> items;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Begin begin = new Begin();
        Operation operation = new Operation();
        Solution solution = new Solution();
        End end = new End();
        items = FXCollections.observableArrayList(begin, operation, solution, end);
        list.setItems(items);
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void addNode(MouseEvent mouseEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int index = list.getSelectionModel().getSelectedIndex();
        if ((index >= 0) && (index < list.getItems().size())) {
            Node new_figure = (Node) items.get(index).clone();
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            new_figure.draw(gc, mouseEvent.getX(), mouseEvent.getY());
        } else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Не выбран узел из списка");
            alert.showAndWait();
        }
    }

    public void clickClear(ActionEvent actionEvent) {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        gr.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.exit();
    }


}
