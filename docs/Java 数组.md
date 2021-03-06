# Java 数组

[TOC]

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/12/0d1ca9b5cd894.png" alt="" style="zoom:50%;" />

## 一、创建数组

> dataType：数据类型
>
> arrayRefVar：数组名或数组参考值

```java
dataType[] arrayRefVar = new dataType[arraySize];


dataType[] arrayRefVar = {value0, value1, ..., valuek};


// 例如
        double[] array;
        int[] array01;
        array01 = new int[]{1, 2, 3, 4, 5, 6};
```

```java
public static void main(String[] args) {
        // 1、定义数组典型标记[] 有可能{} 声明数组并直接赋值
        double score[] = {80,90,85,64,59,90};
        System.out.println(score.length);
        
        // 2、声明数组并制定长度
        double score1[] = new double[6];
        System.out.println(score1.length);

        // 3、1+2声明数组 同时赋值，注意的是这里不需要指定长度
        double score2[] = new double[]{82,95,80,85,78,52};
    }
```

> * 定义数组时，中括号放`变量`前面或`变量`的后面都可以，建议放在`变量`之前。





## 二、数组的遍历

### 2.1 for循环遍历

```java
public class Array_02 {
    /**
     * @Author Singerw_辛格
     * @Description //创建一个数组，存放1-10
     * @Date 15:13 2021-05-12
     */
    public static void main(String[] args) {
        //方案1
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //方案2
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            //给数组元素赋值
            array1[i] = i + 1;
        }
        // 使用循环通过索引来访问数组元素并输出
        System.out.println("*************普通for循环**************");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


        System.out.println("*************增强for循环**************");
        //使用增强的for循环，jdk1.5后增加的
        for (int i:array1){
            System.out.println(i);
        }
    }
}
```

```java
public class Array_03 {
    /**
     * @Author Singerw_辛格
     * @Description //创建一个数组，存放1-10
     * @Date 15:13 2021-05-12
     */
    public static void main(String[] args) {
        //数据从控制台输入
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            //给数组元素赋值
            array1[i] = input.nextInt();
        }
        // 使用循环通过索引来访问数组元素并输出
        System.out.println("*************普通for循环**************");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("*************增强for循环**************");
        //使用增强的for循环，jdk1.5后增加的
        for (int i:array1){
            System.out.println(i);
        }
    }
}
```

**1.控制台输入数字存入数组，求和与平均数**

```java
package com.singerw.day01;

import java.util.Scanner;

public class Array_04 {
    /**
     * @Author Singerw_辛格
     * @Description //控制台输入数字存入数组，求和与平均数
     * @Date 15:32 2021-05-12
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("和是：" + sum);
        System.out.println("平均数是：" + sum / array.length);
    }
}
```



**2.控制台输入数字存入数组，求最 大值最小值**

```java
package com.singerw.day01;

import java.util.Scanner;

public class Array_05 {
    /**
     * @Author Singerw_辛格
     * @Description //控制台输入数字存入数组，求最大值最小值
     * @Date 16:05 2021-05-12
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        // 最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 最小值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}

```



**3. 控制台输入数字存入数组，并按从大小写和从小到大排序**

```java

```



## 三、数组查找

### 3.1 查找的基本实现

```java
package com.singerw.ArrayTask;

import java.util.Scanner;

public class ArrayTaskClass {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 17:27 2021-05-12
     * 录入班级5名的姓名，查找是否包含某个学生，输出结果.
     * 1、定义字符串数组，使用循环完成输入.
     * 2、for循环遍历数组元素，使用equals完成比较。
     * 3、输出结果，显示是否找到，并给出位置.
     */
    public static void main(String[] args) {
        // 从控制台输入学生姓名
        Scanner input = new Scanner(System.in);
        // 创建数组
        String[] nameArray = new String[5];
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的姓名：");
            // 接收从控制台输入的姓名存至数组中
            nameArray[i] = input.next();
        }

        System.out.print("请输入你要查找的学生姓名：");
        String find = input.next();
        // 定义position赋值为-1，-1表示没找到
        int position = -1;
        for (int i = 0; i < nameArray.length; i++) {
            // 条件比较，字符串类型用equals
            // 如果find的值等于数组中i的值，则说明成功找到
            if (nameArray[i].equals(find)) {
                position = i;
                System.out.println("找到了学生：" + find + ",该学生的索引位置是" + position);
            }
            // 如果find的值等于-1，则说明没找到
            if (position == -1) {
                System.out.println("没找到：" + find + "，正在尝试下一次寻找");
            }
        }
    }
}
```

