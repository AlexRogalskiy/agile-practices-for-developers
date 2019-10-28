package com.acme.dbo.it.account;

import com.acme.dbo.config.ScreenshotExceptionExtension;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.DisabledIf;

import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static lombok.AccessLevel.PRIVATE;
import static org.openqa.selenium.By.linkText;

@DisabledIf(expression = "#{environment['features.account'] == 'false'}", loadContext = true)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(ScreenshotExceptionExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ActiveProfiles("it")
@Slf4j
@FieldDefaults(level = PRIVATE)
public class AccountUatIT {
    @LocalServerPort int serverPort;
    @Autowired WebDriver driver;
    String mainPage;

    @BeforeAll
    public void setUp() {
        mainPage = "http://localhost:" + serverPort + "/dbo/swagger-ui.html";

        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 5_000;
        Configuration.reportsFolder = "target/surefire-reports";

        open(mainPage);
    }

    @Test
    public void shouldGetAccountsWhenPrepopulatedDbHasSome() throws IOException {
        $(linkText("account-controller")).shouldBe(visible).click();
        $(linkText("/api/account")).shouldBe(visible).click();
        $(withText("Try it out")).shouldBe(visible).click();
        $(withText("Execute")).shouldBe(visible).click();
        $(withText("Server response")).shouldBe(visible);

        $(byClassName("response")).shouldBe(visible)
                .$(byXpath("*[contains(@class, 'status')]"))
                    .shouldHave(text("200"));
    }

    @AfterAll
    public void closeBrowser() {
        driver.quit();
    }
}
