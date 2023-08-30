// // See https://aka.ms/new-console-template for more information
// Console.WriteLine("Hello, World!");
using System;
using System.Collections.Generic;
namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        string color = "red";
        public static void TwoSum(int[] nums, int target)
        {
            Dictionary<int, int> dc = new Dictionary<int, int>();

            dc.Add(1, 2);
            dc.Add(2, 3);
            foreach (KeyValuePair<int, int> el in dc)
            {
                Console.Write(el.Value + " " + el.Key + " ");
            }
            Console.WriteLine();
        }

        public void insertionSort(int[] nums)
        {

        }
        static void Main(string[] args)
        {
            Program p = new Program();
            var nums = new int[] { 5, 4, 3, 2, 1 };
            //p.insertionSort(nums);
            //Console.WriteLine(p.color);
            //Dictionary<int, int> dc = new Dictionary<int, int>();
            Console.WriteLine("two sum now ");
            TwoSum(nums, 200);
            //var dc = new Dictionary<int, int>();

            //dc.Add(1, 100);
            //dc.Add(2, 200);
            //foreach (KeyValuePair<int, int> el in dc)
            //{
            //    Console.WriteLine(el.Value + " -> " + el.Key);
            //}
        }
    }
}