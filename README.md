# NetflixTest JDK 17.0.2.

- The driver for the Chrome browser and the Windows OS is included.
- In case you want to run in another browser or OS, access this link to download the driver:
  https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
1. Then add the file to the src/test/resources folder.
2. Modify line 19 of code that sets the system property (https://github.com/ayearaujo/NetflixTest/blob/main/src/test/java/com/project/POM/Base.java)
Example for MacOS/Ubuntu: we should remove the extension `.exe`
`System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
