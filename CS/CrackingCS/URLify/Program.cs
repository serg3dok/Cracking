using System;
using System.Collections.Generic;

namespace URLify
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine(urlify("Mr John Smith    "));
        }

        public static String urlify(string input)
        {
            char[] chars = input.ToCharArray();

            int reader, writer;
            reader = writer = chars.Length - 1;
            while (chars[reader] == ' ')
            {
                reader--;
            }
            while (reader > -1)
            {
                if (chars[reader] != ' ')
                {
                    chars[writer] = chars[reader];
                    writer--;
                    reader--;
                }
                else
                {
                    chars[writer] = '0';
                    writer--;
                    chars[writer] = '2';
                    writer--;
                    chars[writer] = '$';
                    writer--;
                    reader--;
                }
            }
            return new string(chars);
        }
    }
}