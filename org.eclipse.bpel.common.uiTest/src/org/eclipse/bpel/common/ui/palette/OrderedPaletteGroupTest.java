package org.eclipse.bpel.common.ui.palette;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderedPaletteGroupTest</code> contains tests for the class <code>{@link OrderedPaletteGroup}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:29
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class OrderedPaletteGroupTest {
	/**
	 * Run the OrderedPaletteGroup(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testOrderedPaletteGroup_1()
		throws Exception {
		String label = "";

		OrderedPaletteGroup result = new OrderedPaletteGroup(label);

		// add additional test code here
		assertNotNull(result);
		assertEquals(100, result.getOrder());
		assertEquals("group.default", result.getCategoryId());
		assertEquals("Palette Container ()", result.toString());
		assertEquals(null, result.getParent());
		assertEquals("", result.getId());
		assertEquals("Palette_Group", result.getType());
		assertEquals("", result.getLabel());
		assertEquals(null, result.getDescription());
		assertEquals(true, result.isVisible());
		assertEquals(null, result.getLargeIcon());
		assertEquals(null, result.getSmallIcon());
		assertEquals(1, result.getUserModificationPermission());
	}

	/**
	 * Run the String getCategoryId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetCategoryId_1()
		throws Exception {
		OrderedPaletteGroup fixture = new OrderedPaletteGroup("");
		fixture.setCategoryId("");
		fixture.setOrder(1);

		String result = fixture.getCategoryId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetOrder_1()
		throws Exception {
		OrderedPaletteGroup fixture = new OrderedPaletteGroup("");
		fixture.setCategoryId("");
		fixture.setOrder(1);

		int result = fixture.getOrder();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setCategoryId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetCategoryId_1()
		throws Exception {
		OrderedPaletteGroup fixture = new OrderedPaletteGroup("");
		fixture.setCategoryId("");
		fixture.setOrder(1);
		String aCategoryId = "";

		fixture.setCategoryId(aCategoryId);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetOrder_1()
		throws Exception {
		OrderedPaletteGroup fixture = new OrderedPaletteGroup("");
		fixture.setCategoryId("");
		fixture.setOrder(1);
		int anOrder = 1;

		fixture.setOrder(anOrder);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderedPaletteGroupTest.class);
	}
}