import static org.junit.Assert.fail;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestAddress {

	@Rule
	public Timeout timeout = Timeout.seconds(10);

	@Test
	public void testConstructor() {
		try {
			Address address = new Address(
					"123",
					"bangbon 5",
					"bangbon",
					"bangbon",
					"bangkok",
					"",
					"10150",
					"thailand"
					);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		try {
			Address address = new Address(
					"123",
					"bangbon 5",
					"bangbon",
					"bangbon",
					"bangkok",
					"",
					"10150",
					"thailand"
					);
			JSONObject obj = address.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		try {
			Address address = new Address(
					"123",
					"bangbon 5",
					"bangbon",
					"bangbon",
					"bangkok",
					"",
					"10150",
					"thailand"
					);
			System.out.println(address.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
