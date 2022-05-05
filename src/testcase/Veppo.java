package testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Veppo {
	WebDriver driver;

	@Before
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.veppocel.com.br/internet/php/cadastro.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		//Capturando o elemento do campo nome completo
		WebElement txtNome = driver.findElement(By.name("nome"));
		txtNome.sendKeys("Agnes Vitoria");
		
		//Capturando o elemento do campo endereço
		WebElement txtEndereco = driver.findElement(By.name("endereco"));
		txtEndereco.sendKeys("Venancio Aires 93");
		
		//Capturando o elemento do campo complemento
		WebElement txtComplemento = driver.findElement(By.name("complemento"));
		txtComplemento.sendKeys("Casa");
		
		//Capturando o elemento do campo cidade
		WebElement txtCidade = driver.findElement(By.name("cidade"));
		txtCidade.sendKeys("Porto Alegre");
		
		//Capturando o elemento do campo bairro
		WebElement txtBairro = driver.findElement(By.name("bairro"));
		txtBairro.sendKeys("Cidade Baixa");
		
		//Capturando o elemento do campo CEP
		WebElement txtCEP = driver.findElement(By.name("cep"));
		txtCEP.sendKeys("5555555");
		
		//Capturando o elemento do campo estado
		WebElement selEstado = driver.findElement(By.name("uf"));
		//selEstado.sendKeys("Alagoas");
		selEstado.sendKeys(Keys.ARROW_DOWN);
		selEstado.sendKeys(Keys.ARROW_DOWN);
		selEstado.sendKeys(Keys.ARROW_DOWN);
		selEstado.sendKeys(Keys.ARROW_DOWN);
		selEstado.sendKeys(Keys.ARROW_UP);
		selEstado.sendKeys(Keys.ENTER);
		
		WebElement rdPessoa = driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table/tbody/tr[8]/td[2]/input[2]"));
		rdPessoa.click();
		
		//Capturando o elemento do campo CPF
		WebElement txtCPF = driver.findElement(By.name("cpfcgc"));
		txtCPF.sendKeys("11111111111");
		
		//Capturando o elemento do campo telefone
		WebElement txtFone = driver.findElement(By.name("fone"));
		txtFone.sendKeys("36363636");
		
		//Capturando o elemento do campo fax
		WebElement txtFax = driver.findElement(By.name("fax"));
		txtFax.sendKeys("3363636");
		
		//Capturando o elemento do campo celular
		WebElement txtCelular = driver.findElement(By.name("celular"));
		txtCelular.sendKeys("583497");
		
		//Capturando o elemento do campo email
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("agnesdevargas13@gmail.com");
		
		//Capturando o elemento do campo senha
		WebElement txtSenha = driver.findElement(By.name("senha"));
		txtSenha.sendKeys("54321");
		
		//Capturando o elemento do campo confirma senha
		WebElement txtPass1 = driver.findElement(By.name("pass1"));
		txtPass1.sendKeys("12345");
		
		//Capturando o elemento do campo limpar
		WebElement btnLimpar = driver.findElement(By.name("btnAux"));
		btnLimpar.click();
	
		//driver.close();
		
	}

}
