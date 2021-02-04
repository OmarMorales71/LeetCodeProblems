/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    const ROMAN = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V", "IV", "I"]
    const INTEGER = [1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
    let ans = ""
    INTEGER.forEach((element, index) =>{

        while(num>=element){
            num-=element
            ans+=(ROMAN[index])
        }
    })

    return ans

};