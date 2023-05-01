package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;


public class ProjectConfiguration {
    static WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void configure() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

        Configuration.baseUrl = webConfig.baseUrl();
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();
//        String remoteUrl = webConfig.remoteWebDriverUrl();
//        if (!Strings.isNullOrEmpty(remoteUrl)) {
//            Configuration.remote = remoteUrl;
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                    "enableVNC", true,
//                    "enableVideo", true
//            ));
//            Configuration.browserCapabilities = capabilities;
//        }
    }
}
