import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TreeView<String> treeView;

    Image img = new Image(getClass().getResourceAsStream("Folder.png"));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TreeItem<String> root = new TreeItem<>("Root",new ImageView(img));
        root.setExpanded(true);

        TreeItem<String> nodeA = new TreeItem<>("node A",new ImageView(img));
        TreeItem<String> nodeB = new TreeItem<>("node B",new ImageView(img));
        TreeItem<String> nodeC = new TreeItem<>("node C");

        root.getChildren().addAll(nodeA, nodeB, nodeC);
        nodeA.setExpanded(true);

        TreeItem<String> nodeA1 = new TreeItem<>("node A1");
        nodeA.getChildren().add(nodeA1);
        TreeItem<String> nodeA2 = new TreeItem<>("node A2");
        nodeB.getChildren().add(nodeA2);
        TreeItem<String> nodeA3 = new TreeItem<>("node A3");
        nodeC.getChildren().add(nodeA3);

        treeView.setRoot(root);
    }
    
    public void clickMouse(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2){
            TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }
}

