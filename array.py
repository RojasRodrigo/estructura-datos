import numpy as np

# Array de precios de equipos
precios_array = np.array([3500, 150, 300, 1200])

# Mostrar array
print("Precios (array):", precios_array)

# Aplicar descuento del 10% a todos los productos
descuento = precios_array * 0.9

print("Precios con descuento:", descuento)