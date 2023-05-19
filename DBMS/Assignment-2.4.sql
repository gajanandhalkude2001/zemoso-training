
Question:
Find out the top 3 rented category of movies by “PATRICIA JOHNSON”.

Ans:
select c1.name,COUNT(*) AS rentals_count
from sakila.customer as c
JOIN sakila.rental as r ON r.customer_id = c.customer_id
JOIN sakila.inventory as i ON i.inventory_id = r.inventory_id
JOIN sakila.film as f ON f.film_id = i.film_id
JOIN sakila.film_category as fc ON fc.film_id = f.film_id
JOIN sakila.category as c1 ON fc.category_id = c1.category_id
where c.first_name = 'PATRICIA' AND c.last_name = 'JOHNSON'
group by c1.name
ORDER BY rentals_count DESC;
