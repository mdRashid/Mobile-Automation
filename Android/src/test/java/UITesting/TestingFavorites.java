package UITesting;

import CommonMethods.CommonMethodsGH;
import UI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/2/17.
 */
public class TestingFavorites extends NavigateMenu {

    //@Test
    public void testingFirstFavorite() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uFavorites().selectFirstFavorite();
    }

    //@Test
    public void testingSecondFavorite() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uFavorites().selectSecondFavorite();
    }

    @Test
    public void testingThirdFavorite() throws InterruptedException {

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uFavorites().selectThirdFavorite();
    }
}
