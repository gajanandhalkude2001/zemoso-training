-- select count(film_id) from film_actor where film_id 
-- 	IN (select film_id from film where rating="R");
-- select film_id from film_actor where actor_id 
-- 	IN (select actor_id from actor where first_name="SUSAN" and last_name="WILSON");

SELECT COUNT(film_id) FROM film_actor WHERE film_id 
	IN (SELECT film_id FROM film WHERE rating = 'R') AND actor_id 
		IN (SELECT actor_id FROM actor WHERE first_name = 'Susan' AND last_name = 'Wilson');
