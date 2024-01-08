package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void acessarAplicacao() {
        driver.manage().window().maximize();
        driver.get("https://www.qazando.com.br/curso.html");
        Assert.assertEquals("Não Acessou a aplicação", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void preencheEmail() {

        driver.findElement(By.id("email")).sendKeys("danielalura@gmail.com");
    }

    public void cliqueGanharDesconto() {

        driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
    }

    
}
