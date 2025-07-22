package main

import{
	"fmt"
}

func subarraySum(nums [] int, k int) int{
	count := 0
	for (i := 0; i< len(nums); i++){
		sum := 0
		for (j:= 0; j<len(nums); j++){
			sum = sum + nums[j];
			if(sum == k){
				count ++;
			}
		}
	}
	return count;
}

func main(){
	nums := [] int {1,1,1}
	k := 2
	fmnt.Println(subarraySum(nums,k))
}