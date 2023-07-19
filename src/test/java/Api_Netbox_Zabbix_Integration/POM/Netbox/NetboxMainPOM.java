package Api_Netbox_Zabbix_Integration.POM.Netbox;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class NetboxMainPOM extends PageObject {


    @FindBy(xpath = "//a[@href='#menuDevices']")
    public WebElement DeviceBar;
    @FindBy(css = "a.btn.btn-sm.btn-green.lh-1[href='/dcim/devices/add/']")
    public WebElement CreateDeviceButton;

    @FindBy(xpath = "//a[@class='nav-link active'][normalize-space()='Devices']")
    public WebElement deviceButton;
}
