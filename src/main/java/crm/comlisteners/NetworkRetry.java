package crm.comlisteners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NetworkRetry implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int start = 0,end=3;
	
			if(start<end)
			{
				start++;
				return true;
			}

		return false;
	}

	
	

}
}


