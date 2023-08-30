import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private int arr[];
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (var i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(null);
            }
        }

        public int hashFunction(int key) {
            return 1;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // gives you the bucket index
            int di = searchInLL(key, bi); // di = -1

            if (di == -1) {
                // key does not exist
                // store the new node in the key index
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                // search and update the value
                Node data = buckets[bi].get(di);
                data.value = value;

            }
        }

        public V remove(K key) {
            return null;
        }

        public V get(K key) {
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }
    }

    public static void main(String args[]) {

    }
}