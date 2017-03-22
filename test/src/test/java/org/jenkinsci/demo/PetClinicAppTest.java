package org.jenkinsci.demo;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.*;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class PetClinicAppTest {

    @Test
    public void testApp() throws IOException {
         System.out.println("Starting the test...");
        //WebDriver webDriver = new FirefoxDriver();       
        WebDriver webDriver = new HtmlUnitDriver();
        webDriver.get(getAppUrl());
        Assert.assertEquals("PetClinic :: a Spring Framework demonstration", webDriver.getTitle());
        //Assert.assertEquals("PetClinic :: a Spring Framework demonstration", "PetClinic :: a Spring Framework demonstration");
    }

    private String getAppUrl() {
        return "http://petclinic:8080/petclinic";
    }
}
