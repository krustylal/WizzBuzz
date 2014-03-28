package fr.epsi.TestWizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TestwizzBuzz extends TestCase {
	
	@Test
	public void testGetResultNonMultipleTroisOuCinq() {
		
		WizzBuzz monWizBuzz = new WizzBuzz();
		
		assertEquals("Doit retourner le chiffre lui même.", "1", monWizBuzz.getResult(1));
	}
	
	@Test
	public void testGetResultMultipleTrois() {
		
		WizzBuzz monWizBuzz = new WizzBuzz();
		
		assertEquals("Doit retourner Wiz.", "Wiz", monWizBuzz.getResult(3));
	}
	
	@Test
	public void testGetResultMultipleCinq() {
		
		WizzBuzz monWizBuzz = new WizzBuzz();
		
		assertEquals("Doit retourner Buzz.", "Buzz", monWizBuzz.getResult(5));
	}
	
	@Test
	public void testGetResultMultipleTroisEtCinq() {
		
		WizzBuzz monWizBuzz = new WizzBuzz();
		
		assertEquals("Doit retourner WizBuzz.", "WizBuzz", monWizBuzz.getResult(30));
	}

}
