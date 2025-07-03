- ¿Qué pasa si se envía una clase que **no hereda** de `Mascota`?
Respuesta: el programa no me va a dejar compilar o me va a mostrar un error.
- ¿Cómo se comporta si eliminas el `instanceof` y casteas directamente?
Respuesta: Si yo quito el instanceof y hago el cast directo, por ejemplo pongo (Perro) m, y resulta que m no es un perro (por ejemplo es un gato), el programa me va a tirar un error en tiempo de ejecución. Esto se llama ClassCastException.
Por eso es importante usar instanceof primero, porque me ayuda a revisar si el objeto realmente es de ese tipo antes de convertirlo y así evito que el programa se caiga.
1. ¿Qué modificadores son accesibles desde una subclase en otro paquete?
Respuesta: los modificadores public y protected solo si es una subclase o si es atreves de una herencia 
2. ¿Qué modificadores permiten acceder desde cualquier clase del mismo paquete?
Respuesta: Los modificadores public, protected y default.
3. ¿Qué pasaría si todos los atributos fueran `public`?
Respuesta: se podría tener acceso a la información desde cualquier clase y paquetes sin restricciones.
