#Author: cristiano.158@hotmail.com


Feature: Pesquisa no advantageonlineshopping
 Como usuario, 
 quero realizar um cadastro no advantageonlineshopping para realizar testes!

  
  Background: Cadastro no advantageon
  Given que eu esteja no site "http://advantageonlineshopping.com/#/"
  
 
  Scenario: Cadastro
    When que eu aperte o botao user
    And e clique em novo cadastro
    And estiver no nome do usuario escrever "Tobias95"
    And no email "tobiasheitorenzopinto-90@formulaweb.com.br"
    And colocar senha "Ab1234567"
    And e confirma a senha "Ab1234567"
    And aceitar termos e clicar em registrar
    Then depois de entrar na tela logada, validar nome do usuario logado
    
  Scenario: Login
    When estiver na pagina inicial, clicar em user
    And colocar nome do usuario, senha
    And clicar em entrar
    Then depois validar usuario logado
  	