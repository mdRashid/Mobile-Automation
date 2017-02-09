package UITesting;

import UI.CatalogUI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/7/17.
 */
public class TestingTransitions extends CatalogUI {

    @Test
    public void testingTransitions() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uTransitions().doSomething12();
    }
}
