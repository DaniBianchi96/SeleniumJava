package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runner.RunCucumberTest;

public class CadastroPage extends RunCucumberTest {

    WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessar_tela_cadastro() {
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");

    }


    public void preencher_formulario() {
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("daniel");
        driver.findElement(By.cssSelector(".signup-form input:nth-child(3)")).sendKeys("testea1correto@gmail.com");
        driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();

        driver.findElement(By.id("days")).click();

        driver.findElement(By.id("days"));
        driver.findElement(By.xpath("//option[. = '1']")).click();

        driver.findElement(By.id("months")).click();


        driver.findElement(By.id("months"));
        driver.findElement(By.xpath("//option[. = 'January']")).click();

        driver.findElement(By.id("years")).click();

        driver.findElement(By.id("years"));
        driver.findElement(By.xpath("//option[. = '2020']")).click();

        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).sendKeys("daniel");
        driver.findElement(By.id("last_name")).click();
        driver.findElement(By.id("last_name")).sendKeys("oliveira");
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("Tcs");
        driver.findElement(By.id("name")).sendKeys("DANIEL BIANCHI DE OLIVEIRA");
        driver.findElement(By.id("address1")).sendKeys("Cambe");
        driver.findElement(By.id("address2")).sendKeys("Casa");
        driver.findElement(By.id("state")).sendKeys("PR");
        driver.findElement(By.id("city")).sendKeys("Cambé");
        driver.findElement(By.id("zipcode")).sendKeys("86182290");
        driver.findElement(By.id("mobile_number")).sendKeys("43996084541");

    }


    public void clico_registrar() {
        driver.findElement(By.cssSelector(".btn:nth-child(22)")).click();
    }

    public void cadastro_realizado() {
        System.out.println("ACCOUNT CREATED!");
    }

    public void delayPage(int segundos) {
        driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }

    }

