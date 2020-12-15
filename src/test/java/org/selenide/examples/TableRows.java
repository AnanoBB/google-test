package org.selenide.examples;
import java.util.List;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class TableRows {


    @BeforeTest
    public void goToWeb(){
        open("http://the-internet.herokuapp.com/challenging_dom");
    }

    @Test
    public void getTb(){
        ElementsCollection elements = $$(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[position() < last()]"));
        List el = elements.texts();

        for(var i = 0; i < el.size();i++){

            String newEl = el.get(i).toString();
            char lastChar = newEl.charAt(newEl.length()-1);
            Assert.assertEquals(lastChar,'0');
        }
    }


}
