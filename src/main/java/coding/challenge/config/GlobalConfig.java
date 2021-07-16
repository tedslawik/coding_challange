package coding.challenge.config;
import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.logevents.SelenideLogger;
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
            Configuration.baseUrl = System.getProperty("user.dir") + "\\src\\www\\ui\\index.html";
            Configuration.startMaximized=true;
            Configuration.savePageSource = true;
            Configuration.screenshots = true;
            Configuration.browser = "chrome";
            Configuration.holdBrowserOpen = true;
        }
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }


}
