package com.mtit.osgi.local_news_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	//Register the service
	ServiceRegistration localNewsPublishServiceRegistration;

	
	//lifecycle methods
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher start");
		ServicePublish publishService = new ServicePublishImpl();
		
		localNewsPublishServiceRegistration = context.registerService(ServicePublish.class.getName(),publishService,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher stop");
		localNewsPublishServiceRegistration.unregister();
	}

}
