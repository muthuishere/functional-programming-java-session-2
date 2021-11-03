package tutorial.cars;

import tutorial.cars.utils.Car;
import tutorial.cars.utils.CarService;

import java.util.*;

public class CarApi {

    CarService carService = new CarService();

    public List<Car> getCars(){

        return carService.getCars();

    }
    public List<Car> getCarsIn2017(){

        List<Car> results = new ArrayList<>();

        for (Car car: carService.getCars()) {

            if(car.getYear() == 2017)
                results.add(car);
        }
        return results;

    }

    public long getTotalBrands(){

        Set<String> results = new HashSet<>();

        for (Car car: carService.getCars()) {

            results.add(car.getBrand());
        }
        return results.size();

    }


    public List<Car> getFordCarsOnYear2018(){

        List<Car> results = new ArrayList<>();

        for (Car car: carService.getCars()) {

            if(car.getYear() == 2018 && car.getBrand().equalsIgnoreCase("ford"))
                results.add(car);
        }
        return results;

    }

    public Long getTotalPriceOfToyotaCars(){

        Long result = 0l;

        for (Car car: carService.getCars()) {

            if( car.getBrand().equalsIgnoreCase("toyota"))
                result+=car.getPrice();
        }
        return result;

    }

    public Map<String,Long> getColorAndCount(){

        Map<String,Long> results= new HashMap<>();

        for (Car car: carService.getCars()) {

            if( results.containsKey(car.getColor())){

                Long existingValue = results.get(car.getColor());
                results.put(car.getColor(),existingValue+1);
            }else {
                results.put(car.getColor(),1L);
            }

        }
        return results;

    }

    public Map<String,Long> getBrandAndTotalPrice(){

        Map<String,Long> results= new HashMap<>();

        for (Car car: carService.getCars()) {

            if( results.containsKey(car.getBrand())){

                Long existingValue = results.get(car.getBrand());
                results.put(car.getBrand(),existingValue+car.getPrice());
            }else {
                results.put(car.getBrand(),car.getPrice().longValue());
            }

        }
        return results;




    }


    public String getUniqueColorsSeperatedByComma(){

        Set<String> results= new HashSet<>();
        String joinedResult= "";

        for (Car car: carService.getCars()) {

            if( results.contains(car.getColor()) == false){
                results.add(car.getColor());
                joinedResult = joinedResult+ car.getColor() +",";
            }

        }

        return joinedResult.substring(0,joinedResult.length()-1);

    }
    public  Set<String> getColorsByBrand(String brand){


        Set<String> results = new HashSet<>();

        for (Car car: carService.getCars()) {

            if(car.getBrand().equalsIgnoreCase(brand))
                results.add(car.getColor());
        }
        return results;

    }



}
