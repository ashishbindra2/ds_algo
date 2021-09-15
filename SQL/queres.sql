
Q1) 2nd(Secound) Highest Salary
 1) Approch SELECT MAX(Price) FROM [Products] WHERE Price < (SELECT MAX(Price) FROM [Products] );
 2) Approch SELECT MAX(Price) FROM [Products] WHERE Price NOT IN (SELECT MAX(Price) FROM [Products] );

Q2) Department wise highest Salary or OrderId wise highest Salary.
 1) SELECT MAX(Quantity),OrderID FROM [OrderDetails] GROUP BY OrderID
 2) SELECT MAX(sal),deptNo FROM [emp] GROUP BY deptNo
 
Q3) Counts No of EMployes ineach Department or counts no of Quantity in Each OrderID
 1) SELECT COUNT(*),OrderID FROM [OrderDetails] GROUP BY OrderID
 2) SELECT COUNT(*),deptNo FROM [emp] GROUP BY deptNo //can be for doublicate vales
 
Q4) Display Alternate Records( 1,3,5 or 2,4,6)?
 1) SELECT * FROM (SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY rn) WHERE MOD(rn,2)<>0;
 2) SELECT * FROM (SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY rn) WHERE MOD(rn,2)!=0;
 3) SELECT * FROM (SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY rn) WHERE MOD(rn,2) =0;
 
Q5) Add numberas add view sal in desending order
 1) SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY SAL DESC;
 
Q6) Display Duplicate of a Column
 1) SELECT DEPTNO,COUNT(*) FROM emp GROUP BY DEPTNO HAVING COUNT(*)>1;

Q7) Pattern matching (Latter start with M eg)
 1) SELECT ENAME FROM emp WHERE ENAME LIKE 'S%'; //starting letter
 2) SELECT ENAME FROM emp WHERE ENAME LIKE '%N'; //Ending letter
 3) SELECT ENAME FROM emp WHERE ENAME LIKE '%M%';// Contain letter M in names
 4) SELECT ENAME FROM emp WHERE ENAME NOT LIKE '%M%'; // not contains leeter m
 5) SELECT ENAME FROM emp WHERE ENAME LIKE '____'; // contain 4 character
 6) SELECT ENAME FROM emp WHERE ENAME LIKE '_L%'; // 2nd letter contain L
 7) SELECT ENAME FROM emp WHERE ENAME LIKE '___M%'; // on 4th postion letter M
 8) SELECT HIREDATE,ENAME FROM emp WHERE HIREDATE LIKE '%DEC%'; //Hiring in December
 9) SELECT ENAME FROM emp WHERE ENAME LIKE 'A&S'; //Start and end with A&S
 
Q8)First 4 row 
 1) SELECT * FROM emp WHERE ROWNUM<=4 ;
Q9)Display nth row in SQL
 1) SELECT * FROM emp WHERE ROWNUM<=4 MINUS  SELECT * FROM emp WHERE ROWNUM<=3;//Excectly 4th record
 2) SELECT * FROM (SELECT ROWNUM r,ENAME,SAl FROM emp) WHERE r=4; //Excectly 4th record
 3) SELECT * FROM (SELECT ROWNUM r,emp.* FROM emp) WHERE r=4;//entirer row of 4th no
 4) SELECT * FROM (SELECT ROWNUM r,emp.* FROM emp) WHERE r IN(2,5,7);//Display 2,5,7 record
 
Q10)union vs uninonall
 1) SELECT ENAME FROM emp1 UNION SELECT ENAME FROM emp2;//union// Elemenate dublicate values from the set
 2) SELECT ENAME FROM emp1 UNION ALL SELECT ENAME FROM emp2; //allow dublicate data
Q11)
Q12)
Q14)
Q15)
Q16)
Q17)
Q18)
Q19)
Q20)
Q21)
Q22)
Q23)
Q24)
Q25)

