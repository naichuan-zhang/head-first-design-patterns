package com.naichuan.chain_of_responsibility;

import lombok.RequiredArgsConstructor;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
public class OrcKing {

    private final RequestHandler handler;

    public OrcKing() {
        handler = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request) {
        handler.handleRequest(request);
    }
}
