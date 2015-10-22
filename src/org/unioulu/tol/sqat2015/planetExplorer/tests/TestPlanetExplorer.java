package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	PlanetExplorer explorer;
	String actualStr;
	
	@Test
	public void planetCreator100x100()
	{
		explorer = new PlanetExplorer(100,100,"");
	}
	
	
	@Test
	public void planetCreatedExplorerLands()
	{
		explorer = new PlanetExplorer(100, 100, "");
		
		actualStr = explorer.executeCommand("");
		
		assertEquals("The explorer has landed", actualStr);
	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsLeft()
	{
		explorer = new PlanetExplorer(100, 100, "");
		
		explorer.executeCommand("");
		
		actualStr = explorer.executeCommand("l");
		
		assertEquals("Turned left", actualStr);
	}
}
