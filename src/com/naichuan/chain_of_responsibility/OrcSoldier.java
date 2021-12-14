package com.naichuan.chain_of_responsibility;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.isHandled()) {
            return;
        }
        if (RequestType.TORTURE_PRISONER == request.getRequestType()) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc Soldier";
    }
}
