package tutorial.cars.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    Integer id;
    Integer price;
    String brand;
    String model;
    Integer year;
    @JsonProperty("title_status")
    String status;
    @JsonProperty("mileage")
    Integer totalMilesTraveled;
    String color;

    @JsonProperty("condition")
    String car_condition;
    String vin;
    String lot;


    String state;
    String country;
    String bidding_ends_on;


    public Car(String id, String price, String brand, String model, String year, String status, String totalMilesTraveled, String color, String vin, String lot, String state, String country, String bidding_ends_on) {
        this.id = Integer.valueOf(id);
        this.price = Integer.valueOf(price);
        this.brand = brand;
        this.model = model;
        this.year = Integer.valueOf(year);
        this.status = status;
        this.totalMilesTraveled = Integer.valueOf(totalMilesTraveled);
        this.color = color;
        this.vin = vin;
        this.lot = lot;
        this.state = state;
        this.country = country;
        this.bidding_ends_on = bidding_ends_on;
    }
}
