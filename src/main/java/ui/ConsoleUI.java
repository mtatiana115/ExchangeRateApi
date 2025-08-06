package main.java.ui;


import java.util.Scanner;

import main.java.service.CurrencyConverter;

public class ConsoleUI {
    private final CurrencyConverter converter;
    private final Scanner scanner;

    public ConsoleUI(String apiKey) {
        this.converter = new CurrencyConverter(apiKey);
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("¡Bienvenido al Conversor de Monedas!");
        
        while (true) {
            printMenu();
            int option = scanner.nextInt();
            
            if (option == 7) {
                System.out.println("¡Hasta luego!");
                break;
            }
            
            try {
                handleOption(option);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void printMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. USD a ARS (Peso Argentino)");
        System.out.println("2. USD a BOB (Boliviano Boliviano)");
        System.out.println("3. USD a BRL (Real Brasileño)");
        System.out.println("4. USD a CLP (Peso Chileno)");
        System.out.println("5. USD a COP (Peso Colombiano)");
        System.out.println("6. Otra moneda");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
    }

    private void handleOption(int option) throws Exception {
        String fromCurrency = "USD";
        String toCurrency;
        
        switch (option) {
            case 1:
                toCurrency = "ARS";
                break;
            case 2:
                toCurrency = "BOB";
                break;
            case 3:
                toCurrency = "BRL";
                break;
            case 4:
                toCurrency = "CLP";
                break;
            case 5:
                toCurrency = "COP";
                break;
            case 6:
                System.out.print("Ingrese moneda origen (ej. USD): ");
                fromCurrency = scanner.next().toUpperCase();
                System.out.print("Ingrese moneda destino (ej. EUR): ");
                toCurrency = scanner.next().toUpperCase();
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        
        System.out.print("Ingrese cantidad a convertir: ");
        double amount = scanner.nextDouble();
        
        double result = converter.convert(fromCurrency, toCurrency, amount);
        System.out.printf("\n%.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
    }
}
