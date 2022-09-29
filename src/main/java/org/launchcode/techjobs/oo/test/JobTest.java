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

    Job job1 =
            new Job("Product tester",
                    new Employer("ACME"),
                    new Location("Desert"),
                    new PositionType("Quality control"),
                    new CoreCompetency("Persistence"));

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1 instanceof Job);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Product tester", job1.getName());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job jobOne = new Job();
        Job jobTwo = new Job();

        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertEquals('\n', job1.toString().charAt(0));
        assertEquals('\n', job1.toString().charAt(job1.toString().length()-1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String expected = "\nID: " + job1.getId() + '\n' +
                "Name: " + job1.getName() + '\n' +
                "Employer: " + job1.getEmployer() + '\n' +
                "Location: " + job1.getLocation() + '\n' +
                "Position Type: " + job1.getPositionType() + '\n' +
                "Core Competency: " + job1.getCoreCompetency() + '\n';
        assertEquals(expected, job1.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job blankJob = new Job();
        String expected = "\nID: " + blankJob.getId() + '\n' +
                "Name: Data not available" + '\n' +
                "Employer: Data not available" + '\n' +
                "Location: Data not available" + '\n' +
                "Position Type: Data not available" + '\n' +
                "Core Competency: Data not available" + '\n';
        assertEquals(expected, blankJob.toString());
    }

    }
//ID:  _______
//        Name: _______
//        Employer: _______
//        Location: _______
//        Position Type: _______
//        Core Competency: _______