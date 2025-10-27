## Sort 0 1
https://www.naukri.com/code360/problems/sort-0-1_624379?leftPanelTabValue=PROBLEM&count=25&search=&company%5B%5D=Accenture&sort_entity=order&sort_order=ASC&customSource=studio_nav
```py
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
```

## Binary Search
https://www.naukri.com/code360/problems/binary-search_972?leftPanelTabValue=PROBLEM&count=25&search=&company%5B%5D=Accenture&company%5B%5D=Accenture&sort_entity=company_count&sort_order=DESC&customSource=studio_nav

```py
def search(nums: [int], target: int):
    # write your code logic !!
    low = 0
    high = len(nums) - 1

    mid = (low + high) // 2

    while low <= high:
        # print(mid,nums[mid])
        if nums[mid] < target:
            low = mid + 1
        elif nums[mid] > target:
            high = mid - 1
        else:
            return mid
        mid =  (low + high) // 2
    return -1
```

```py
def search(nums: [int], target: int):
    # write your code logic !!
    
    if target in nums:
        return nums.index(target)
    return -1

```

