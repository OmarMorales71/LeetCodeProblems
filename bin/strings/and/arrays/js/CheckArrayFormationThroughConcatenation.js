/**
 * @param {number[]} arr
 * @param {number[][]} pieces
 * @return {boolean}
 */
var canFormArray = function(arr, pieces) {
    let ans= true
    pieces.forEach(piece => {
        let i = arr.indexOf(piece[0])
        console.log(i)

        if(i === -1){
            ans=false
            return
        }
        for(let j = i; j<i+piece.length; j++){
            if(arr[j]!==piece[j-i]){
                ans=false
                return
            }
        }
    })
    return ans
};

console.log(canFormArray([85, 20],[[85, 20]]))