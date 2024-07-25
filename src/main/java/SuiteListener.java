import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

public class SuiteListener implements ISuiteListener {

    @BeforeSuite
    public void beforeSuite(ITestContext context) {
        String suiteFile = context.getSuite().getXmlSuite().getFileName();
        System.out.println("XML Suite file used: " + suiteFile);
    }

    @Override
    public void onStart(ISuite suite) {
        // Do nothing
    }

    @Override
    public void onFinish(ISuite suite) {
        // Do nothing
    }
}
