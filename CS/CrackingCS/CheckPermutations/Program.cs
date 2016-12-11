using System;
using System.Linq;

namespace CheckPermutations
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine(checkPermutations("qwerty", "ytrewq"));
        }

        public static bool checkPermutations(string str1, string str2)
        {
            char[] chars1 = str1.ToCharArray();
            char[] chars2 = str2.ToCharArray();

            Array.Sort(chars1);
            Array.Sort(chars2);

            return Enumerable.SequenceEqual(chars1, chars2);
        }
    }
}