import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Exercise2601 extends Application
{
  private Scene scene;
  private FlowPane mainPane;
  private VBox leftPane;
  private VBox middlePane;
  private Label textLabel1;
  private Label textLabel2;
  private TextField textField1;
  private TextField textField2;
  private CheckBox checkBox1;
  private CheckBox checkBox2;
  private HBox x;
  private HBox y;
  private VBox bottomPane;
  private Button button1;
  private Button button2;
  private Button button3;


  public void start(Stage window)
  {
    window.setTitle("Align");

    //leftPane
    //Check Box
    leftPane = new VBox();
    checkBox1 = new CheckBox("Exit on ok");
    checkBox2 = new CheckBox("Exit on cancel");
    checkBox1.setPadding(new Insets(5,5,5,5));
    checkBox2.setPadding(new Insets(5,5,5,5));
    leftPane.getChildren().addAll(checkBox1, checkBox2);

    //MiddlePane
    //Text section
    middlePane = new VBox();
    //x
    textLabel1 = new Label("X:");
    textField1 = new TextField("");
    x = new HBox();
    x.getChildren().addAll(textLabel1, textField1);
    textField1.setPadding(new Insets(5,5,5,5));
    x.setPadding(new Insets(5,5,5,5));
    //y
    textLabel2 = new Label("Y:");
    textField2 = new TextField("");
    textField2.setPadding(new Insets(5,5,5,5));
    y = new HBox();
    y.getChildren().addAll(textLabel2, textField2);
    y.setPadding(new Insets(5,5,5,5));

    //MiddlePaneAdding
    middlePane.getChildren().addAll(x,y);

    //Bu
    button1 = new Button("Ok");
    //button1.setPadding(new Insets(5,5,5,5));
    button2 = new Button("Cancel");
   // button2.setPadding(new Insets(5,5,5,5));
    button3 = new Button("Clear");
   // button3.setPadding(new Insets(5,5,5,5));
    //Bottom Pane
    bottomPane = new VBox(10);
    //bottomPane.setPadding(new Insets(5,5,5,5));
    bottomPane.getChildren().addAll(button1, button2, button3);


    //MainPane
    mainPane = new FlowPane(200,50);
    mainPane.getChildren().addAll(leftPane, middlePane,bottomPane);
    scene = new Scene(mainPane, 800, 300);
    window.setScene(scene);
    window.show();




  }
}




