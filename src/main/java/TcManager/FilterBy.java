package TcManager;

import java.util.List;

public class FilterBy {
    public static void filterByOwner(List<TestSuite> suites, String owner) {

        for (TestSuite suite : suites) {
            List<TestCase> testcases = suite.getTestCases();
            for (int i = 0; i < testcases.size(); i++) {
                TestCase test = testcases.get(i);
                if (test.getOwner().getFirstName().equals(owner))
                    PrinterTestCases.print(suite, test);
            }
            {


            }
        }

    }


    public static void filterByPriority(List<TestSuite> suites, String priority) {
        for (TestSuite suite : suites) {
            List<TestCase> testcases = suite.getTestCases();
            int i = 0;
            while (i < testcases.size()) {
                TestCase test = testcases.get(i);
                if (test.getPriority().equals(priority))
                    PrinterTestCases.print(suite, test);

               i++;
            }
            {


            }
        }

    }
}
