package TcManager;

import java.util.Map;

public class TestCase {
    private String title;
    private String priority;
    private String description;
    private Owner owner;
    private Map<Integer, String> steps;
    private String expectedResult;
    private String status;

    public TestCase(String title) {
        title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public Owner getOwner() {
        return owner;
    }

    public Map<Integer, String> getSteps() {
        return steps;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getStatus() {
        return status;
    }

    private TestCase(TestCaseBuilder testCaseBuilder) {
        this.title = testCaseBuilder.title;
        this.priority = testCaseBuilder.priority;
        this.description = testCaseBuilder.description;
        this.owner = testCaseBuilder.owner;
        this.steps = testCaseBuilder.steps;
        this.expectedResult = testCaseBuilder.expectResult;
        this.status = testCaseBuilder.status;

    }

    public static class TestCaseBuilder {
        private String title;
        private String priority;
        private String description;
        private Owner owner;
        private Map<Integer, String> steps;
        private String expectResult;
        private String status;


        public TestCaseBuilder(String title) {
            this.title = title;
            setPriority("Priority 1");

        }
        public TestCaseBuilder setPriority(String priority){
            this.priority=priority;
            return this;
        }

        public TestCaseBuilder setDescription(String description){
            this.description=description;
            return this;
        }

        public TestCaseBuilder setOwner(Owner owner){
            this.owner=owner;
            return this;
        }

        public TestCaseBuilder setSteps(Map<Integer, String>steps){
            this.steps=steps;
            return this;
        }

        public TestCaseBuilder setExpectResult(String expectResult){
            this.expectResult=expectResult;
            return this;
        }

        public TestCaseBuilder setStatus(String status){
            this.status=status;
            return this;
        }
        public TestCase build(){
            TestCase test= new TestCase(this);
            validateData(test);
            return test;
        }
        private void validateData(TestCase test){
            test.description=test.description==null ? "Description is empty" : test.description;
            test.expectedResult=test.expectedResult==null ? "Expect result is empty" : test.expectedResult;
            test.status=test.status==null ? "Status is empty" : test.status;


        }
    }

}

