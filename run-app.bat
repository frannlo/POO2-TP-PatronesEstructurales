@echo off
REM Script para compilar y ejecutar AppDemo desde escenario-2
REM Configurar JDK 21
set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-21.0.9.10-hotspot
set PATH=%JAVA_HOME%\bin;%PATH%

echo ===================================
echo Compilando escenario-2...
echo ===================================

REM Compilar
javac -d escenario-2\bin escenario-2\src\main\java\ar\universidad\contabilidad\*.java
if %errorlevel% neq 0 (
    echo Error en compilacion.
    exit /b 1
)

echo.
echo ===================================
echo Ejecutando AppDemo...
echo ===================================
echo.

REM Ejecutar
java -cp escenario-2\bin ar.universidad.contabilidad.AppDemo

pause
