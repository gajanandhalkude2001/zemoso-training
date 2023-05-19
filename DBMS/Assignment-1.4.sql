Question:
 Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.
 
Ans:
SELECT DISTINCT c.customer_id, c.first_name
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ct ON a.city_id = ct.city_id
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film_actor fa ON i.film_id = fa.film_id
WHERE ct.country_id = 20 AND fa.actor_id = 2;
