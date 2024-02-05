package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.geometry.Insets;
    
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
    private double paneWidth = 500;
    private double paneHeight = 500;
     
    @Override 
    public void start(Stage primaryStage) {
     
    StackPane pane = new StackPane();
    Rectangle pravougaonik = new Rectangle(250, 300, 250, 400);
    pane.getChildren().add(pravougaonik);
    pravougaonik.setFill(Color.BLACK);
    pravougaonik.setStroke(Color.BLACK);
     
    GridPane pane1 = new GridPane();
    pane1.setAlignment(Pos.CENTER);
    pane1.setPadding(new Insets(5, 5, 5, 5));
    pane1.setHgap(5);
    pane1.setVgap(5);
    pane.getChildren().add(pane1);
     
    Circle krug = new Circle(paneWidth / 2, 40, 60);
    krug.setStroke(Color.BLACK);
    krug.setFill(Color.GREY);
    pane1.add(krug, 1, 1);
     
    Circle krug1 = new Circle(paneWidth / 2, 40, 60);
    krug1.setStroke(Color.BLACK);
    krug1.setFill(Color.GREY);
    pane1.add(krug1, 1, 2);
     
    Circle krug2 = new Circle(paneWidth / 2, 40, 60);
    krug2.setStroke(Color.BLACK);
    krug2.setFill(Color.GREY);
    pane1.add(krug2, 1, 3);
     
    RadioButton rbCrvena = new RadioButton("Crvena");
    RadioButton rbZuta = new RadioButton("Zuta");
    RadioButton rbZelena = new RadioButton("Zelena");
     
    ToggleGroup group = new ToggleGroup();
    rbCrvena.setToggleGroup(group);
    rbZuta.setToggleGroup(group);
    rbZelena.setToggleGroup(group);
     
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(rbCrvena, rbZuta, rbZelena);
    hBox.setAlignment(Pos.CENTER);
     
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hBox);
     
    Scene scene = new Scene(borderPane, paneWidth, paneHeight + 40);
    primaryStage.setTitle("Semafor Simulator");
    primaryStage.setScene(scene);
    primaryStage.show();
     
    
    
    rbCrvena.setOnAction(e -> {
    krug.setFill(Color.RED);
    krug1.setFill(Color.GREY);
    krug2.setFill(Color.GREY);
    });
     
    rbZuta.setOnAction(e -> {
    krug.setFill(Color.GREY);
    krug1.setFill(Color.YELLOW);
    krug2.setFill(Color.GREY);
    });
     
    rbZelena.setOnAction(e -> {
    krug.setFill(Color.GREY);
    krug1.setFill(Color.GREY);
    krug2.setFill(Color.GREEN);
    });
     
    }
     
   
    public static void main(String[] args) {
    launch(args);
    }
    }