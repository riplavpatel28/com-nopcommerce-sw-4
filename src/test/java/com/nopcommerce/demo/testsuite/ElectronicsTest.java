package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    Electronics electronics = new Electronics();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // Mouse Hover on “Electronics”Tab
        electronics.mouseHoverOnElectronics();
        //Mouse Hover on “Cell phones” and click
        electronics.mouseHoverOnCellPhonesAndClick();
        //Verify the text “Cell phones”
        String actualCellPhoneText = "Cell phones";
        String expectedCellPhoneText = electronics.getTextCellphones();
        Assert.assertEquals(actualCellPhoneText, expectedCellPhoneText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // Mouse Hover on “Electronics”Tab
        electronics.mouseHoverOnElectronics();
        //Mouse Hover on “Cell phones” and click
        electronics.mouseHoverOnCellPhonesAndClick();
        //2.3 Verify the text “Cell phones”
        String actualCellPhoneText = "Cell phones";
        String expectedCellPhoneText = electronics.getTextCellphones();
        Assert.assertEquals(actualCellPhoneText, expectedCellPhoneText);

        //Click on List View Tab
        electronics.clickOnListView();
        //Click on product name “Nokia Lumia 1020” link
        Thread.sleep(3000);
        electronics.clickOnNokiaLumia1020();

        // Verify the text “Nokia Lumia 1020”
        String actualProduct = "Nokia Lumia 1020";
        String expectedProduct = electronics.getTextProductNokiaLumia();
        Assert.assertEquals(actualProduct, expectedProduct);

        // Verify the price “$349.00”
        String actualTotal = "$349.00";
        String expectedTotal = electronics.getTextPrice();
        Assert.assertEquals(actualTotal, expectedTotal);


        // Change quantity to 2
        electronics.clearAndAddQuantity();

        // Click on “ADD TO CART” tab
        Thread.sleep(3000);
        electronics.clickOnAddToCart();
        // Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(2000);
        String actualVerifyMessage = "The product has been added to your shopping cart";
        String expectedVerifyMessage = electronics.getTextVerifyMessage();
        Assert.assertEquals(actualVerifyMessage, expectedVerifyMessage);


        //After that close the bar clicking on the cross button.
        electronics.clickOnBarNotification();

        //  Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronics.mouseHoverOnShoppingCart();
        Thread.sleep(3000);
        electronics.clickOnGoToCart();

        // Verify the message "Shopping cart"
        String actualShoppingCart2 = "Shopping cart";
        String expectedShoppingCart2 = electronics.getTextShoppingCart2();
        Assert.assertEquals(actualShoppingCart2, expectedShoppingCart2);

        // Verify the quantity is 2
        //Thread.sleep(4000);
       // String actualCheckQty = "2";
        //String expectedCheckQty = electronics.getTextCheckQty();
       // Assert.assertEquals(actualCheckQty, expectedCheckQty);


        // Verify the Total $698.00
        Thread.sleep(4000);
        String actualPrice2 = "$698.00";
        String expectedPrice2 = electronics.getTextPrice2();
        Assert.assertEquals(actualPrice2, expectedPrice2);
        //  click on checkbox “I agree with the terms of service”
        electronics.clickOnCheckBoxTerm();
        //  Click on “CHECKOUT”
        electronics.clickOnCheckOut();
        // Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeSign = "Welcome, Please Sign In!";
        String expectedWelcomeSign = electronics.getWelcomeSign();
        Assert.assertEquals(actualWelcomeSign, expectedWelcomeSign);

        //  Click on “REGISTER” tab
        electronics.clickOnRegister();
        //  Verify the text “Register”
        String actualRegisterText = "Register";
        String expectedRegisterText = electronics.getRegisterText();
        Assert.assertEquals(actualRegisterText, expectedRegisterText);
        //  Fill the mandatory fields
        electronics.sendTextToFirstName();
        electronics.sendTextToLastName();
        electronics.selectDay();
        electronics.selectMonth();
        electronics.selectYear();
        electronics.SendTextToEmailId();
        electronics.sendTextToPassword();
        electronics.sendTextToConfirmPassword();
        electronics.clickOnRegister();
       // Verify the message “Your registration completed”
        String actualRegisterTxt = "Your registration completed";
        String expectedRegisterTxt = electronics.getRegisterTxt();
        Assert.assertEquals(actualRegisterTxt, expectedRegisterTxt);
        //2.23 Click on “CONTINUE” tab
        electronics.clickOnContinue2();
        Thread.sleep(3000);
        //2.24 Verify the text “Shopping carr”
        String actualShoppingText = "Shopping cart”";
        String expectedShoppingText = electronics.getTextShoppingCart();
        Assert.assertEquals(actualShoppingText,expectedShoppingText);
        //cart empty login linkagain
        electronics.inputOnEmailLoginField();
        electronics.inputOnPasswordLoginField();
        electronics.clickOnLoginButton();

        // 2.25 click on checkbox “I agree with the terms of service”
        electronics.clickOnCheckBoxTerm2();
        //2.26 Click on “CHECKOUT”
        electronics.clickOnFinalCheckOut();
       //2.27 Fill the Mandatory fields
        electronics.sendTextFirstName2();
        electronics.sendTextLastName2();
        electronics.sendTextEmailId2();
        electronics.SelectCountry();
        electronics.SelectState();
        electronics.sendTextCity();
        electronics.sendTextAddress();
        electronics.sendTextPostalCode();
        electronics.sendTextPhone();
       // 2.28 Click on “CONTINUE”
        electronics.clickOnContinue();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronics.NextDayAir();
        //2.30 Click on “CONTINUE”
        electronics.clickOnContinue4();
        electronics.clickOnCreditCardRadioButton();

        electronics.selectCreditCard();
        electronics.sendTextToCardHolderName();
        electronics.sendTextToCardNumber();
        electronics.selectExpiryMonth();
        electronics.selectExpiryYear();
       // electronics.sendTextTOCardCode();
        //2.34 Click on “CONTINUE”
       // electronics.continueAftersSuccessfullyProcessed();
        //2.35 Verify “Payment Method” is “Credit Card”
       // String expectedPaymentMethodMessage = "Payment Method: Credit Card";
       // String actualPaymentMethodMessage = electronics.getToVerifyPaymentMethodByCard();
       // Assert.assertEquals(expectedPaymentMethodMessage, actualPaymentMethodMessage);

        //2.36 Verify “Shipping Method” is “2nd Day Air”
       // String expectedShippingMethodMessage = "Shipping Method: 2nd Day Air";
      //  String actualShippingMethodMessage = electronics.getToVerifyShippingMethod();
      //  Assert.assertEquals(expectedShippingMethodMessage, actualShippingMethodMessage);

        //2.37 Verify Total is “$698.00”

        String expectedTotalFinalPayment = "$698.00";
        String actualTotalFinalPayment = electronics.getToVerifyTotalFinalAmount();
        Assert.assertEquals(expectedTotalFinalPayment, actualTotalFinalPayment);
        Thread.sleep(1000);
        //2.38 Click on “CONFIRM”
        electronics.clickOnConfirmAfterPayment();

        //2.39 Verify the Text “Thank You”
        Thread.sleep(1000);
        String expectedThankYouMessage = "Thank you";
        String actualThankYouMessage = electronics.getToVerifyThankYouMessage();
        Assert.assertEquals(expectedThankYouMessage, actualThankYouMessage);



        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedSuccessfullyProcessed = "Your order has been successfully processed!";
        String actualSuccessfullyProcessed = electronics.getToVerifySuccessfullyProcessedMessage();
        Assert.assertEquals(expectedSuccessfullyProcessed, actualSuccessfullyProcessed);


        //2.41 Click on “CONTINUE”
        electronics.clickOnContinueAfterSuccessfullyMessage();

        //2.42 Verify the text “Welcome to our store”
        String expectedWelcomeToOurStoreMessage = "Welcome to our store";
        String actualWelcomeToOurStoreMessage= electronics.getToVerifyWelcomeToOurStoreMessage();
        Assert.assertEquals(expectedWelcomeToOurStoreMessage,actualWelcomeToOurStoreMessage);


        //2.43 Click on “Logout” link
        electronics.clickOnLogOut();


        //2.44 Verify the URL is “https://demo.nopcommerce.com/
        //String currentUrl = electronics.checkTheCurrentUrl();
        //String expectedUrl2 = "https://demo.nopcommerce.com/";
        //Assert.assertEquals("Url not verified", expectedUrl2, currentUrl);



    }

}



    }


}












