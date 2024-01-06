package LongestPathWithDifferentAdjacentCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Reference: https://leetcode.com/problems/longest-path-with-different-adjacent-characters/solutions/3042998/java-c-dfs-cases-and-code-explained-with-comments/
public class Solution {
    int[] paths;
    public int longestPath(int[] parent, String s) {

        paths=new int[parent.length];  //store maximum path for each node

        //Creating adjacency list

        ArrayList<Integer>[] a = new ArrayList[parent.length];
//        List<List<Integer>> b = new ArrayList<>(parent.length);

        for(int i=0;i<parent.length;i++) {
            a[i] = new ArrayList<Integer>();
//            b.add(new ArrayList<>());
        }

        for(int i=1;i<parent.length;i++) {
            a[parent[i]].add(i);
//            b.get(parent[i]).add(i);
        }

        // dfs from root node
        dfs(-1,0,a,s);
//        dfs(-1,0,b,s);

        //finding the node with maximum path length
        int max=0;
        for(int x:paths){
            if(x>max)
                max=x;
        }
        return max+1;  //since we have to return no. of vertices in path length, so adding +1
    }

    private int dfs(int prev,int curr,ArrayList<Integer>[] a,String s)
    {
        //temporary array for storing pathlengths of children nodes.
        int[] pathlength=new int[Math.max(a[curr].size(),1)];
        int i=0;  //index to store pathlength return by child nodes in temporary array.
        for(int x:a[curr]){
            if(x!=prev)
            {
                pathlength[i]=dfs(curr,x,a,s);
                //if two adjacent nodes have different frequencies
                if(s.charAt(x)!=s.charAt(curr))
                    pathlength[i++]++;
                else
                    pathlength[i++]=0;
            }
        }
        Arrays.sort(pathlength);
        //setting curr vertex max path length=pathlength of child node.
        if(pathlength.length==1) //only one child
            paths[curr]=pathlength[0];
            //setting curr vertex max path length=sum of two maximum child pathlengths.
        else if(pathlength.length>=2)  //two or more than two child
            paths[curr]=pathlength[pathlength.length-1]+pathlength[pathlength.length-2];
        // returning only maximum child path length.
        return pathlength[pathlength.length-1];
    }
}
