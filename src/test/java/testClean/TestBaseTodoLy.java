package testClean;

import com.sun.org.apache.xalan.internal.xslt.Process;
import org.junit.After;
import org.junit.Before;
import singletonSession.Session;

import java.io.IOException;

public class TestBaseTodoLy {
    @Before
    public void open(){
        Session.getSession().getDriver().get("http://todo.ly/");
    }

    @After
    public void close() throws IOException {
       Session.getSession().closeSession();
       // solo para windows
       this.killChromeDriver();
    }

    public void waitOnSecond(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

    //TASKKILL /F /IM chromedriver.exe /T
    public void killChromeDriver() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

}
