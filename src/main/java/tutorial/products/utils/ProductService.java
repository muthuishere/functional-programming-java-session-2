package tutorial.products.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getProducts() {
        return products;
    }

    List<Product> products;
    public ProductService(){
        products =new ArrayList<>();
        parseProductDetails(loadProductDetailsFromJson());


    }

    private void parseProductDetails(String contents) {
        ObjectMapper objectMapper= new ObjectMapper();
        try {
            products = objectMapper.readValue(contents,  new TypeReference<List<Product>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String loadProductDetailsFromJson() {
        String contents="";
        File file = new File(
                getClass().getClassLoader().getResource("products.json").getFile()
        );
        try {
            contents = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }
}
