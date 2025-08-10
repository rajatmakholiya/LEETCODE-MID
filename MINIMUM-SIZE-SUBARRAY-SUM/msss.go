package main

import "math"

func minSubArrayLen(target int, nums []int) int {
    left, sum := 0, 0
    minLen := math.MaxInt32

    for right := 0; right < len(nums); right++ {
        sum += nums[right]
        for sum >= target {
            if right-left+1 < minLen {
                minLen = right - left + 1
            }
            sum -= nums[left]
            left++
        }
    }
    if minLen == math.MaxInt32 {
        return 0
    }
    return minLen
}
