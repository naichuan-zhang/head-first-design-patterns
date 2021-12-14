package com.naichuan.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@Slf4j
@AllArgsConstructor
public abstract class RequestHandler {

    private final RequestHandler next;

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        log.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}
