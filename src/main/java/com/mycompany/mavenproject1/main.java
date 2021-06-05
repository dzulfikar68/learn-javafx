/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import javax.swing.JFrame;

/**
 *
 * @author dzulfikar68
 */
public class main {
    public static void main(String[] args) {
        // Write your code here
        System.out.print("XXX");
                // membuat objek jendela
        JFrame myWindow = new JFrame();
        
        // berikan judul pada jendela
        myWindow.setTitle("Jendela Program");
        
        // tentukan ukuran jendela
        myWindow.setSize(400, 200);
        
        // tampilkan jendela ke layar
        myWindow.setVisible(true);
    }
}
