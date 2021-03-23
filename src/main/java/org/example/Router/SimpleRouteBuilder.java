package org.example.Router;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        /** After copy files from inputFolder to output, will move files from inputFolder to inputFolder/.camel */
        from("file:/home/acer/PROGRAMMING/Jobs/PKO BP JJD/inputFolder").to("file:/home/acer/PROGRAMMING/Jobs/PKO BP JJD/outputFolder");

        /** After copy files from inputFolder to output, will leave files in inputFolder */
//        from("file:/home/acer/PROGRAMMING/Jobs/PKO BP JJD/inputFolder?noop=true").to("file:/home/acer/PROGRAMMING/Jobs/PKO BP JJD/outputFolder");
    }
}
