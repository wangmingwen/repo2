package cn.itheima.Demo;
//输出数组中的最大值/最小值的方法与思想:
//与打擂台的方式类似,求最大或者最小值的方法也是需要先定义一个最值max,
//一般先赋于一个最初的元素大小,arr[0],然后遍历数组,用数组中的元素arr[i],先于这个临时最值比较,若是大于这个
//值,将值赋于这个max即: max=arr[i]  两边互换一下
public class MaxArrayDemo {
    public static void main(String[] args) {
//        定义一个数组arr,静态方法赋初值
        int [] arr = {10,20,30,40,50 };
        //定义一个擂台变量
        int max = arr[0];
//        遍历数组中的元素
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
//              比较遍历后的一个元素arr[i]与max的大小,
//                若大于,将arr[i]赋于max,循环下一步
              max = arr[i];
            }
        }
        System.out.println("max:"+max);
    }
}
