package com.naichuan.chain_of_responsibility;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class Request {

    private final RequestType requestType;
    private final String requestDescription;

    private boolean handled;

    public Request(final RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public boolean isHandled() {
        return handled;
    }

    public void markHandled() {
        handled = true;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
