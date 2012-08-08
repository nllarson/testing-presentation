public class FooTest
{
	@InjectMocks
	private Foo foo = new Foo();
	@Mock
	private FooMgr mockFooMgr;

	@BeforeMethod
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		foo.setFooMgr(mockFooMgr);
	}

	@Test
	public void testAddToOffset_OffsetIs100()
	{
		when(mockFooMgr.loadOffset()).thenReturn(100);
		int answer = foo.addToOffset(4);
		assertEquals(104, answer);
	}	

	@Test
	public void testAddToOffset_OffsetIs0()
	{
		when(mockFooMgr.loadOffset()).thenReturn(0);
		int answer = foo.addToOffset(4);
		assertEquals(4, answer);
		verify(mockFooMgr, times(1)).loadOffset();
	}		

	@Test
	public void testAddToOffset_MultipleCalls()
	{
		when(mockFooMgr.loadOffset()).thenReturn(1).thenReturn(2).thenReturn(3);
		assertEquals(4, foo.addToOffset(4);
		assertEquals(42, foo.addToOffset(40);
		assertEquals(58, foo.addToOffset(55);
		assertEquals(9, foo.addToOffset(6);
		verify(mockFooMgr, times(4)).loadOffset();
	}			
}	 