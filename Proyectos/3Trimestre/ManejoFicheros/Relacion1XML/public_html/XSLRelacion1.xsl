<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
        <html>
            <head>
                <title>Listar todos los nombres 1</title>
            </head>
            <body>
                <h2>Mostrar los ciclos formativos de grado superior:</h2>
                    <ul>
                    <xsl:apply-templates select="ies/ciclos/ciclo[grado='Superior']/nombre"/>
                    
                    </ul>

            </body>
        </html>


</xsl:stylesheet>
