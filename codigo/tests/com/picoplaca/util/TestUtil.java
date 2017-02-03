package com.picoplaca.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.picoplaca.exception.GetDigitException;

public class TestUtil {
	
	@Test
	public void shouldPicoPlaca() throws ParseException{
		//Arrange
		final Integer lastDigit = 5;
		final Date myDefaultDate = new SimpleDateFormat( "yyyyMMdd" ).parse( "20170208" );
		final String hora = "17:00";
		Utilitario util = new Utilitario();
		
		//Action
		final Boolean have = util.havePicoPlaca(lastDigit, myDefaultDate, hora);
		
		//Assert
		Assert.assertTrue(have);
	}
	
	@Test
	public void notHavePicoPlaca()throws ParseException{
		//Arrange
		final Integer lastDigit = 5;
		final Date myDefaultDate = new SimpleDateFormat( "yyyyMMdd" ).parse( "20170209" );
		final String hora = "14:00";
		Utilitario util = new Utilitario();
		
		//Action
		final Boolean have = util.havePicoPlaca(lastDigit, myDefaultDate, hora);
		
		//Assert
		Assert.assertFalse(have);
	}
	
	@Test
	public void isTheLastDigit() throws GetDigitException{
		//Arange
		final String plate = new String("PBC4562");
		Utilitario util = new Utilitario();
		
		//Action
		final Integer last = util.digitLast(plate);
		
		//Assert
		Assert.assertEquals(last, Integer.valueOf(2));
	}

}
