package tutorial.cars.utils;

import tutorial.cars.utils.CarService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;
@Slf4j
public class CarServiceTest {

    @Test
    public void loadFileAsJson(){

        CarService carService= new CarService();
        assertThat(carService.getCars().size(),greaterThan(2));
    }
    @Test
    public void loadFileFromTestResourcesRoot(){
//https://maven.apache.org/plugins/maven-resources-plugin/examples/resource-directory.html
        /*
        apply plugin: 'java'
apply plugin: 'application'

repositories {
        mavenCentral()
}

mainClassName='Test'


sourceSets {
        main {
                java {
                        srcDirs= ["src/main/java"]
                }
                resources {
                        srcDirs= ["src/main/resources"]
                }
        }
}

         */
//        File file = new File(
//                getClass().getClassLoader().getResource("books.json").getFile()
//        );
//
//        try {
//            String fileString = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())), StandardCharsets.UTF_8);
//
//            log.info(fileString);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}