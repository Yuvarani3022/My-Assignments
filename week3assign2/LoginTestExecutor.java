package week3assign2;

public class LoginTestExecutor {
	    public static void main(String[] args) {
	        LoginTestData1 loginTestData1 = new LoginTestData1();
	        loginTestData1.enterCredentials(); // Inherited from Testleaf
	        loginTestData1.navigateToHomePage(); // Inherited from Testleaf
	        loginTestData1.enterUserName(); // Specific to LoginTestData1
	        loginTestData1.enterPassword(); // Specific to LoginTestData1

	        LoginTestData2 loginTestData2 = new LoginTestData2();
	        loginTestData2.enterCredentials(); // Inherited from Testleaf
	        loginTestData2.navigateToHomePage(); // Inherited from Testleaf
	        loginTestData2.enterUserName(); // Specific to LoginTestData2
	        loginTestData2.enterPassword(); // Specific to LoginTestData2
	    }
	}

