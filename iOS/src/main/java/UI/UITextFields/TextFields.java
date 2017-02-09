package UI.UITextFields;

import common.Base;

/**
 * Created by icecube on 2/6/17.
 */
public class TextFields extends Base {

    public void uitextfield(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]", "testing1");
    }

    public void uitextfieldRounded(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]", "testing2");
    }

    public void uitextfieldSecure(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]", "testing3");
    }

    public void uitextfieldWithLeftView(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]", "testing4");
    }


    public void typeOnTextFields() throws InterruptedException {

        uitextfield();
        uitextfieldRounded();
        uitextfieldSecure();
        uitextfieldWithLeftView();
        sleep(2);
    }
}
