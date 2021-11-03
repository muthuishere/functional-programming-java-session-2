package tutorial.products.utils;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {

    Long productId;




    private String name;

    private String category;


    private double price;

    private double dealPrice;



    private String description;

    private String manufacturer;


    Integer availableItems;
    Integer overAllRating;

    String imageUrl;


    private LocalDateTime created=LocalDateTime.now();


    private LocalDateTime updated=LocalDateTime.now();


    public Product(){

    }
    public Product(String name, String category, int price, String description, String manufacturer, String imageUrl) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.imageUrl=imageUrl;
        this.created=LocalDateTime.now();
        this.updated=LocalDateTime.now();
        this.availableItems=2;
    }


    public double calculatedPrice(){
        if(dealPrice != 0)
            return dealPrice;
        else
            return price;
    }

}
