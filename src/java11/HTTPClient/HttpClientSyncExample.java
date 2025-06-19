package java11.HTTPClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientSyncExample {
    public static void main(String[] args) throws Exception {
        // 1) Kliens példány
        HttpClient client = HttpClient.newHttpClient();

        // 2) Kérés létrehozása
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();

        // 3) Kérés küldése és válasz fogadása (blokkoló)
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body:\n" + response.body());
    }
}
