/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author dzulfikar68
 */
public class HelloWorldFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // the root of the scene shown in the main window
        StackPane root = new StackPane();
        // add button as child of the root
        root.getChildren().add(getLineChart());
        // create a scene specifying the root and the size
        Scene scene = new Scene(root, 500, 300);
        // add scene to the stage
        stage.setScene(scene);
        // make the stage visible
        stage.show();
    }
    
    private Button getButton() {
        // create a button with specified text
        Button button = new Button("Say 'Hello World'");
        // set a handler that is executed when the user activates the button
        // e.g. by clicking it or pressing enter while it's focused
        button.setOnAction(e -> {
            //Open information dialog that says hello
//            Alert alert = new Alert(AlertType.INFORMATION, "Hello World!?");
//            alert.showAndWait();
//            Timeline t = new Timeline(
//                new KeyFrame(Duration.seconds(0), new KeyValue(button.translateXProperty(), 0)),
//                new KeyFrame(Duration.seconds(2), new KeyValue(button.translateXProperty(), 80))
//            );
            Timeline t = new Timeline(
                new KeyFrame(Duration.seconds(0), new KeyValue(button.translateXProperty(), 0)),
                new KeyFrame(Duration.seconds(1), new KeyValue(button.translateYProperty(), 10)),
                new KeyFrame(Duration.seconds(2), new KeyValue(button.translateXProperty(), 80)),
                new KeyFrame(Duration.seconds(3), new KeyValue(button.translateYProperty(), 90))
            );
            t.setAutoReverse(true);
            t.setCycleCount(Timeline.INDEFINITE);
            t.play();
        });
        return button;
    }
    
    private PieChart getPieChart() {
        Pane root = new Pane();
        ObservableList<PieChart.Data> valueList = FXCollections.observableArrayList(
        new PieChart.Data("Android", 55),
        new PieChart.Data("IOS", 33),
        new PieChart.Data("Windows", 12));
        // create a pieChart with valueList data.
        PieChart pieChart = new PieChart(valueList);
        pieChart.setTitle("Popularity of Mobile OS");
        //adding pieChart to the root.
        return pieChart;
    }
    
    private LineChart getLineChart() {
        // Create empty series
        ObservableList<XYChart.Series> seriesList = FXCollections.observableArrayList();
        // Create data set for the first employee and add it to the series
        ObservableList<XYChart.Data> aList = FXCollections.observableArrayList(
        new XYChart.Data(0, 0),
        new XYChart.Data(2, 6),
        new XYChart.Data(4, 37),
        new XYChart.Data(6, 82),
        new XYChart.Data(8, 115)
        );
        seriesList.add(new XYChart.Series("Employee A", aList));
        // Create data set for the second employee and add it to the series
        ObservableList<XYChart.Data> bList = FXCollections.observableArrayList(
        new XYChart.Data(0, 0),
        new XYChart.Data(2, 43),
        new XYChart.Data(4, 51),
        new XYChart.Data(6, 64),
        new XYChart.Data(8, 92)
        );
        seriesList.add(new XYChart.Series("Employee B", bList));
        
        // Create axes
        Axis xAxis = new NumberAxis("Hours worked", 0, 8, 1);
        Axis yAxis = new NumberAxis("Lines written", 0, 150, 10);
        LineChart chart = new LineChart(xAxis, yAxis, seriesList);
        
        return chart;
    }
    
    private Canvas getCanvas() {
        Canvas canvas = new Canvas(185, 70);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Set stroke color, width, and global transparency
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2d);
        gc.setGlobalAlpha(0.5d);
        // Draw a square
        gc.setFill(Color.RED);
        gc.fillRect(10, 10, 50, 50);
        gc.strokeRect(10, 10, 50, 50);
        // Draw a triangle
        gc.setFill(Color.GREEN);
        gc.fillPolygon(new double[]{70, 95, 120}, new double[]{60, 10, 60}, 3);
        gc.strokePolygon(new double[]{70, 95, 120}, new double[]{60, 10, 60}, 3);
        // Draw a circle
        gc.setFill(Color.BLUE);
        gc.fillOval(130, 10, 50, 50);
        gc.strokeOval(130, 10, 50, 50);
        
        return canvas;
    } 
    
    public static void main(String[] args) {
        // launch the HelloWorld application.\
        // Since this method is a member of the HelloWorld class the first
        // parameter is not required
        Application.launch(HelloWorldFX.class, args);
    }
    
}
