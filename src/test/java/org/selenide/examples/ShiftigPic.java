package org.selenide.examples;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShiftigPic {
    @BeforeTest
    public void goToWeb(){
        open("http://the-internet.herokuapp.com/shifting_content/image");
    }

    @Test
    public void testPic(){

        String beforeClick = $(".shift").getCssValue("left");
        $(By.xpath("//*[@id='content']/div/p[3]/a")).click();
        String afterClick = $(By.xpath("//*[@id='content']/div/p[3]/a")).getCssValue("left");
        Assert.assertNotEquals(beforeClick,afterClick);

    }
}
