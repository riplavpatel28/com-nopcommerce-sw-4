package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computer;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    Computer computer = new Computer();

    @Test
    public void verifyTheProductWillArrangeInDescendingOrder ()throws InterruptedException{
        //Click on Computer Menu.
        computer.clickOnComputerMenu();
        //Click on Desktop
        Thread.sleep(1000);
        computer.clickOnDesktoptab();
        //Select Sort By position "Name: Z to A"
        computer.selectNameZToA();

        //Verify the Product will arrange in Descending order.
        String actualText =computer.getSortByText();
        String expectedText ="Name: Z to A";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully () throws InterruptedException{
        //Click on Computer Menu.
        computer.clickOnComputerMenu();

        //Click on Desktop

        computer.clickOnDesktoptab();
        //Select Sort By position "Name: A to Z"
        computer.selectNameAToZ();
        Thread.sleep(1000);
        //Click on "Add To Cart"
        computer.clickAddToCart();
        //Verify the Text "Build your own computer
        String actualText1 =computer.getTextBuildYourOwnComputerText();
        String expectedText1 = "Build your own computer";
        Assert.assertEquals(actualText1,expectedText1);
        Thread.sleep(4000);
       // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computer.selectProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class.
        computer.selectRam();
        //Select HDD radio "400 GB [+$100.00]"
        computer.clickOnHDDRadio();
        //select os radio
        computer.clickOnOSRadio();
        // Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        computer.clickOnCheckboxMO();
        computer.clickOnCheckboxMO();
        computer.clickOnCheckboxCommander();
        // Verify the price "$1,475.00"
        Thread.sleep(3000);
        String expectedPriceValue ="$1,475.00";
        String actualPriceValue =computer.getTextPrice();
        Assert.assertEquals(actualPriceValue,expectedPriceValue);

        // Click on "ADD TO CARD" Button.
        computer.clickOnAddToCart2();
        // Verify the Message "The product has been added to your shopping cart" on Topgreen Bar

        String expectedMessage= "The product has been added to your shopping cart";
        String actualMessage=computer.getTextMessage();
        Assert.assertEquals(actualMessage,expectedMessage);

       // After that close the bar clicking on the cross button.
        computer.clickOnCloseBar();
        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computer.mouseHoverOnShoppingCart();

        computer.clickOnGoToCart();
        //2.15 Verify the message "Shopping cart"
        String actualMessage1 ="Shopping cart";
        String expectedMessage1 =computer.getTextMessage2();
        Assert.assertEquals(expectedMessage1,actualMessage1);
        // Change the Qty to "2" and Click on "Update shopping cart"
        computer.clearAndAddQuantity();
        computer.clickOnUpdateCart();

        // Verify the Total"$2,950.00"
        String actualPrice="$2,950.00";
        String expectedPrice =computer.getTextTotal();
        Assert.assertEquals(expectedPrice,actualPrice);
        // click on checkbox “I agree with the terms of service”
        computer.clickOnCheckBox();
        // Click on “CHECKOUT”
        computer.clickOnCheckOut();

        // Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeMessage="Welcome, Please Sign In!";
        String expectedWelcomeMessage=computer.getTextWelcomeMessage();
        Assert.assertEquals(actualWelcomeMessage,expectedWelcomeMessage);

        //2.21Click on “CHECKOUT AS GUEST”Tab
        computer.clickOnCheckOutGuest();
        //2.22 Fill the all mandatory field
        Thread.sleep(4000);
        computer.sendTextToFirstName();
        computer.sendTextToLastName();
        computer.sendTextToEmailId();
        computer.selectCountry();
        computer.sendTextToCity();
        computer.sendTextToAddress();
        computer.sendTextToPostalCode();
        computer.sendTextToPhone();
        //2.23 Click on “CONTINUE”
        computer.clickOnContinue();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        computer.clickOnNextDayAir();
        //2.25 Click on “CONTINUE”
        computer.clickOnContinue1();
        //2.26 Select Radio Button “Credit Card”
        computer.clickOnCreditCardRadioButton();
        //click on continue
        //computer.clickOnContinue2();
        //2.27 Select “Master card” From Select credit card dropdown
        //2.28 Fill all the details
        computer.selectCreditCard();
        computer.sendTextToCardHolderName();
        computer.sendTextToCardNumber();
        computer.selectExpiryMonth();
        computer.selectExpiryYear();
        computer.sendTextTOCardCode();
        //2.29 Click on “CONTINUE”
        computer.clickOnContinue3();
        //2.30 Verify “Payment Method” is “Credit Card”
        String actualPaymentMethod="Credit Card";
        String expectedPaymentMethod=computer.getTextToPaymentMethod();
        Assert.assertEquals(actualPaymentMethod,expectedPaymentMethod);
        //2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMethod="Next Day Air";
        String expectedShippingMethod=computer.getTextShippingMethod();
        Assert.assertEquals(expectedShippingMethod,actualShippingMethod);

        //2.33 Verify Total is “$2,950.00”
        String actualTotal1 ="$2,950.00";
        String expectedTotal1 =computer.getTextToTotal1();
        Assert.assertEquals(expectedTotal1,actualTotal1);
        //2.34 Click on “CONFIRM”
        computer.clickOnConfirm();
        //2.35 Verify the Text “Thank You”
        String actualThankYou ="Thank You";
        String expectedThankYou =computer.getTextThankYou();
        Assert.assertEquals(expectedThankYou,actualThankYou);

        //2.36 Verify the message “Your order has been successfully processed!”

        String actualOrder ="Your order has been successfully processed!";
        String expectedOrder =computer.getTextToOrder();
        Assert.assertEquals(expectedOrder,actualOrder);
        //2.37 Click on “CONTINUE”

        computer.clickOnContinue4();
        //2.37 Verify the text “Welcome to our store”

        String actualWelComeMessage2 ="Welcome to our store";
        String expectedWelcomeMessage2 =computer.getTextToWelcomeMessage();
        Assert.assertEquals(expectedWelcomeMessage2,actualWelComeMessage2);





    }
}
