package UI;

import UI.UIAlerts.Alerts;
import UI.UIButtons.Buttons;
import UI.UIControls.Controls;
import UI.UIImages.Images;
import UI.UIPickers.Pickers;
import UI.UISearchBar.SearchBar;
import UI.UISegments.Segments;
import UI.UITextFields.TextFields;
import UI.UITextView.TextView;
import UI.UIToolbar.Toolbar;
import UI.UITransitions.Transitions;
import UI.UIWeb.Web;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by icecube on 2/6/17.
 */
public class CatalogUI extends Base {

    List<WebElement> elements = new ArrayList<WebElement>();

    public void homePage() {
        //store mobile elements into ArrayList
        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"));
    }


    public Buttons uButtons() throws InterruptedException {
        homePage();
        elements.get(0).click();
        return new Buttons();
    }

    public Controls uControls() throws InterruptedException {
        homePage();
        elements.get(1).click();
        return new Controls();
    }

    public TextFields uTextFields() throws InterruptedException {
        homePage();
        elements.get(2).click();
        return new TextFields();
    }

    public SearchBar uSearchBar() throws InterruptedException {
        homePage();
        elements.get(3).click();
        return new SearchBar();
    }

    public TextView uTextView() throws InterruptedException {
        homePage();
        elements.get(4).click();
        return new TextView();
    }

    public Pickers uPickers() throws InterruptedException {
        homePage();
        elements.get(5).click();
        return new Pickers();
    }

    public Images uImages() throws InterruptedException {
        homePage();
        elements.get(6).click();
        return new Images();
    }

    public Web uWeb() throws InterruptedException {
        homePage();
        elements.get(7).click();
        return new Web();
    }

    public Segments uSegments() throws InterruptedException {
        homePage();
        elements.get(8).click();
        return new Segments();
    }

    public Toolbar uToolbar() throws InterruptedException {
        homePage();
        elements.get(9).click();
        return new Toolbar();
    }

    public Alerts uAlerts() throws InterruptedException {
        homePage();
        elements.get(10).click();
        return new Alerts();
    }

    public Transitions uTransitions() throws InterruptedException {
        homePage();
        elements.get(11).click();
        return new Transitions();
    }
}
