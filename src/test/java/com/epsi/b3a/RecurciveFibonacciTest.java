package com.epsi.b3a;

import com.epsi.b3a.RecurciveFibonacci;
import org.junit.jupiter.api.*;

public class RecurciveFibonacciTest {

    private RecurciveFibonacci recurciveFibonacci;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Init class");
    }

    @BeforeEach
    public void prepare(){
        this.recurciveFibonacci= new RecurciveFibonacci();
    }


    @Test
    @DisplayName("La suite doit retourner 0 quand f(0)=0")
    public void when_number_is_zero_should_return_zero(){
        Assertions.assertEquals(0, this.recurciveFibonacci.calculate(0));
    }


    @Test
    @DisplayName("La suite doit retourner 1 quand f(1)=0")
    public void when_number_is_one_should_return_one(){
        Assertions.assertEquals(1, this.recurciveFibonacci.calculate(1));
    }

    @Test
    @DisplayName("La suite doit retourner la valeur ")
    public void when_x_should_return_fibo_y(){
        Assertions.assertEquals(2, this.recurciveFibonacci.calculate(3));
        Assertions.assertEquals(13, this.recurciveFibonacci.calculate(7));
        Assertions.assertEquals(377, this.recurciveFibonacci.calculate(14));
        Assertions.assertEquals(12586269025l, this.recurciveFibonacci.calculate(50));
        Assertions.assertEquals(3736710778780434371l, this.recurciveFibonacci.calculate(100));

    }
}
