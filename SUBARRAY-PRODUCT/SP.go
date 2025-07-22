package main

import {
	"fmt"
	"math"
}

func subArrProd (nums[] int) int {
	arrmax := max(nums)
	currmax := 1
	currmin := 1

	for _, i in range nums {
		temp := currmax * i
		currmax = math.max(currmin * i, temp, i)
		currmin = math.min(currmin * i, temp, i)

		arrmax = math.max(arrmax, currmax)
	}

	return arrmax
}

func main(){

	nums:= [] int [1,2,3,-4,-5]

	fmt.println(subArrProd(nums))
}