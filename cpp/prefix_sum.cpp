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
   for (int i = 0; i < n; i++) {
if(i==0){
    prefix[i]=a[0];
}else{
    prefix[i] = prefix[i-1]+a[i];
}
  }
  cin>>q;
 while(q--){
     int i,j;
cin>>i>>j;
int sum = prefix[j];
if(i!=0)
    sum-=prefix[i-1];
    cout<<sum<<endl;

 }
	return 0;
}
