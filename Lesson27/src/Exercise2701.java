import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.awt.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Exercise2701 extends Application
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
  private TextField textField;
  private double number1;
  private double number2;
  private String operator;
  private double result;
  private MyListener listener;

  public void start(Stage window)
  {
    window.setTitle("Calculator");

    //top panel
    listener = new MyListener();
    textField = new TextField("");
    textField.setPrefSize(300, 10);
    //Central panel
    button1 = new Button("7");
    button1.setOnAction(listener);
    button2 = new Button("8");
    button2.setOnAction(listener);
    button3 = new Button("9");
    button3.setOnAction(listener);
    button4 = new Button("/");
    button4.setOnAction(listener);
    button5 = new Button("4");
    button5.setOnAction(listener);
    button6 = new Button("5");
    button6.setOnAction(listener);
    button7 = new Button("6");
    button7.setOnAction(listener);
    button8 = new Button("*");
    button8.setOnAction(listener);
    button9 = new Button("1");
    button9.setOnAction(listener);
    button10 = new Button("2");
    button10.setOnAction(listener);
    button11 = new Button("3");
    button11.setOnAction(listener);
    button12 = new Button("-");
    button12.setOnAction(listener);
    button13 = new Button("0");
    button13.setOnAction(listener);
    button14 = new Button(".");
    button14.setOnAction(listener);
    button15 = new Button("=");
    button15.setOnAction(listener);
    button16 = new Button(",");
    button16.setOnAction(listener);
    //Central panel
    gridPane = new GridPane();
    gridPane.add(button1, 0, 0);
    gridPane.add(button2, 1, 0);
    gridPane.add(button3, 2, 0);
    gridPane.add(button4, 3, 0);
    gridPane.add(button5, 0, 1);
    gridPane.add(button6, 1, 1);
    gridPane.add(button7, 2, 1);
    gridPane.add(button8, 3, 1);
    gridPane.add(button9, 0, 2);
    gridPane.add(button10, 1, 2);
    gridPane.add(button11, 2, 2);
    gridPane.add(button12, 3, 2);
    gridPane.add(button13, 0, 3);
    gridPane.add(button14, 1, 3);
    gridPane.add(button15, 2, 3);
    gridPane.add(button16, 3, 3);

    font = new Font(20);
    for (int i = 0; i < gridPane.getChildren().size(); i++)
    {
      ((Button) gridPane.getChildren().get(i)).setPrefSize(100, 100);
      ((Button) gridPane.getChildren().get(i)).setFont(font);
    }
    //Main Pane
    //MainPane
    mainPane = new BorderPane();
    mainPane.setTop(textField);
    mainPane.setCenter(gridPane);
    scene = new Scene(mainPane, 300, 300);
    window.setScene(scene);
    window.show();


  }

  //Actions button
  private class MyListener implements EventHandler<ActionEvent>
  {

    public void handle(ActionEvent e)
    {

      if (e.getSource() == button1)
      {
        textField.appendText("7");
      }
      else if (e.getSource() == button2)
      {
        textField.appendText(button2.getText());
      }
      else if (e.getSource() == button5)
      {
        textField.appendText(button5.getText());
      }
      else if (e.getSource() == button6)
      {
        textField.appendText(button6.getText());
      }
      else if (e.getSource() == button7)
      {
        textField.appendText(button7.getText());
      }
      else if (e.getSource() == button9)
      {
        textField.appendText(button9.getText());
      }
      else if (e.getSource() == button10)
      {
        textField.appendText(button10.getText());
      }
      else if (e.getSource() == button11)
      {
        textField.appendText(button11.getText());
      }
      else if (e.getSource() == button13)
      {
        textField.appendText(button13.getText());
      }
      else if (e.getSource() == button14)
      {
        textField.appendText(button14.getText());
      }
      else if (e.getSource() == button16)
      {
        textField.appendText(button16.getText());
      }

     if (e.getSource() == button4)
      {
        number1 = Double.parseDouble(textField.getText());
        textField.setText("");
        operator = button4.getText();

      }
      else if (e.getSource() == button8)
      {
        number1 = Double.parseDouble(textField.getText());
        textField.setText("");
        operator = button8.getText();

      }
      else if (e.getSource() == button12)
      {
        number1 = Double.parseDouble(textField.getText());
        textField.setText("");
        operator = button12.getText();

      }
      else if (e.getSource() == button16)
      {
        number1 = Double.parseDouble(textField.getText());
        textField.setText("");
        operator = button16.getText();

      }
       if (e.getSource() == button15)
      {
        number2 = Double.parseDouble(textField.getText());
        if (operator.equals("+"))
        {
          result = number1 + number2;
          textField.setText(result + "");
        }
        else if (operator.equals("-"))
        {
          result = number1 - number2;
          textField.setText(result + "");
        }
        else if (operator.equals("/"))
        {
          result = number1 / number2;
          textField.setText(result + "");
        }
        else if (operator.equals("*"))
        {
          result = number1 * number2;
          textField.setText(result + "");
        }
      }
    }
  }
}

