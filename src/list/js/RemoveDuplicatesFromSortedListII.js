var deleteDuplicates = function(head) {
    if(head===null || head.next===null){
        return head
    }

    let root = null
    let lastNode = null
    let currentValue = -99999
    let isValid = false

    while(head!==null){
        if(head.val !== currentValue){
            if(head.next && head.val === head.next.val){
                isValid=false
            }else{
                isValid=true
            }
        }

        if(root===null && isValid){
            root = head
            lastNode = head
        }else if(isValid){
            lastNode.next=head
            lastNode = head
        }

        currentValue = head.val
        head = head.next
    }

    if(lastNode!==null){
        lastNode.next=null
    }

    return root
};
