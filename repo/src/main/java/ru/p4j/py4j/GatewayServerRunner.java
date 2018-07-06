package ru.p4j.py4j;

import org.springframework.beans.factory.annotation.Autowired;
import py4j.GatewayServer;

public class GatewayServerRunner {
    private static ApplicationContextProvider applicationContextProvder = null;

    public static ApplicationContextProvider getApplicationContextProvder() {
        return applicationContextProvder;
    }
    public static void setApplicationContextProvder(ApplicationContextProvider applicationContextProvder) {
        GatewayServerRunner.applicationContextProvder = applicationContextProvder;
    }
    @Autowired 
    public GatewayServerRunner(ApplicationContextProvider applicationContextProvder) {
        GatewayServerRunner.applicationContextProvder = applicationContextProvder;
        System.out.print("GatewayServerRunner");
        GatewayServer gatewayServer = new GatewayServer(applicationContextProvder.getApplicationContext());
        gatewayServer.start();
        System.out.print(applicationContextProvder.toString());
    }
}
