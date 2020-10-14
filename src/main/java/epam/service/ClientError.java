package epam.service;

import epam.inter.HttpHandler;

public class ClientError implements HttpHandler {
    @Override
    public void showDirection() {
        System.out.println("This is a Client error");
    }
}
