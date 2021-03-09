package pomPages.todoLy;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public Button addNewProjectButton= new Button(By.xpath("//td[contains(.,'Add New Project') and @class='ProjItemContent']"));
    public Button addButton= new Button(By.xpath("//input[@id='NewProjNameButton']"));
    public TextBox nameProjectTextBox= new TextBox(By.xpath("//input[@id='NewProjNameInput']"));

    public Button projectMenuButton= new Button(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
    public Button editOption= new Button(By.xpath("//ul[@id='projectContextMenu']//a[contains(.,'Edit')]"));
    public Button saveOption= new Button(By.xpath("//li//div[@id='ProjectEditDiv']/*[@id=\"ItemEditSubmit\"]"));
    public TextBox editNameProjectTextBox= new TextBox(By.id("ItemEditTextbox"));
    public Button deleteOption = new Button(By.xpath("//ul[@id='projectContextMenu']//a[contains(.,'Delete')]"));

    public Label lastProjectInListLabel= new Label(By.xpath("//div[@id=\"ProjectListPlaceHolder\"]//li[last()]"));

    public LeftSection(){

    }

    public void clickOnProject(String nameProject){
        Label projectInList= new Label(By.xpath("//li[last()]//td[contains(.,'"+nameProject+"') and @class='ProjItemContent']"));
        projectInList.click();
    }

}
