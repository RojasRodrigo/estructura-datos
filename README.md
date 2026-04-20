# Listas Simples en Java

## ¿Qué son las listas simples?
Imagina una cadena de cajas. Cada caja (llamada **Nodo**) guarda dos cosas:
1. Un dato (como un número, por ejemplo, el 10).
2. Una cuerda o flecha que la conecta con la siguiente caja de la cadena.

El último nodo de la cadena no se conecta a nada, simplemente indica que la lista ha terminado apuntando a vacío (`null`).

## ¿Para qué se usan?
Se utilizan para almacenar datos cuando **no sabes exactamente cuántos elementos vas a tener en total**. 

A diferencia de los arreglos (arrays) clásicos, que tienen un tamaño fijo desde el principio, las listas simples pueden crecer o encogerse dinámicamente según lo necesites. Si quieres agregar un dato nuevo, simplemente creas una nueva "caja" y la conectas a la cadena.

## Cómo ejecutar el código

Para correr este programa desde tu consola o terminal, sigue estos 3 sencillos pasos:

**1. Entra a la carpeta donde está tu código:**
Abre tu terminal y navega hasta la carpeta `src` de tu proyecto.
```bash
cd ruta/hacia/tu/carpeta/src
```
**2. Compialr los archivos Java:**
```bash
javac *.java
```

3.**Ejecutar el programa principal**
```bash
java Main
```
