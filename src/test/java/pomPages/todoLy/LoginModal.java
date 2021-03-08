package pomPages.todoLy;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxPassword']"));
    public Button loginButton= new Button(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$ButtonLogin']"));

    public LoginModal(){}

}
