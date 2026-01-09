/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

public class SimpleCalculator {

    public static void main(String[] args) throws Exception {

        int port = Integer.parseInt(
                System.getenv().getOrDefault("PORT", "8080")
        );

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        server.createContext("/add", exchange -> {
            URI uri = exchange.getRequestURI();
            String query = uri.getQuery(); // a=5&b=3

            double a = 0, b = 0;
            if (query != null) {
                String[] params = query.split("&");
                a = Double.parseDouble(params[0].split("=")[1]);
                b = Double.parseDouble(params[1].split("=")[1]);
            }

            String response = "Result = " + (a + b);

            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.start();
        System.out.println("Calculator running on port " + port);
    }
}
