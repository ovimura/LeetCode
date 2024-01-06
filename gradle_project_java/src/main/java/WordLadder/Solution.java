package WordLadder;

import java.util.*;

public class Solution {
    class Node{
        public String word;
        public int depth;
        public Node prev;

        public Node(String word, int depth, Node prev){
            this.word=word;
            this.depth=depth;
            this.prev=prev;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
            return 0;
        List<List<String>> paths = new ArrayList<List<String>>();
        HashSet<String> unvisited = new HashSet<>();
        unvisited.addAll(wordList);
        LinkedList<Node> q = new LinkedList<>();
        Node node = new Node(beginWord,0,null);
        q.offer(node);
        int min = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Node top = q.poll();
            if(paths.size()>0 && top.depth>min){
                return paths.get(0).size();
            }
            for(int i=0; i<top.word.length(); i++){
                char c = top.word.charAt(i);
                char[] arr = top.word.toCharArray();
                for(char j='z'; j>='a'; j--){
                    if(j==c){
                        continue;
                    }
                    arr[i]=j;
                    String t = new String(arr);
                    if(t.equals(endWord)){
                        List<String> temp = new ArrayList<>();
                        temp.add(endWord);
                        Node p = top;
                        while(p!=null){
                            temp.add(p.word);
                            p = p.prev;
                        }
                        Collections.reverse(temp);
                        paths.add(temp);
                        if(top.depth<=min){
                            min=top.depth;
                        }else{
                            return paths.get(0).size();
                        }
                    }
                    if(unvisited.contains(t)){
                        Node n=new Node(t,top.depth+1,top);
                        q.offer(n);
                        unvisited.remove(t);
                    }
                }
            }
        }
        if(paths.isEmpty())
            return 0;
        else
            return paths.get(0).size();
    }
}