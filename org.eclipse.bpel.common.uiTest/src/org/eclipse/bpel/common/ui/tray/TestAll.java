package org.eclipse.bpel.common.ui.tray;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AddChildInTrayActionTest.class,
	TrayScrollPaneLayoutTest.class,
	TrayScrollBarTest.class,
	TraySelectionEditPolicyTest.class,
	TraySelectionHandleTest.class,
	AdaptingSelectionProviderTest.class,
	TrayMarkerDecoratorTest.class,
	TrayCategoryEntryEditPartDirectEditManagerTest.class,
	TrayCategoryEntryFigureTest.class,
	TrayKeyHandlerTest.class,
	MainTrayEditPartTest.class,
	TrayAccessibleEditPartTest.class,
	SelectionBorderFigureTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
