package org.eclipse.bpel.common.ui.palette;

import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PaletteCategoryTest</code> contains tests for the class <code>{@link PaletteCategory}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class PaletteCategoryTest {
	/**
	 * Run the PaletteCategory(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testPaletteCategory_1()
		throws Exception {
		String label = "";

		PaletteCategory result = new PaletteCategory(label);

		// add additional test code here
		assertNotNull(result);
		assertEquals(10, result.getOrder());
		assertEquals("bpel.user", result.getCategoryId());
		assertEquals(null, result.getDefaultTool());
		assertEquals(false, result.isInitiallyPinned());
		assertEquals(0, result.getInitialState());
		assertEquals("Palette_type_Unknown", result.getDrawerType());
		assertEquals(true, result.isInitiallyOpen());
		assertEquals(true, result.showDefaultIcon());
		assertEquals("Palette Container ()", result.toString());
		assertEquals(null, result.getParent());
		assertEquals("", result.getId());
		assertEquals("$Palette Drawer", result.getType());
		assertEquals("", result.getLabel());
		assertEquals(null, result.getDescription());
		assertEquals(true, result.isVisible());
		assertEquals(7, result.getUserModificationPermission());
		assertEquals(null, result.getLargeIcon());
		assertEquals(null, result.getSmallIcon());
	}

	/**
	 * Run the PaletteCategory(String,ImageDescriptor) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testPaletteCategory_2()
		throws Exception {
		String label = "";
		ImageDescriptor icon = ImageDescriptor.getMissingImageDescriptor();

		PaletteCategory result = new PaletteCategory(label, icon);

		// add additional test code here
		assertNotNull(result);
		assertEquals(10, result.getOrder());
		assertEquals("bpel.user", result.getCategoryId());
		assertEquals(null, result.getDefaultTool());
		assertEquals(false, result.isInitiallyPinned());
		assertEquals(0, result.getInitialState());
		assertEquals("Palette_type_Unknown", result.getDrawerType());
		assertEquals(true, result.isInitiallyOpen());
		assertEquals(true, result.showDefaultIcon());
		assertEquals("Palette Container ()", result.toString());
		assertEquals(null, result.getParent());
		assertEquals("", result.getId());
		assertEquals("$Palette Drawer", result.getType());
		assertEquals("", result.getLabel());
		assertEquals(null, result.getDescription());
		assertEquals(true, result.isVisible());
		assertEquals(7, result.getUserModificationPermission());
		assertEquals(null, result.getLargeIcon());
	}

	/**
	 * Run the String getCategoryId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetCategoryId_1()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool(new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor()));
		fixture.setOrder(1);

		String result = fixture.getCategoryId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the ToolEntry getDefaultTool() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetDefaultTool_1()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool(new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor()));
		fixture.setOrder(1);

		ToolEntry result = fixture.getDefaultTool();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Palette Entry ()", result.toString());
		assertEquals(null, result.getParent());
		assertEquals("", result.getId());
		assertEquals("$Palette Tool", result.getType());
		assertEquals("", result.getLabel());
		assertEquals("", result.getDescription());
		assertEquals(true, result.isVisible());
		assertEquals(15, result.getUserModificationPermission());
	}

	/**
	 * Run the ToolEntry getDefaultTool() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetDefaultTool_2()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool((ToolEntry) null);
		fixture.setOrder(1);

		ToolEntry result = fixture.getDefaultTool();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ToolEntry getDefaultTool() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetDefaultTool_3()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool((ToolEntry) null);
		fixture.setOrder(1);

		ToolEntry result = fixture.getDefaultTool();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetOrder_1()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool(new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor()));
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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSetCategoryId_1()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool(new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor()));
		fixture.setOrder(1);
		String aCategoryId = "";

		fixture.setCategoryId(aCategoryId);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultTool(ToolEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSetDefaultTool_1()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool(new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor()));
		fixture.setOrder(1);
		ToolEntry entry = new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor());

		fixture.setDefaultTool(entry);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSetOrder_1()
		throws Exception {
		PaletteCategory fixture = new PaletteCategory("");
		fixture.setCategoryId("");
		fixture.setDefaultTool(new CreationToolEntry("", "", (CreationFactory) null, ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor()));
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
	 * @generatedBy CodePro at 14/10/19 22:31
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
	 * @generatedBy CodePro at 14/10/19 22:31
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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PaletteCategoryTest.class);
	}
}