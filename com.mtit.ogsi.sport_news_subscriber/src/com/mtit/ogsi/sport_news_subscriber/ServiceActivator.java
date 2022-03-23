package com.mtit.ogsi.sport_news_subscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ServiceActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		ServiceActivator.context = bundleContext;
		System.out.println("Start Servicesubscriber");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ServiceActivator.context = null;
		System.out.println("Stop Servicesubscriber");
	}

}
