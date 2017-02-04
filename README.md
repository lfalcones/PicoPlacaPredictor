# PicoPlacaPredictor
Proyecto que notifica si tienes pico y placa de acuerdo a cadenas de carácteres

Este proyecto es un "Java Project"

El código fuente se encuentra en la carpeta "codigo"
* Herramientas utilizadas
	Eclipse Luna/Jboss Studio (Puede utilizarse cualquier Eclipse que permita insertar el JDK 1.8)
	Apache Ant (para construir el archivo jar)
	
* Requerimientos
	Jdk 1.8 Mínimo (Desarrollo y ejecución)
	Eclipse Luna Mínimo (Desarrollo)
	Apache Ant (Desarrollo)
	

-----------------------Crear archivo ".jar" con Apacha Ant-----------------------------------
Prerequisito:
	Tener configurado Apache Ant
	
1.- Abrir una consola de línea de comandos y colocarse en el directorio raíz del proyecto
     
	   #>cd \PicoPlacaPredictor\codigo 
	   
2.- Luego ejecutar la siguiente sentencia
       \PicoPlacaPredictor\codigo#> ant -buildfile projectBuilder.xml
	   
3.- El archivo "PicoPlacaPredictor.jar" se genera dentro del directorio "codigo"

-----------------Ejecución de archivos ".jar" si no tiene configurado Apache Ant ---------------

Para su ejecución se crearon archivos ".jar" los cuales se encuentran en la carpeta "executable"

* Ejecutar los ".jar"
  - Abrir una consola de línea de comandos 
  - En la ventana de línea de comando ejecutar :
  
		(Si tiene configuradao el JAVA_HOME)
		
	    #>  java -jar C:\PicoPlacaPredictor\executable\PicoPlacaPredictor.jar
		
		(Si no tiene configurado el JAVA_HOME, pero si instalado el JDK 1.8)
		
		\Java\jdk1.8.0_40\bin> java -jar C:\PicoPlacaPredictor\executable\PicoPlacaPredictor.jar

		


	

	
