package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Dado("^acesso o cadastro de usuario$")
    public void acessarTelaCadastro() {
        cadastroPage.acessar_tela_cadastro();
    }

    @Quando("^eu preencho o formulario do cadastro$")
    public void criar_formulario() {
        cadastroPage.delayPage(5);
        cadastroPage.preencher_formulario();

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clico_registrar();
    }

    @Então("^O cadastro é realizado com sucesso$")
    public void o_cadastro_é_realizado_com_sucesso() {
        cadastroPage.cadastro_realizado();
    }


}