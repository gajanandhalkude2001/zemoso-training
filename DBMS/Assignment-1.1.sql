Question: Find out the PG-13 rated comedy movies. DO NOT use the film_list table.

Ans:
SELECT distinct title as comedy_movies from film , category where rating="PG-13" and category_id=5;
