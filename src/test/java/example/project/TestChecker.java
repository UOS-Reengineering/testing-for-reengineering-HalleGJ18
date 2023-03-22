package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import example.project.domain.Scenario;
import example.project.domain.SimulationResult;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestChecker {

    @Test
    public void testCheckCollisionViolations()
    {
        // setup
//        Simulator simulator = new Simulator("dummy");
//        Scenario scenario = new Scenario();
//
//        // testing target
//        Checker checker = new Checker(simulator);
//        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
//        assertEquals(false, isCollision);

        Simulator simulator = mock();
        Scenario scenario = new Scenario();
        when(simulator.run(scenario)).thenReturn(new SimulationResult());

        Checker checker = new Checker(simulator);
        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
        assertEquals(false, isCollision);


    }

}