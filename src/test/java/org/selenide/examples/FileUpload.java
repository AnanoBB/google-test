package org.selenide.examples;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.v6.C;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class FileUpload {

    File file = new File("src/test/pics/Screenshot 2020-11-26 at 01.09.15.png");
    @BeforeTest
    public void goToWebSite(){
        open("http://the-internet.herokuapp.com/upload");
    }

    @Test
    public void uploadFileOnClick(){

        $("#file-upload").uploadFile(
                file
        );
        $("#file-submit").click();
        $("#uploaded-files").should(Condition.appear);
    }



}
