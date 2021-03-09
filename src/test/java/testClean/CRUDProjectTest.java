package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.CenterSection;
import pomPages.todoLy.LeftSection;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import singletonSession.Session;

public class CRUDProjectTest extends  TestBaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_create_project_todoly() throws InterruptedException {
        String name="CleanProject";
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();

        this.waitOnSecond(2);
        Assert.assertEquals("ERROR !!Projecto No Creado",name, centerSection.projectNameLabel.getText());

        leftSection.clickOnProject(name);
        leftSection.projectMenuButton.click();
        leftSection.editOption.click();

        name="CleanProjectUpdated";
        leftSection.editNameProjectTextBox.set(name);
        leftSection.saveOption.click();

        this.waitOnSecond(2);
        Assert.assertEquals("ERROR !!Projecto No Actualizado",name, centerSection.projectNameLabel.getText());

        leftSection.clickOnProject(name);
        leftSection.projectMenuButton.click();
        leftSection.deleteOption.click();

        Session.getSession().getDriver().switchTo().alert().accept();

        this.waitOnSecond(2);
        Assert.assertFalse("Projecto No fue Borrado",name.equals(leftSection.lastProjectInListLabel.getText()));


    }




}
