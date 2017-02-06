package UI.UIGiftCards;

import common.Base;

/**
 * Created by icecube on 2/2/17.
 */
public class GiftCards extends Base {

    public void selectPurchaseAGiftCard() throws InterruptedException {

        //clicks Purchase A Gift Card
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]");
        sleep(10);

        //navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }

    public void selectCheckYourGiftCardBalance() throws InterruptedException {

        //clicks Check Your Gift Card Balance
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]");
        sleep(10);

        //navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }
}
