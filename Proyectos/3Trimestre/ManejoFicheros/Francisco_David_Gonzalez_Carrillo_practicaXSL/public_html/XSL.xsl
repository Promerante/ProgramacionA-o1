<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : FraGon.xsl
    Created on : 12 de abril de 2024, 15:16
    Author     : MEDAC Tarde
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>FraGon.xsl</title>
                <link rel="stylesheet" type="text/css" href="desguacecss-1.css" />
            </head>
            <body>
                <h1>Ejercicio 1</h1>
                <table>
                    <tr>
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Año</th>
                        <th>Color</th>
                        <th>Precio</th>
                        <th>Estado</th>
                    </tr>
                    <xsl:apply-templates select="//vehiculo" mode="tabla"/>
                </table>
                <h1>Ejercicio 2</h1>
                <xsl:for-each select='//vehiculo'>
                    <h2> Piezas para <xsl:value-of select="marca"/> <xsl:value-of select="modelo"/></h2>
                    <table>
                    <tr>
                        <th>id Pieza</th>
                        <th>nombre</th>
                        <th>tipo</th>
                        <th>descripción</th>
                        <th>precio</th>
                        <th>Estado</th>
                    </tr>
                    <xsl:apply-templates select="piezas/pieza" mode="tabla"/>
                    </table>
                </xsl:for-each>  
                
                <h1>Ejercicio 3</h1>
                <ul>
                    <xsl:apply-templates select="//vehiculo[estado_vehiculo='Usado']" mode="lista"/>
                </ul>
                
                
                <h1>Ejercicio 4</h1>
                <table>
                    <tr>
                        <th>Vehiculo</th>
                        <th>Total Precios Plazas</th>
                    </tr>
                    <xsl:apply-templates select="//vehiculo" mode="suma"/>
                </table>
                
                <h1>ejercicio 5</h1>
                
                <ul>
                    <xsl:apply-templates select="//pieza[estado='nueva']" mode= "lista"/> 
                </ul>
            </body>   
        </html>
    </xsl:template>
    
    
    
    
    <xsl:template match="//vehiculo" mode="tabla">
        <tr>
        <td><xsl:value-of select="marca"/></td>
        <td><xsl:value-of select="modelo"/></td>
        <td><xsl:value-of select="anio"/></td>
        <td><xsl:value-of select="color"/></td>
        <td><xsl:value-of select="precio_vehiculo"/></td>
        <td><xsl:value-of select="estado_vehiculo"/></td>
        </tr>
    </xsl:template>  
     
    <xsl:template match="//vehiculo" mode="lista">
        <li>
            <xsl:value-of select="marca"/> <xsl:text> </xsl:text> <xsl:value-of select="modelo"/>
        </li>    
    
    </xsl:template>
  
    <xsl:template match="//vehiculo" mode="suma">
        <tr>
            <td>
                <xsl:value-of select="marca"/> 
                <xsl:text> </xsl:text> 
                <xsl:value-of select="modelo"/>
            </td>
            <td><xsl:value-of select="sum(piezas/pieza/precio)"/></td>
        </tr>
    </xsl:template>
     
    <xsl:template match="pieza" mode="tabla">
        <tr>
            <td><xsl:value-of select="@id"/></td>
            <td><xsl:value-of select="nombre"/></td>
            <td><xsl:value-of select="tipo"/></td>
            <td><xsl:value-of select="descripcion"/></td>
            <td><xsl:value-of select="precio"/></td>
            <td><xsl:value-of select="estado"/></td>
        </tr>
    </xsl:template>
    
    
    <xsl:template match="//pieza" mode= "lista">
        <li><xsl:value-of select="nombre"/></li>
    </xsl:template>
        
    

</xsl:stylesheet>
