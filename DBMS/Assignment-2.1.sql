-- select count(film_id) as count from film where special_features="Deleted Scenes" and film_id 
-- 	IN (select film_id from film_category where category_id 
-- 		IN (select category_id from category where name="Documentary"));

SELECT count(film_id) as Total_Count
FROM film
WHERE special_features LIKE '%Deleted Scenes%' 
	AND film_id IN (
		SELECT film_id
		FROM film_category
		WHERE category_id IN (
			SELECT category_id
			FROM category
			WHERE name = 'Documentary'
		)
	);