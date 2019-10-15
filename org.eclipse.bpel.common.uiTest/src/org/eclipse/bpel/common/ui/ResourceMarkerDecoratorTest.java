package org.eclipse.bpel.common.ui;

import org.eclipse.jface.viewers.DecorationContext;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.IDecorationContext;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.ui.internal.decorators.DecorationBuilder;
import org.eclipse.ui.internal.decorators.DecoratorManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResourceMarkerDecoratorTest</code> contains tests for the class <code>{@link ResourceMarkerDecorator}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ResourceMarkerDecoratorTest {
	/**
	 * Run the ResourceMarkerDecorator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testResourceMarkerDecorator_1()
		throws Exception {

		ResourceMarkerDecorator result = new ResourceMarkerDecorator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addListener(ILabelProviderListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testAddListener_1()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		ILabelProviderListener listener = new DecoratorManager();

		fixture.addListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_1()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_2()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_3()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_4()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_5()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_6()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void decorate(Object,IDecoration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDecorate_7()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object element = null;
		IDecoration decoration = new DecorationBuilder(DecorationContext.DEFAULT_CONTEXT);

		fixture.decorate(element, decoration);

		// add additional test code here
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();

		fixture.dispose();

		// add additional test code here
	}

	/**
	 * Run the boolean isLabelProperty(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testIsLabelProperty_1()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		Object arg0 = new Object();
		String arg1 = "";

		boolean result = fixture.isLabelProperty(arg0, arg1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void removeListener(ILabelProviderListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRemoveListener_1()
		throws Exception {
		ResourceMarkerDecorator fixture = new ResourceMarkerDecorator();
		ILabelProviderListener listener = new DecoratorManager();

		fixture.removeListener(listener);

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
		new org.junit.runner.JUnitCore().run(ResourceMarkerDecoratorTest.class);
	}
}