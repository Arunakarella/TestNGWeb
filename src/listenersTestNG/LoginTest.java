package listenersTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest {
  @Test
  void LoginbyEmail() {
	  System.out.println("Login by Email");
	 Assert.assertEquals("pavan","pavan");	 
  }
  
  @Test
  void LoginbyFacebook() {
	  System.out.println("Login by facebook");
	  Assert.assertEquals("pavan","kumar");
  }
  
  @Test(enabled=false)
   void LoginbyGmail() {
	  System.out.println("Login by Gmail");
	  Assert.assertEquals("english", "english");
  }
  }
