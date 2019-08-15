package service;

import javax.xml.ws.Endpoint;

public class Server {

    private static final String ADDRESS = "http://127.0.0.1:12345/Service";

    public Server() {
        System.out.println("Starting server...");
        Object implementator = new HelloImpl();
        Endpoint.publish(ADDRESS, implementator);
    }

    public static void main(String[] args) {
        new Server();
        System.out.println("Service listening at " + ADDRESS);
        System.out.println("WSDL hosted at " + ADDRESS + "?wsdl");
    }
}
