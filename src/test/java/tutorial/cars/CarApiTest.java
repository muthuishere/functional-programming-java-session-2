package tutorial.cars;

import tutorial.cars.utils.Car;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

@Slf4j
public class CarApiTest {

    CarApi carApi;

    @Before
    public void before() {
        carApi = new CarApi();
    }

    @Test
    public void getCarsShouldRetrieveAllCars() {

        List<Car> cars = carApi.getCars();
        assertThat(cars.size(), equalTo(2499));

    }

    @Test
    public void getCarsIn2017ShouldBe377() {
        List<Car> cars = carApi.getCarsIn2017();
        assertThat(cars.size(), equalTo(377));

    }

    @Test
    public void getFordCarsIn2018ShouldBe148() {
        List<Car> cars = carApi.getFordCarsOnYear2018();
        assertThat(cars.size(), equalTo(148));

    }

    @Test
    public void getTotalManufacturersShouldBeTwentyEight() {
        Long totalManufacturers = carApi.getTotalBrands();
        assertThat(totalManufacturers, equalTo(28L));


    }

    @Test
    public void getTotalPriceOfToyotaCarsShouldBe6300() {
        Long consolidatedPrice = carApi.getTotalPriceOfToyotaCars();
        assertThat(consolidatedPrice, equalTo(6300L));


    }

    @Test
    public void getColorAndCountShouldBeValid() {
        Map<String, Long> colorAndCount = carApi.getColorAndCount();
        log.info(colorAndCount.toString());
        assertThat(colorAndCount.size(), equalTo(48));
        assertThat(colorAndCount.get("red"), equalTo(192L));
        assertThat(colorAndCount.get("blue"), equalTo(151L));
        assertThat(colorAndCount.get("green"), equalTo(24L));


    }

    @Test
    public void getBrandAndTotalPriceBeValid() {
        Map<String, Long> brandAndTotal = carApi.getBrandAndTotalPrice();
        log.info(brandAndTotal.toString());
        assertThat(brandAndTotal.size(), equalTo(28));
        /*
        {kia=144610, hyundai=78048, buick=256305, acura=21800, infiniti=157180, ford=26758607, heartland=14830, bmw=448750, mazda=16000, audi=55925, maserati=30300, jeep=328015, land=115600, lexus=66440, ram=11050, dodge=7681819, mercedes-benz=287040, honda=73530, cadillac=249410, harley-davidson=54680, chrysler=246350, peterbilt=1600, chevrolet=5544976, lincoln=36300, toyota=6300, nissan=3764536, gmc=447610, jaguar=2800}

         */
        assertThat(brandAndTotal.get("ford"), equalTo(26758607L));
        assertThat(brandAndTotal.get("heartland"), equalTo(14830L));



    }

    @Test
    public void getUniqueColorsSeperatedByCommaShouldBeValid() {
        String colors = carApi.getUniqueColorsSeperatedByComma();

        log.info(colors);
        String input = "black,silver,blue,red,white,gray,orange,brown,no_color,gold,charcoal,turquoise,beige,green,dark blue,maroon,phantom black,yellow,light blue,toreador red,bright white clearcoat,billet silver metallic clearcoat,black clearcoat,jazz blue pearlcoat,purple,ruby red metallic tinted clearcoat,triple yellow tri-coat,competition orange,off-white,shadow black,magnetic metallic,ingot silver metallic,ruby red,royal crimson metallic tinted clearcoat,kona blue metallic,oxford white,lightning blue,ingot silver,white platinum tri-coat metallic,guard,tuxedo black metallic,tan,burgundy,super black,cayenne red,morningsky blue,pearl white,glacier white";

        String[] expectedColors = input.split(",");
        for (String expectedColor : expectedColors) {
            assertThat(colors, containsString(expectedColor));
        }
    }

    @Test
    public void getColorsByBrandShouldBeValid() {
        Set<String> colors = carApi.getColorsByBrand("ford");

        log.info(colors.toString());
        assertThat(colors.size(), equalTo(30));


    }
}