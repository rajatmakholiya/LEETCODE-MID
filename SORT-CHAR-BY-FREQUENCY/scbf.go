package main

import (
	"fmt"
	"sort"
	"strings"
)

func frequencySort(s string) string {
	freq := make(map[rune]int)
	for _, ch := range s {
		freq[ch]++
	}

	type pair struct {
		char  rune
		count int
	}
	var pairs []pair
	for ch, cnt := range freq {
		pairs = append(pairs, pair{ch, cnt})
	}

	sort.Slice(pairs, func(i, j int) bool {
		return pairs[i].count > pairs[j].count
	})

	var sb strings.Builder
	for _, p := range pairs {
		sb.WriteString(strings.Repeat(string(p.char), p.count))
	}

	return sb.String()
}

func main() {
	s := "tree"
	result := frequencySort(s)
	fmt.Println(result) // Output: eert or ttee
}
