package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateTotalSummTest {


	@Test
	public void test() {
		assertEquals(true, Start.calculateTotalSumm(30, 8)==2.4);
	}

}
