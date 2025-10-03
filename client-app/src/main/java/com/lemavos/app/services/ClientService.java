package com.app.services;

import com.app.models.Client;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientService {

    private static final String BASE_URL = "http://localhost:8081/user"; // ajusta

    public static boolean createClient(Client client) {
        try {
            HttpClient httpClient = HttpClient.newHttpClient();

            String json = String.format(
                "{\"name\":\"%s\",\"email\":\"%s\",\"phone\":\"%s\",\"password\":\"%s\"}",
                client.getName(), client.getEmail(), client.getPhone(), client.getPassword()
            );

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status: " + response.statusCode());
            System.out.println("Response: " + response.body());

            return response.statusCode() == 201 || response.statusCode() == 200;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
