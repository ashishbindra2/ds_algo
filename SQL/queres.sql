
Q1) 2nd(Secound) Highest Salary
 1) Approch SELECT MAX(Price) FROM [Products] WHERE Price < (SELECT MAX(Price) FROM [Products] );
 2) Approch SELECT MAX(Price) FROM [Products] WHERE Price NOT IN (SELECT MAX(Price) FROM [Products] );

Q2) Department wise highest Salary or OrderId wise highest Salary.
 1) SELECT MAX(Quantity),OrderID FROM [OrderDetails] GROUP BY OrderID
 2) SELECT MAX(sal),deptNo FROM [emp] GROUP BY deptNo
 
Q3) Counts No of EMployes ineach Department or counts no of Quantity in Each OrderID
 1) SELECT COUNT(*),OrderID FROM [OrderDetails] GROUP BY OrderID
 2) SELECT COUNT(*),deptNo FROM [emp] GROUP BY deptNo
 
Q4) Display Alternate Records( 1,3,5 or 2,4,6)?
 1) SELECT * FROM (SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY rn) WHERE MOD(rn,2)<>0;
 2) SELECT * FROM (SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY rn) WHERE MOD(rn,2)!=0;
 3) SELECT * FROM (SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY rn) WHERE MOD(rn,2) =0;
 
Q5) Add numberas add view sal in desending order
 1) SELECT ROWNUM rn,EMPNO,SAL,ENAME,DEPTNO FROM emp ORDER BY SAL DESC;
 
Q6) 
Q7)
Q8)
Q9)
Q10)
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

