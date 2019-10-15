package org.eclipse.bpel.fnmeta.model.impl;

import javax.imageio.metadata.IIOMetadataNode;
import org.eclipse.bpel.fnmeta.model.Assistant;
import org.eclipse.bpel.fnmeta.model.Optionality;
import org.eclipse.bpel.fnmeta.model.proxy.AssistantProxy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ArgumentImplTest</code> contains tests for the class <code>{@link ArgumentImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ArgumentImplTest {
	/**
	 * Run the ArgumentImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testArgumentImpl_1()
		throws Exception {

		ArgumentImpl result = new ArgumentImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getType());
		assertEquals("", result.getDefaultValue());
		assertEquals(null, result.getComment());
		assertEquals(false, result.isSetOptionality());
		assertEquals(null, result.getAssistant());
		assertEquals(null, result.basicGetAssistant());
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
	 * Run the Assistant basicGetAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testBasicGetAssistant_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Assistant result = fixture.basicGetAssistant();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getType());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(true, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 3;
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
	public void testEGet_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 4;
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
	public void testEGet_5()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 5;
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
	public void testEGet_6()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 6;
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
	public void testEGet_7()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 6;
		boolean resolve = false;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
	public void testEIsSet_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
	public void testEIsSet_5()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = false;
		fixture.optionality = Optionality.OPTIONAL;
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
	public void testEIsSet_6()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 4;

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
	public void testEIsSet_7()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 4;

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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType((String) null);
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 4;

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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 5;

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
	public void testEIsSet_10()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 5;

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
	public void testEIsSet_11()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment((String) null);
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 5;

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
	public void testEIsSet_12()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 6;

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
	public void testEIsSet_13()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant((Assistant) null);
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 6;

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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testESet_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 3;
		Object newValue = new Object();

		fixture.eSet(featureID, newValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.eclipse.bpel.fnmeta.model.Optionality
		//       at org.eclipse.bpel.fnmeta.model.impl.ArgumentImpl.eSet(ArgumentImpl.java:386)
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testESet_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 4;
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
	public void testESet_5()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 5;
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
	public void testESet_6()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 6;
		Object newValue = new AssistantProxy(URI.createFileURI(""), "");

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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		EClass result = fixture.eStaticClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(7, result.getFeatureCount());
		assertEquals(null, result.getDefaultValue());
		assertEquals("org.eclipse.bpel.fnmeta.model.Argument", result.getInstanceClassName());
		assertEquals("org.eclipse.bpel.fnmeta.model.Argument", result.getInstanceTypeName());
		assertEquals(3, result.getClassifierID());
		assertEquals("Argument", result.getName());
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 3;

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
	public void testEUnset_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 4;

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
	public void testEUnset_5()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 5;

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
	public void testEUnset_6()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		int featureID = 6;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the Assistant getAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistant_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Assistant result = fixture.getAssistant();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getType());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(true, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Assistant getAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistant_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Assistant result = fixture.getAssistant();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getType());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(true, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Assistant getAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistant_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Assistant result = fixture.getAssistant();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getType());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(true, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Assistant getAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistant_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant((Assistant) null);
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Assistant result = fixture.getAssistant();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Assistant getAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetAssistant_5()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Assistant result = fixture.getAssistant();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getType());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(true, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the String getComment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetComment_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.getComment();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetDefaultValue_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals("", result);
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Optionality getOptionality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetOptionality_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		Optionality result = fixture.getOptionality();

		// add additional test code here
		assertNotNull(result);
		assertEquals("?", result.toString());
		assertEquals("Optional", result.getName());
		assertEquals(1, result.getValue());
		assertEquals("?", result.getLiteral());
		assertEquals("OPTIONAL", result.name());
		assertEquals(1, result.ordinal());
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isSetOptionality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testIsSetOptionality_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		boolean result = fixture.isSetOptionality();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSetOptionality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testIsSetOptionality_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = false;
		fixture.optionality = Optionality.OPTIONAL;

		boolean result = fixture.isSetOptionality();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAssistant(Assistant) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetAssistant_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		Assistant newAssistant = new AssistantProxy(URI.createFileURI(""), "");

		fixture.setAssistant(newAssistant);

		// add additional test code here
	}

	/**
	 * Run the void setAssistant(Assistant) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetAssistant_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		Assistant newAssistant = new AssistantProxy(URI.createFileURI(""), "");

		fixture.setAssistant(newAssistant);

		// add additional test code here
	}

	/**
	 * Run the void setComment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetComment_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		String newComment = "";

		fixture.setComment(newComment);

		// add additional test code here
	}

	/**
	 * Run the void setComment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetComment_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		String newComment = "";

		fixture.setComment(newComment);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetDefaultValue_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		String newDefaultValue = "";

		fixture.setDefaultValue(newDefaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetDefaultValue_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		String newDefaultValue = "";

		fixture.setDefaultValue(newDefaultValue);

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
	public void testSetName_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		String newName = "";

		fixture.setName(newName);

		// add additional test code here
	}

	/**
	 * Run the void setOptionality(Optionality) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetOptionality_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		Optionality newOptionality = Optionality.OPTIONAL;

		fixture.setOptionality(newOptionality);

		// add additional test code here
	}

	/**
	 * Run the void setOptionality(Optionality) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetOptionality_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		Optionality newOptionality = null;

		fixture.setOptionality(newOptionality);

		// add additional test code here
	}

	/**
	 * Run the void setOptionality(Optionality) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetOptionality_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		Optionality newOptionality = Optionality.OPTIONAL;

		fixture.setOptionality(newOptionality);

		// add additional test code here
	}

	/**
	 * Run the void setOptionality(Optionality) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetOptionality_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
		Optionality newOptionality = null;

		fixture.setOptionality(newOptionality);

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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.ArgumentImpl@3cca11c8 (element: javax.imageio.metadata.IIOMetadataNode@38f59289) (defaultValue: , name: , optionality: ?, type: , comment: )", result);
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = false;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.ArgumentImpl@580463a1 (element: javax.imageio.metadata.IIOMetadataNode@5c3bec79) (defaultValue: , name: , optionality: <unset>, type: , comment: )", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testToString_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.ArgumentImpl@47af1ca5 (element: javax.imageio.metadata.IIOMetadataNode@43908088) (defaultValue: , name: , optionality: ?, type: , comment: )", result);
	}

	/**
	 * Run the void unsetOptionality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testUnsetOptionality_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		fixture.unsetOptionality();

		// add additional test code here
	}

	/**
	 * Run the void unsetOptionality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testUnsetOptionality_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.setName("");
		fixture.setDefaultValue("");
		fixture.setType("");
		fixture.setAssistant(new AssistantProxy(URI.createFileURI(""), ""));
		fixture.setComment("");
		fixture.element = new IIOMetadataNode();
		fixture.optionalityESet = true;
		fixture.optionality = Optionality.OPTIONAL;

		fixture.unsetOptionality();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ArgumentImplTest.class);
	}
}