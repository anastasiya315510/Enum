package epam.service;

import epam.inter.HttpHandler;

public class InfoHandler implements HttpHandler {
    @Override
    public void showDirection() {
        System.out.println("This is a Server error");
    }
}
