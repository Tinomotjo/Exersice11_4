package Exersice11_4;
import java.awt.List;
import java.util.*;

/*
Write a method called partition that accepts a list of integers and an integer value E as its parameter,
and rearranges (partitions) the list so that all the elements with values less than E occur before all
elements with values greater than E. The exact order of the elements is unimportant, so long as all elements less than
E appear before all elements greater than E. For example, for the linked list
[15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9], one acceptable ordering of
the list after a call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9].
You may assume that the list contains no duplicates and does not contain the element value E.
 */
public class Run
{


    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(15);
        list1.add(1);
        list1.add(6);
        list1.add(12);
        list1.add(-3);
        list1.add(4);
        list1.add(8);
        list1.add(21);
        list1.add(2);
        list1.add(30);
        list1.add(-1);
        list1.add(9);

        int E = 5;

        System.out.println(partiton(list1,E));



    }





    public static LinkedList<Integer> partiton(LinkedList<Integer> list, int E )
    {

        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        int value = 0;

        while (list.size() > value)
        {
            if (list.get(value) < E)
            {
                list2.add(list.get(value));
                value++;

            } else
            {
                list3.add(list.get(value));
                value++;

            }



        }
        list2.addAll(list3);
        return list2;

    }


}
