package com.requirements;

import net.thucydides.core.annotations.Feature;
import net.thucydides.junit.annotations.UseTestDataFrom;


public class Application {
	
   @Feature
    public class Login {
        public class LogIn {}    
    }
   
   @Feature
   public class Logout {
       public class LogOut {}   
   }
	
   @UseTestDataFrom("users.cvs")
   public class LogIn_param
   {
	   public class LogIn_p {}    
   }

	
	
}