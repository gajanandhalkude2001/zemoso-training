Question:
Find out the number of R rated movies rented by “SUSAN WILSON”.

Ans:
SELECT COUNT(film_id) FROM film_actor WHERE film_id 
	IN (SELECT film_id FROM film WHERE rating = 'R') AND actor_id 
		IN (SELECT actor_id FROM actor WHERE first_name = 'Susan' AND last_name = 'Wilson');
