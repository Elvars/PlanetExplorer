package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	PlanetExplorer explorer;
	
	@Test
	public void planetCreator100x100()
	{
		explorer = new PlanetExplorer(100,100,"");
	}
	
	
	@Test
	public void planetCreatedExplorerLands()
	{
		explorer = new PlanetExplorer(100, 100, "");
		
		explorer.executeCommand("");
		
	}
}
