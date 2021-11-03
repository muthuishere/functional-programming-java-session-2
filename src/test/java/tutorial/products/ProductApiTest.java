package tutorial.products;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import tutorial.products.utils.Product;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@Slf4j
public class ProductApiTest {
    ProductApi productApi= new ProductApi();

    @Test
    public void total_products_should_be_154() {



        final List<Product> products = productApi.getProducts();
        log.info(products.toString());
        assertThat(products.size(),equalTo(154));
    }

    @Test
    public void total_deals_available_should_be_5() {



        final List<Product> products = productApi.getProductsWithDealPriceGreaterThanZero();
        log.info(products.toString());
        assertThat(products.size(),equalTo(5));
    }
    @Test
    public void number_of_categories_should_be_16() {
        final List<String> categories = productApi.getCategories();
        log.info(categories.toString());
        assertThat(categories.size(),equalTo(16));
    }

    @Test
    public void number_of_getCategoryAndCount_should_be_16() {
        final Map<String,Long> categoryAndCount = productApi.getCategoryAndCount();
        log.info(categoryAndCount.toString());
        assertThat(categoryAndCount.get("Clothing"),equalTo(25));
        assertThat(categoryAndCount.get("Pet Supplies"),equalTo(3));

    }

    @Test
    public void total_price_of_clothing_should_be_455() {
        final Double totalCostOfClothingProducts = productApi.getTotalCostOfClothingProducts();
        assertThat(totalCostOfClothingProducts,equalTo(44713.0));
    }


}