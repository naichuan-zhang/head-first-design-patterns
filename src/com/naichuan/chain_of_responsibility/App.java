package com.naichuan.chain_of_responsibility;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class App {

    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
