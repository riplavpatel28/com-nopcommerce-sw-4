package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Computer extends Utility {
    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktopsTab = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By sortByNameZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");

    By sortByNameAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]");
    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.id("product_attribute_1");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By HDRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By OSRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By checkBoxMO = By.xpath("//input[@id='product_attribute_5_10']");
    By checkBoxCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.xpath("//span[@id='price-value-1']");
    By addToCart2 = By.xpath("//button[@id='add-to-cart-button-1']");
    By message = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHoverShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By addQunty = By.className("qty-input");
    By UpdateCart = By.xpath("//button[@id='updatecart']");
    By Total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By checkBox = By.id("termsofservice");
    By checkOut = By.id("checkout");
    By WelcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By FirstName = By.id("BillingNewAddress_FirstName");
    By LastName = By.id("BillingNewAddress_LastName");
    By EmailId = By.id("BillingNewAddress_Email");
    By Country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By City = By.id("BillingNewAddress_City");
    By BillingAddress = By.id("BillingNewAddress_City");
    By PostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By PhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By Continue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By NextDayAir = By.id("shippingoption_1");
    By Continue1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By CreditCardRadioButton = By.id("paymentmethod_1");
    By Continue2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By CreditCard = By.id("CreditCardType");
    By CardholderName = By.id("CardholderName");
    By CardNumber = By.id("CardNumber");
    By ExpiryMonth = By.id("ExpireMonth");
    By ExpiryYear = By.id("ExpireYear");
    By CardCode = By.id("CardCode");
    By Continue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    By PaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By ShippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");
    By Total1 = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By Confirm =By.xpath("//button[contains(text(),'Confirm')]");
    By ThankYou =By.xpath("//h1[normalize-space()='Thank you']");
    By Order =By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By Continue4 =By.xpath("//button[contains(text(),'Continue')]");
    By WelComeMessage1 =By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    public void clickOnDesktoptab() {
        clickOnElement(desktopsTab);
    }

    public void selectNameZToA() {
        clickOnElement(sortByNameZtoA);
    }

    public String getSortByText() {
        return getTextFromElement(sortByNameZtoA);
    }


    public void selectNameAToZ() {
        clickOnElement(sortByNameAtoZ);
    }

    public String getSortByAtoZ() {
        return getTextFromElement(sortByNameAtoZ);
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    public String getTextBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor() {
        selectByIndexFromDropDown(processor, 1);

    }

    public void selectRam() {
        selectByIndexFromDropDown(ram, 3);
    }

    public void clickOnHDDRadio() {
        clickOnElement(HDRadio);
    }

    public void clickOnOSRadio() {
        clickOnElement(OSRadio);
    }

    public void clickOnCheckboxMO() {
        clickOnElement(checkBoxMO);
    }

    public void clickOnCheckboxCommander() {
        clickOnElement(checkBoxCommander);
    }

    public String getTextPrice() {
        return getTextFromElement(price);

    }

    public void clickOnAddToCart2() {
        clickOnElement(addToCart2);
    }

    public String getTextMessage() {
        return getTextFromElement(message);
    }

    public void clickOnCloseBar() {
        clickOnElement(closeBar);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHoverShoppingCart);
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCart);
    }

    public String getTextMessage2() {
        return getTextFromElement(shoppingCartMessage);
    }

    public void clearAndAddQuantity() {
        clearTextToElement(By.className("qty-input"));
        sendTextToElement(By.className("qty-input"), "2");
        clickOnElement(addQunty);
    }

    public void clickOnUpdateCart() {
        clickOnElement(UpdateCart);
    }

    public String getTextTotal() {
        return getTextFromElement(Total);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String getTextWelcomeMessage() {
        return getTextFromElement(WelcomeMessage);
    }

    public void clickOnCheckOutGuest() {
        clickOnElement(checkoutGuest);
    }

    public void sendTextToFirstName() {
        sendTextToElement(By.id("BillingNewAddress_FirstName"), "Rupal");
    }

    public void sendTextToLastName() {
        sendTextToElement(By.id("BillingNewAddress_LastName"), "Patel");
    }

    public void sendTextToEmailId() {
        sendTextToElement(By.id("BillingNewAddress_Email"), "riplav@yahoo.com");
    }

    public void selectCountry() {
        selectByIndexFromDropDown(Country, 133);
    }

    public void sendTextToCity() {
        sendTextToElement(By.id("BillingNewAddress_City"), "Ahmedabad");
    }

    public void sendTextToAddress() {
        sendTextToElement(By.id("BillingNewAddress_Address1"), "211 Anand society");
    }

    public void sendTextToPostalCode() {
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"), "380050");
    }

    public void sendTextToPhone() {
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "97234123");
    }

    public void clickOnContinue() {
        clickOnElement(Continue);
    }

    public void clickOnNextDayAir() {
        clickOnElement(NextDayAir);
    }

    public void clickOnContinue1() {
        clickOnElement(Continue1);
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(CreditCardRadioButton);
    }

    public void clickOnContinue2() {
        clickOnElement(Continue2);
    }

    public void selectCreditCard() {
        selectByIndexFromDropDown(CreditCard, 1);

    }

    public void sendTextToCardHolderName() {
        sendTextToElement(CardholderName, "Mr.Right");
    }

    public void sendTextToCardNumber() {
        sendTextToElement(CardNumber, "5555 5555 5555 4444");
    }

    public void selectExpiryMonth() {
        selectByIndexFromDropDown(ExpiryMonth, 5);

    }

    public void selectExpiryYear() {
        selectByIndexFromDropDown(ExpiryYear, 2);
    }

    public void sendTextTOCardCode() {
        sendTextToElement(CardCode, "453");
    }

    public void clickOnContinue3() {
        clickOnElement(Continue3);
    }

    public String getTextToPaymentMethod() {
        return getTextFromElement(PaymentMethod);

    }

    public String getTextShippingMethod() {
        return getTextFromElement(ShippingMethod);
    }

    public String getTextToTotal1() {
        return getTextFromElement(Total1);

    }
    public void clickOnConfirm(){
        clickOnElement(Confirm);
    }
    public String getTextThankYou(){
        return getTextFromElement(ThankYou);
    }
    public String getTextToOrder(){
        return getTextFromElement(Order);
    }
    public void clickOnContinue4(){
        clickOnElement(Continue4);
    }
    public String getTextToWelcomeMessage() {
        return getTextFromElement(WelComeMessage1);
    }





}


























