#include <iostream>
#include <map>
// O(n*logn)
#include <iterator>
using namespace std;

int main() {
    string s ="raaj";
        map<char, int> mp;
     for(auto it: s){
         mp[it]++;
     }
    /*   for (auto it = mp.begin(); it != mp.end(); ++it) {
        cout << '\t' << it->first
             << '\t' << it->second << '\n';
    }*/
      for(auto it:mp){
       	cout<<it.first<<" "<<it.second<<endl;
     }

	return 0;
}


// o/p
// a 2
// j 1
// r 1
