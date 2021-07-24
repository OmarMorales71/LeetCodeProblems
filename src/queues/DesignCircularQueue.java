package queues;

public class DesignCircularQueue {

}

class MyCircularQueue {
    int[] queue;
    int size;
    int top, rear;
    public MyCircularQueue(int k) {
        queue = new int[k];
        size=0;
        top=-1;
        rear=-1;
    }

    public boolean enQueue(int value) {
        if(rear==-1){
            top=0;
            rear=0;
        }else{
            if(isFull()){
                return false;
            }
            rear=(rear==queue.length-1)?0:rear+1;
        }
        queue[rear]=value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        top=(top==queue.length-1)?0:top+1;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[top];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull() {
        if(size==queue.length){
            return true;
        }else{
            return false;
        }
    }
}
