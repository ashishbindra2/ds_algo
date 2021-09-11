#include <iostream>
/*#include <map>
#include <iterator>*/
using namespace std;

int main() {
  int n,q;
  cin>>n;
  int a[n], prefix[n];
  for (int i = 0; i < n; i++) {
cin>>a[i];
  }
  cin>>q;
 while(q--){
     int l,r,x;
cin>>l>>r>>x;
for(int j=l;j<=r;j++)
    a[j]+=x;
 }   
for(int i=0;i<n;i++)
cout<<a[i]<<" ";


	return 0;
}
