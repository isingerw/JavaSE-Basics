# 程序员必备技能 Debug

> * 代码运行结果和预期结果不一致
> * 编译通过，运行的过程中出现了异常
> * 初学者必须了解代码的执行过程

---

## 一、Debug 执行步骤

1. 在行标记的位置双击加入`断点`，程序执行过程中要暂停的那行代码；
2. 右击或状态栏选择`Debug As Java` 执行程序；
3. 点击状态栏`Step Over`或快捷键`F6`执行单步运行；
4. 可在右边状态栏`Expressions`中添加自定义参数或表达式；
5. 观察变量或表达式的值，从而查找程序的问题所在；
6. 修正错误并验证。

![Eclipse—Debug](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/11/8a8a71c4126d6.png)

![Step Over](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/11/b4285e5fdfad9.png)



## 二、Debug 经典应用练习

> 弹弹球的问题1：
>
> 一个弹弹球从100m的高度落下，每次弹起来的高度是原来的一半。
>
> 问：第几次落地后谈起的高度小于0.1m?

```java
public class Debug {
    /**
    * @Author Singerw_辛格 
    * @Description //TODO 
    * @Date 15:31 2021-05-11
    * @Param 
    * @return  
    */
    public static void main(String[] args) {
        double height = 100;
        for (int i = 1; height >= 0.1 ; i++) {
            height = height / 2;
        }
    }
}
```

> 弹弹球的问题2：
>
> 累加小于0.1m弹弹球弹起的高度

```java
public class Debug02 {
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
        for (int i = 1; i <= 10; i++) {
            // 累加落下的高度
            sum = sum + height;
            // 弹起一半
            height = height / 2;
            // 累加弹起的高度
            sum = sum +height;
            
            System.out.println(height);
            System.out.println(sum);
        }
    }
}
```

![IDEA经典弹弹球Debug](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/11/2d899aa6ef030.gif)

