package com.job.hunt.util;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.job.hunt.testbase.TestBase;

public class Util extends TestBase{

	public static void captureSS(String ss) throws Exception {
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./ScreenShots/"+ss+".png"));
		
		
	}
	
	
}
