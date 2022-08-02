package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class HatTest {
    Hat hat;

    @Test
    public void testConstructor() {
        String expectedColor = "Green";
        String expectedBrand = "Adidas";
        String expectedSize = "Small";
        float expectedPrice = 25.00f;
        int expectedQty = 2;

        Hat testHat = new Hat(expectedColor, expectedBrand, expectedSize, expectedPrice, expectedQty);

        assertEquals(expectedColor, testHat.getColor());
        assertEquals(expectedBrand, testHat.getBrand());
        assertEquals(expectedSize, testHat.getSize());
        assertEquals(expectedPrice, testHat.getPrice());
//        assertEquals(expectedQty, testHat.getQty);
    }

//    @Before
//    public void testCreateHat() {
//      Hat hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);
//    }

    @Test
    public void testGetColor() {
       hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);
        //Given
        String expected = "Green";

        //When
        String actual = hat.getColor();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetColor() {
       hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);
        //Given
        String expected = "Blue";

        //When
        hat.setColor(expected);
        String actual = hat.getColor();

        //Then
        assertSame(expected, actual);
    }

    @Test
    public void testGetBrand() {
       hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);
        //Given
        String expected = "Adidas";

        //When
        String actual = hat.getBrand();

        //Then
        assertSame(expected, actual);
    }

    @Test
    public void testSetBrand() {
        hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);

        //Given
        String expected = "Nike";

        //When
        hat.setBrand(expected);
        String actual = hat.getBrand();

        //Then
        assertSame(expected, actual);
    }

    @Test
    public void testGetSize() {
        hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);

        //Given
        String expected = "Small";

        //When
        String actual = hat.getSize();

        //Then
        assertSame(expected,actual);
    }

    @Test
    public void testSetSize() {
        hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);

        //Given
        String expected = "Large";

        //When
        hat.setSize(expected);
        String actual = hat.getSize();

        //Then
        assertSame(expected,actual);

    }

    @Test
    public void testGetPrice() {
        hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);

        //Given
        Float expected = 25.00f;

        //When
        float actual = hat.getPrice();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSetPrice() {
        hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);

        //Given
        float expected = 15.00f;

        //When
        hat.setPrice(expected);
        float actual = hat.getPrice();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testGetQty() {
        hat = new Hat("Green", "Adidas", "Small", 25.00f, 2);

        //Given
        int expected = 2;

        //When
        int actual = hat.getQty();

        //Then
        Assert.assertEquals(expected,actual);
    }

    }
