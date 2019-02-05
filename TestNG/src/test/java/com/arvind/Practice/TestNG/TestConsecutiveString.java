package com.arvind.Practice.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.arvind.Practice.TestNG.*;
import org.testng.*;

public class TestConsecutiveString {
	
ConsecutiveString obj = new ConsecutiveString();
	
	@Test
	public void testConsecutiveString()
	{
		ConsecutiveString obj = new ConsecutiveString();
		
		ArrayList<String> actualConsecutiveLetter = new ArrayList<String>();
		ArrayList<String> expectedConsecutiveLetter = new ArrayList<String>();
		
		actualConsecutiveLetter.add("Hello");
		actualConsecutiveLetter.add("Apple");
		actualConsecutiveLetter.add("Qainfotech");
		actualConsecutiveLetter.add("Accv");
		
		expectedConsecutiveLetter.add("Hello");
		expectedConsecutiveLetter.add("Apple");
		expectedConsecutiveLetter.add("Accv");
		
		ArrayList<String> actualConsecutiveLetterResult = obj.getConsecutiveString(actualConsecutiveLetter);
		System.out.println("dfjfn");
//		assertEquals(expectedConsecutiveLetter, actualConsecutiveLetterResult);
		AssertJUnit.assertEquals(expectedConsecutiveLetter, actualConsecutiveLetterResult);
		
		
	}

}
