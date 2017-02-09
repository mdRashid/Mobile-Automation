package UITesting;

import UI.CatalogUI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/6/17.
 */
public class TestingButtons extends CatalogUI {

    @Test
    public void testingButtons() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uButtons().uiswitch();
    }
}
