-- Добавляем продукты в таблицу products
INSERT INTO products (name, price) VALUES ('Product A', 10.99);
INSERT INTO products (name, price) VALUES ('Product B', 20.49);
INSERT INTO products (name, price) VALUES ('Product C', 15.79);

-- Добавляем заказы в таблицу orders
INSERT INTO orders (total_cost, created_at) VALUES (10.99, '2024-11-03 10:00:00');
INSERT INTO orders (total_cost, created_at) VALUES (36.28, '2024-11-03 12:30:00');

-- Связываем заказы с продуктами через таблицу order_products
INSERT INTO order_products (order_id, product_id) VALUES (1, 1); -- Заказ 1 содержит продукт 1 (Product A)
INSERT INTO order_products (order_id, product_id) VALUES (2, 2); -- Заказ 2 содержит продукт 2 (Product B)
INSERT INTO order_products (order_id, product_id) VALUES (2, 3); -- Заказ 2 также содержит продукт 3 (Product C)