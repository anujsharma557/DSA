package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #208 - Implement Trie (Prefix Tree)
 */
public class ImplementTriePrefixTree {
    private TrieNode root;
    public ImplementTriePrefixTree() {
        root = new TrieNode();
    }

    /**
     * iterate through word and keep inserting new trie node for every character and set the end field as true
     * @param word
     */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }

    /**
     * Trie Node
     */
    static class TrieNode{
        private TrieNode[] links;
        private final int numberOfLinks = 26;
        private boolean isEnd;
        public TrieNode() {
            links = new TrieNode[numberOfLinks];
        }
        public boolean isEnd() {
            return isEnd;
        }
        public void setEnd() {
            isEnd = true;
        }
        public void put(char ch, TrieNode node) {
            links[ch -'a'] = node;
        }
        public TrieNode get(char ch) {
            return links[ch -'a'];
        }
        public boolean containsKey(char ch) {
            return links[ch -'a'] != null;
        }

    }
}
