$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarUsuarioSteps.feature");
formatter.feature({
  "name": "cadastrar usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cadastrarusuario"
    }
  ]
});
formatter.scenario({
  "name": "informacoes pessoais",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cadastrarusuario"
    },
    {
      "name": "@infopessoais"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo First name \"Caroline\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "infomar o campo Last name \"Silva\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.infomarOCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo Email \"carolweb112@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar campo Password \"12345\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarCampoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo First nameA \"Caroline\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoFirstNameA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "infomar o campo Last nameA \"Silva\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.infomarOCampoLastNameA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo Adress \"Norman St\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarNoCampoAdress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo City \"Detroit\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo State",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoState()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo Postal Code \"98765\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoPostalCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo Country",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo Endereco Alternativo \"Belle St\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoEnderecoAlternativo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo Mobile Phone \"021936471932\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarOCampoMobilePhone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao Register",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.acionarOBotaoRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema cadastra o usuario \"Caroline Silva\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.oSistemaCadastraOUsuario(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027Caroline Silva\u0027]\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-MQF4COF8\u0027, ip: \u002710.0.0.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: C:\\Users\\quell\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57816}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4c2265b2fe5a615e4892f2874773a24a\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027Caroline Silva\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepsDefinitions.CadastrarUsuarioSteps.oSistemaCadastraOUsuario(CadastrarUsuarioSteps.java:99)\r\n\tat ✽.o sistema cadastra o usuario \"Caroline Silva\"(file:src/test/resources/features/CadastrarUsuarioSteps.feature:24)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});