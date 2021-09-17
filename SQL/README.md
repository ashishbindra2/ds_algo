### https://livesql.oracle.com/apex/f?p=590:1:8777679737669::LEVEL1:RP::
***
- ROWNUM   --> we can't use rownum with (*)
- <>       --> != ( not equals to)
- GROUP BY --> you can't use WHERE after GROUP BY clause you can user before that,GROUP BY Clause always follows the WHERE Clause
- HAVING   --> it always come after the GROUP BY clause,Where Clause applied first and then Having Clause.
- WHERE    -->  WHERE and HAVING can be used in a single query.

---
- WHERE Clause restricts records before GROUP BY Clause, whereas HAVING Clause restricts groups after GROUP BY Clause are performed.
- WHERE Clause can be utilized with SELECT, UPDATE, DELETE, and INSERT, whereas HAVING can be utilized only with SELECT statement.
---
## Union Clouse 
> Union Clouse used to combine the result-set of two or more selective queries.
> Elemenate dublicate values from the set.

` the colums used in all select statment must have the following`
 - the same no's of columns
 - similar or compartible data types
 - same logical order
---
## Union All Clouse 
> **UNION** remove dublicate values while comparing where **UNION ALL** allows dublicates values while combining.
---
## INNER-JOIN
- Based on the equality condition data retreved from multiple tables.
- We must have a common column in both the tables with the same data type.
- Right table row is joined with left table row if there is a matching for the left row in Right table.

## SELF JOIN
- Joining a Table with itself is called self join.
- Comparing values of a values with the values of same column itself or different coluns values of the same table.
- Display employee details who are geeting more salary than their manager salary. here given one table employee,so values are commare with itself we can use copy of values.

## LEFT JOIN
- All rows from left side table.
- Matching value rows from right side table.
- null values in place of Non matching rows in other table.

## RIGHT JOIN
- All rows from right side table are displayed.
- Matching value rows from left side table.
- null values in place of Non matching row in othere table.

## FULL JOIN 
- A FULL JOIN is view as a result of union operation of an INNER JOIN, LEFT JOIN and RIGHT JOIN
- It reutrns all matched records i.e where the join condition is satisfied on both tables.
- it returns all rows from reftside table(unmatched right side row)
- It return all rows from the left side table(unmatched left side row)
- This join return null values in place of nonmatching tuples in another table.

## 1NF
1. Each column of the table should contain atomic values.(a column should contain multiple values)
2. Intermixing of different values in column.
3. Uniques column names for easy understand and access ablity
4. ordering of data doesnot matter.
