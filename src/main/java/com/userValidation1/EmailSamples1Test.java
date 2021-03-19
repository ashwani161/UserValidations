package com.userValidation1;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailSamples1Test {
	private String sampleMail;
	private boolean expectedResult;
	public EmailSamples1Test(boolean expectedResult,String sampleMail) {
	      this.sampleMail = sampleMail;
	      this.expectedResult=expectedResult;
	   }
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	       return Arrays.asList(new Object[][] { 
	    	   {true, "abc@yahoo.com"},
	    	   {true, "abc-100@yahoo.com"},
	    	   {true,"abc.100@yahoo.com"},
	    	   {true,"abc111@abc.com"},
	    	   {true, "abc-100@abc.net"},
	    	   {true, "abc.100@abc.com.au"},
	    	   {true, "abc@1.com"},
	    	   {true, "abc@gmail.com.com"},
	    	   {true, "abc+100@gmail.com"},
		       //invalid email addresses
	    	   {false, "abc"},
	    	   {false, "abc@.com"},
	    	   {false, "abc123@gmail.a"},
	    	   {false, "abc123@.com"},
	    	   {false, "abc123@.com.com"},
	    	   {false, ".abc@abc.com"},
	    	   {false, "abc()*@gmail.com"},
	    	   {false,"abc@%*.com"},
	    	   {false, "abc..2002@gmail.com"},
	    	   {false, "abc.@gmail.com"},
	    	   {false, "abc@abc@gmail.com"},
	    	   {false, "abc@gmail.com.1a"},
	    	   {false, "abc@gmail.com.aa.au"}
	   });
	   }
	@Test
	   public void testemail() {
	      System.out.println("Parameterized email is : " + sampleMail);
	      Pattern pattern = Pattern.compile("^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9]*[^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.]*[a-z^la]*)$");
	      Matcher matcher = pattern.matcher(sampleMail);
   	   	  System.out.println(sampleMail + " : " + matcher.matches());
   	   	  Assert.assertEquals(matcher.matches(), expectedResult);
	   }
}

