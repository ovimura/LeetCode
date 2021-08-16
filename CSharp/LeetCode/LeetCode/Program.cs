using System;


namespace LeetCode
{
    class Program
    {
        static void testP1603() {
            P1603.ParkingSystem p = new P1603.ParkingSystem(1, 1, 0);
            Console.WriteLine(p.AddCar(1));
            Console.WriteLine(p.AddCar(2));
            Console.WriteLine(p.AddCar(3));
            Console.WriteLine(p.AddCar(1));
        }

        static void testP1720() {
            int[] temp = new P1720.Solution().Decode(new int[] { 1, 2, 3 }, 1);
            foreach (var t in temp)
                Console.WriteLine(t);
        }

        static void testP7() {
            int i = new P7.Solution().Reverse1(1239999999);
            Console.WriteLine(i);
        }

        static void testP9() { 
            Console.WriteLine(new P9.Solution().IsPalindrome(121));
            Console.WriteLine(new P9.Solution().IsPalindrome(-121));
            Console.WriteLine(new P9.Solution().IsPalindrome(10));
            Console.WriteLine(new P9.Solution().IsPalindrome(-101));
        }

        static void Main(string[] args)
        {

            int[][] input = new int[3][]; //{ { 1 , 2 }, { 1 , 3 }, { 2, 3 } };
            input[0] = new int[] { 1, 2 };
            input[1] = new int[] { 1, 3 };
            input[2] = new int[] { 2, 3 };
            int[] result = new RedundantConnection.Solution().FindRedundantConnection(input);
            Console.WriteLine(result[0] + " : " + result[1]);
        }
    }
}
