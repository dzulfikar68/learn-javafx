/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import javafx.application.Application;
import javax.swing.JFrame;

/**
 *
 * @author dzulfikar68
 */
public class MainWindow extends JFrame {
    public MainWindow(){
        this.setTitle("Jendela Utama");
        this.setSize(600, 320);
    }
    public static void main(String[] args){
//        MainWindow mWindow = new MainWindow();
//        mWindow.setVisible(true);

//        Application.launch(HelloWorldFX.class, args);
// membuat objek jendela

        JFrame myWindow = new NewJFrame();
        
        // berikan judul pada jendela
        myWindow.setTitle("Jendela Program");
        
        // tentukan ukuran jendela
        myWindow.setSize(400, 200);
        
        // tampilkan jendela ke layar
        myWindow.setVisible(true);
    }
}
