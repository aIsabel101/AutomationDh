package TcManagerTest;

import TcManager.Owner;
import TcManager.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestCaseManager {
    @Test
    public void mandatoryFields(){
        String title= "First Test Case";
        TestCase testMandatory= new TestCase.TestCaseBuilder(title).build();
        Assert.assertEquals(testMandatory.getTitle(), title);
        Assert.assertEquals(testMandatory.getPriority(),"Priority 1");
        Assert.assertEquals(testMandatory.getOwner(),null);
        Assert.assertEquals(testMandatory.getDescription(),"Description is empty");
        Assert.assertEquals(testMandatory.getSteps(),null);
        Assert.assertEquals(testMandatory.getStatus(),"Status is empty");

         }
         @Test
    public void TestCaseisCreatedwithSetPriotiry(){
             String title = "Test case Number 2";
             String priority = "Priority 3";
             TestCase test1 = new TestCase.TestCaseBuilder(title)
                     .setPriority(priority)
                     .build();
             Assert.assertEquals(test1.getPriority(), priority);

         }

    @Test
    public void TestCaseisCreatedwithOwner(){
        String title = "Test case Number 1";
        Owner owner = new Owner("Isabel");
        owner.setLastName("Sarzosa");
        owner.setRole("QA");
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setOwner(owner)
                .build();
        Assert.assertEquals(test1.getOwner().getFirstName(), "Isabel");
        Assert.assertEquals(test1.getOwner().getLastName(), "Sarzosa");
        Assert.assertEquals(test1.getOwner().getRole(), "QA");

    }
    @Test
    public void TestCaseisCreatedwithDescription(){
        String title = "Test case Number 1";
        String description = "It is a description for testing";

        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setDescription(description)
                .build();
        Assert.assertEquals(test1.getDescription(), description);

    }


    @Test
    public void TestCaseisCreatedwithStep(){
        String title = "Test case Number 1";
        Map<Integer,String> steps= new HashMap<Integer, String>();
        steps.put(1,"Step 001");
        steps.put(2,"Step 002");
        steps.put(3,"Step 003");
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setSteps(steps)
                .build();
        Assert.assertEquals(test1.getSteps().get(1), "Step 001");
        Assert.assertEquals(test1.getSteps().get(2), "Step 002");
        Assert.assertEquals(test1.getSteps().get(3), "Step 003");

    }

    @Test
    public void TestCaseisCreatedwithExpectResult(){
        String title = "Test case Number 1";
        String expectedResult= "Verify the test case";
        TestCase test1 = new TestCase.TestCaseBuilder(title)

                .setExpectResult(expectedResult)
                .build();
        Assert.assertEquals(test1.getExpectedResult(), "Verify the test case");

    }


    public void TestCaseisCreatedwithStatus(){
        String title = "Test case Number 1";
        String status="Inprogress";
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setStatus(status)
                .build();
        Assert.assertEquals(test1.getStatus(), "Inprogress");

    }


}
