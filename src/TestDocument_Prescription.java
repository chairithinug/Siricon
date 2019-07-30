import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.UUID;

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
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testAddMed() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testAddMeds() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
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
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
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
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
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
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
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
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
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
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			System.out.println(p.countMeds());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testFindMed() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			System.out.println(p.findMed("Paracetamol"));
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testGetMed() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			System.out.println(p.getMed(2));
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testDuplicateList() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			System.out.println(p.duplicateList().toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			p.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		printTest();
		try {
			Prescription p = new Prescription("Z Zebra", 1, UUID.randomUUID().toString());
			p.addMed("Paracetamol");
			p.addMeds(new ArrayList<String>() {
				{
					add("Chlorpheniramine");
					add("Aspirin");
				}
			});
			System.out.println(p.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}
	
	public void printTest() {
		System.out.print(testName.getMethodName() + ": ");
	}
}
