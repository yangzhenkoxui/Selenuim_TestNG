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
	WebDriver mydr;// ����ȫ�ֱ����ر�������á���������
  @Test
  public void f() throws InterruptedException {
	  //���������
	  //File file_ie = new File("C:/Program Files (x86)/Google/chrome64_55.0.2883.75/chromedriver.exe");
	  //System.setProperty("webdriver.ie.driver", file_ie.getAbsolutePath());
	  //WebDriver dr = new ChromeDriver();
	   mydr = new FirefoxDriver();
	 
/*	 ����ҳ�ҵ�¼��ʧ�� 
 *  dr.get("https://www.yinxiang.com/");
 *  Thread.sleep(1000);
 *  dr.findElement(By.xpath(".//*[@id='create-account']/div/p/a")).click();
 */
	   	

	  /**�򿪵�¼ҳ**/
	   mydr.get("https://app.yinxiang.com/Login.action?targetUrl=%2FHome.action");
	  Thread.sleep(100);	//�ȴ�����ҳ  
      /**��λ���û����������û���**/
	  mydr.findElement(By.xpath(".//*[@id='username']")).sendKeys("616200636@qq.com");
      Thread.sleep(1000);
      /**���������������ʾ�����������**/
      mydr.findElement(By.xpath(".//*[@id='loginButton']")).click();
      Thread.sleep(1000);  //�ȴ���ʾ�����
      /**��λ���������������**/
      mydr.findElement(By.xpath(".//*[@id='password']")).sendKeys("zhenning1228");
      Thread.sleep(1000);
      /**�����¼**/
      mydr.findElement(By.xpath(".//*[@id='loginButton']")).click();
      Thread.sleep(10000);
      /**�л�frame**/
      //mydr.switchTo().parentFrame();
      //mydr.switchTo().frame("entinymce_485_ifr");
      //Thread.sleep(1000);
      //mydr.switchTo().frame("FocusClientMessages");
      
      /**�����ӱʼ�**/
      mydr.findElement(By.xpath(".//*[@id='gwt-debug-Sidebar-newNoteButton-container']/div[1]/div/img[2]")).click();
      Thread.sleep(1000);
      
      /**����ʼǱ���**/
      mydr.findElement(By.xpath(".//*[@id='gwt-debug-NoteTitleView-textBox']")).sendKeys("�԰�������������Զ�����������");
      Thread.sleep(5000);
      /**����ʼ�����**/
      mydr.findElement(By.xpath(".//*[@id='gwt-debug-NoteContentView-root']/div[1]/div/div/div[2]/input")).click();
      Thread.sleep(1000);
      //mydr.switchTo().frame("entinymce_485_ifr");
      //Thread.sleep(1000);
      //mydr.findElement(By.xpath(".//*[@id='gwt-debug-NoteContentView-root']/div[1]/div/div/div[2]/input")).sendKeys("��̱��Ƶĳɹ���������һ���ˣ�����");
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
	   //�ر������
	  //mydr.close();
  }

}
