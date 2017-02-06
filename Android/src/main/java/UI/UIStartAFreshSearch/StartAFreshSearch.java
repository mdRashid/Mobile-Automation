package UI.UIStartAFreshSearch;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by icecube on 2/2/17.
 */
public class StartAFreshSearch extends Base {

    public void selectFirstItem() throws InterruptedException {

        //clicks first item
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[6]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]");
        sleep(5);

        //closes blue pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //to go back/navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }

    public void selectSecondItem() throws InterruptedException {

        //clicks second item
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[6]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]");
        sleep(5);

        //closes blue pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //to go back/navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }

    public void selectThirdItem() throws InterruptedException {

        //clicks third item
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[6]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[3]");
        sleep(5);

        //closes blue pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //to go back/navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }

    public void selectFourthItem() throws InterruptedException {

        //clicks fourth item
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[6]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[4]");
        sleep(5);

        //closes blue pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //to go back/navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }
}
