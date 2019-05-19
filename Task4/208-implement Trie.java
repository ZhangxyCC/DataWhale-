class Node{
    Node[] son = new Node[26];
    boolean isEnd;
}
class Trie {
    Node root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
        root.isEnd = false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node p = root;
        char[] chars = word.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(p.son[c - 'a'] == null){
                Node temp = new Node();
                temp.isEnd = false;
                p.son[c - 'a'] = temp;
            }
            p = p.son[c - 'a'];
        }
        p.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node p = root;
        for(char c : word.toCharArray()){
            if(p.son[c - 'a'] == null)  return false;
            p = p.son[c - 'a'];
        }
        return p.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         Node p = root;
        for(char c : prefix.toCharArray()){
            if(p.son[c - 'a'] == null)  return false;
            p = p.son[c - 'a'];
        }
        return true;
    }
}
