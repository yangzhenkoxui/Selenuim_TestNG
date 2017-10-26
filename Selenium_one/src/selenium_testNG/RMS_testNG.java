package selenium_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class RMS_testNG {
	WebDriver mydr;// 申明全局变量关闭浏览器用。。。。。
  @Test
  public void f() throws InterruptedException {
	  //加载浏览器
	  //File file_ie = new File("C:/Program Files (x86)/Google/chrome64_55.0.2883.75/chromedriver.exe");
	  //System.setProperty("webdriver.ie.driver", file_ie.getAbsolutePath());
	  //WebDriver dr = new ChromeDriver();
	   mydr = new FirefoxDriver();
	 
/*	 打开首页找登录，失败 
 *  dr.get("https://www.yinxiang.com/");
 *  Thread.sleep(1000);
 *  dr.findElement(By.xpath(".//*[@id='create-account']/div/p/a")).click();
 */
	   	

	  /**打开登录页**/
	   mydr.get("https://app.yinxiang.com/Login.action?targetUrl=%2FHome.action");
	  Thread.sleep(100);	//等待打开网页  
      /**定位到用户名，输入用户名**/
	  mydr.findElement(By.xpath(".//*[@id='username']")).sendKeys("616200636@qq.com");
      Thread.sleep(1000);
      /**点击“继续”，显示出输入密码框**/
      mydr.findElement(By.xpath(".//*[@id='loginButton']")).click();
      Thread.sleep(1000);  //等待显示密码框
      /**定位到密码框，输入密码**/
      mydr.findElement(By.xpath(".//*[@id='password']")).sendKeys("zhenning1228");
      Thread.sleep(1000);
      /**点击登录**/
      mydr.findElement(By.xpath(".//*[@id='loginButton']")).click();
      Thread.sleep(10000);
      /**切换frame**/
      //mydr.switchTo().parentFrame();
      //mydr.switchTo().frame("entinymce_485_ifr");
      //Thread.sleep(1000);
      //mydr.switchTo().frame("FocusClientMessages");
      
      /**点击添加笔记**/
      mydr.findElement(By.xpath(".//*[@id='gwt-debug-Sidebar-newNoteButton-container']/div[1]/div/img[2]")).click();
      Thread.sleep(1000);
      
      /**输入笔记标题**/
      mydr.findElement(By.xpath(".//*[@id='gwt-debug-NoteTitleView-textBox']")).sendKeys("对啊！！！这就是自动化啊！！！");
      Thread.sleep(5000);
      /**输入笔记内容**/
      mydr.findElement(By.xpath(".//*[@id='gwt-debug-NoteContentView-root']/div[1]/div/div/div[2]/input")).click();
      Thread.sleep(1000);
      //mydr.switchTo().frame("entinymce_485_ifr");
      //Thread.sleep(1000);
      //mydr.findElement(By.xpath(".//*[@id='gwt-debug-NoteContentView-root']/div[1]/div/div/div[2]/input")).sendKeys("里程碑似的成功，进行下一步了！！！");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	   //关闭浏览器
	  //mydr.close();
  }

}
