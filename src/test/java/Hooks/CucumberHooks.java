package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setUp()
    {
        System.out.println("Before Hook");
    }
    @After
    public void cleanUp()
    {
        System.out.println("After Hook");
    }
}
