/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */

var pruneTree = function(root) {
    return purgeZeros(root)!==0?root:null;
};

let purgeZeros = node =>{
    if(node === null){
        return 0;
    }

    let left = purgeZeros(node.left);
    if (left === 0){
        node.left = null;
    }

    let right = purgeZeros(node.right);
    if (right === 0){
        node.right = null;
    }

    let total = left + right + node.val;

    return total;
}