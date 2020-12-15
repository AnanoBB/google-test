package org.selenide.examples;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    @BeforeTest
    public void goToWebsite(){
        open("http://the-internet.herokuapp.com/shifting_content/menu");
    }

    @Test
    public void checkValueAfterHover(){

       String sizeBeforeHover = $(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).getCssValue("font-size");


        String colorBeforeHover = $(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).getCssValue("color");
       SelenideElement hover = $(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).hover();

       String colorAfterHover = hover.getCssValue("color");
       String sizeAfterHover = hover.getCssValue("font-size");

       Assert.assertNotEquals(sizeBeforeHover, sizeAfterHover);
       Assert.assertNotEquals(colorBeforeHover,colorAfterHover);










    }
}
