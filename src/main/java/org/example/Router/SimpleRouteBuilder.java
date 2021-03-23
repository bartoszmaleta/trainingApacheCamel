package org.example.Router;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/acer/PROGRAMMING/Jobs/PKO BP JJD/inputFolder?noop=true").to("file:/home/acer/PROGRAMMING/Jobs/PKO BP JJD/outputFolder");



    }
}
