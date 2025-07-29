class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char, int> ht;

        for (char c : s) {
            ht[c]++;
        }

        vector<pair<char, int>> vec(ht.begin(), ht.end());

        sort(vec.begin(), vec.end(), [](const pair<char, int>& a, const pair<char, int>& b) {
            return a.second > b.second;
        });

        string result;
        for (auto& p : vec) {
            result.append(p.second, p.first);
        }

        return result;
    }
};