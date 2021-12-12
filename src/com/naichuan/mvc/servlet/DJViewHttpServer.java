package com.naichuan.mvc.servlet;

import com.naichuan.mvc.BeatModel;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class DJViewHttpServer {
    public static void main(String[] args) {
        try {
            System.out.println("DJView Http Server Running");
            BeatModel model = new BeatModel();
            model.initialize();
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);
            server.createContext("/djview", new DJViewHttpHandler(model));
            server.start();
            System.out.println("DJView Server is running at http://localhost:8080/djview");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
