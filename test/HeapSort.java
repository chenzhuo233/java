package test;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void ad(int[] a,int i,int len){
        int temp;
        temp=a[i];
        for (int m =2*i+1; m <len ; m=m*2+1) {
            if(m+1<len && a[m]<a[m+1])
                m++;
            if(a[m] > temp){
                temp=a[i];
                a[i]=a[m];
                a[m]=temp;
                i=m;
            }
            else {
                break;
            }
        }
    }

    public static void heapsort(int[] a){
        for (int i = a.length/2-1; i>=0; i--) {
            ad(a,i,a.length);
        }
        for (int j = a.length-1; j >0; j--) {
            int temp=a[0];
            a[0]=a[j];
            a[j]=temp;
            ad(a,0,j);
        }
    }

    public static void main(String[] args) {
            /*选择*/
            System.out.println("请选择要执行堆排的选项：\n1.输入数组\n2.使用教材数组");
            Scanner n = new Scanner(System.in);
            int a = n.nextInt();
            switch (a) {
                case 1:
                    ScannerSort();
                    break;
                case 2:
                    testHSort();
                    break;
            }

        }
        /*教材数组*/
        public static void testHSort(){
            int[] a={11,49,38,65,97,76,13,27,87,90};
            heapsort(a);
            System.out.println(Arrays.toString(a));
        }
        /*输入数组*/
        public static void ScannerSort(){
            System.out.println("请输入十组数据；");
            int n=10;
            int[] hsort=new int[n];
            Scanner sc=new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                hsort[i]=sc.nextInt();
            }
            System.out.println("输入的数组为：");
            for (int j = 0; j < hsort.length; j++) {
                System.out.print(" "+hsort[j]+" ");
            }
            System.out.println("排序后：");
            heapsort(hsort);
            System.out.println(Arrays.toString(hsort));
        }
}

