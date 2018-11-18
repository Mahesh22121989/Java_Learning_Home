/**
 * 
 */
package dec2;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

/**
 * @author acer
 *
 */
public class Listeners implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcase started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("testcase onstarted");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("testcase onfinish");
		
	}
	
	
	@Test
	public void m1()
	{
		int a=5;
		
		int c= a++ + ++a + a++;
		System.out.println(a);
		System.out.println(c);
		Assert.assertTrue(false);
		if(a==c)
		{
			
		}
	}

}
