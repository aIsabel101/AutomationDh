package TcManager;

import java.util.ArrayList;
import java.util.List;

public class TestSuite<testCase> {
    private String suitName;
    private List<TestCase> testCases;

    public TestSuite(String suitName) {
            this.suitName = suitName;
            testCases=new ArrayList<>();

    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(TestCase testCase) {
        testCases.add(testCase);

    }
}

