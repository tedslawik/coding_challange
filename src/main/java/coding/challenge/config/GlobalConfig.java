package coding.challenge.config;
import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GlobalConfig {

    private static GlobalConfig INSTANCE;

    private GlobalConfig() {
    }

    public static void setUp() {

        if (INSTANCE == null) {
            log.info("Setting up Global framework config for coding challenge ");
            INSTANCE = new GlobalConfig();
            Config config = loadConfig();
            Configuration.baseUrl = System.getProperty("user.dir") + config.getString("challenge.baseUrl");
            Configuration.startMaximized=true;
            Configuration.savePageSource = true;
            Configuration.screenshots = true;
            Configuration.browser = config.getString("challenge.browser");
            Configuration.holdBrowserOpen = true;
        }
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));




    }

    public static Config loadConfig(){
    Config defaultConfig = ConfigFactory.parseResources("config/default.conf");

    return ConfigFactory.load().withFallback(defaultConfig);
    }


}
