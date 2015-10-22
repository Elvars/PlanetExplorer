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
		
		assertEquals("0,0, N", actualStr);
	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsLeft()
	{
		explorer = new PlanetExplorer(100, 100, "");
		
		explorer.executeCommand("");
		
		actualStr = explorer.executeCommand("l");
		
		assertEquals("0,0, W", actualStr);
	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsRight()
	{
		explorer = new PlanetExplorer(100, 100, "");
		
		explorer.executeCommand("");
		
		actualStr = explorer.executeCommand("r");
		
		assertEquals("0,0, E", actualStr);
	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsRightTwoTimes()
	{
		explorer = new PlanetExplorer(100, 100, "");
		
		explorer.executeCommand("");
		
		explorer.executeCommand("r");
		actualStr = explorer.executeCommand("r");
		
		assertEquals("0,0, S", actualStr);
	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsRightMovesForward()
	{
		explorer = new PlanetExplorer(100, 100, "");
		explorer.executeCommand("");
		explorer.executeCommand("r");
		
		actualStr = explorer.executeCommand("f");
		
		assertEquals("1,0, E", actualStr);

	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsRightTwoTimesMovesForward()
	{
		explorer = new PlanetExplorer(100, 100, "");
		explorer.executeCommand("");
		explorer.executeCommand("r");
		explorer.executeCommand("r");
		
		actualStr = explorer.executeCommand("f");
		
		assertEquals("0,1, S", actualStr);

	}
	
	@Test
	public void planetCreatedExplorerLandedTurnsRightTwoTimesMovesForwardMovesBackward()
	{
		explorer = new PlanetExplorer(100, 100, "");
		explorer.executeCommand("");
		explorer.executeCommand("r");
		explorer.executeCommand("r");
		
		explorer.executeCommand("f");
		actualStr = explorer.executeCommand("b");
		
		assertEquals("0,0, S", actualStr);

	}
}
