package processing;

import net.sf.saxon.expr.XPathContext;
import net.sf.saxon.lib.ExtensionFunctionCall;
import net.sf.saxon.lib.ExtensionFunctionDefinition;
import net.sf.saxon.om.Item;
import net.sf.saxon.om.Sequence;
import net.sf.saxon.om.SequenceTool;
import net.sf.saxon.om.StructuredQName;
import net.sf.saxon.trans.XPathException;
import net.sf.saxon.tree.iter.SingletonIterator;
import net.sf.saxon.value.Int64Value;
import net.sf.saxon.value.SequenceType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyExtensionFunction1 extends ExtensionFunctionDefinition {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = LoggerFactory.getLogger(MyExtensionFunction1.class);

	@Override
    public StructuredQName getFunctionQName() {
        return new StructuredQName("", "http://mytest/", "myExtensionFunction1"); 
    }

    @Override
    public int getMinimumNumberOfArguments() {
        return 2;
    }

    @Override
    public int getMaximumNumberOfArguments() {
        return 2;
    }

    @Override
    public SequenceType[] getArgumentTypes() {
        return new SequenceType[] { SequenceType.SINGLE_INTEGER, SequenceType.SINGLE_INTEGER };  
    }

    @Override
    public SequenceType getResultType(SequenceType[] suppliedArgumentTypes) {
    	int resultCardinality = 1;
    	return SequenceType.makeSequenceType(SequenceType.SINGLE_INTEGER.getPrimaryType(), resultCardinality);
    }

    @Override
    public ExtensionFunctionCall makeCallExpression() {
    	return new ExtensionFunctionCall() {
			private static final long serialVersionUID = 1L;

			@Override
	        public Sequence call(XPathContext xPathContext, Sequence[] arguments) throws XPathException {
				// 1st argument (mandatory, index 0)
	            Int64Value arg1 = (Int64Value) arguments[0].iterate().next();
	            int arg1Int = arg1.getDecimalValue().toBigInteger().intValue();
	            LOG.info("1st arg (mandatory): {}", arg1Int);
	
	            // 2nd argument (mandatory, index 1)
	            Int64Value arg2 = (Int64Value) arguments[1].iterate().next();
	            int arg2Int = arg2.getDecimalValue().toBigInteger().intValue();
        		LOG.info("2nd arg (mandatory): {}", arg2Int);
	            
	            // Functionality goes here
	            int resultInt = arg1Int + arg2Int;
	            LOG.info("result: {}", resultInt);
	
	            Item result = new Int64Value(resultInt);
	            return SequenceTool.toLazySequence(SingletonIterator.makeIterator(result));
	        }
		};
    }
	
}