# Netbox-Zabbix-Integration_TEST_SERENITY
That porpuse of this project is automate the End to End testing(E2E) using:
  * Serenity BDD: Very friendly reports and allows to take screenshoot for each step
  * Selenium: For implementing all the logic to navegate the pages
  * Cucumber BDD: For execute differents scenarios and easy to read them

# Structure and Organization
This project respect the best practices in _Selenium_ using Page Object Model(POM) creating a JavaClass for each page tested for a easier maintenance and scale of the test

Manage: All the utils used along the entire project

 ![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/052be1c5-e5b0-4ee0-8575-3bac02be4ba0)

Pages: Conteins the logic and the @Step used in Serenity

 ![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/39019cab-f068-4399-8132-afe16387f96e)

POM: These are the files where we define the WebElements of the corresponding page

 ![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/f3eaaaf4-e44d-4c65-ac64-13639bc60f5d)

StepDefinitions: Step definitions are create for each feature

 ![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/a7b10e4c-b59f-4467-9349-3e4921518977)

Features: Cucumber files using Gherkin language for each feature

 ![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/6177903b-5811-45c8-88f4-3e9ca8d69eed)

 
 

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
* Credentials.java:
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

* Run the TESTS!
```bash
mvn clean verify
```
# Example of the Solution:

Report HTML:
![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/fb79e4bb-ae5b-4ba4-9ebd-e593b151a08d)

![image](https://github.com/AdrianJPT/Netbox-Zabbix-Integration_TEST_SERENITY/assets/86939628/04b8747a-90bd-425e-8b94-f1a54345a385)

--------------------------------------------------------------------------
