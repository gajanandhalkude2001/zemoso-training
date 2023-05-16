select * from customer inner join category on customer.customer_id = category.category_id inner join country on country.country_id = category.category_id where category_id = 44;
SELECT c.category_id, c.name
FROM category c
JOIN rental r ON c.category_id = r.customer_id
JOIN film m ON r.rental_id = m.film_id
WHERE c.category_id = 15 ;