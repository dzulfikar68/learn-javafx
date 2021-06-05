///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.mavenproject1;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Region;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
///**
// *
// * @author dzulfikar68
// */
//public class StyledApplication extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Region region1 = new Region();
//        Region region2 = new Region();
//        Region region3 = new Region();
//        Region region4 = new Region();
//        Region region5 = new Region();
//        Region region6 = new Region();
//
//        //inline style
//        region1.setStyle("-fx-background-color: yellow;");
//        
//        //set id for styling
//        region2.setId("region2");
//        
//        //add class for styling
//        region2.getStyleClass().add("round");
//        region3.getStyleClass().add("round");
//        
//        HBox hbox = new HBox(region3, region4, region5);
//        VBox vbox = new VBox(region1, hbox, region2, region6);
//        
//        Scene scene = new Scene(vbox, 500, 500);
//
//        //add stylesheet for root
//        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
//        
//        //add stylesheet for hbox
//        hbox.getStylesheets().add(getClass().getResource("inlinestyle.css").toExternalForm());
//        
//        scene.setFill(Color.BLACK);
//        
//        stage.setScene(scene);
//        stage.show();
//    }
//    
//}
