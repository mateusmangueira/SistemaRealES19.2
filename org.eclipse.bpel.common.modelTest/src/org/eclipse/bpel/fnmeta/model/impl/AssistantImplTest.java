package org.eclipse.bpel.fnmeta.model.impl;

import java.util.ArrayList;
import javax.imageio.metadata.IIOMetadataNode;
import org.eclipse.bpel.fnmeta.model.Option;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>AssistantImplTest</code> contains tests for the class <code>{@link AssistantImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class AssistantImplTest {
	/**
	 * Run the AssistantImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testAssistantImpl_1()
		throws Exception {

		AssistantImpl result = new AssistantImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getType());
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 2;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEGet_3()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 3;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_5()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_6()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName((String) null);
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 2;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_7()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 3;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_8()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 3;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_9()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType((String) null);
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 3;

		boolean result = fixture.eIsSet(featureID);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testESet_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 1;
		Object newValue = new ArrayList<Option>();

		fixture.eSet(featureID, newValue);

		// add additional test code here
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testESet_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 2;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		// add additional test code here
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testESet_3()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 3;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		// add additional test code here
	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		EClass result = fixture.eStaticClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(4, result.getFeatureCount());
		assertEquals(null, result.getDefaultValue());
		assertEquals("org.eclipse.bpel.fnmeta.model.Assistant", result.getInstanceClassName());
		assertEquals("org.eclipse.bpel.fnmeta.model.Assistant", result.getInstanceTypeName());
		assertEquals(1, result.getClassifierID());
		assertEquals("Assistant", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 1;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 2;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEUnset_3()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		int featureID = 3;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the EList<Option> getOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetOptions_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		EList<Option> result = fixture.getOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Option> getOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetOptions_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		EList<Option> result = fixture.getOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		String newName = "";

		fixture.setName(newName);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetName_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		String newName = "";

		fixture.setName(newName);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		String newType = "";

		fixture.setType(newType);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetType_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;
		String newType = "";

		fixture.setType(newType);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.AssistantImpl@6c948aaf (element: javax.imageio.metadata.IIOMetadataNode@68ab13e5) (name: , type: )", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testToString_2()
		throws Exception {
		AssistantImpl fixture = new AssistantImpl();
		fixture.setName("");
		fixture.setType("");
		fixture.element = new IIOMetadataNode();
		fixture.options = null;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.AssistantImpl@1656a841 (element: javax.imageio.metadata.IIOMetadataNode@12692e53) (name: , type: )", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
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
	 * @generatedBy CodePro at 14/10/19 22:13
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AssistantImplTest.class);
	}
}