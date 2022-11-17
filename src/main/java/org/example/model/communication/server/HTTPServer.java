package org.example.model.communication.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import org.example.model.communication.server.handlers.GetPseudo;
import org.example.model.communication.server.handlers.getUserHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class HTTPServer {

    int port = 0;
    public HTTPServer(int port) throws IOException {
        this.port = port;
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", port), 1000);

        server.createContext("/get_pseudo", new GetPseudo());
        server.createContext("/get_user", new getUserHandler());

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        server.setExecutor(threadPoolExecutor);
        server.start();

        System.out.println(" Server started on port " + port);

    }

    /**
     * Returns a simple HTTP response with the body with code 200 (Ok)
     */
    public static void sendResponse(HttpExchange httpExchange, String body) throws IOException {
        OutputStream outputStream = httpExchange.getResponseBody();

        // this line is a must
        httpExchange.sendResponseHeaders(200, body.length());
        outputStream.write(body.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}