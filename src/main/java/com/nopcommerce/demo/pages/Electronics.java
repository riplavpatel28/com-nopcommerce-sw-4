package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By Electronics = By.xpath("(//a[normalize-space()='Electronics'])[1]");
    By CellPhones = By.xpath("(//a[normalize-space()='Cell phones'])[1]");

    By CellphonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By ListView = By.xpath("//a[normalize-space()='List']");
    By NokiaLumia1020 = By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']");
    By ProductName = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By Price = By.id("price-value-20");
    By Quantity = By.id("product_enteredQuantity_20");
    By AddToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyMessage = By.xpath("//p[@class='content']");
    By BarNotification = By.xpath("//span[@title='Close']");
    By ShoppingCart = By.xpath("//li[@id='topcartlink']");
    By GoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By ShoppingCart2 = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By CheckQty = By.xpath("//input[@id='itemquantity11243']");
    By Price2 = By.xpath("//span[@class='product-subtotal']");
    By CheckBoxTerm = By.id("termsofservice");
    By CheckOut = By.id("checkout");
    By WelcomeSign = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By Register = By.xpath("//button[normalize-space()='Register']");
    By RegisterText = By.xpath("//h1[contains(text(),'Register')]");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By Day = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    By Month = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    By Year = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    By EmailId = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By ShoppingCart3 = By.xpath("//li[@id='topcartlink']");
    By Register1 = By.id("register-button");
    By RegisterTxt = By.xpath("//div[contains(text(),'Your registration completed')]");
    By Continue2 = By.xpath("//a[contains(text(),'Continue')]");
    By continueAfterRegistration = By.xpath("//a[contains(text(),'Continue')]");
    By login = By.xpath("//a[@class='ico-login']");
    By emailLoginField = By.xpath("//input[@id='Email']");
    By passwordLoginField = By.xpath("//input[@id='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Log in']");
    By FirstName2 = By.id("BillingNewAddress_FirstName");
    By LastName2 = By.id("BillingNewAddress_LastName");
    By EmailId2 = By.id("id=BillingNewAddress_Email");
    By Country = By.id("id=BillingNewAddress_CountryId");
    By State = By.id("BillingNewAddress_StateProvinceId");
    By City = By.id("BillingNewAddress_City");
    By BillingAddress = By.id("BillingNewAddress_City");
    By PostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By PhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueFinal = By.xpath("//button[@onclick='Billing.save()']");
    By NextDayAir = By.id("shippingoption_1");
    By Continue4 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By CreditCardRadioButton = By.id("paymentmethod_1");
    By Continue5 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By CreditCard = By.id("CreditCardType");
    By CardholderName = By.id("CardholderName");
    By CardNumber = By.id("CardNumber");
    By ExpiryMonth = By.id("ExpireMonth");
    By ExpiryYear = By.id("ExpireYear");
    By CardCode = By.id("CardCode");
    By continueAfterPaymentDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentByCreditCard = By.xpath(" //li[@class='payment-method']");
    By shippingMethodBy2ndDayAir = By.xpath("//li[@class='shipping-method']");
    By totalPaymentToPay = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmAfterPayment = By.xpath("//button[normalize-space()='Confirm']");
    By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By successfullyProcessedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueAfterSuccessfullyMessage = By.xpath("//button[normalize-space()='Continue']");
    By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logOut = By.xpath("//a[@class='ico-logout']");


    public void mouseHoverOnElectronics() {
        mouseHoverToElement(Electronics);
    }

    public void mouseHoverOnCellPhonesAndClick() {
        mouseHoverToElementAndClick(CellPhones);
    }

    public String getTextCellphones() {
        return getTextFromElement(CellphonesText);
    }

    public void clickOnListView() {
        clickOnElement(ListView);
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(NokiaLumia1020);
    }

    public String getTextProductNokiaLumia() {
        return getTextFromElement(ProductName);
    }

    public String getTextPrice() {
        return getTextFromElement(Price);
    }

    public void clearAndAddQuantity() {
        clearTextToElement(Quantity);
        sendTextToElement(Quantity, "2");
        clickOnElement(Quantity);
    }

    public void clickOnAddToCart() {
        clickOnElement(AddToCart);
    }

    public String getTextVerifyMessage() {
        return getTextFromElement(verifyMessage);
    }

    public void clickOnBarNotification() {
        clickOnElement(BarNotification);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(ShoppingCart);
    }

    public void clickOnGoToCart() {
        mouseHoverToElementAndClick(GoToCart);
    }

    public String getTextShoppingCart2() {
        return getTextFromElement(ShoppingCart2);
    }

    public String getTextCheckQty() {
        return getTextFromElement(CheckQty);
    }

    public String getTextPrice2() {
        return getTextFromElement(Price2);
    }

    public void clickOnCheckBoxTerm() {
        clickOnElement(CheckBoxTerm);
    }

    public void clickOnCheckOut() {
        clickOnElement(CheckOut);
    }

    public String getWelcomeSign() {
        return getTextFromElement(WelcomeSign);
    }

    public void clickOnRegister() {
        clickOnElement(Register);
    }

    public String getRegisterText() {
        return getTextFromElement(RegisterText);
    }

    public void sendTextToFirstName() {
        sendTextToElement(FirstName, "Rupal");
    }

    public void sendTextToLastName() {
        sendTextToElement(LastName, "Patel");
    }

    public void selectDay() {
        selectByIndexFromDropDown(Day, 5);
    }

    public void selectMonth() {
        selectByContainsTextFromDropDown(Month, "March");
    }

    public void selectYear() {
        selectByValueFromDropDown(Year, "1978");

    }

    public void SendTextToEmailId() {
        sendTextToElement(EmailId, "rupal@yahoo.com");
    }

    public void sendTextToPassword() {
        sendTextToElement(Password, "12345a");
    }

    public void sendTextToConfirmPassword() {
        sendTextToElement(ConfirmPassword, "12345a");
    }

    public void clickOnRegister1() {
        clickOnElement(Register1);
    }

    public String getRegisterTxt() {
        return getTextFromElement(RegisterTxt);
    }

    public void clickOnContinue2() {
        clickOnElement(Continue2);
    }
    // Login again because cart is empty

    public void clickOnLoginAbove() {
        clickOnElement(login);
    }

    public void inputOnEmailLoginField() {
        sendTextToElement(emailLoginField, "riplav1@gmail.com");
    }

    public void inputOnPasswordLoginField() {
        sendTextToElement(passwordLoginField, "shivam18");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getTextShoppingCart() {
        return getTextFromElement(ShoppingCart);
    }

    public void clickOnCheckBoxTerm2() {
        clickOnElement(CheckBoxTerm);
    }

    public void clickOnFinalCheckOut() {
        clickOnElement(CheckOut);

    }

    public void sendTextFirstName2() {
        sendTextToElement(FirstName2, "Rupal");
    }

    public void sendTextLastName2() {
        sendTextToElement(LastName2, "Rupal");
    }

    public void sendTextEmailId2() {
        sendTextToElement(EmailId2, "Riplav1@yahoo.com");

    }

    public void SelectCountry() {
        selectByValueFromDropDown(Country, "India");
    }

    public void SelectState() {
        selectByValueFromDropDown(State, "Alabama");
    }

    public void sendTextCity() {
        sendTextToElement(City, "Ahmedabad");
    }

    public void sendTextAddress() {
        sendTextToElement(BillingAddress, "Ahmedabad");
    }

    public void sendTextPostalCode() {
        sendTextToElement(PostalCode, "380050");
    }

    public void sendTextPhone() {
        sendTextToElement(PhoneNumber, "97234123");
    }

    public void clickOnContinue() {
        clickOnElement(continueFinal);
    }

    public void NextDayAir() {
        clickOnElement(NextDayAir);
    }

    public void clickOnContinue4() {
        clickOnElement(Continue4);

    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(CreditCardRadioButton);
    }

    public void clickOnContinue5() {
        clickOnElement(Continue5);
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


        // public void sendTextTOCardCode(){
        //sendTextToElement(CardCode, "453");
    }
    //2.34 Click on “CONTINUE”
    ///  public void continueAftersSuccessfullyProcessed() {
    //   clickOnElement(continueAfterPaymentDetails);
//}

//2.35 Verify “Payment Method” is “Credit Card”
// public String getTextPaymentMethodByCard(){
//   return getTextFromElement(paymentByCreditCard);

   // }

//2.36 Verify “Shipping Method” is “2nd Day Air”
public String getToVerifyShippingMethod(){
        return getTextFromElement(shippingMethodBy2ndDayAir);
        }

//2.37 Verify Total is “$698.00”

public String getToVerifyTotalFinalAmount(){
        return getTextFromElement(totalPaymentToPay);
        }

//2.38 Click on “CONFIRM”
public void clickOnConfirmAfterPayment() {
    clickOnElement(confirmAfterPayment);
}

//2.39 Verify the Text “Thank You”

public String getToVerifyThankYouMessage() {
    return getTextFromElement(thankYouMessage);
}

//2.40 Verify the message “Your order has been successfully processed!”

public String getToVerifySuccessfullyProcessedMessage() {
        return getTextFromElement(successfullyProcessedMessage);
    }

//2.41 Click on “CONTINUE”
public void clickOnContinueAfterSuccessfullyMessage(){
        clickOnElement(continueAfterSuccessfullyMessage);
        }


//2.42 Verify the text “Welcome to our store”
public String getToVerifyWelcomeToOurStoreMessage(){
        return getTextFromElement(welcomeToOurStore);
        }

//2.43 Click on “Logout” link
public void clickOnLogOut(){
        clickOnElement(logOut);
        }
        }

//2.44 Verify the URL is “https://demo.nopcommerce.com






