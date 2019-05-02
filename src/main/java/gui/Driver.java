package gui;

import javax.swing.*;

public class Driver
{
    public static void main(String[] args) {
        ClientHomePage clientHomePage = new ClientHomePage();
        clientHomePage.setVisible(true);
        clientHomePage.setSize(990,600);
        clientHomePage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
