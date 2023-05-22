Question:
Find out the number of documentaries with deleted scenes.

Ans:
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
