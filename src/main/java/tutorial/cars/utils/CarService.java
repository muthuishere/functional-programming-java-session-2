package tutorial.cars.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CarService {


    public List<Car> getCars() {
        return cars;
    }

    List<Car> cars;
    public CarService(){
        cars=new ArrayList<>();
        parseCarDetails(loadCarDetailsFromJson());


    }

    private void parseCarDetails(String contents) {
        ObjectMapper objectMapper= new ObjectMapper();
        try {
            cars = objectMapper.readValue(contents,  new TypeReference<List<Car>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String loadCarDetailsFromJson() {
        String contents="";
        File file = new File(
                getClass().getClassLoader().getResource("cars.json").getFile()
        );
        try {
             contents = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }


}
