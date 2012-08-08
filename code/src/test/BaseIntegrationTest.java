@ContextConfiguration("applicationContext-test.xml")
@TransactionConfiguration(transactionManager = "transactionManager")
public abstract class BaseIntegrationTest extends AbstractTransactionalTestNGSpringContextTests
{

	@BeforeClass
	public void insertTestData() throws Exception
	{
		FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
		builder.setColumnSensing(true);

		DatabaseOperation.CLEAN_INSERT.execute(getConnection("ldbDataSource"), builder.build(new File(data.xml);
	}
		
}