package com.mtit.osgi.local_news_subscriber;

import com.mtit.osgi.local_news_publisher.ServicePublish;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ServiceActivator implements BundleActivator {

	//implement the service reference to refer the service.
	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {		
		//refer the service
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish)context.getService(serviceReference);
		System.out.println(servicePublish.localNewsPublishService());
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye");
		/* detach the service */
		context.ungetService(serviceReference);
	}

}
