package org.eclipse.bpel.fnmeta.model.impl;

import java.util.ArrayList;
import javax.imageio.metadata.IIOMetadataNode;
import org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl;
import org.eclipse.bpel.common.extension.model.notify.impl.ExtensionModelNotificationImpl;
import org.eclipse.bpel.fnmeta.model.Argument;
import org.eclipse.bpel.fnmeta.model.Assistant;
import org.eclipse.bpel.fnmeta.model.Function;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>RegistryImplTest</code> contains tests for the class <code>{@link RegistryImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class RegistryImplTest {
	/**
	 * Run the RegistryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testRegistryImpl_1()
		throws Exception {

		RegistryImpl result = new RegistryImpl();

		// add additional test code here
		assertNotNull(result);
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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 3;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEInverseRemove_1()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		InternalEObject otherEnd = new ExtensionmodelFactoryImpl();
		int featureID = 1;
		NotificationChain msgs = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
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
	public void testEIsSet_5()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
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
	public void testEIsSet_6()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 3;

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
	public void testEIsSet_8()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 3;

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
	public void testEIsSet_9()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 1;
		Object newValue = new ArrayList<Function>();

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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 2;
		Object newValue = new ArrayList<Function>();

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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 3;
		Object newValue = new ArrayList<Function>();

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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EClass result = fixture.eStaticClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(4, result.getFeatureCount());
		assertEquals(null, result.getDefaultValue());
		assertEquals("org.eclipse.bpel.fnmeta.model.Registry", result.getInstanceClassName());
		assertEquals("org.eclipse.bpel.fnmeta.model.Registry", result.getInstanceTypeName());
		assertEquals(0, result.getClassifierID());
		assertEquals("Registry", result.getName());
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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
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
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();
		int featureID = 3;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the EList<Argument> getArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetArguments_1()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EList<Argument> result = fixture.getArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Argument> getArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetArguments_2()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EList<Argument> result = fixture.getArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Assistant> getAssistants() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistants_1()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EList<Assistant> result = fixture.getAssistants();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Assistant> getAssistants() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistants_2()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EList<Assistant> result = fixture.getAssistants();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Function> getFunctions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetFunctions_1()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EList<Function> result = fixture.getFunctions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Function> getFunctions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetFunctions_2()
		throws Exception {
		RegistryImpl fixture = new RegistryImpl();
		fixture.arguments = null;
		fixture.functions = null;
		fixture.assistants = null;
		fixture.element = new IIOMetadataNode();

		EList<Function> result = fixture.getFunctions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(RegistryImplTest.class);
	}
}