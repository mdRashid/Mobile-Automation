package UI.UIContactUs;

import common.Base;

/**
 * Created by icecube on 2/2/17.
 */
public class ContactUs extends Base {

    public void selectChatWithUs() throws InterruptedException {

        //clicks on Chat With Us
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[3]/android.widget.Button[1]");
        sleep(10);

        //navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }
}
