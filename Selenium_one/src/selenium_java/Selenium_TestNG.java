package selenium_java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Selenium_TestNG {
	  WebDriver mydr;// ����ȫ�ֱ�������������
	      
	    @Test
	    public void testng001() throws InterruptedException {
	      //-----------------------------�������--------------------------------------------------
	    	File file_ie = new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
	         System.setProperty("webdriver.firefox.bin", file_ie.getAbsolutePath());
	          
	        //Ϊ Internet Explorer ���ð�ȫ�Թ���,���������һ����ȫ������ʾ��"Protected Mode must be set to the same value (enabled or disabled) for all zones"
	        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
	       caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	        WebDriver my_dr = new InternetExplorerDriver(caps);// �������
	        //�򿪰ٶ�
	        my_dr.get("www.baidu.com");
	  
	        Thread.sleep(1000);
	       //��λ���ٶȵ������
	        my_dr.findElement(By.id("kw")).sendKeys("G7������ͼ");
	        Thread.sleep(1000);
	        //�������
	       my_dr.findElement(By.id("su")).click();
	          
	        Thread.sleep(1000);
	         //��ӡҳ�����
	         System.out.println(my_dr.getTitle());
	         //��֤ҳ������Ƿ����Ԥ��
	        Assert.assertEquals(my_dr.getTitle(), "G7������ͼ_�ٶ�����");
	        Thread.sleep(5000);
	              
	    }
	    @BeforeMethod
	     public void beforeMethod() {
	         //switchTo��ؿ���д������
	     }
	   
	     @AfterMethod
	    public void afterMethod() {
	      // �л��������ڡ�ģ�Mˢ�����
	    }
	  
	     @BeforeClass
	    public void beforeClass() {
	       //��½��ؿ���д������
	     }
	   
	    @AfterClass
	     public void afterClass() {
	        //������رտ���д������
	    	//mydr.close();
	     }
}
