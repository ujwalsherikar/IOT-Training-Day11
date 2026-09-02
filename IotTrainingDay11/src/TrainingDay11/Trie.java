package TrainingDay11;

class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean end;
}
public class Trie {
    static TrieNode root = new TrieNode();
    static void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.child[index] == null)
                current.child[index] = new TrieNode();
            current = current.child[index];
        }
        current.end = true;
    }
    static boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.child[index] == null)
                return false;
            current = current.child[index];
        }
        return current.end;
    }
    public static void main(String[] args) {
        insert("cat");
        insert("car");
        insert("can");
        insert("cab");
        System.out.println(search("car"));
        System.out.println(search("dog"));
    }
}