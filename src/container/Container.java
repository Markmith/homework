package container;

import java.util.ArrayList;
import java.util.Scanner;

public class Container {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("原容器中的元素为:");
        arrayList.add(input.nextInt());
        arrayList.add(input.nextInt());
        arrayList.add(input.nextInt());
        arrayList.add(input.nextInt());
        System.out.println(arrayList);
        System.out.println("\n");
        System.out.println("将下标为1位置的元素置为  ,将下标为2位置的元素置为  ");
        arrayList.set(1, input.nextInt());
        arrayList.set(2, input.nextInt());
        System.out.println("重置之后容器中的元素为:");
        System.out.println(arrayList);
        System.out.println("\n");
        System.out.println("在下标为  的位置插入一个元素,-----插入元素  ;此时容器后面的元素整体向后移动");
        arrayList.add(input.nextInt(), input.nextInt());
        System.out.println("插入之后容器中的元素为:");
        System.out.println(arrayList);
        System.out.println("插入之后容器中的容量为:");
        System.out.println(arrayList.size());
        System.out.println("\n");
        System.out.println("将下标为  位置的元素删除,-----删除元素:此时容器位置后面的元素整体向前移");
        arrayList.remove(input.nextInt());
        System.out.println("删除之后容器中的元素为:");
        System.out.println(arrayList);
        System.out.println("删除之后容器中的容量为:");
        System.out.println(arrayList.size());
    }
}

