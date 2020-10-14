package epam.service;

import epam.inter.HttpHandler;

public class SuccessHandler implements HttpHandler {
    @Override
    public void showDirection() {
        System.out.println("Operation was successfull");
    }
}
