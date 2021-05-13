#include <iostream>
#include <map>

#include <iterator>
using namespace std;

int main() {
 
 int frq[256]={0};
 string str = "raaj";
for(auto it : str){
    frq[it]++;
}
char c;
for(int i=0;i<256;i++){
    c=i;

    if(frq[i]>0)
    cout<<c<<"->"<<frq[i]<<"\n";
}
	return 0;
}
