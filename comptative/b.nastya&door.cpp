#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n, k;
        cin>>n>>k;
        int a[n]={1, 2, 4, 1, 2, 4, 1, 2};
      
   //
            int left =0,right=k-1;
            int peek = 0;
            for(int i=1;i<k-1;i++){
                if(a[i]>a[i-1] && a[i]>a[i+1])
                     peek++;
            }
            int maxPeek = peek;
            int statIndex = 0;
            while(right !=(n-1)){
                if(a[right]>a[right+1] && a[right]<a[right-1])
                  peek++;
                  right++;
                  left++;
                   if(a[left]>a[left-1] && a[left]>a[right+1])
                  peek--;
                  if(peek >maxPeek){
                      maxPeek =peek;
                      statIndex = left;
                  }
            }
            cout<<maxPeek+1<<" ."<<statIndex<<endl;
        }
    

	return 0;
}
