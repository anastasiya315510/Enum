package epam.service;

import epam.inter.HttpHandler;

public class ServError implements HttpHandler {

    @Override
    public void showDirection() {
        System.out.println("This is a Server error");
    }
}
