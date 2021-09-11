#include <iostream>
/*#include <map>
#include <iterator>*/
using namespace std;

int main() {
  int n,q;
  cin>>n;
  int a[n], scanlin[n]={0};
  for (int i = 0; i < n; i++) {
       cin>>a[i];
  }
  cin>>q;
 while(q--){
     int l,r,x;
cin>>l>>r>>x;
scanlin[l]+=x;
scanlin[r+1]-=x;

 }   
 int sum =0;
for(int i=0;i<n;i++){
    sum+=scanlin[i];
    a[i]+=sum;
}
for(int i=0;i<n;i++)
cout<<a[i]<<" ";


	return 0;
}
