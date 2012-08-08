public class FooMgrTest
{
	@InjectMocks
	private FooMgr fooMgr = new FooMgr();
	@Mock
	private BarMgr mockBarMgr;
	@Mock
	private FooDao mockFooDao;

	@BeforeMethod
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		fooMgr.setBarMgr(mockBarMgr);
		fooMgr.setFooDao(mockFooDao);
	}

	@Test
	public void testLoadOffset()
	{
		when(mockFooDao.getOffSet("SYSTEM")).thenReturn(77);
		assertEquals(77, fooMgr.loadOffset());
	}

	@Test
	public void testLoadOffset_HandleNull()
	{
		when(mockFooDao.getOffSet("SYSTEM")).thenReturn(null);
		assertEquals(0, fooMgr.loadOffset());
	}	

	@Test
	public void testLoadOffset_Exception()
	{
		when(mockFooDao.getOffSet("SYSTEM")).thenThrow(new Exception())
		assertEquals(0, fooMgr.loadOffset());
	}	

}