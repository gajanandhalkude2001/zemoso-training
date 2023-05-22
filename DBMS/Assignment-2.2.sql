Question:
Find out the number of sci-fi movies rented by the store managed by Jon Stephens.

Ans:
SELECT COUNT(*) AS sci_fi_count
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
JOIN inventory i ON f.film_id = i.film_id
JOIN store s ON i.store_id = s.store_id
JOIN staff st ON s.manager_staff_id = st.staff_id
WHERE c.name = 'Sci-Fi' AND st.first_name = 'Jon' AND st.last_name = 'Stephens';
