package com.abc.test.app;

import org.apache.camel.CamelContext;


public class AppContext {
    private static CamelContext _context;

    public static CamelContext getContext() {
        return _context;
    }

    public static CamelContext InitCamelContext(CamelContext context) {
        _context = context;
        return _context;
    }
}
