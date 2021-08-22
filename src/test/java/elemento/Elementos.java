package elemento;

import org.openqa.selenium.By;

public class Elementos {

	//Cadastro
	private By user = By.cssSelector("#menuUser");
	private By novoCadastro = By.cssSelector("a.create-new-account.ng-scope");
	private By userName = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(1) > div > input");
	private By email = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By password = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input");
	private By confirmaPassword = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input");
	private By aceitarTermos = By.cssSelector("#formCover > sec-view > div > input");
	private By cadastrar = By.cssSelector("#register_btnundefined");
	private By userLogado = By.cssSelector("#menuUserLink > span");

	//login
	private By usuario = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input");
	private By senha = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
	private By entrar = By.id("sign_in_btnundefined");
	
	
	
	public By getUser() {
		return user;
	}

	public By getNovoCadastro() {
		return novoCadastro;
	}

	public By getUserName() {
		return userName;
	}

	public By getEmail() {
		return email;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmaPassword() {
		return confirmaPassword;
	}

	public By getAceitarTermos() {
		return aceitarTermos;
	}

	public By getCadastrar() {
		return cadastrar;
	}

	public By getUserLogado() {
		return userLogado;
	}

	public By getUsuario() {
		return usuario;
	}

	public By getSenha() {
		return senha;
	}

	public By getEntrar() {
		return entrar;
	}

}
