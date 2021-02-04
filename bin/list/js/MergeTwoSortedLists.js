
function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

var mergeTwoLists = function(l1, l2) {
    let root = null
    if(l1 && l2){
        if(l1.val<=l2.val){
            root= new ListNode(l1.val)
            l1=l1.next
        }else{
            root= new ListNode(l2.val)
            l2=l2.next
        }
    }else if(l1){
        root= new ListNode(l1.val)
        l1=l1.next
    }else if(l2){
        root= new ListNode(l2.val)
        l2=l2.next
    }

    let currentNode = root
    while(l1 || l2){
        if(l1 && l2){
            if(l1.val<=l2.val){
                currentNode.next=new ListNode(l1.val)
                currentNode=currentNode.next
                l1 = l1.next
            }else{
                currentNode.next=new ListNode(l2.val)
                currentNode=currentNode.next
                l2 = l2.next
            }
        }else if(l1){
            currentNode.next=new ListNode(l1.val)
            currentNode=currentNode.next
            l1 = l1.next
        }else if(l2){
            currentNode.next=new ListNode(l2.val)
            currentNode=currentNode.next
            l2 = l2.next
        }
    }

    return root
};

let l1 = new ListNode(1)
l1.next = new ListNode(2)
l1.next.next = new ListNode(4)

let l2 = new ListNode(1)
l2.next = new ListNode(3)
l2.next.next = new ListNode(4)
console.log(mergeTwoLists(l1, l2))