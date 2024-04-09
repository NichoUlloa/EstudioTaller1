### UML 
![EstudioTaller1.png](EstudioTaller1.png)



### Tarea diagnóstico
1. Objetivo:

2. Caso:

Considere que se desea desarrollar un sistema de venta de vehículos que permita a los clientes comprar automóviles, motocicletas y bicicletas. La aplicación debe tener las siguientes características:

Los clientes pueden registrarse y tener una cuenta en la tienda de vehículos.
Cada vehículo debe tener una marca, un modelo, un año de fabricación, peso del vehículo, un precio y una cantidad en stock.
La tienda de vehículos debe tener un catálogo de vehículos con diferentes tipos.
Los clientes pueden buscar vehículos por marca, modelo o tipo.
Los clientes pueden agregar vehículos a su carrito de compras del pedido y ver el subtotal.
Los clientes pueden hacer una compra y proporcionar información de envío y pago.
Cada compra realizada debe tener una lista de vehículos, cliente asociado y fecha de compra. Cada vez que se realice la venta se debe descontar del stock de vehículos de la tienda.
En el caso de los vehículos, debe considerar que:

Los automóviles deben especificar una potencia en caballos de fuerza (HP), el número de puertas y el tamaño del motor.
Las motocicleta deben especificar una potencia en caballos de fuerza (HP), el tipo de motor y la suspensión.
Las bicicletas deben especificar el material de construcción, fuerza de pedaleo (la cual se define arbitrariamente debido a la resistencia de los componentes) y el número de velocidades.
Cada vehículo debe permitir calcular la velocidad máxima permitida, las cuales se deben calcular de la siguiente forma:
Automóvil: velocidad máxima (en km/h) = (potencia en caballos de fuerza / peso del coche) * 10. Por ejemplo, si un coche tiene una potencia de 150 HP y pesa 1500 kg, su velocidad máxima sería de 100 km/h ((150 / 1500) * 10).
Motocicleta: velocidad máxima (en km/h) = ((potencia en caballos de fuerza * 2) / peso de la motocicleta) * 20. Por ejemplo, si una motocicleta tiene una potencia de 80 HP y pesa 200 kg, su velocidad máxima sería de 160 km/h (((80 * 2) / 200) * 20).
Bicicleta: velocidad máxima (en km/h) = ((fuerza de pedaleo en newtons / peso de la bicicleta) * 100) + 10. Por ejemplo, si una bicicleta tiene una fuerza de pedaleo de 200 N y pesa 15 kg, su velocidad máxima sería de 138 km/h (((200 / 15) * 100) + 10).
3. Implemente un diagrama de clases que permita modelar dicha problemática, para luego desarrollar mediante POO un sistema que permita las siguientes funcionalidades.