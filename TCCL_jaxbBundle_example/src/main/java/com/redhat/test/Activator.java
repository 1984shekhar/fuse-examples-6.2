package com.redhat.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        ClassLoader cl = Activator.class.getClassLoader();
        Thread.currentThread().setContextClassLoader(cl);
    }

    public void stop(BundleContext context) throws Exception {
        // do nothing here
    }
}
