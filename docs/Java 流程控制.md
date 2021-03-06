# Java 流程控制

[TOC]



## 一 、Java 条件结构

### 1.1 if 语句

**语法：**

```java
if(布尔表达式){
   //如果布尔表达式为true将执行的语句
}
```

**实例：**


```java
public static void main(String[] args) {
        if(true){
            System.out.println("true.....");
        }
    }
```



### 1.2 if...else 语句

**语法：**

```java
if(布尔表达式){
   //如果布尔表达式的值为true
}else{
   //如果布尔表达式的值为false
}
```

**实例：**

```java
public static void main(String[] args) {
        System.out.println("我们在结婚吧！");
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        if (ans.equals("我愿意")){
            System.out.println("领证结婚，赶紧去泰国蜜月");
        }else {
            System.out.println("你是个好人");
        }
    }
```

```java
public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        }else{
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("三个数字：" + a + b + c + "中的最大值为" + max);
    }
```



### 1.3 if...else if...else 语句

**语法：**

```java
if(布尔表达式 1){
   //如果布尔表达式 1的值为true执行代码
}else if(布尔表达式 2){
   //如果布尔表达式 2的值为true执行代码
}else if(布尔表达式 3){
   //如果布尔表达式 3的值为true执行代码
}else {
   //如果以上布尔表达式都不为true执行代码
}
```

**实例：**

```java
public class Test {

   public static void main(String args[]){
      int x = 30;

      if( x == 10 ){
         System.out.print("Value of X is 10");
      }else if( x == 20 ){
         System.out.print("Value of X is 20");
      }else if( x == 30 ){
         System.out.print("Value of X is 30");
      }else{
         System.out.print("这是 else 语句");
      }
   }
}
```



### 1.4  if…else 嵌套语句

**语法：**

```java
if(布尔表达式 1){
   ////如果布尔表达式 1的值为true执行代码
   if(布尔表达式 2){
      ////如果布尔表达式 2的值为true执行代码
   }
}
```

**实例：**

```java
public class Test {

   public static void main(String args[]){
      int x = 30;
      int y = 10;

      if( x == 30 ){
         if( y == 10 ){
             System.out.print("X = 30 and Y = 10");
          }
       }
    }
}
```



### 1.5 switch-case 语句

- switch 语句中的变量类型只能为 byte、short、int  、char和enmu枚举类型。从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
- switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。

**语法：**

```java
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}
```

**实例：**

```java
public static void main(String[] args) {
        System.out.println("请输入月份");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println("请输入年份");
        int years = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(years + "年" + month + "月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(years + "年" + month + "月有30天");
            case 2:
                if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
                System.out.println(years + "年" + month + "月有29天");
            }else {
                    System.out.println(years+"年"+month+"月有28天");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
```

### 1.6 小练习

```java
import java.util.Scanner;

public class Review02 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 9:38 2021-05-11
     * @Param 输出三个整数
     * @return 从大到小排序
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int t;
        if (a < b) {
            // 交换位置，a和b的值交换了
            t = a;
            a = b;
            b = t;
        }

        if (b < c) {
            t = b;
            b = c;
            c = t;
        }

        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        System.out.println(a + ">" + b + ">" + c);
    }

}
```



## 二、Java 循环结构

> 顺序结构的程序语句只能被执行一次。如果您想要同样的操作执行多次,，就需要使用循环结构。
>
> Java中有三种主要的循环结构：
>
> - while循环
> - do…while循环
> - for循环
>
> 在Java5中引入了一种主要用于数组的增强型for循环。

### 2.1 for 循环

**语法：**

```java
for(初始化; 布尔表达式; 更新) {
    //代码语句
}
```

**实例：**

```java
public class Loop_For01{

    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 10:20 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum+i;
            System.out.println("第" + i + "次：" + i);
        }
        System.out.println("和为"+sum);
    }
```

```java
public class Loop_For02 {

    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Param 从控制台输入一个数字n
     *  * @return   求1+2+3+4+...n的和
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("请输入大于1的整数");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("sum=" + sum);
        }
    }
}
```

````java
public class Loop_For03 {

    /**
     * @return  返回1+2+3+4+...n的偶数和
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 10:46 2021-05-11
     * @Param 控制台输入n
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = input.nextInt();
        int sum = 0;
        if (n < 1) {
            System.out.println("请输入大于1的整数");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
````

### 2.2 break 关键字

> break主要用在循环语句或者switch语句中，用来跳出整个语句块。
>
> break跳出最里层的循环，并且继续执行该循环下面的语句。
>
> 跳出循环，跳出一层

**实例：**

```java
public class LoopForBreak {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 13:59 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum = sum + i;
            if (sum > 4000){
                break;
            }
        }
        System.out.println("sum" + sum);
    }
}
```

### 2.3 continue关键字

> continue适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
>
> 在for循环中，continue语句使程序立即跳转到更新语句。
>
> 在while或者do…while循环中，程序立即跳转到布尔表达式的判断语句。
>
> 终止当次循环，关键字循环体中的代码不执行，尝试进行下一次循环

**实例：**

```java
public class LoopForContinue {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 14:06 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i % 5 ==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
```

### 2.4 break continue小练习

```java
public class Continue02 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 14:19 2021-05-11
     * @Param continnue 应用，1-100累加，跳过3或5的倍数
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
```



### 2.5 while 循环

> while循环通常用于循环次数不确定的情况
>
> 只要布尔表达式为true，循环体会一直执行下去。

**语法：**

```java
while( 布尔表达式 ) {
	//循环内容
}
```

**实例：**

```java
public class While {

    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 16:28 2021-05-11
    * @Param  循环输出10次i
    * @return
    */
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("over");
    }
}
```

```java
public class While02 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 16:30 2021-05-11
    * @Param 让用户一直从控制台输入，直到用户输入的字符串为no的时候，结束循环
    * @return
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串，输入no结束");
        String str;
        while (!"no".equals(str = input.next())){
            System.out.println(str);
        }
        System.out.println("over");
    }
}
```

```java
public class While05_BallEr {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 15:43 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        double height = 100;
        double sum = 0;
        int i = 1;
        while (i <= 10) {
            // 累加落下的高度
            sum = sum + height;
            // 弹起一半
            height = height / 2;
            // 累加弹起的高度
            sum = sum + height;

            System.out.println(height);
            System.out.println(sum);
            i++;
        }
    }
}
```



### 2.6 do while 循环

> 对于while语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
>
> do…while循环和while循环相似，不同的是，do…while循环至少会执行一次。

**语法：**

```java
do {
       //代码语句
}while(布尔表达式);
```

**实例：**

```java
public class Do_While01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 16:52 2021-05-11
     */
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
        } while (i > 1);
        System.out.println("over");
    }
}
```



### 2.7 增强for循环

**语法：**

```java
for(声明语句 : 表达式)
{
   //代码句子
}
```

> **声明语句：**声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
>
> **表达式：**表达式是要访问的数组名，或者是返回值为数组的方法。

**实例：**

```java
```

