
Q1) 2nd(Secound) Highest Salary
 1) Approch SELECT MAX(Price) FROM [Products] WHERE Price < (SELECT MAX(Price) FROM [Products] );
 2) Approch SELECT MAX(Price) FROM [Products] WHERE Price NOT IN (SELECT MAX(Price) FROM [Products] );

Q2) Department wise highest Salary or OrderId wise highest Salary.
 1) SELECT MAX(Quantity),OrderID FROM [OrderDetails] GROUP BY OrderID
 2) SELECT MAX(sal),deptNo FROM [emp] GROUP BY deptNo
 
Q3) Counts No of EMployes ineach Department or counts no of Quantity in Each OrderID
 1) SELECT COUNT(*),OrderID FROM [OrderDetails] GROUP BY OrderID
 2) SELECT COUNT(*),deptNo FROM [emp] GROUP BY deptNo
 

 Display Alternate Records
