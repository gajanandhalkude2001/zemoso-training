Question:
Find out the total sales from Animation movies.

Ans:
select sum(rental_rate) as Total_Sales from film where film_id IN (select film_id from film_category where category_id=2);
