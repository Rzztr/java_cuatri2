SELECT studentID, FullName, sat_score
FROM student
WHERE (studentID between 1 and 5 -- inclusive
	or studentID = 8
    or FullName like '%Maximo%'
    and sat_score NOT in (1000, 1400)
  order by FullName DESC;