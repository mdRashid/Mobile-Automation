package UI.UIFavorites;

import common.Base;

/**
 * Created by icecube on 2/2/17.
 */
public class Favorites extends Base {

    public void selectFirstFavorite() throws InterruptedException {

        //clicks first favorite
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]");
        sleep(5);

        //close pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }

    public void selectSecondFavorite() throws InterruptedException {

        //clicks second favorite
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]");
        sleep(5);

        //close pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }

    public void selectThirdFavorite() throws InterruptedException {

        //clicks third favorite
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.ViewFlipper[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.RelativeLayout[3]");
        sleep(5);

        //close pop up
        clickByXpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]");
        sleep(5);

        //navigate back
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
        sleep(5);
    }
}
