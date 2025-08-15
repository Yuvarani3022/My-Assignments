package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

		List<String> companyList = new ArrayList<>();
		Collections.addAll(companyList, companies);

		// Sort in ascending order
		Collections.sort(companyList);

		// Print in reverse order
		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.println(companyList.get(i));
		}
	}
}