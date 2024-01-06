package DistributeCandiesToPeople;

public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] people = new int[num_people];
        int i=0;
        int c = 1;
        while(candies>0) {
            if(i == num_people)
                i = 0;
            people[i] += c;
            candies -= c;
            if(candies<0) {
                people[i] -= c;
                people[i] += candies + c;
                break;
            }
            c++;
            i++;
        }
        return people;
    }
}
