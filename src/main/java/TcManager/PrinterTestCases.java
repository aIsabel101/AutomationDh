package TcManager;

import java.util.List;

public class PrinterTestCases {
    public static void printSuiteTestCases(List<TestSuite> suites) {

        for (TestSuite suite :suites) {
            List<TestCase> testcases=suite.getTestCases();
            for (TestCase test:testcases) {
                print(suite, test);

            }
        }

    }

    public static void print(TestSuite suite, TestCase test) {
        System.out.println("-------------------------------");
        System.out.println("Title Suite: "+suite.getSuitName());
        System.out.println("-------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println(test.getTitle());
        System.out.println(test.getDescription());
        System.out.println(test.getOwner().getFirstName() +" "+ (test.getOwner().getLastName()==null? "": test.getOwner().getLastName()));
        System.out.println(test.getPriority());
        System.out.println(test.getStatus());
    }
}
