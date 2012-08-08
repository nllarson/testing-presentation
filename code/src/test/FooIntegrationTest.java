public class FooIntegrationTest extends BaseIntegrationTest
{
	@Autowired
	Foo aFoo;

	@Test
	public void testAddToOffset()
	{
		assertEquals(90, aFoo.addToOffset(10));
	}
	
}