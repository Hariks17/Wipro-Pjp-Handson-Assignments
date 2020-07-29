package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestStringConcat {

	@Test
	void test() {
		DailyTasks dailytasks=new DailyTasks();
		int expected[]={1,2,3,4,5};
		int userinput[]={5,2,1,4,3};
		assertEquals("Hariharan",dailytasks.doStringConcat("Hari","haran"));
		assertArrayEquals(expected,dailytasks.sortValues(userinput));
		assertTrue(dailytasks.checkPresence("hari", "hari"));
		
	}

}
