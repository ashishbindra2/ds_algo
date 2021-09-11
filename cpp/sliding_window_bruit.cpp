#include <iostream>
using namespace std;

int main() {
    int sum = 0,left=0,k=3,right=k-1,n=6;
    int a[n]={1,2,7,3,5,10};
    for(int i=0;i<k;i++){
        sum+=a[i];
    }
    int maxi =sum;
    while(right!=n-1){
        right++;
        sum+=a[right];
        sum-=a[left];
        left++;
    }
    maxi=max(maxi,sum);
	cout<<"f"<<maxi;
	return 0;
}
