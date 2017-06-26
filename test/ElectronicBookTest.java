import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ElectronicBookTest {
	private Author author;
	private ElectronicBook eBook;
	
	@Before
	public void testSetUp()
	{
		author = new Author("Michael", "Jordan", "Raleigh");	
		eBook = new ElectronicBook("Java How to program", author, new Date());
	}
	
	
	@Test
	public void testElectronicBook() 
	{
		assertNotNull(eBook);

	}
	
	@Test
	public void testCalculatePrice()
	{
		//must be one dollar
		assertEquals(1 ,eBook.calculatePrice(), .01);
		
	}

	@Test
	public void testIsTransmitted() 
	{
		
		assertEquals("Transmitted", eBook.isTransmitted());
		
	}
	
	@Test
	public void testGetDateSent()
	{
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd");
		Date date = new Date();
		String date1;
		date1 = ft.format(date);
		
		String date2;
		date = eBook.getDateSent();
		date2 = ft.format(date);
		assertEquals(date1, date2);	
		
	}
	
	@Test
	public void testSetDateSent()
	{
	
		eBook.setDateSent(new Date());
		System.out.println(eBook.getDateSent());
	}

}
