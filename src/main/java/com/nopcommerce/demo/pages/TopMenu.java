package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenu extends Utility {
    By computerMenu = By.xpath("//a[text()='Computers ']");
    By computerText = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    public void clickOnComputerMenu(){
        clickOnElement(computerMenu);
    }

    public String getComputerText(){
        return getTextFromElement(computerText);
    }
    }