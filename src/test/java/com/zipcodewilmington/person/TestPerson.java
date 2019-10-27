package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testDefaultConstructor2() {
        // Given
        String expectedName = "Johnny";
        Integer expectedAge = 24;
        String expectedEyeColor = "Brown";
        String expectedHairColor = "Black";
        Integer expectedHeight = 6;
        String expectedOccupation = "Developer";
        String expectedGender = "Male";

        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor, expectedHairColor, expectedHeight, expectedOccupation, expectedGender);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();
        Integer actualHeight = person.getHeight();
        String actualOccupation = person.getOccupation();

        String actualGender = person.getGender();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedOccupation, actualOccupation);

        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 6;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Brown";

        // When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testSetHairColor() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setHairColor(expected);
        String actual = person.getHairColor();

        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testSetOccupation() {
        // Given
        Person person = new Person();
        String expected = "Developer";

        // When
        person.setOccupation(expected);
        String actual = person.getOccupation();

        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Male";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
