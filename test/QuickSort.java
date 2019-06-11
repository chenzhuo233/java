import java.util.Scanner;

class Qsort{
    private int[] qsort;//创建数组

    public Qsort(int[] qsort){
        this.qsort=qsort;
    }
    //输出
    public void printSort(){
        for (int i = 0; i < qsort.length; i++) {
            System.out.print(" "+qsort[i]+" ");
        }
    }
    //快排方法
    public void sort(){
        quicksort(qsort,0,qsort.length-1);
    }
    //方法
    private void quicksort(int[] qsort,int low,int high){
        this.qsort=qsort;
        if(low<high){//当i和j没相遇时
        int pivotkey=qsort[low];//取第一个元素作为轴值
        int i=low;
        int j=high;
//开始从右往左扫描
            while (i < j){
                while(i < j && qsort[j] > pivotkey){//遇到比轴值大的，继续往前移动
                    j--;
                }
                if(i < j){//找到比轴值小的，交换当前的两组数据，然后开始从左扫描
                    qsort[i]=qsort[j];
                    i++;
                }
//从左扫描
                while (i < j && qsort[i] < pivotkey){//遇到比轴值小的，继续移动
                    i++;
                }
                if(i < j){//找到比轴值大的，交换当前两组数据，开始从右扫描
                    qsort[j]=qsort[i];
                    j--;
                }
            }
            qsort[i]=pivotkey;//把轴值放到轴的位置
            quicksort(qsort,low,i-1);//左侧按照快排，递归
            quicksort(qsort,i+1,high);//右侧按照快拍，递归
        }
    }
}

public class QuickSort {//测试代码
    public static void main(String[] args){
        /*选择*/
        System.out.println("请选择要执行快排的选项：\n1.输入数组\n2.使用教材数组");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        switch (a){
            case 1:
                ScannerSort();
                break;
            case 2:
                testQuickSort();
                break;
        }

    }
    /*教材数组*/
    private static void testQuickSort(){
        int[] qsort={49,38,65,97,76,13,27};
        Qsort qs=new Qsort(qsort);
        qs.sort();
        qs.printSort();
    }
    /*输入数组*/
    private static void ScannerSort(){
        System.out.println("请输入十组数据；");
        int a=10;
        int[] sqsort=new int[a];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            sqsort[i]=sc.nextInt();
        }
        Qsort qs=new Qsort(sqsort);
        System.out.println("输入的数组为：");
        for (int j = 0; j < sqsort.length; j++) {
            System.out.print(" "+sqsort[j]+" ");
        }
        System.out.print("\n");
        System.out.println("快排中...");
        qs.sort();
        System.out.println("快排后：");
        qs.printSort();
    }
}