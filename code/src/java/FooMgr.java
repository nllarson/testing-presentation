@Service
public class FooMgr 
{
	private BarMgr aBarMgr;
	private FooDao aFooDao;

	public int loadOffset()
	{
		Integer offset;
		try 
		{
			offset = aFooDao.getOffset("SYSTEM");
		}
		catch (Exception e)
		{
			offset = null;
		}

		return offset != null ? offset : 0;
	}

	public void setBarMgr(BarMgr pBarMgr)
	{
		aBarMgr = pBarMgr;
	}

	public void setFooDao(FooDao pFooDao)
	{
		aFooDao = pFooDao;
	}	
}