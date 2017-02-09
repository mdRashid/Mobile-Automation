package UI.UIAlerts;

import common.Base;

/**
 * Created by icecube on 2/6/17.
 */
public class Alerts extends Base {

    public void uiactionsheetShowSimple() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
        sleep(3);

        //clicks OK
//        clickByXpath("//UIAApplication[1]/UIAWindow[4]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[1]");
//        sleep(3);
    }

    public void uiactionsheetShowOkCancel() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]");
        sleep(3);
    }

    public void uiactionsheetShowCustomized() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]");
        sleep(3);
    }

    public void uialertviewShowSimple() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]");
        sleep(3);
    }

    public void uialertviewShowOkCancel() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
        sleep(3);
    }

    public void uialertviewShowCustom() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
        sleep(3);
    }

    public void uialertviewSecureTextInput() throws InterruptedException {

        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[13]");
        sleep(3);
    }

}
