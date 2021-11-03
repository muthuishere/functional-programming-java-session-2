package tutorial.prime;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

@Slf4j
public class PrimeNumberTest {


    PrimeNumber primeNumber = new PrimeNumber();


    @Test
    public void isPrime() {
        assertPrime(3, true);
        assertPrime(1, false);
        assertPrime(10, false);
        assertPrime(71, true);

    }

    private void assertPrime(int number, boolean result) {
        boolean prime = primeNumber.isPrime(number);
        log.info(" " + number + " is prime " + prime);
        assertThat(prime,equalTo(result));
    }
}