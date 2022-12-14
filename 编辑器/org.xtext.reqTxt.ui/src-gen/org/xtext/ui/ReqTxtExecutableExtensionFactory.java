/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.reqTxt.ui.internal.ReqTxtActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReqTxtExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ReqTxtActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ReqTxtActivator activator = ReqTxtActivator.getInstance();
		return activator != null ? activator.getInjector(ReqTxtActivator.ORG_XTEXT_REQTXT) : null;
	}

}
