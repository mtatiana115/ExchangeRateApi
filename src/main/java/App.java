package main.java;

import main.java.ui.ConsoleUI;

public class App {
    public static void main(String[] args) {

        String apiKey = "cef078473fe91b3a39bf9d20";
        
        ConsoleUI ui = new ConsoleUI(apiKey);
        ui.start();
    }
}
