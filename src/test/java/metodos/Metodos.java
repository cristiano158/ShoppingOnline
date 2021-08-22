package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elemento.Elementos;

public class Metodos extends Elementos {

	WebDriver driver;

	public void abrirNavegador(String url) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.err.println("***Erro na configuração do navegador***\n" + e.getMessage());
		}

	}

	public void escrever(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("***Erro ao escrever.***\n" + e.getMessage());
		}

	}

	public void clicar(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);
	}

	public void validarTexto(String texto, By elemento) {
		String textoEsperado = driver.findElement(elemento).getText();
		assertEquals(texto, textoEsperado);
	}

	public void printScr(String nome) throws IOException {
		TakesScreenshot print = ((TakesScreenshot) driver);
		File srcFile = print.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public void fecharNavegador() {
		driver.quit();
	}

}
