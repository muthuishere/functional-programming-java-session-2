package tutorial.products;

/* Home Assignment*/
import tutorial.products.utils.Product;
import tutorial.products.utils.ProductService;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductApi {

    ProductService productService = new ProductService();

    public List<Product> getProducts(){

        return productService.getProducts();

    }

    public List<Product> getProductsWithDealPriceGreaterThanZero() {

        return null;
    }

    public List<String> getCategories() {
        return null;
    }



    /*
    Use Deal Price , if its greater than zero
    or else use Price
     */
    public Double getTotalCostOfClothingProducts() {
        return null;
    }

    public Map<String,Long> getCategoryAndCount() {
        return null;
    }


}
