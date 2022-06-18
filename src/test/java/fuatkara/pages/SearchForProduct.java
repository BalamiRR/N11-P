package fuatkara.pages;

import java.sql.Driver;

public class SearchForProduct {
    public SearchForProduct(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "searchData")
    public WebElement iphone;

    @FindBy(className = "searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//a[.='2']")
    public WebElement secondPage;

    @FindBy(xpath = "//span[@data-controlformid='addToWatchlistForm515317570']")
    public WebElement favoriteProduct;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement account;

    @FindBy(xpath = "//a[@href='//www.n11.com/hesabim/istek-listelerim']")
    public WebElement myFavorites;

    @FindBy(className = "btnHolder")
    public WebElement okButton;
}
