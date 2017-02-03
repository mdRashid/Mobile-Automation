package UI;

import CommonMethods.CommonMethodsGH;
import UI.UIContactUs.ContactUs;
import UI.UIFavorites.Favorites;
import UI.UIGiftCards.GiftCards;
import UI.UIPastOrders.PastOrders;
import UI.UIScheduledOrders.ScheduledOrders;
import UI.UIStartAFreshSearch.StartAFreshSearch;
import UI.UITrackYourOrder.TrackYourOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by icecube on 2/2/17.
 */
public class NavigateMenu extends CommonMethodsGH {

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement btnMenu;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public static WebElement linkUserAccount;

//    List<WebElement> listMenuItems = new ArrayList<WebElement>();
//    public void getMenuItems(){
//        listMenuItems = ad.findElements(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]"));
//
//    }

//    List<WebElement> listMenuItems = new ArrayList<WebElement>();
//    public void getMenuItems(){
//        listMenuItems = ad.findElements(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout"));
//
//    }

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[1]")
    public static WebElement scheduledOrders;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[2]")
    public static WebElement trackYourOrder;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[3]")
    public static WebElement favorites;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[4]")
    public static WebElement pastOrders;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[5]")
    public static WebElement startAFreshSearch;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[6]")
    public static WebElement giftCards;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[7]")
    public static WebElement contactUs;


    public ScheduledOrders uScheduledOrders() throws InterruptedException {
        btnMenu.click();
        //getMenuItems();
        //listMenuItems.get(0).click();
        scheduledOrders.click();
        Thread.sleep(3000);
        return new ScheduledOrders();
    }

    public TrackYourOrder uTrackYourOrder() throws InterruptedException {
        btnMenu.click();
        //getMenuItems();
        //listMenuItems.get(1).click();
        trackYourOrder.click();
        Thread.sleep(3000);
        return new TrackYourOrder();
    }

    public Favorites uFavorites() throws InterruptedException {
        btnMenu.click();
        favorites.click();
        Thread.sleep(3000);
        return new Favorites();
    }

    public PastOrders uPastOrders() throws InterruptedException {
        btnMenu.click();
        pastOrders.click();
        Thread.sleep(3000);
        return new PastOrders();
    }

    public StartAFreshSearch uStartAFreshSearch() throws InterruptedException {
        btnMenu.click();
        startAFreshSearch.click();
        Thread.sleep(3000);
        return new StartAFreshSearch();
    }

    public GiftCards uGiftCards() throws InterruptedException {
        btnMenu.click();
        giftCards.click();
        Thread.sleep(3000);
        return new GiftCards();
    }

    public ContactUs uContactUs() throws InterruptedException {
        btnMenu.click();
        contactUs.click();
        Thread.sleep(3000);
        return new ContactUs();
    }


}
