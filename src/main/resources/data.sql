-- Insertar marcas
INSERT INTO marca (id, nombre) VALUES (1, 'Volvo'), (2, 'Scania'), (3, 'Fiat');

-- Insertar buses (asume que la columna marca_id existe en la tabla bus)
INSERT INTO bus (numero_bus, placa, caracteristicas, activo, fecha_creacion, marca_id)
VALUES ('001', 'ABC-123', 'Asientos reclinables', true, NOW(), 1);


