package strings.and.arrays;

import java.util.ArrayList;

public class OnlineStockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		StockSpanner obj = new StockSpanner();
		System.out.println(obj.next(100));
		System.out.println(obj.next(80));
		System.out.println(obj.next(60));
		System.out.println(obj.next(70));
		System.out.println(obj.next(60));
		System.out.println(obj.next(75));
		System.out.println(obj.next(85));
	}

}
class StockSpanner {
	ArrayList<Integer> stock;
	ArrayList<Integer> span;
    public StockSpanner() {
        stock = new ArrayList<Integer>();
        span=new ArrayList<Integer>();
    }
    
    public int next(int price) {
        if(stock.isEmpty()) {
        	stock.add(price);
        	span.add(1);
        	return 1;
        }
        
        int spanNum=1;
        int lastIndex = stock.size()-1;
        stock.add(price);
        boolean searching =true;
        while(searching && lastIndex>=0) {
        
        	if(price>=stock.get(lastIndex)) {
        		spanNum+=span.get(lastIndex);
        		lastIndex-=span.get(lastIndex);
        	}else {
        		break;
        	}
        }
        span.add(spanNum);
        return spanNum;
    }
}