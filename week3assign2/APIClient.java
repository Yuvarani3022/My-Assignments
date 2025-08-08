package week3assign2;

public class APIClient {
	// Overloaded method 1 - accepts one parameter
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint: " + endpoint);
	}

	// Overloaded method 2 - accepts three parameters
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending request to endpoint: " + endpoint);
		System.out.println("Request Body: " + requestBody);
		System.out.println("Request Status: " + (requestStatus ? "Success" : "Failure"));
	}

	// Main method to test overloading
	public static void main(String[] args) {
		// Create object of APIClient
		APIClient client = new APIClient();

		// Call the first overloaded method
		client.sendRequest("https://api.testleaf.com/data");

		System.out.println("-----------------------------");

		// Call the second overloaded method
		client.sendRequest(
				"https://api.testleaf.com/data",
				"{ \"name\": \"Yuvarani\", \"course\": \"Java\" }",
				true
				);
	}
}