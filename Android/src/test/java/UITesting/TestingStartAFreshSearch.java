package UITesting;

import CommonMethods.CommonMethodsGH;
import UI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/2/17.
 */
public class TestingStartAFreshSearch extends NavigateMenu {

    //@Test
    public void testingFirstItem() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uStartAFreshSearch().selectFirstItem();
    }

    //@Test
    public void testingSecondItem() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uStartAFreshSearch().selectSecondItem();
    }

    //@Test
    public void testingThirdItem() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uStartAFreshSearch().selectThirdItem();
    }

    @Test
    public void testingFourthItem() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uStartAFreshSearch().selectFourthItem();
    }
}
