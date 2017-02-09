package UI.UIButtons;

import common.Base;

/**
 * Created by icecube on 2/6/17.
 */
public class Buttons extends Base {

    public void uiswitch() throws InterruptedException {

        //UISWITCH Standard Switch On/Off
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
        sleep(5);
    }
}
