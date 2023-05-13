package Git;

import org.openqa.selenium.edge.*;
public class Hub {

	public static void main(String[] args) {
		 var driver = new EdgeDriver();
         try
         {
             driver.Url = "https://bing.com";

             var element = driver.FindElement(By.Id("sb_form_q"));
             element.SendKeys("WebDriver");
             element.Submit();

             Thread.Sleep(5000);
         }
         finally
         {
             driver.Quit();
	}

}
