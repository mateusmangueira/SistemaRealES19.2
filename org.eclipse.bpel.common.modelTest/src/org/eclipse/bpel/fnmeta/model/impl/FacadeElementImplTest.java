package org.eclipse.bpel.fnmeta.model.impl;

import javax.imageio.metadata.IIOMetadataNode;
import org.eclipse.emf.ecore.EClass;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>FacadeElementImplTest</code> contains tests for the class <code>{@link FacadeElementImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:12
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FacadeElementImplTest {
	/**
	 * Run the FacadeElementImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFacadeElementImpl_1()
		throws Exception {

		FacadeElementImpl result = new FacadeElementImpl();

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
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		int featureID = 0;
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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		int featureID = 0;

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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		int featureID = 0;

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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement((Element) null);
		int featureID = 0;

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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		int featureID = 0;
		Object newValue = new IIOMetadataNode();

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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());

		EClass result = fixture.eStaticClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(1, result.getFeatureCount());
		assertEquals(null, result.getDefaultValue());
		assertEquals("org.eclipse.bpel.fnmeta.model.FacadeElement", result.getInstanceClassName());
		assertEquals("org.eclipse.bpel.fnmeta.model.FacadeElement", result.getInstanceTypeName());
		assertEquals(5, result.getClassifierID());
		assertEquals("FacadeElement", result.getName());
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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		int featureID = 0;

		fixture.eUnset(featureID);

		// add additional test code here
	}

	/**
	 * Run the Element getElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetElement_1()
		throws Exception {
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());

		Element result = fixture.getElement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTagName());
		assertEquals(false, result.hasAttributes());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getFirstChild());
		assertEquals(null, result.getLastChild());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getNextSibling());
		assertEquals(null, result.getNodeName());
		assertEquals((short) 1, result.getNodeType());
		assertEquals(null, result.getNodeValue());
		assertEquals(null, result.getOwnerDocument());
		assertEquals(null, result.getParentNode());
		assertEquals(null, result.getPreviousSibling());
		assertEquals(false, result.hasChildNodes());
		assertEquals(null, result.getLocalName());
	}

	/**
	 * Run the void setElement(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetElement_1()
		throws Exception {
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		Element newElement = new IIOMetadataNode();

		fixture.setElement(newElement);

		// add additional test code here
	}

	/**
	 * Run the void setElement(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetElement_2()
		throws Exception {
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());
		Element newElement = new IIOMetadataNode();

		fixture.setElement(newElement);

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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.FacadeElementImpl@658516f1 (element: javax.imageio.metadata.IIOMetadataNode@61ba9e99)", result);
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
		FacadeElementImpl fixture = new FacadeElementImpl();
		fixture.setElement(new IIOMetadataNode());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.fnmeta.model.impl.FacadeElementImpl@3bd8628b (element: javax.imageio.metadata.IIOMetadataNode@3fe7e128)", result);
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
		new org.junit.runner.JUnitCore().run(FacadeElementImplTest.class);
	}
}