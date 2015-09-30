<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:func="http://mytest/" 
    exclude-result-prefixes="func">

	<xsl:output method="xml" encoding="UTF-8" indent="no" />

	<xsl:template match="/">
		<Test1>
            <xsl:value-of select="func:myExtensionFunction1(1, 2)"/>
        </Test1>
        <Test2>
            <xsl:value-of select="func:myExtensionFunction2('abc', 'cde')"/>
        </Test2>
        <Test3>
            <xsl:value-of select="func:myExtensionFunction2('xyz')"/>
        </Test3>
	</xsl:template>

</xsl:stylesheet>
