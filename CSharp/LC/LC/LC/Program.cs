using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



namespace LC
{
    // 697. Degree of an Array
    class Solution {
        public int FindShortestSubArray(int[] nums)
        {
            int degree = 0;
            Dictionary<int, int> num_freqs = new Dictionary<int, int>();

            for (int i = 0; i < nums.Length; i++) {
                int f = 0;
                for (int j = 0; j < nums.Length; j++) {
                    if (nums[i] == nums[j])
                        f++;
                }
                if (!num_freqs.Keys.Contains(nums[i]))
                    num_freqs.Add(nums[i], f);
                else {
                    int val = num_freqs[nums[i]];
                    if(val<f)
                        num_freqs.Add(nums[i], f);
                }
            }
            foreach (int k in num_freqs.Keys) {
                //Console.WriteLine(k + " : " + num_freqs[k]);
                if (num_freqs[k] > degree)
                {
                    degree = num_freqs[k];
                }
            }
            Dictionary<int, int> len = new Dictionary<int, int>();
            foreach (int k in num_freqs.Keys)
            {
                //Console.WriteLine(k + " : " + num_freqs[k]);
                if (num_freqs[k] == degree)
                {
                    int start = 0, stop = 0;
                    for (int i = 0; i < nums.Length; i++) {
                        if (nums[i] == k)
                        {
                            start = i;
                            break;
                        }
                    }
                    for (int i = nums.Length-1; i >= 0; i--)
                    {
                        if (nums[i] == k)
                        {
                            stop = i;
                            break;
                        }
                    }
                    len.Add(k, stop - start + 1);
                }
            }
            int min = int.MaxValue;
            foreach(int k in len.Keys) {
                //Console.WriteLine(k + " : " + len[k]);
                if (len[k] < min)
                    min = len[k];
            }
            return min;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            Console.WriteLine(s.FindShortestSubArray(new int[] {1,2,2,3,1}));
            Console.WriteLine(s.FindShortestSubArray(new int[] { 1, 2, 2, 3, 1, 4, 2 }));
            Console.ReadKey();
        }
    }
}
