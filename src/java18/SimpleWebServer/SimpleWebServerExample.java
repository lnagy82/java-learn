package java18.SimpleWebServer;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;
import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SimpleWebServerExample {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress(8080);
        Path path = Path.of("d:\\repo\\java-learn\\target\\java18\\SimpleWebServer\\");
        HttpServer server = SimpleFileServer.createFileServer(address, path, SimpleFileServer.OutputLevel.VERBOSE);
        server.start();
    }
}
