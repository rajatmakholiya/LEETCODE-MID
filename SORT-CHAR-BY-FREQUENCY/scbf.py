from collections import Counter

class Solution:
    def frequencySort(self, s: str) -> str:
        freq = Counter(s)
        sorted_items = sorted(freq.items(), key=lambda x: -x[1])
        print(sorted_items)


        result = []
        for char, count in sorted_items:
            result.append(char * count)

        return ''.join(result)

s = Solution()
s.frequencySort("tree")
s.frequencySort("cccaaa")
s.frequencySort("Aabb")
s.frequencySort("loveleetcode")