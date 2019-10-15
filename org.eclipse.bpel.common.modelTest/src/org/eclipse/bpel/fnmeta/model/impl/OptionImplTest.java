package org.eclipse.bpel.fnmeta.model.impl;

import javax.imageio.metadata.IIOMetadataNode;
import org.eclipse.emf.ecore.EClass;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>OptionImplTest</code> contains tests for the class <code>{@link OptionImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:12
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class OptionImplTest {
	/**
	 * Run the OptionImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testOptionImpl_1()
		throws Exception {

		OptionImpl result = new OptionImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getDisplayValue());
		assertEquals(null, result.getElement());
		assertEquals(0, result.eContainerFeatureID());
		assertEquals(null, result.eInternalContainer());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(null, result.eInternalResource());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eDirectResource());
		assertEquals(null, result.eProxyURI());
		assertEquals(null, result.eStore());
		assertEquals(false, result.eNotificationRequired());
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 1;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 2;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 1;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 1;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue((String) null);
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 1;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 2;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_5()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 2;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_6()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue((String) null);
		fixture.element = new IIOMetadataNode();
		int featureID = 2;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testESet_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 1;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		// add additional test code here
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testESet_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 2;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		// add additional test code here
	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();

		EClass result = fixture.eStaticClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(3, result.getFeatureCount());
		assertEquals(null, result.getDefaultValue());
		assertEquals("org.eclipse.bpel.fnmeta.model.Option", result.getInstanceClassName());
		assertEquals("org.eclipse.bpel.fnmeta.model.Option", result.getInstanceTypeName());
		assertEquals(2, result.getClassifierID());
		assertEquals("Option", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 1;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		int featureID = 2;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the String getDisplayValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetDisplayValue_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();

		String result = fixture.getDisplayValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setDisplayValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetDisplayValue_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		String newDisplayValue = "";

		fixture.setDisplayValue(newDisplayValue);

		// add additional test code here
	}

	/**
	 * Run the void setDisplayValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetDisplayValue_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		String newDisplayValue = "";

		fixture.setDisplayValue(newDisplayValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		String newValue = "";

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();
		String newValue = "";

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testToString_1()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.OptionImpl@3cda760d (element: javax.imageio.metadata.IIOMetadataNode@38e5f54e) (value: , displayValue: )", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testToString_2()
		throws Exception {
		OptionImpl fixture = new OptionImpl();
		fixture.setValue("");
		fixture.setDisplayValue("");
		fixture.element = new IIOMetadataNode();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.OptionImpl@7cb73840 (element: javax.imageio.metadata.IIOMetadataNode@7888a30e) (value: , displayValue: )", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
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
	 * @generatedBy CodePro at 14/10/19 22:12
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
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OptionImplTest.class);
	}
}