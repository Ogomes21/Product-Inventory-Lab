package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TshirtTest {
    Tshirt tshirt;

    @Test
    public void testConstructor() {

        String expectedColor = "White";
        String expectedBrand = "Chanel";
        String expectedSize = "Small";
        float expectedPrice = 500.00f;
        int expectedQty = 1;

        Tshirt testTshirt = new Tshirt(expectedColor, expectedBrand, expectedSize, expectedPrice, expectedQty);

        assertSame(expectedColor, testTshirt.getColor());
        assertSame(expectedBrand, testTshirt.getBrand());
        assertSame(expectedSize, testTshirt.getSize());
        assertEquals(expectedPrice, testTshirt.getPrice(), 0.0);
        assertEquals(expectedQty, testTshirt.getQty());

    }
    @Test
    public void getColor(){
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        String expected = "White";

        //When
        String actual = tshirt.getColor();

        //Then
        Assert.assertSame(expected, actual);
    }

    @Test
    public void setColor() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        String expected = "Purple";

        //When
        tshirt.setColor(expected);
        String actual = tshirt.getColor();

        //Then
        Assert.assertSame(expected, actual);
    }

    @Test
    public void getBrand() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        String expected = "Chanel";

        //When
        String actual = tshirt.getBrand();

        //Then
        Assert.assertSame(expected, actual);
    }

    @Test
    public void setBrand() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        String expected = "White";

        //When
        tshirt.setBrand(expected);
        String actual = tshirt.getBrand();

        //Then
        Assert.assertSame(expected, actual);

    }

    @Test
    public void getSize() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        String expected = "Small";

        //When

        String actual = tshirt.getSize();

        //Then
        Assert.assertSame(expected, actual);
    }

    public void setSize() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        String expected = "Small";

        //When
       String actual = tshirt.getSize();

       //Then
        Assert.assertSame(expected, actual);
    }

    @Test
    public void getPrice() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        float expected = 500.00f;

        //When
        float actual = tshirt.getPrice();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void setPrice() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        float expected = 500.00f;

        //When
        float actual = tshirt.getPrice();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getQty() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        int expected = 1;

        //When
        int actual = tshirt.getQty();

        //Then
        Assert.assertSame(expected, actual);
    }
    @Test
    public void setQty() {
        tshirt = new Tshirt("White", "Chanel", "Small", 500.00f, 1);

        //Given
        int expected = 1;

        //When
        int actual = tshirt.getQty();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
