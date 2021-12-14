package com.naichuan.chain_of_responsibility;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.isHandled()) {
            return;
        }
        if (RequestType.DEFEND_CASTLE == request.getRequestType()) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc Commander";
    }
}
