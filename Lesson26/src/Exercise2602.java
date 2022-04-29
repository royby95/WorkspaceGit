import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
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

import java.awt.*;

public class Exercise2602 extends Application
{

  private Scene scene;
  private Button button;
  private Button button1;
  private Button button2;
  private Button button3;
  private Button button4;
  private Button button5;
  private Button button6;
  private Button button7;
  private Button button8;
  private Button button9;
  private Button button10;
  private Button button11;
  private Button button12;
  private Button button13;
  private Button button14;
  private Button button15;
  private Button button16;
  private GridPane gridPane;
  private BorderPane mainPane;
  private javafx.scene.text.Font font;
  public void start(Stage window)
  {
    window.setTitle("Calculator");

    //top panel
    button = new Button("");
    button.setPrefSize(300,10);
    //Central panel
    button1 = new Button("7");
    button2 = new Button("8");
    button3 = new Button("9");
    button4 = new Button("/");
    button5 = new Button("4");
    button6 = new Button("5");
    button7 = new Button("6");
    button8 = new Button("*");
    button9 = new Button("1");
    button10 = new Button("2");
    button11 = new Button("3");
    button12 = new Button("-");
    button13 = new Button("0");
    button14 = new Button(".");
    button15 = new Button("=");
    button16= new Button(",");
    //Central panel
    gridPane = new GridPane();
    gridPane.add(button1,0,0);
    gridPane.add(button2,1,0);
    gridPane.add(button3,2,0);
    gridPane.add(button4,3,0);
    gridPane.add(button5,0,1);
    gridPane.add(button6,1,1);
    gridPane.add(button7,2,1);
    gridPane.add(button8,3,1);
    gridPane.add(button9,0,2);
    gridPane.add(button10,1,2);
    gridPane.add(button11,2,2);
    gridPane.add(button12,3,2);
    gridPane.add(button13,0,3);
    gridPane.add(button14,1,3);
    gridPane.add(button15,2,3);
    gridPane.add(button16,3,3);


    //Main Pane
    //MainPane
    mainPane = new BorderPane();
    mainPane.setTop(button);
    mainPane.setCenter(gridPane);
    scene = new Scene(mainPane, 300, 300);
    window.setScene(scene);
    window.show();

    font = new Font(20);
    for (int i = 0; i < gridPane.getChildren().size(); i++)
    {
      ((Button) gridPane.getChildren().get(i)).setPrefSize(100, 100);
      ((Button) gridPane.getChildren().get(i)).setFont(font);
    }
  }
}
