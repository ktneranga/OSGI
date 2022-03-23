package com.mtit.osgi.sport_news_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ServiceActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		ServiceActivator.context = bundleContext;
		System.out.println("Start Servicepublisher");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ServiceActivator.context = null;
		System.out.println("Stop Servicepublisher");
	}

}
