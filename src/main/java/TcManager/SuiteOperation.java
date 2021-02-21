package TcManager;

import java.util.ArrayList;
import java.util.List;

public class SuiteOperation {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Sebastiam");
        owner1.setLastName("cv");
        Owner owner2 = new Owner("Isabel");

//Create 2 test suite
        List<TestSuite> suites = new ArrayList<>();
        suites.add(new TestSuite("Register User"));
        suites.add(new TestSuite("Login User"));
//2) Crear 5 Test Cases para cada test suite con su respectivo Owner y mostrar toda la Informacion por consola

        AddToSuit.AddTestCasesToSuit(suites.get(0), "T1 the user can open register form", owner1, "Priority 2");
        AddToSuit.AddTestCasesToSuit(suites.get(0), "T2 User can edit form", owner2);
        AddToSuit.AddTestCasesToSuit(suites.get(0), "T3 User should create a new register", owner1, "Priority 2");
        AddToSuit.AddTestCasesToSuit(suites.get(0), "T4 User should save the register", owner2);
        AddToSuit.AddTestCasesToSuit(suites.get(0), "T5 User can upload an avatar", owner1, "Priority 2");

        AddToSuit.AddTestCasesToSuit(suites.get(1), "T1 User can login with user registed", owner2, "Priority 2");
        AddToSuit.AddTestCasesToSuit(suites.get(1), "T2 User should be login with gmail account", owner2);
        AddToSuit.AddTestCasesToSuit(suites.get(1), "T3 User should be login with facebook account", owner1, "Priority 2");
        AddToSuit.AddTestCasesToSuit(suites.get(1), "T4 User should be login with twiter account", owner2);
        AddToSuit.AddTestCasesToSuit(suites.get(1), "T5 User should not loging with the user is not register", owner1, "Priority 2");
        PrinterTestCases.printSuiteTestCases(suites);

 //Mostrar solo los test cases que pertenescan aun solo owner( filtro por owner)

        FilterBy.filterByOwner(suites, owner1.getFirstName());

// Mostrar solo los test cases que sean de un tipo de prioridad (filtro por prioridad)

        FilterBy.filterByPriority(suites, "Priority 2");





    }
}
