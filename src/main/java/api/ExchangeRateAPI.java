package main.java.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import main.java.model.ExchangeRateResponse;

public class ExchangeRateAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";
    private final String apiKey;

    public ExchangeRateAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    public ExchangeRateResponse getExchangeRates(String baseCurrency) throws IOException, InterruptedException {
        String url = API_URL + apiKey + "/latest/" + baseCurrency;
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        Gson gson = new Gson();
        return gson.fromJson(response.body(), ExchangeRateResponse.class);
    }
}