package Api_Netbox_Zabbix_Integration.Pages.Zabbix;

import Api_Netbox_Zabbix_Integration.Manage.ManageDriver;
import Api_Netbox_Zabbix_Integration.POM.Zabbix.ZabbixMainPOM;
import net.thucydides.core.annotations.Step;

public class ZabbixMain {

    ZabbixMainPOM zabbixMainPOM = new ZabbixMainPOM();
    ManageDriver manageDriver;
    @Step
    public void clickOnBarHost() {
        manageDriver.mouseOverElement(zabbixMainPOM.barDataColletion);
        zabbixMainPOM.barDataColletion.click();
        zabbixMainPOM.barHosts.click();
    }

}
