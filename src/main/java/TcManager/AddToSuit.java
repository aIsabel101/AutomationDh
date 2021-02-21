package TcManager;

public class AddToSuit {
    public static void AddTestCasesToSuit(TestSuite testSuite, String title, Owner owner1, String s) {
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setOwner(owner1)
                .setPriority(s)
                .build();
        testSuite.setTestCases(test1);
    }
    public static void AddTestCasesToSuit(TestSuite testSuite, String title, Owner owner1) {
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setOwner(owner1)
                .build();
        testSuite.setTestCases(test1);
    }
}
