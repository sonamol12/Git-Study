package testscripts;
import Utilities.ExcelUtility;
import basepackage.BaseClass;
import org.testng.annotations.Test;
import pages.seid.Login;
import java.io.IOException;
public class BaseTestClass  extends BaseClass {
    Login log;



    @Test(description = "Test Case:01")
    public void verifyValidAdminLogin() throws IOException, InterruptedException
    {
        log=new Login(driver);

        //log = new Login(BaseClass.getDriver()); // ✅ Correct usage
        String username= ExcelUtility.getCellData(0, 0);
        String passwd=ExcelUtility.getCellData(0, 1);
        log.setUsername(username);
        log.setPassword(passwd);
        log.setLogin();
        Thread.sleep(2000);
//        String actualResult=log.VerifyLogin();
//        Assert.assertEquals(actualResult, Constant.text3);g
    }

    @Test(description = "Test Case:02")
    public void Print() throws IOException, InterruptedException
    {
        System.out.println("https://www.google.com/");
//        String actualResult=log.VerifyLogin();
//        Assert.assertEquals(actualResult, Constant.text3);
    }
}
