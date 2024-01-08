package pages;

import runner.RunCucumberTest;

public class LoginPage extends RunCucumberTest {
    public static void acessar_tela_login() {
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");

    }
}


