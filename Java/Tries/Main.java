// Tries data structure

public class Main {
    // Alphabet size (# of symbol)
    static final int ALPHABET_SIZE = 26;

    static class Node {
        Node[] children = new Node[ALPHABET_SIZE];
        boolean isEndOfWord;

        Node() {
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }

            isEndOfWord = false;
        }

    }

    static Node root = new Node();

    // if not present, inserts key into trie
    // if the key is prefix of treenode just marks the leaf node

    static void insert(String key) {

        int index;
        Node pcCrawl = root;
        for (int i = 0; i < key.length(); i++) {
            index = key.charAt(i) - 'a';
            if (pcCrawl.children[index] == null) {
                pcCrawl.children[index] = new Node();

            }

            pcCrawl = pcCrawl.children[index];
        }

        pcCrawl.isEndOfWord = true;
    }

    static boolean search(String key) {
        int level;
        int length = key.length();
        int index;

        Node pCrawl = root;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if (pCrawl.children[index] == null) {
                return false;
            }

            pCrawl = pCrawl.children[index];
        }

        return pCrawl.isEndOfWord;

    }

    public static void main(String args[]) {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = { "the", "a", "there", "answer", "any",
                "by", "bye", "their" };

        Node root = new Node();
        for (String k : keys) {
            insert(k);
        }

        System.out.println(search("name"));

    }
}