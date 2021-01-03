/**
 * @param {number} n
 * @return {number}
 */
let count = 0

var countArrangement = function(n) {
    let nums = []
    if(n===1) {
        count = 0
        return 1;
    }
    for(let i = 0; i<n; i++){
        nums[i]=i+1
    }

    permute(nums, 0)
    let ans = count
    count = 0
    return ans

};

function swap(nums, i, k){
    let temp = nums[i]
    nums[i] = nums[k]
    nums[k] = temp
}

let permute = (nums, k) =>{
    if(k===nums.length){
        count++
    }

    for(let i=k; i<nums.length; i++){
        swap(nums, i, k)
        if(nums[k] % (k+1) === 0 || (k+1) % nums[k] === 0){
            permute(nums, k+1)
        }
        swap(nums, i, k)
    }
}