> 请输入第1个学生的姓名：张欣
> 请输入第2个学生的姓名：林东
> 请输入第3个学生的姓名：陈鑫
> 请输入第4个学生的姓名：方圆
> 请输入第5个学生的姓名：学良
> 请输入你要查找的学生姓名：学良
> 没找到：学良，正在尝试下一次寻找
> 没找到：学良，正在尝试下一次寻找
> 没找到：学良，正在尝试下一次寻找
> 没找到：学良，正在尝试下一次寻找
> 找到了学生：学良,该学生的索引位置是4



## 四、数组排序

### 4.1 选择排序

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/12/f00cec2d71de8.png" alt="" style="zoom:80%;" />

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/12/4ddb992289223.png" alt="" style="zoom:80%;" />

```java
package com.singerw.array_02;

public class Array_07 {
    /**
     * @Author Singerw_辛格
     * @Description //选择排序的算法
     * @Date 16:58 2021-05-12
     */
    public static void main(String[] args) {
        // 最小值下标
        int smaller = 0;
        // 可以和for循环结合在一起
        int[] array = {1, 2, 23, 51, 18, 502, 41};
        for (int i = 0; i < array.length - 1; i++) {
            // 自定义一个smaLler samller为最小值
            smaller = i;
            // 比较，用当前的索引值和剩余的每一个元素都比较一次
            for (int j = i + 1; j < array.length; j++) {
                // 比较
                if (array[smaller] > array[j]) {
                    // j的位置更新，重新定义smaller
                    smaller = j;
                }
            }
            // 得到最小值的所在位置，索引位置smaller
            if (smaller != i) {
                // 交换
                int temp = array[smaller];
                array[smaller] = array[i];
                array[i] = temp;
            }
        }
        // 输出结果
        for (int a:array){
            System.out.println(a);
        }

    }
}
```

```java
package com.singerw.ArrayTask;

import java.util.Scanner;

public class ArrayTaskStudent {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 17:31 2021-05-12
     * 录入10个学生的年龄，按照从小到大排序输出。
     * 1、定义整型数组，使用循环完成输入
     * 2、使用for循环完成选择排序
     * 3、输出排序后的结果
     */
    public static void main(String[] args) {
        int smaller = 0;
        // 定义Scanner从控制台输入学生年龄
        Scanner input = new Scanner(System.in);
        // 创建数组
        int[] ageArray = new int[10];
        for (int i = 0; i < ageArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的年龄：");
            // 接收从控制台输入的姓名存至数组中
            ageArray[i] = input.nextInt();
        }

        for (int j = 0; j < ageArray.length - 1; j++) {
            // 自定义的smaller当做最小值
            smaller = j;
            // 比较，用当前的索引值和数组中剩余的每一个元素都比较一次
            for (int k = j + 1; k < ageArray.length; k++) {
                // 条件比较
                if (ageArray[smaller] > ageArray[k]) {
                    smaller = k;
                }
            }
            // 得到最小值的所在位置，所以位置至smaller
            if (smaller != j) {
                // 交换
                int temp = ageArray[smaller];
                ageArray[smaller] = ageArray[j];
                ageArray[j] = temp;
            }
        }
        // 输出结果
        System.out.println("学生年龄按照从小到大为：");
        for (int ascending : ageArray) {
            System.out.println(ascending);
        }
    }
}
```

> 请输入第1个学生的年龄：25
> 请输入第2个学生的年龄：23
> 请输入第3个学生的年龄：25
> 请输入第4个学生的年龄：22
> 请输入第5个学生的年龄：18
> 请输入第6个学生的年龄：29
> 请输入第7个学生的年龄：23
> 请输入第8个学生的年龄：18
> 请输入第9个学生的年龄：16
> 请输入第10个学生的年龄：19
> 学生年龄按照从小到大为：
> 16
> 18
> 18
> 19
> 22
> 23
> 23
> 25
> 25
> 29



