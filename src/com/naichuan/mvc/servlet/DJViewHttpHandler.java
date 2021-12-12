package com.naichuan.mvc.servlet;

import com.naichuan.mvc.BeatModel;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class DJViewHttpHandler implements HttpHandler {
    BeatModel beatModel;
    Map<String, String> queryPairs;

    public DJViewHttpHandler(BeatModel model) {
        this.beatModel = model;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String uri = httpExchange.getRequestURI().toString();
        System.out.println("URI: " + uri);
        String[] params = uri.split("\\?");
        String queryStrings = "";
        if (params.length > 1) {
            queryStrings = params[1];
        }
        boolean noAction = true;
        try {
            queryPairs = this.splitQuery(queryStrings);
            noAction = false;
        } catch (Exception e) {
            System.out.println("Error splitting query: " + e.getMessage());
        }
        System.out.println("Query pairs: " + queryPairs);

        if (!noAction) {
            String bpm = this.getParameter("bpm");
            if (bpm == null) {
                bpm = beatModel.getBPM() + "";
            }
            String set = this.getParameter("set");
            if (set != null) {
                int bpmNumber = 90;
                bpmNumber = Integer.parseInt(bpm);
                beatModel.setBPM(bpmNumber);
            }
            String decrease = this.getParameter("decrease");
            if (decrease != null) {
                beatModel.setBPM(beatModel.getBPM() - 1);
            }
            String increase = this.getParameter("increase");
            if (increase != null) {
                beatModel.setBPM(beatModel.getBPM() + 1);
            }
            String on = this.getParameter("on");
            if (on != null) {
                beatModel.on();
            }
            String off = this.getParameter("off");
            if (off != null) {
                beatModel.off();
            }
        }

        // allow access from web server other 8080
        Headers headers = httpExchange.getResponseHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        OutputStream out = httpExchange.getResponseBody();
        StringBuilder sb = new StringBuilder();
        sb.append(beatModel.getBPM());
        System.out.println("BPM: " + beatModel.getBPM());

        String responseString = sb.toString();
        httpExchange.sendResponseHeaders(200, responseString.length());
        out.write(responseString.getBytes(StandardCharsets.UTF_8));
        out.flush();
        out.close();
    }

    private Map<String, String> splitQuery(String queryStrings) throws UnsupportedEncodingException {
        Map<String, String> queryPairs = new HashMap<>();
        String[] pairs = queryStrings.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            queryPairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
        }
        return queryPairs;
    }

    String getParameter(String param) {
        return queryPairs.get(param);
    }
}
