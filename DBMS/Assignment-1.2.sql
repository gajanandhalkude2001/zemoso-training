select title,name ,rental_duration , count(rental_duration) from film,category where category_id=11 group by rental_duration order by rental_duration desc ; 
-- SELECT distinct title,count(title) from film , category  where rating="PG-13" and category_id=5;
-- select distinct title , count(title) from film inner join category on film.film_id = category.category_id ;