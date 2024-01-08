$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cadastro_usuario.feature");
formatter.feature({
  "name": "Cadastro de usuário:",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "name": "Registrar",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cadastro"
    },
    {
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "name": "acesso o cadastro de usuario",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroSteps.acessarTelaCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o formulario do cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroSteps.criar_formulario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "O cadastro é realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroSteps.o_cadastro_é_realizado_com_sucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/desconto.feature");
formatter.feature({
  "name": "Receber o cupom desconto da qazando",
  "description": "    Eu como usuário da qazando\n    Quero receber um cupom de desconto\n    Para comprar um curso com valor reduzido",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Visualizar código de desconto",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que estou no site da qazando",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "eu preencho o meu e-mail",
  "keyword": "Quando "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "eu vejo o código de desconto",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "xpto",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que tenho cupom gerado",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});