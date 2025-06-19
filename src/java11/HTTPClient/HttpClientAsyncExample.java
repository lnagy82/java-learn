package java11.HTTPClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientAsyncExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> future = 
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        future.thenApply(HttpResponse::body)
              .thenAccept(System.out::println);

        // Várj, hogy le tudjon futni az async válasz
        future.join();
    }
}
