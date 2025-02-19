SELECT id, COUNT(*) AS num FROM

(SELECT requester_id AS id FROM RequestAccepted
UNION All
SELECT accepter_id AS id FROM RequestAccepted) ids

GROUP BY id
ORDER BY num DESC
LIMIT 1
