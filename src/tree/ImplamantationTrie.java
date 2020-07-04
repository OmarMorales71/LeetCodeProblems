package tree;

import java.util.ArrayList;
import java.util.Collections;

public class ImplamantationTrie {

	public static void main(String[] args) {
		
		Trie trie = new Trie();

		trie.insert("apple");
		System.out.println(trie.search("apple"));   // returns true
		System.out.println(trie.search("app"));     // returns false
		System.out.println(trie.startsWith("app")); // returns true
		trie.insert("app");   
		System.out.println(trie.search("app")); 
	}
	
	

}
class Trie {
	ArrayList<String> tree;
    
    public Trie() {
        tree = new ArrayList<String>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
     tree.add(word);
     
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return tree.contains(word);
        }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	if(!tree.isEmpty()) {
    		Collections.sort(tree);
            int low = 0, hi=tree.size()-1,middle;
            int size = prefix.length();
            while(low<=hi) {
            	middle = ((hi+low)/2);
            	String aux = tree.get(middle);
            	
            	if(aux.startsWith(prefix))return true;
            	
            	if(prefix.compareTo(aux)>0) {
            		low=middle+1;
            	}else {
            		hi=middle-1;
            	}
            }	
    	}
    	
        return false;
    }
}