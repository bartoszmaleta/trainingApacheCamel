package org.example;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.example.Router.SimpleRouteBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            Thread.sleep(3000);
            ctx.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println( "Hello World!" );
    }
}
