# Utref - Diseño y Arquitectura

## Descripcion
1. El proposito de la aplicación es calcular la serie fibonacci a partir de un número que provee el usuario.
2. La aplicación se ejecuta por linea de comando

## Pre Requisitos
Tener instalado el runtime de Java

## Como ejecutar la aplicación
1. Descargar el proyecto o el archivo "fibo.jar"
2. Abrir una ventana de comando en la ubicación del archivo fibo.jar
3. Ejecutar el siguiente comando java -jar fibo &lt;print-mode&gt; &lt;serie-number&gt; (ej. java -jar -o=vd 8)
&lt;print-mode&gt; inidica los posibles formatos de impresión (vd, vi, hd, hi)
&lt;serie-number&gt; es el número sobre el cual se calculará la serie de Fibonacci

## Integración Continua
Se configuró Github Actions. Con cada push a Master y Pull Request se hace un build, se corren los tests (unitarios y de aceptación) y se hace un control estátido de código contra Sonar Cloud.
