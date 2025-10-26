 Sort 0 1
https://www.naukri.com/code360/problems/sort-0-1_624379?leftPanelTabValue=PROBLEM&count=25&search=&company%5B%5D=Accenture&sort_entity=order&sort_order=ASC&customSource=studio_nav
from sys import stdin

def sortZeroesAndOne(arr, n) :
    # write your code here 
    i = 0
    j = n-1
    while i<n and i<j:
        if arr[i] == 1 and arr[j] == 0:
            arr[i],arr[j] = arr[j],arr[i]
            j-=1
            i+=1
        if arr[j] == 1:
            j-=1
        if arr[i] == 0:
            i+=1


