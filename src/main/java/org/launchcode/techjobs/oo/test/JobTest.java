package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

@Test
    public void testSettingJobId() {
        Job testJob = new Job();
        Job anotherTestJob = new Job();
        assertNotEquals(testJob.getId(), anotherTestJob.getId());
    }

@Test
    public void testJobConstructorSetsAllFields() {
        Job testJobForConstructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJobForConstructor.getName());
        assertEquals("ACME", testJobForConstructor.getEmployer().toString());
        assertEquals("Desert", testJobForConstructor.getLocation().toString());
        assertEquals("Quality control", testJobForConstructor.getPositionType().toString());
        assertEquals("Persistence", testJobForConstructor.getCoreCompetency().toString());
        assertTrue(testJobForConstructor.getName() instanceof String);
        assertTrue(testJobForConstructor.getEmployer() instanceof Employer);
        assertTrue(testJobForConstructor.getLocation() instanceof Location);
        assertTrue(testJobForConstructor.getPositionType() instanceof PositionType);
        assertTrue(testJobForConstructor.getCoreCompetency() instanceof CoreCompetency);
    }

@Test
    public void testJobsForEquality() {
        Job testJobForEquals = new Job("Mr. Manager", new Employer("Banana Stand"), new Location("Newport Beach"), new PositionType("Sales"), new CoreCompetency("Honesty"));
        Job anotherTestJobForEquals = new Job("Mr. Manager", new Employer("Banana Stand"), new Location("Newport Beach"), new PositionType("Sales"), new CoreCompetency("Honesty"));
        assertFalse(testJobForEquals.equals(anotherTestJobForEquals));
    }
}
