#language:pt
#encoding: UTF-8

@cadastrarusuario
Funcionalidade: cadastrar usuario

  @infopessoais
  Cenario: informacoes pessoais

    Quando informar o campo First name "Caroline"
    E infomar o campo Last name "Silva"
    E informar o campo Email "carolweb112@gmail.com"
    E informar campo Password "12345"
    E informar o campo First nameA "Caroline"
    E infomar o campo Last nameA "Silva"
    E informar no campo Adress "Norman St"
    E informar o campo City "Detroit"
    E informar o campo State
    E informar o campo Postal Code "98765"
    E informar o campo Country
    E informar o campo Endereco Alternativo "Belle St"
    E informar o campo Mobile Phone "021936471932"
    E acionar o botao Register
   Entao o sistema cadastra o usuario "Caroline Silva"

