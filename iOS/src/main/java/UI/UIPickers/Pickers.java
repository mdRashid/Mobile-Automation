package UI.UIPickers;

import common.Base;

/**
 * Created by icecube on 2/6/17.
 */
public class Pickers extends Base {

    public void selectUIPicker() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton[1]");
        sleep(2);
    }

    public void selectUIDatePicker() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton[2]");
        sleep(2);
    }

    public void selectCustom() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton[3]");
        sleep(2);
    }


    public void selectPickersTabs() throws InterruptedException {

        selectUIDatePicker();
        selectCustom();
        selectUIPicker();
    }
}
