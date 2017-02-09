package UITesting;

import UI.CatalogUI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/7/17.
 */
public class TestingAlerts extends CatalogUI {

    @Test
    public void testUIACTIONSHEETShowSimple() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uiactionsheetShowSimple();
    }

    @Test
    public void testUIACTIONSHEETShowOkCancel() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uiactionsheetShowOkCancel();
    }

    @Test
    public void testUIACTIONSHEETShowCustomized() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uiactionsheetShowCustomized();
    }

    @Test
    public void testUIALERTVIEWShowSimple() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uialertviewShowSimple();
    }

    @Test
    public void testUIALERTVIEWShowOkCancel() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uialertviewShowOkCancel();
    }

    @Test
    public void testUIALERTVIEWShowCustom() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uialertviewShowCustom();
    }

    @Test
    public void testUIALERTVIEWSecureTextInput() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uAlerts().uialertviewSecureTextInput();
    }
}
