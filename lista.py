# Lista de ventas de equipos de computación

ventas_lista = [
    ["Laptop", 5, 800],      # producto, cantidad, precio
    ["Mouse", 20, 15],
    ["Teclado", 10, 25],
    ["Monitor", 7, 200]
]

# Mostrar datos
for venta in ventas_lista:
    producto = venta[0]
    cantidad = venta[1]
    precio = venta[2]
    total = cantidad * precio

    print("Producto:", producto)
    print("Cantidad:", cantidad)
    print("Precio:", precio)
    print("Total:", total)
    print("------------------")
