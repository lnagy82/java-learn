package java11.HTTPClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.net.http.WebSocket.Listener;
import java.util.concurrent.CompletionStage;

public class WebSocketExample {
    public static void main(String[] args) throws InterruptedException {
        // 1️⃣ Kliens
        HttpClient client = HttpClient.newHttpClient();

        // 2️⃣ WebSocket létrehozása
        WebSocket webSocket = client.newWebSocketBuilder()
            .buildAsync(URI.create("wss://echo.websocket.events"), new EchoListener())
            .join();

        System.out.println("WebSocket opened");

        // 3️⃣ Üzenet küldése
        webSocket.sendText("Hello WebSocket!", true);

        // Várjunk egy kicsit, hogy kapjunk választ
        Thread.sleep(2000);

        // 4️⃣ Bontjuk a kapcsolatot
        webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "Bye").thenRun(() ->
            System.out.println("WebSocket closed")
        );

        Thread.sleep(1000); // várj a lezárásra
    }

    // 5️⃣ Listener implementáció
    private static class EchoListener implements Listener {
        @Override
        public void onOpen(WebSocket webSocket) {
            System.out.println("onOpen");
            Listener.super.onOpen(webSocket);
        }

        @Override
        public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
            System.out.println("Received: " + data);
            return Listener.super.onText(webSocket, data, last);
        }

        @Override
        public void onError(WebSocket webSocket, Throwable error) {
            System.out.println("Error: " + error.getMessage());
            Listener.super.onError(webSocket, error);
        }

        @Override
        public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
            System.out.println("Closed with status: " + statusCode + ", reason: " + reason);
            return Listener.super.onClose(webSocket, statusCode, reason);
        }
    }
}
