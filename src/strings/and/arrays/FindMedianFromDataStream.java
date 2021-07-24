package strings.and.arrays;

public class FindMedianFromDataStream {
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        obj.findMedian();
        obj.addNum(3);
        obj.findMedian();

    }
}

class MedianFinder {

    int[] data;
    int count;

    public MedianFinder() {
        data = new int[101];
        count = 0;
    }

    public void addNum(int num) {
        data[num]++;
        count++;
    }

    public double findMedian() {
        if (count % 2 == 0) {
            int halfLeft = count / 2;
            int left=-1;
            boolean leftIsFound = false;
            int halfRight = halfLeft + 1;
            int sum = 0;
            for (int i = 0; i < data.length; i++) {
                sum += data[i];
                if (sum >= halfLeft) {
                    if (!leftIsFound) {
                        left= i;
                        leftIsFound = true;
                    }
                    if (sum >= halfRight) {
                        return (Double.valueOf(left) + Double.valueOf(i)) / 2;
                    }

                }
            }

        } else {
            double half = Double.valueOf(count) / 2;
            int sum = 0;
            for (int i = 1; i < data.length; i++) {
                sum += data[i];
                if (sum >= half) {
                    return i;
                }
            }
        }
        return -28;
    }
}


