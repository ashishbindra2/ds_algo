#include <iostream>
#include <map>

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



