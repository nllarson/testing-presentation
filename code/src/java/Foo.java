@Bean
public class Foo 
{
	private FooMgr aFooMgr;

	public int addToOffset(int pNumber)
	{
		return pNumber + aFooMgr.loadOffset();
	}

	public void setFooMgr(FooMgr pFooMgr)
	{
		aFooMgr = pFooMgr;
	}
}