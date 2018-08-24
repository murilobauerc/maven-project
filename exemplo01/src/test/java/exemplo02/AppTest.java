package exemplo02;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
	@Test
	public void sumTest()
	{
		assertEquals(4, App.sum(2, 2));
	}
	
}
