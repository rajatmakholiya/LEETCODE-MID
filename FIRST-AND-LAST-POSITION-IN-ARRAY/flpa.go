func searchRange(nums []int, target int) []int {
    result := []int{-1, -1}

    // Find first occurrence
    start, end := 0, len(nums)-1
    for start <= end {
        mid := start + (end-start)/2
        if nums[mid] < target {
            start = mid + 1
        } else {
            if nums[mid] == target {
                result[0] = mid
            }
            end = mid - 1
        }
    }

    // Find last occurrence
    start, end = 0, len(nums)-1
    for start <= end {
        mid := start + (end-start)/2
        if nums[mid] > target {
            end = mid - 1
        } else {
            if nums[mid] == target {
                result[1] = mid
            }
            start = mid + 1
        }
    }

    return result
}
