package selenium_java;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class runasjavaapplication {
	public static void main(String[] args) {
		//�򿪻�������,������������̫��
		//WebDriver my_driver = new FirefoxDriver();
		//�������������
		File my_driver = new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		System.setProperty("webdriver.ie.driver", my_driver.getAbsolutePath());
		//�������
		WebDriver my_dr = new InternetExplorerDriver();
		
		//Object my_dr = System.getProperty("webdriver.ie.driver");
		my_dr.get("http://www.baidu.com");
		
	}

}
