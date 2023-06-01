// // See https://aka.ms/new-console-template for more information
// Console.WriteLine("Hello, World!");
using System;
using System.Collections.Generic;

namespace MyApp // Note: actual namespace depends on the project name.
{

   
    internal class Program
    {
        string color = "red";


        public static void TwoSum(int[] nums, int target){

            Dictionary<int, int> dc = new Dictionary<int, int>();

        }

        static void Main(string[] args)
        {
            Program pr = new Program();
            Console.WriteLine(pr.color);
            Dictionary<int, int> dc = new Dictionary<int, int>();
            dc.Add(1, 100);
            dc.Add(2, 200);

            foreach (KeyValuePair<int,int> el in dc ){
                Console.WriteLine(el.Value + " -> "+ el.Key);
            }
        }

    }
}