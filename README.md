# Netbox-Zabbix-Integration_TEST_SERENITY
That porpuse of this project is automate the End to End testing(E2E) using:
  * Serenity BDD: Very friendly reports and allows to take screenshoot for each step
  * Selenium: For implementing all the logic to navegate the pages
  * Cucumber BDD: For execute differents scenarios and easy to read them

## Prerequisites
These are requisites that must be installed to run this project correctly: 
  * Java
  * Maven

## Start
To use this project follow the next steps:
* Clone the repository to your local
```bash
git clone https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY.git
cd Netbox-Zabbix-Integration_TEST_SERENITY
```

* Change the parameters in _src/test/java/Api_Netbox_Zabbix_Integration/Credentials.java_
```bash
vim src/test/java/Api_Netbox_Zabbix_Integration/Credentials.java
```
Credentials.java:
```bash
package Api_Netbox_Zabbix_Integration.Manage;

public class Credentials {

    // MARK - Netbox Credentials
    public String NetboxURL = "http://192.168.40.50:3000/";
    public String NetboxUsername = "admin";
    public String NetboxPassword = "admin";


    // MARK - Zabbix Credentials

    public String ZabbixURL = "http://192.168.40.50/";
    public String ZabbixUsername = "Admin";
    public String ZabbixPassword = "zabbix";

}
```
  Netbox-Zabbix-Integration_TEST_SERENITY/src/test/java/Api_Netbox_Zabbix_Integration
* Run the TESTS!
```bash
mvn clean verify
```


