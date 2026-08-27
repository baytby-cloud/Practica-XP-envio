Baytby Love
Historia de usuario

Como cliente de una tienda en línea,

quiero conocer el costo de envío de mi pedido,

para conocer el monto total antes de comprar.

Reglas de negocio
Importe del pedido	Costo de envío
Menos de $500	$100
$500 - $999.99	$50
$1,000 o más	Gratis
Paso 1: Definición de pruebas

Se definieron pruebas para comprobar las reglas de negocio y los valores frontera.

Pedido de $400 → envío de $100.
Pedido de $499.99 → envío de $100.
Pedido de $500.00 → envío de $50.
Pedido de $700 → envío de $50.
Pedido de $999.99 → envío de $50.
Pedido de $1,000.00 → envío gratis.
Pedido de $1,200 → envío gratis.
Casos frontera

Los valores frontera identificados fueron:

$499.99 → $100 de envío.
$500.00 → $50 de envío.
$999.99 → $50 de envío.
$1,000.00 → $0 de envío.

Estos casos permiten comprobar que el cambio de tarifa ocurre exactamente en los límites establecidos.

Paso 2: TDD - Red

Primero se escribieron las pruebas antes de implementar la función de cálculo.

Las pruebas inicialmente fallaron porque la clase y el método necesarios todavía no estaban implementados.

Se realizó un commit con las pruebas iniciales:

TDD Red: agregar pruebas de costo de envio

Paso 3: TDD - Green

Después se implementó la solución mínima necesaria para que las pruebas fueran exitosas.

La función calcular() utiliza las reglas de negocio para determinar el costo de envío.

Las pruebas fueron ejecutadas nuevamente y todas resultaron exitosas.

Se realizó un commit:

TDD Green: implementar calculo de costo de envio

Cambio de roles

Al ser una práctica individual, el cambio de roles de Driver y Navigator se simuló revisando el código después de escribir las pruebas y posteriormente implementando la solución.

Paso 4: Refactoring

Después de comprobar que las pruebas funcionaban correctamente, se mejoró la estructura del código.

Se utilizaron constantes para representar los límites y costos de envío, evitando números mágicos y haciendo el código más fácil de leer y mantener.

Las pruebas se ejecutaron nuevamente después del refactoring y continuaron funcionando correctamente.

Commit realizado:

Refactor: mejorar legibilidad del calculo de envio

Paso 5: Cambio del cliente
Nuevo requerimiento

Los clientes Premium siempre tienen envío gratuito.

Nueva prueba

Se agregó una prueba para comprobar que un cliente Premium tenga envío gratis:

Cliente Premium con pedido de $400 → envío de $0.
Modificación del código

Se agregó un parámetro para identificar si el cliente es Premium. Si el cliente es Premium, la función devuelve un costo de envío de $0.

También se mantuvo el método anterior para que las pruebas y reglas existentes continuaran funcionando.

¿Las pruebas anteriores continúan funcionando?

Sí. Las pruebas anteriores continuaron funcionando correctamente después de agregar el nuevo requerimiento.

En total se obtuvieron 5 pruebas exitosas.

Reflexión
1. ¿Qué ventaja tuvo escribir primero los casos de prueba?

Escribir primero los casos de prueba permitió definir claramente el comportamiento esperado antes de programar. También ayudó a identificar los valores frontera y a detectar rápidamente si la implementación cumplía con las reglas de negocio.

2. ¿Qué aportó trabajar en pareja?

El Pair Programming permite que una persona se concentre en escribir el código mientras la otra revisa la lógica, detecta errores y verifica que se cumplan los requisitos. En esta práctica individual, se simuló este proceso mediante la revisión de cada cambio antes de continuar.

3. ¿Fue fácil incorporar el nuevo requerimiento?

Sí, porque las pruebas existentes permitieron comprobar que el comportamiento anterior no se rompiera. Primero se agregó una nueva prueba para el cliente Premium y después se modificó el código para hacerla pasar.

4. ¿Qué práctica de XP facilitó más el cambio?

La práctica que más facilitó el cambio fue TDD, porque permitió agregar primero una prueba para el nuevo requerimiento y comprobar que la modificación funcionara sin afectar las reglas anteriores.

