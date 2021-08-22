package executarMetodos;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Executar {

	Metodos metodo = new Metodos();

	//teste cadastro
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) throws InterruptedException {
		metodo.abrirNavegador(url);
	}

	@When("que eu aperte o botao user")
	public void que_eu_aperte_o_botao_user() throws InterruptedException {
		metodo.clicar(metodo.getUser());
	}

	@When("e clique em novo cadastro")
	public void e_clique_em_novo_cadastro() throws InterruptedException {
		metodo.clicar(metodo.getNovoCadastro());
	}

	@When("estiver no nome do usuario escrever {string}")
	public void estiver_no_nome_do_usuario_escrever(String nome) {
		metodo.escrever(nome, metodo.getUserName());
	}

	@When("no email {string}")
	public void no_email(String email) {
		metodo.escrever(email, metodo.getEmail());
	}

	@When("colocar senha {string}")
	public void colocar_senha(String senha) {
		metodo.escrever(senha, metodo.getPassword());
	}

	@When("e confirma a senha {string}")
	public void e_confirma_a_senha(String confirmaSenha) {
		metodo.escrever(confirmaSenha, metodo.getConfirmaPassword());
	}

	@When("aceitar termos e clicar em registrar")
	public void aceitar_termos_e_clicar_em_registrar() throws InterruptedException {
		metodo.clicar(metodo.getAceitarTermos());
		metodo.clicar(metodo.getCadastrar());
	}

	@Then("depois de entrar na tela logada, validar nome do usuario logado")
	public void depois_de_entrar_na_tela_logada_validar_nome_do_usuario_logado() throws IOException {
        metodo.validarTexto("Tobias95", metodo.getUserLogado());
        metodo.printScr("Cadastro");
        metodo.fecharNavegador();
	}

	
	//teste login
	@When("estiver na pagina inicial, clicar em user")
	public void estiver_na_pagina_inicial_clicar_em_user() throws InterruptedException {
		metodo.clicar(metodo.getUser());
	}

	@When("colocar nome do usuario, senha")
	public void colocar_nome_do_usuario_senha() {
	   metodo.escrever("Tobias01", metodo.getUsuario());
	   metodo.escrever("Ab1234567", metodo.getSenha());
	}

	@When("clicar em entrar")
	public void clicar_em_entrar() throws InterruptedException {
	   metodo.clicar(metodo.getEntrar());
	}

	@Then("depois validar usuario logado")
	public void depois_validar_usuario_logado() throws IOException {
		metodo.validarTexto("Tobias01", metodo.getUserLogado());
		metodo.printScr("Login");
        metodo.fecharNavegador();
	}

}
