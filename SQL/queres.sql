
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
 
Q8) First 4 row 
 1) SELECT * FROM emp WHERE ROWNUM<=4 ;
 
Q9) Display nth row in SQL
 1) SELECT * FROM emp WHERE ROWNUM<=4 MINUS  SELECT * FROM emp WHERE ROWNUM<=3;//Excectly 4th record
 2) SELECT * FROM (SELECT ROWNUM r,ENAME,SAl FROM emp) WHERE r=4; //Excectly 4th record
 3) SELECT * FROM (SELECT ROWNUM r,emp.* FROM emp) WHERE r=4;//entirer row of 4th no
 4) SELECT * FROM (SELECT ROWNUM r,emp.* FROM emp) WHERE r IN(2,5,7);//Display 2,5,7 record
 
Q10) union vs uninonall
  1) SELECT ENAME FROM emp1 UNION SELECT ENAME FROM emp2;//union// Elemenate dublicate values from the set
  2) SELECT ENAME FROM emp1 UNION ALL SELECT ENAME FROM emp2; //allow dublicate data
 
Q11) Inner Join
  1) SELECT ENAME,SAL,DEPT.DEPTNO,LOC FROM EMP,DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO;
  2) SELECT ENAME,SAL,d.DEPTNO,LOC FROM EMP e,DEPT d WHERE e.DEPTNO = d.DEPTNO;
  3) SELECT ENAME,SAL,d.DEPTNO,LOC FROM EMP e,DEPT d WHERE e.DEPTNO = d.DEPTNO and LOC='NEW YORK';
  4) SELECT DNAME,SUM(SAL) FROM EMP e,DEPT d WHERE e.DEPTNO = d.DEPTNO GROUP BY DNAME;
  
Q12) SELF JOIN
  1) SELECT e1.ENAME  "employes",e2.ENAME  "managers",e1.SAL FROM emp e1, emp e2 WHERE e2.EMPNO=e1.MGR; .//find manager of emplyee
  2) SELECT e1.ENAME  "employes",e2.ENAME  "managers",e1.SAL FROM emp e1, emp e2 WHERE e2.EMPNO=e1.MGR AND e1.SAl>e2.SAL;//emp salary grat than manager
  3) SELECT e1.ENAME  "employes",e2.ENAME "managers" ,e1.SAL,e1.HIREDATE FROM emp e1, emp e2 WHERE e2.EMPNO=e1.MGR AND e1.HIREDATE<e2.HIREDATE; //join befor managers 
  
Q14) LEFT JOIN
  1) SELECT ROWNUM,EMPNO,ENAME,emp.DEPTNO,DNAME,LOC,JOB FROM EMP LEFT JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;
  2) SELECT ROWNUM,EMPNO,ENAME,emp.DEPTNO,DNAME,LOC,JOB FROM EMP LEFT JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO AND DNAME='SALES';//display nul values those are not matched

Q15) FULL JOIN
  1) SELECT * FROM EMP e FULL JOIN DEPT d ON d.DEPTNO =e.DEPTNO
  
Q16) Display 1st or last n rows
  1) SELECT * FROM(SELECT ROWNUM r,ENAME,SAL FROM EMP) WHERE R=1 OR R=(SELECT COUNT(*) FROM EMP)
  
Q17) Display Last Two ROW of the table
  1) SELECT * FROM EMP MINUS SELECT * FROM EMP WHERE ROWNUM <=(SELECT COUNT(*)-2 FROM EMP)
  2) SELECT * FROM (SELECT ROWNUM r,ENAME,SAL FROM EMP)  WHERE r>(SELECT COUNT(*)-2 FROM EMP)
  3)  SELECT * FROM (SELECT ROWNUM r,EMP.* FROM EMP)  WHERE r>(SELECT COUNT(*)-2 FROM EMP)
  
Q18) DISPLAY FIRT TWO AND LAST TWO
  1) SELECT * FROM (SELECT ROWNUM r,EMP.* FROM EMP)  WHERE r>(SELECT COUNT(*)-2 FROM EMP) OR r IN(1,2)
  
Q19) Nth Hieght salary 
  1)  SELECT * FROM (SELECT DISTINCT SAL FROM EMP ORDER BY SAL DESC)  WHERE ROWNUM<=3// first 3rd higest salary
  2   SELECT * FROM (SELECT DISTINCT SAL FROM EMP ORDER BY SAL DESC)  WHERE ROWNUM<=3 MINUS SELECT * FROM (SELECT DISTINCT SAL FROM EMP ORDER BY SAL DESC)  WHERE ROWNUM<=2
  
Q20) Intersect
  1) SELECT DEPTNO FROM EMP INTERSECT SELECT DEPTNO FROM DEPT
Q21)
Q22)
Q23)
Q24)
Q25)

