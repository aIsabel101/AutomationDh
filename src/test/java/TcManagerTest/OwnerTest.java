package TcManagerTest;

import TcManager.Owner;
import org.junit.Assert;
import org.junit.Test;

public class OwnerTest {
    @Test
    public void OwnerIsCreatedWithFirstName(){
        Owner owner= new Owner("Isabel");
        Assert.assertEquals(owner.getFirstName(),"Isabel");
    }
    public void OwnerIsCreatedWithLastName(){
        Owner owner= new Owner("Sarzosa");
        Assert.assertEquals(owner.getLastName(),"Sarzosa");
    }
    public void OwnerIsCreatedWithRole(){
        Owner owner= new Owner("QA");
        Assert.assertEquals(owner.getRole(),"QA");
    }



}
