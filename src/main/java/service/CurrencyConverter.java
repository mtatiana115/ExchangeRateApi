package main.java.service;


import java.io.IOException;
import java.util.Map;

import main.java.api.ExchangeRateAPI;
import main.java.model.ExchangeRateResponse;

public class CurrencyConverter {
    private final ExchangeRateAPI api;

    public CurrencyConverter(String apiKey) {
        this.api = new ExchangeRateAPI(apiKey);
    }

    public double convert(String fromCurrency, String toCurrency, double amount) 
            throws IOException, InterruptedException {
        
        ExchangeRateResponse response = api.getExchangeRates(fromCurrency);
        Map<String, Double> rates = response.getConversionRates();
        
        if (!rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Moneda no soportada: " + toCurrency);
        }
        
        double rate = rates.get(toCurrency);
        return amount * rate;
    }
}
