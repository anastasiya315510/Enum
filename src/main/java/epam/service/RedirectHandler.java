package epam.service;

import epam.inter.HttpHandler;

public class RedirectHandler implements HttpHandler {
    @Override
    public void showDirection() {
        System.out.println("Your code was redirected");
    }
}
