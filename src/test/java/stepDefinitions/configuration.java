package stepDefinitions;

import pages.googlePage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class configuration {
	
	public static void getProperties() {

		try {
			Properties prop = new Properties();
			String ProjectPath=System.getProperty("user.dir");
			InputStream input=new FileInputStream(ProjectPath+"/src/test/resources/config.properties");
			prop.load(input);
			steps.browser=prop.getProperty("browser");
			googlePage.url= prop.getProperty("url");

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
