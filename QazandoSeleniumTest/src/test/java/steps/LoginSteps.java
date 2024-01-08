package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {


    @Dado("^que estou na tela de login$")
    public void acessar_tela_login()  {

        LoginPage.acessar_tela_login();
    }
}
