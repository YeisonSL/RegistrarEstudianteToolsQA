# Automatizacion Llenar Formulario TOOLSQA

Un proyecto donde se ejemplifica el uso del patrón serenity screenplay con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web de TOOLSQA.

Por defecto, los tests corren en Chrome.


# Detalles generales de la implementación

El siguiente proyecto consiste en la automatización de registro de estudiante dentro de la página de compras hhttps://demoqa.com/automation-practice-form, el robot abre el navegador e ingresa a la URL ya mencionada, seguido se digita la información solicitada en el formulario de registro y se realiza una acción de click, para enviar la información, luego se valida si la información se envió correctamente y al final se cierra el navegador.


# Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 5.4.

#  Para correr el proyecto

"gradle clean test aggregate" es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity, dentro encontraremos un archivo llamado index.html