### 4.2 冒泡排序

> * 冒泡排序主要的思想是进行相邻的两个元素之间比较并且交换，有利于利用原有元素在集合中的位置优势，冒泡排序的原则是大的下沉小的上浮（跟最终的排序要求保持一致）
>
> * 仍然对之前的数据按照冒泡进行排序：

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/13/f2c98de1ce8d5.gif" alt="" style="zoom:80%;" />

#### 1. 冒泡排序的基本实现：

> 冒泡排序口诀：
>
> * 两层循环，一外一内
> * 外循环次数长度 `array.length-1`
> * 外循环次数长度 `array.length-i-1`
> * 内中相邻比较，大的下沉，小的冒泡

```java
package com.singerw.bubble_sort;

public class Array_Loop_Bubble_Sort_01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 9:30 2021-05-13
     */
    public static void main(String[] args) {
        int[] array = {100, 23, 4, 57, 344, 65, 34};
        // 比较的轮数为数组长度-1
        for (int i = 0; i < array.length - 1; i++) {
            // 1 -> 6次  7-0-1
            // 2 -> 5次  7-1-1
            // 3 -> 4次  7-2-1
            // 4 -> 3次
            // 5 -> 2次
            // 6 -> 1次
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        // 输出结果
        for(int n:array){
            System.out.println(n);
        }
    }
}
```

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/13/a565b7a9c8930.gif)

#### 2. 实例与练习

```java
```





### 4.3 插入排序

> 插入排序与选择排序类似，需要将数组分为有序与无序两部分。

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/13/7aab0be00c221.png)

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/13/e88cbeaf3a9d6.gif)

#### 1. 插入排序的基本实现：

```java
package com.singerw.bubble_sort;

public class Array_Loop_Insertion_Sort_02 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 10:41 2021-05-13
     */
    public static void main(String[] args) {
        // 定义一个数组并赋值
        int[] array = {122, 34, 56, 2, 34, 67, 243, 64};

        // 存储右侧临时数据（当前要插入进来的数据）
        int current;
        // 从1开始，因为122不用了
        for (int i = 1; i < array.length; i++) {
            // 将122右侧的数据临时存储起来，放入一个自定义变量中
            current = array[i];
            // 循环比较
            // 从i-1的位置开始比较，一直到索引位置为0停止
            for (int j = i - 1; j >= 0; j--) {

                //比较
                if (current < array[j]){
                    // 位置的移动
                    array[j+1] = array[i];
                }else {
                    array[j+1] = current;
                    break;
                }
                // 特殊情况，如果发现j == 0
                if (j == 0){
                    array[j] = current;
                }
            }
        }
    }
}
```



#### 2. 实例与练习

```java
```



# Java 二维数组

### 一、 创建数组

> 数组元素类型[ ][ ] 变量名称=new 数组元素类型[一维长度] [二维长度];

```java
package com.singerw.array_03;

public class Array_01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 13:55 2021-05-13
     */
    public static void main(String[] args) {
        // 定义数组，三行四列
        int[][] array = new int[3][4];

        System.out.println(array[1][0]);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        // 3行，每行有几个元素没有声明
        int[][] array1 = new int[3][];
        // 不能指定列，而不指定行 ==》编译出错
        System.out.println(array1[1][0]);
        System.out.println(array1[0].length);
        System.out.println(array1[1].length);
    }
}
```



### 二、杨辉三角

```java
package com.singerw.array_03;

public class ArrayYangHuiSanJiao {
    /**
     * @Author Singerw_辛格
     * @Description //杨辉三角
     * @Date 14:24 2021-05-13
     */

    public static void main(String[] args) {
        int[][] array = new int[20][20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {

                // 两个条件
                if (j == 0 || i == j){
                    array[i][j] = 1;
                }else {
                    array[i][j] = array[i -1][j] +array[i-1][j-1];
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
```





