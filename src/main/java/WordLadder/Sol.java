package WordLadder;

import javafx.util.Pair;

import java.util.*;

public class Sol {
    class WorkingSolution {
        private int L;
        private Map<String, List<String>> allComboDict;

        WorkingSolution() {
            this.L = 0;

            // Dictionary to hold combination of words that can be formed,
            // from any given word. By changing one letter at a time.
            this.allComboDict = new HashMap<>();
        }

        private int visitWordNode(
                Queue<Pair<String, Integer>> Q,
                Map<String, Integer> visited,
                Map<String, Integer> othersVisited) {

            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();

            for (int i = 0; i < this.L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : this.allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (othersVisited.containsKey(adjacentWord)) {
                        return level + othersVisited.get(adjacentWord);
                    }

                    if (!visited.containsKey(adjacentWord)) {

                        // Save the level as the value of the dictionary, to save number of hops.
                        visited.put(adjacentWord, level + 1);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
            return -1;
        }

        public int ladderLength(String beginWord, String endWord, List<String> wordList) {

            if (!wordList.contains(endWord)) {
                return 0;
            }

            // Since all words are of same length.
            this.L = beginWord.length();

            wordList.forEach(
                    word -> {
                        for (int i = 0; i < L; i++) {
                            // Key is the generic word
                            // Value is a list of words which have the same intermediate generic word.
                            String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                            List<String> transformations =
                                    this.allComboDict.getOrDefault(newWord, new ArrayList<>());
                            transformations.add(word);
                            this.allComboDict.put(newWord, transformations);
                        }
                    });

            // Queues for birdirectional BFS
            // BFS starting from beginWord
            Queue<Pair<String, Integer>> Q_begin = new LinkedList<>();
            // BFS starting from endWord
            Queue<Pair<String, Integer>> Q_end = new LinkedList<>();
            Q_begin.add(new Pair(beginWord, 1));
            Q_end.add(new Pair(endWord, 1));

            // Visited to make sure we don't repeat processing same word.
            Map<String, Integer> visitedBegin = new HashMap<>();
            Map<String, Integer> visitedEnd = new HashMap<>();
            visitedBegin.put(beginWord, 1);
            visitedEnd.put(endWord, 1);

            while (!Q_begin.isEmpty() && !Q_end.isEmpty()) {

                // One hop from begin word
                int ans = visitWordNode(Q_begin, visitedBegin, visitedEnd);
                if (ans > -1) {
                    return ans;
                }

                // One hop from end word
                ans = visitWordNode(Q_end, visitedEnd, visitedBegin);
                if (ans > -1) {
                    return ans;
                }
            }

            return 0;
        }

    }

    class Word {
        String w;
        int moves;
        Word(String w, int m) {
            this.w = w;
            this.moves = m;
        }
    }
    boolean valid(String w1, String w2) {
        int i =0;
        for(int j=0; j<w2.toCharArray().length; j++) {
            if(w1.toCharArray()[j] != w2.toCharArray()[j])
                i++;
        }
        return (i==1)? true: false;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Stack<Word> q = new Stack();
        q.push(new Word(beginWord, 1));
        boolean[] visited = new boolean[wordList.size()];
        for(int i=0; i<visited.length; i++) {
            visited[i] = false;
        }
        while(q.size() != 0) {
            Word word = q.peek();
            q.pop();
            if(word.w.equals(endWord))
                return word.moves;
            for(int i=0; i<wordList.size(); i++) {
                if(valid(word.w, wordList.get(i)) && !visited[i]) {
                    visited[i] = true;
                    q.push(new Word(wordList.get(i), word.moves+1));
                }
            }
        }
        System.out.println(q.size());
        return 0;
    }

    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {
        // If the target String is not
        // present in the dictionary
        if (!wordList.contains((String)endWord))
            return 0;

        // To store the current chain length
        // and the length of the words
        int level = 0, wordlength = beginWord.length();

        // Push the starting word into the queue
        Queue<String> Q = new LinkedList<>();
        Q.add(beginWord);

        // While the queue is non-empty
        while (!Q.isEmpty())
        {

            // Increment the chain length
            ++level;

            // Current size of the queue
            int sizeofQ = Q.size();

            // Since the queue is being updated while
            // it is being traversed so only the
            // elements which were already present
            // in the queue before the start of this
            // loop will be traversed for now
            for (int i = 0; i < sizeofQ; ++i)
            {

                // Remove the first word from the queue
                char []word = Q.peek().toCharArray();
                Q.remove();

                // For every character of the word
                for (int pos = 0; pos < wordlength; ++pos)
                {

                    // Retain the original character
                    // at the current position
                    char orig_char = word[pos];

                    // Replace the current character with
                    // every possible lowercase alphabet
                    for (char c = 'a'; c <= 'z'; ++c)
                    {
                        word[pos] = c;

                        // If the new word is equal
                        // to the target word
                        if (String.valueOf(word).equals(endWord))
                            return level + 1;

                        // Remove the word from the set
                        // if it is found in it
                        if (!wordList.contains(String.valueOf(word)))
                            continue;
                        //System.out.println(String.valueOf(word));
                        wordList.remove(String.valueOf(word));

                        // And push the newly generated word
                        // which will be a part of the chain
                        Q.add(String.valueOf(word));
                    }

                    // Restore the original character
                    // at the current position
                    word[pos] = orig_char;
                }
            }
        }
        return 0;
    }
}
