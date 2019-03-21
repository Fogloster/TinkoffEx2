package pages;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import test.BaseRunner;

import static org.junit.Assert.assertEquals;

public class EmptyFieldsCheck extends BaseRunner {

@Test
    public void EmptyFieldsCheck() {
        driver.get(baseURL);
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("birthday")).click();
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("phone")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Перетащите или'])[1]/following::span[1]")).click();
        driver.findElement(By.name("socialLink0")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ссылка на ваш профиль в соцсетях или портфолио'])[1]/following::div[6]")).click();
        driver.findElement(By.name("socialLink1")).click();
        driver.findElement(By.cssSelector("svg.ui-icon-checkbox.ui-checkbox__icon")).click();
        driver.findElement(By.cssSelector("svg.ui-icon-checkbox.ui-checkbox__icon > path")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::span[1]")).click();

        assertEquals("Поле обязательное", driver
                .findElement(By.cssSelector("div.Error__errorMessage_q8BBY")).getText());
        assertEquals("Поле обязательное", driver
                .findElement(By.cssSelector(".Row__row_AjrJL:nth-child(2) > .FormField__field_1iwkM:nth-child(1) > .Error__errorMessage_q8BBY")).getText());
        assertEquals("Необходимо указать номер телефона", driver
                .findElement(By.cssSelector(".FormField__field_1iwkM:nth-child(2) > .Error__errorMessage_q8BBY")).getText());
        assertEquals("Поле обязательное", driver
                .findElement(By.cssSelector(".Row__row_AjrJL:nth-child(3) .Error__errorMessage_q8BBY")).getText());
        assertEquals("Поле обязательное", driver
                .findElement(By.cssSelector(".Row__row_AjrJL:nth-child(4) .Error__errorMessage_q8BBY")).getText());
    }


}
