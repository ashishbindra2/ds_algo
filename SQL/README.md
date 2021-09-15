### https://livesql.oracle.com/apex/f?p=590:1:8777679737669::LEVEL1:RP::
***
- ROWNUM   --> we can't use rownum with (*)
- <>       --> != ( not equals to)
- GROUP BY --> you cant use where clouse when ever you use group by clouse

---
##Union Clouse 
> Union Clouse used to combine the result-set of two or more selective queries.
> Elemenate dublicate values from the set.

` the colums used in all select statment must have the following`
 - the same no's of columns
 - similar or compartible data types
 - same logical order
---
##UnionAll Clouse 
> **UNION** remove dublicate values while comparing where **UNION ALL** allows dublicates values while combining.
---
##INNER-JOIN
- Based on the equality condition data retreved from multiple tables.
- We must have a common column in both the tables with the same data type.
- Right table row is joined with left table row if there is a matching for the left row in Right table.
