package org.eclipse.bpel.common.ui;

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
	ResourceMarkerDecoratorTest.class,
	PolicyTest.class,
	ImageUtilsTest.class,
	MessagesTest.class,
	ColorUtilsTest.class,
	UtilsTest.class,
	CommonUIPluginTest.class,
	org.eclipse.bpel.common.ui.assist.TestAll.class,
	org.eclipse.bpel.common.ui.calendar.TestAll.class,
	org.eclipse.bpel.common.ui.command.TestAll.class,
	org.eclipse.bpel.common.ui.decorator.TestAll.class,
	org.eclipse.bpel.common.ui.details.TestAll.class,
	org.eclipse.bpel.common.ui.editmodel.TestAll.class,
	org.eclipse.bpel.common.ui.figures.TestAll.class,
	org.eclipse.bpel.common.ui.flatui.TestAll.class,
	org.eclipse.bpel.common.ui.layouts.TestAll.class,
	org.eclipse.bpel.common.ui.markers.TestAll.class,
	org.eclipse.bpel.common.ui.palette.TestAll.class,
	org.eclipse.bpel.common.ui.tray.TestAll.class,
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
