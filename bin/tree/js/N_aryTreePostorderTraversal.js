function Node(val, children) {
    this.val = val;
    this.children = children;
}

/**
 * @param {Node} root
 * @return {number[]}
 */
var postorder = function (root) {
    let ans = [];
    let stack = [];

    if (root) {
        stack.push(root);
    }

    while (stack.length !== 0) {
        let current = stack.pop();
        ans.push(current.val);

        if (current.children) {
            current.children.forEach((node) => {
                stack.push(node);
            });
        }
    }

    return ans.reverse()
};