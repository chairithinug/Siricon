import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

public class TestDocument_Prescription extends TestName {

	@Rule
	public Timeout timeout = Timeout.seconds(10);
	@Rule
	public TestName testName = new TestName();

	@Test
	public void testPresciption() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testAddMed() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
			p.addMed("Paracetamol");
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testAddMeds() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
			p.addMeds(new ArrayList<String>() {
				{
					add("Paracetamol");
					add("Aspirin");
				}
			});
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testGetList() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			ArrayList<String> list = p.getList();
			System.out.println(list.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testClearList() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			p.clearList();
			System.out.println(p.getList().toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testRemoveMed() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			p.removeMed("Aspirin");
			System.out.println(p.getList().toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testRemoveMeds() {
		System.out.println(testName.getMethodName());
		try {
			Prescription p = new Prescription();
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			p.removeMeds(new ArrayList<String>() {
				{
					add("Paracetamol");
					add("Aspirin");
				}
			});
			System.out.println(p.getList().toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testCountMeds() {
		System.out.println(testName.getMethodName());
	}

	@Test
	public void testFindMed() {
		System.out.println(testName.getMethodName());
	}

	@Test
	public void testGetMed() {
		System.out.println(testName.getMethodName());
	}

	@Test
	public void testDuplicateList() {
		System.out.println(testName.getMethodName());
	}

	@Test
	public void testToJSON() {
		System.out.println(testName.getMethodName());
	}

	@Test
	public void testToString() {
		System.out.println(testName.getMethodName());
	}
}
