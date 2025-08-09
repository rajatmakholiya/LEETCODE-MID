package main

import "fmt"

func findMaxLength(nums []int) int {
    countMap := make(map[int]int)
    count := 0
    maxLen := 0

    countMap[0] = -1

    for i := 0; i < len(nums); i++ {
        if nums[i] == 0 {
            count--
        } else {
            count++
        }

        if val, exists := countMap[count]; exists {
            if i-val > maxLen {
                maxLen = i - val
            }
        } else {
            countMap[count] = i
        }
    }

    return maxLen
}

func main() {
    nums := []int{0, 1, 0}
    fmt.Println(findMaxLength(nums))
}
