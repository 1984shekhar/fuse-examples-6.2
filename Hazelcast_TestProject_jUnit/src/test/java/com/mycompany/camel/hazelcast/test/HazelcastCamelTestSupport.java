package com.mycompany.camel.hazelcast.test;
import com.hazelcast.core.HazelcastInstance;

import org.apache.camel.CamelContext;
import org.apache.camel.component.hazelcast.HazelcastComponent;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.After;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
public class HazelcastCamelTestSupport extends CamelTestSupport {

    @Mock
    private HazelcastInstance hazelcastInstance;

    @Override
    protected CamelContext createCamelContext() throws Exception {
        MockitoAnnotations.initMocks(this);
        CamelContext context = super.createCamelContext();
        HazelcastComponent hazelcastComponent = new HazelcastComponent(context);
        hazelcastComponent.setHazelcastInstance(hazelcastInstance);
        context.addComponent("hazelcast", hazelcastComponent);
        trainHazelcastInstance(hazelcastInstance);
        return context;
    }

    protected void trainHazelcastInstance(HazelcastInstance hazelcastInstance) {

    }

    protected void verifyHazelcastInstance(HazelcastInstance hazelcastInstance) {

    }

    @After
    public final void verifyHazelcastInstanceMock() {
        verifyHazelcastInstance(hazelcastInstance);
    /*    verifyNoMoreInteractions(hazelcastInstance);*/
    }


}