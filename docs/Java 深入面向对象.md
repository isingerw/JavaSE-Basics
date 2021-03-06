[TOC]



# Java 深入面向对象

---

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/21/198928251d8c0.png" style="zoom:150%;" />



---

## 一、面向对象特性

### 1.1 三大特征说明

* 封装
* 继承
* 多态



### 1.2 包的定义和导入

> 为了更好地组织类，Java 提供了包机制，用于区别类名的命名空间

**1.包的作用：**

​		Java 使用包这种机制是为了防止命名冲突，访问控制，提供搜索和定位类、接口、枚举和注解等，它把不同的 java 程序分类保存，更方便的被其他 java 程序调用。



**2. 包命名规范：**

​		通常，一个公司使用它互联网域名的颠倒形式来作为它的包名.例如：互联网域名是 `chinasofti.com`，所有的包名都以 `com.chinasofti `开头 。

```java
com.chinasofti.etc.example.se.oop.adcanced
com.singerw.oop
```

> 包声明应该在源文件的第一行，每个源文件只能有一个包声明，这个文件中的每个类型都应用于它



**3.使用 `import`语句完成导包**

```java
import package1[.package2…].(classname|*);
```

> import语句中类名部分可以使用通配符`*`
>
> 符号`*`表示直接导入包中所有的类

如：`import com.chinasofit.*` 表示导入`com.chinasofti`包中所有的类



### 1.3 类访问修饰符

* `Public`:权限访问修饰符，任何位置都可以使用，可以被任何代码访问
* `Default`（默认值）: `package `包级别，即同一个包下可以访问，（不提供访问控制符）：仅可被同包的其他代码访问

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/20/bcc3905bec95c.png)

![QQ截图20210520161300.png](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/20/7c234752be3e5.png)



### 1.4 成员访问修饰符/控制符

* 除了类自身存在访问控制外，类的成员还存在更为精确的权限控制体系。
* 为了实现封装特性，可以通过对类成员的权限访问来隐藏数据而暴露操作接口（简单来说就是阻止对成员变量的直接操作而由暴露成员方法对数据进行操作）。

**1、类成员的访问级别有四种：**

* **`private`(私有的)**

* **`default`(不使用`default`关键字，和类的`default`类似，不提供修饰符即为默认权限)**

* **`protected` (安全的)：如果一个类中变量或方法有修饰字protected，同一类，同一包可使用。不同包的类要使用，必须是该类的子类。需要注意的是，即便在非同包的子类中，也只能通过直接调用继承下来的成员的方式访问protected成员，而不能使用父类的引用进行调用**

* **`public`(公共的)：任何其它类对象，只要可以看到这个类的话，那么它就可以存取变量的数据，或使用方法**



**2、成员访问控制符总结：**

|             | **同一个类中** | **同一个包中** | **不同包中的子类** | **不同包中的非子类** |
| :---------: | :------------: | :------------: | :----------------: | :------------------: |
|  `private`  |       ★        |                |                    |                      |
|  `default`  |       ★        |       ★        |                    |                      |
| `protected` |       ★        |       ★        |         ★          |                      |
|  `public`   |       ★        |       ★        |         ★          |          ★           |





---

## 二、封装

**高内聚，低耦合**

采用`get/set`

* `get` : 获得这个数据
* `set` : 给这个数据设置值

**封装的意义：**

* 提高程序和代码的安全性，保护数据，隐藏代码的实现细节
* 统一接口
* 增加系统可维护性
* 属性私有化，提供公共的方法用来访问私有的属性；读写方法中加入一些限制。

```java
package com.singerw.oop;

public class Demo03 {
    // 1 private 属性私有化
    private String name;
    private int age;
    private char sex;

    // 2 提供公共的方法用来访问私有的属性
    // 提供一些Public 的 get set 方法
    // Alt+Insert

    // get 获得这个数据
    public String getName() {
        return name;
    }
    // 3 给这个数据设置值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
```

```java
package com.singerw.oop;
class Demo03Test {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        demo03.setName("ZHANGSINGERW");
        demo03.setAge(23);
        demo03.setSex('男');
    }
}
```



---

## 三、继承（关系）

### 3.1 继承关系

* Java中的类只有单继承，没有多继承。
* 继承关系的两个类，一个为子类（派生类），一个为父类（基类），子类继承父类，使用关键字`extends`来表示。
* `extends` 的意思是"拓展"，子类是父类的拓展
* **在Java中，所有的类都间接或者直接继承默认的`Object`类**

```java
package com.singerw.demo05;

public class Person {
    // public
    // protected
    // default
    // private
    private int money = 10_0000_0000;
    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
```

```java
package com.singerw.demo05;

// 学生 is 人 ： 派生类，子类

public class Student extends Person{

}
```

```java
package com.singerw.demo05;

class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.say();
        System.out.println(student.getMoney());
    }
}
```

```java
package com.singerw.day10;

public class Father {
    private int n = 100;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void t(){
        System.out.println("father t()");
    }
}
```

```java
package com.singerw.day10;

public class Son extends Father {
    public void test1(){
        // 在子类实例方法调用父类中的实例方法t()；
        // sqper关键字，一定出现在子类中，调用父类的属性或者方法
        super.t();
        t(); // 如果不加super，默认找当前类的方法t()，如果当前类中不存在，再去调用父类中的方法t()

    }

}
```



### 3.2  super（重点）

**`super`注意点：**

* `super`可以用在子类的构造方法中;调用父类的构造方法 super(); 必须是子类构造中个**第一行代码**;
* `super`放在子类的普通方法中，可以调用父类的公共的方法: `super.父类方法名()`;
* `super`必须只能出现在子类的方法或者构造方法中！
* `super`和`this`不能同时调用构造方法！

**`this` VS `super`:**

* 代表的对象不同：
  * `this`：本身调用者这个对象
  * `super`：代表父类对象的应用
* 前提：
  * `this`：没有继承也可以使用
  * `super`：只能在继承条件下才能使用
* 构造方法：
  * `this()`：本类的构造
  * `super()`：父类的构造



```java
package com.singerw.demo05;

public class Person {
    protected String name = "张欣";
    }
}
```

```java
package com.singerw.demo05;

// 学生 is 人 ： 派生类，子类

public class Student extends Person{
    private String name = "zhangsingerw";

    public void test1(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
```

```java
package com.singerw.demo05;

class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.test1("singerw");
    }
}
```

> singerw
> zhangsingerw
> 张欣



---

```java
package com.singerw.demo05;

public class Person {
    protected String name = "张欣";

    public void print(){
        System.out.println("Person");
    }
}
```

```java
package com.singerw.demo05;

// 学生 is 人 ： 派生类，子类

public class Student extends Person{
    private String name = "zhangsingerw";

    public void test1(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void test2(){
        print();
        this.print();
        super.print();
    }
}
```

```java
package com.singerw.demo05;

class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
//        student.test1("singerw");
        student.test2();
    }
}
```

> Person
> Person
> Person



**调用父类的构造器，必须要在子类构造器的第一行**

---

```java
package com.singerw.demo05;

public class Person {
    protected String name = "张欣";

    // 构造函数
    public Person() {
        System.out.println("Person无参执行了");
    }
}
```

```java
package com.singerw.demo05;

// 学生 is 人 ： 派生类，子类

public class Student extends Person{
    // 构造函数
    public Student(){
        // 隐藏代码  super();  默认先调用执行父类的无参构造super();
        // 调用父类的构造器，必须要在子类构造器的第一行
        System.out.println("Student无参执行了");
    }
}
```

```java
package com.singerw.demo05;

class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
```

> Person无参执行了
> Student无参执行了



### 3.3 方法重写（重点）

**方法的重写的规则：**

* 发生在继承关系的子类中，对父类中的一个方法重新实现（子类重写父类的方法！）
* 在有返回值且返回值为引用类型的情况下，子类的方法返回值类型可以是父类方法返回值的子类。
* 语法结构：
  * 子类的方法签名和父类的一致
  * 参数列表必须相同，但参数的引用名可以不同。
  * 修饰符：范围可以扩大但是不能缩小  `publiuc` > `protected `> `default` > `private`
  * 抛出的异常：范围可以被缩小但是不能扩大  `ClassNotFoundException`----> `Exception(大)`

```java
package com.singerw.day10;

/**
 * @ClassName: Animal
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-18 10:08
 */
public class Animal {
   
    public void eat(String food) {
        System.out.println("在吃" + food);
    }
}


class Snake extends Animal {
    @Override
    // 参数列表必修相同，但参数的引用名food可以不同。
    public void eat(String food) {
        System.out.println("吞一口：" + food + "吐一口");
    }
}


class Monkey extends Animal {
    @Override
    // 参数列表必修相同，但参数的引用名food可以不同。
    public void eat(String food) {
        System.out.println("吃一口：" + food + "丢一口");
    }

}
```



### 3.4 引用和对象

```java
package com.singerw.day10;

/**
 * @ClassName: Animal
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-18 10:08
 */
public class Animal {
    public void eat(String food) {
        System.out.println("在吃" + food);
    }
}

class Monkey extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("吃一口：" + food + "丢一口");
    }
}
```



```java
package com.singerw.day10;

public class AnimalTest {
    public static void main(String[] args) {
        // 1.子类引用 = 子类对象
        Monkey monkey1 = new Monkey();
        monkey.eat("仙桃");
        
        // 2.父类引用 = 父类对象
        Animal animal = new Animal();
        animal.eat("食物");
        
        // 3.父类引用 = 子类对象
        // 实际调用方法的时候是和new出来的对象有关的。（对象有调子类的，没有就调用父类的）
        Animal ani = new Monkey();
        ani.eat("鲜桃");
        
        // 4.子类引用 = 父类对象
        // 虽然可以进行强制转换，保证编译不出错，但是运行时会出错！
        Monkey mon = (Monkey) new Animal();
        mon.eat("桃儿");
    }
}
```



---

## 四、多态

### 1.1 多态

**多态性:**指允许不同类的对象对同一消息做出响应。即同一消息可以根据发送对象的不同而采用多种不同的行为方式。



**多态存在的条件：**

* 有继承关系
* 子类重写父类方法
  * `static`修饰的方法是属于类的，不属于实例，不能被重写
  * `final` 常量，不能被重写
  * `privat`修饰方法，私有的，也不能被重写
* 父类引用指向子类对象 `Father f1 = new Son`

**！注意：多态是方法的多态，属性没有多态性。**



**多态的实现方式：**

* 创建父类，定义方法
* 创建子类，重写父类的方法
* 场景类中，有一个方法，父类引用作为参数
* 实际调用的时候传递的参数为子类对象

```java
```

```java
```

```java

```







### 1.2 instanceof 关键字

* 方便方法的调用，减少代码的复用

* 类型转换，是引用类型之间的转换，用来判断两个类是否存在父子关系。

```java
```

**类型之间的转换：**

```java
```

* 父类引用指向之类的对象
* 把子类转换为父类，向上转型
* 把父类转换为子类，向下转型，需要强制转换



---

## 五、修饰符：`final`

* 修饰类：用来修饰类时，这个类不能被继承；
* 修饰属性：用来修饰属性时，表示这个属性是常量；
* 修饰方法：用来修饰方法时，表示这个方法不能被重写；

> **常用final类 :`String`  `System`  **
>
> **常用`工具类`会被定义成`final`的**
>
> **`final`常量一旦赋值，不能再修改值**



---

## 六、修饰符：`static`

* 修饰类：用来修饰类时，这个类不能被继承；
* 修饰属性：用来修饰属性时，表示这个属性是类所以，所有实例都共享。**调用方法：`类名.属性名`或者`对象名.属性名`**
* 修饰方法：用来修饰方法时，表示这个方法是属于类所有。**调用方法：`类名.方法名`或者`实例名.方法名`， 建议使用`类名.方法名`来修饰方法**。
* **静态方法不能直接调用非静态的属性**



---

## 七、抽象类和抽象方法

* 在面向对象的概念中，知道所有的对象都是通过类来描绘的，但是反过来却不是这样。并不是所有的类都是用来描绘对象的，如形状类是抽象的类，圆、三角形等是具体类。
* 抽象类是抽象方法的容器，如果某个类中包含有抽象方法，那么该类就必须定义成抽象类。抽象类中也可以包含有非抽象的方法甚至抽象类中可以没有抽象方法（只要一个类不应该有具体对象，就应该是抽象类，不一定是有抽象方法的）
* **用`abstract`修饰的类就是抽象类，抽象类不能直接被实例化。**
* **抽象类的所有方法，继承了它的子类，都必须要实现抽象类的方法，除非子类也是抽象类。**

> 1. 抽象类可以包含普通方法吗？ `可以的`
>
> 2. 抽象类中可以包含抽象方法吗？ `是`
>
> 3. 抽象类的普通方法能否被子类继承？ `能`
>
> 4. 抽象类中可否有显式的构造方法？ `有，依然遵循继承关系`
>
> 5. 一个类继承了抽象类，能否不实现抽象类的抽象方法？ `可以，但是要继续抽象`
>
> 6. 抽象类中可以包含属性吗？ `可以的`
>
> 7. 使用场景主要是一些抽象概念性内容定义: `形状`，`门` ;主要用来做模板，标准；也就是定义了一个方法的签名，具体实现留给子类；



**1、抽象类**

```java
public  abstract class Person {
    
}
```

**2、抽象方法**

```java
class A{
    // 抽象方法
    public abstract void show();
    // 抽象方法
    public abstract class Shape {
        // 方法 计算面积
        // 抽象方法
        public abstract double getArea();
    }
}
```





---

## 八、接口的实现与定义

* 实现多继承；设计标准化；
* **接口定义了标准，定义的一组规则，接口实现了对多继承的支持；**
* 接口不能被实例化，接口中没有构造方法

### 8.1 定义语法

**1、Java中接口的一般定义形式如下：**

``` java
[访问权限] interface 接口名 {
    公开静态常量列表；
    公开抽象方法列表；
}
```

```java
package com.singerw.day12;

/**
* @ClassName: IA
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
* @Date 2021-05-20 9:47
*/
public interface IA {
    // 1 公共常量
    int a = 2; // a 要赋值才能定义使用
    final int b =2;
    static final int c = 2;
    public static final int d = 2;
    
    // 2 抽象方法
    public abstract void t1();
    abstract void t2();
    void t3();  //一般这样写
    
    // 3 默认方法
    void t4(){
        System.out.println("jdk1.8 default method");
    }
}
```

* 成员变量方面，在接口中只存在公开静态常量（即便没有使用`static final`修饰，`Java`也会默认确定其性质）

* 成员方法方面，在接口中只存在公开抽象方法（即便没有`abstract`修饰，`Java`也会默认其抽象性质）

### 8.2 接口实现

* 类可以实现接口，用`implements`接口；
* 实现了接口的类，就需要重写接口中的方法；
* 一个类可以实现多个接口：`Class` 类名` implements 接口1，接口2，接口3 …`

* 类中要实现接口中的抽象方法。不实现的话，这个类就要定义为抽象类；

```java
package com.inters;
/**
 * 接口
 * 接口不能直接进行实例化
 * @author Administrator
 *
 */
public interface IFly {
	void fly();
	
}


package com.inters;

public interface IEat {

	void eat();
}
```

```java
package com.inters;

/**
 * 实现类
 * implements 实现 @Override重写接口的方法
 * 
 * @author Administrator
 *
 */
public class Bird implements IFly, IEat {

	@Override
	public void fly() {
		System.out.println("笨鸟在飞");

	}

	// alt+/

	@Override
	public void eat() {
		System.out.println("笨鸟在吃虫子");

	}

}
```

```java
package com.inters;

/**
 * 测试类
 * 
 * @author Administrator
 */
public class TestBird {
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
		
		
		IFly bird2 = new Bird();
		bird2.fly();
		
	}
}
```



* **一个接口能继承一个接口吗？**

  可以

* **一个接口可以继承多个接口吗？**

  可以

* **如果一个类，继承了类同时有实现了接口，语法是什么样子的？**

  



### 8.3 类实现多态







### 8.4 类实现接口

```java
/**
* @ClassName: Review_01
* @Description: 一个类实现接口，要实现[重写]的是接口中的所有抽象方法
* @Author 张欣
* @Date 2021-05-20 14:40
*/
public class Review_01 implements IA {    // IA为定义的接口
    @Override
    public void t1() {
        System.out.println("子类来决定方法的执行过程和结果");
    }

    @Override
    public void t2() {

    }

    @Override
    public void t3() {

    }

    @Override
    public void t4() {

    }
}
```



### 8.5 接口应用（多态）

> **USB调用实例**

* 1、 创建接口，父类定义统一的方法
* 2.1、 创建接口实现类，`IUSB`，重写`Installdriver` `start` `stop`方法
* 2.2 、创建接口实现类，`IUSB`，重写`Installdriver`  `start`  `stop`方法
* 3 、类中有一个方法，方法的参数是接口引用
* 4 、测试类，我们根据情况，传递子类（接口实现类）的对象；最终执行结果，根据子类对象的不同，执行结果也不同

![QQ截图20210520143259.png](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/20/854509405d01e.png)

```java
package com.singerw.usbdemo;
/**
* @ClassName: IUSB
* @Description: 1 创建接口，父类定义统一的方法
* @Author 张欣
* @Date 2021-05-20 14:00
*/
public interface IUSB {
    void installDriver();
    void start();
    void stop();
}
```

```java
package com.singerw.usbdemo;
/**
* @ClassName: KeyBoard 接口的实现类
* @Description: 2.1 创建接口实现类，IUSB，重写Installdriver start stop方法
* @Author 张欣
* @Date 2021-05-20 14:02
*/
public class KeyBoard implements IUSB{
    @Override
    public void installDriver() {
        System.out.println("安装USB键盘驱动");
    }

    @Override
    public void start() {
        System.out.println("USB键盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("USB键盘停止工作");
    }
}
```

```java
package com.singerw.usbdemo;
/**
* @ClassName: Mouse 接口的实现类
* @Description: 2.2 创建接口实现类，IUSB，重写Installdriver start stop方法
* @Author 张欣
* @Date 2021-05-20 14:17
*/
public class Mouse implements IUSB {
    @Override
    public void installDriver() {
        System.out.println("安装USB鼠标驱动");
    }

    @Override
    public void start() {
        System.out.println("USB鼠标开始工作");
    }

    @Override
    public void stop() {
        System.out.println("USB鼠标停止工作");
    }
}
```

```java
package com.singerw.usbdemo;

import org.jetbrains.annotations.NotNull;

/**
* @ClassName: Computer
* @Description: 3 类中有一个方法，方法的参数是接口引用
* @Author 张欣
* @Date 2021-05-20 14:15
*/
public class Computer {
    public void install(IUSB usb){
        usb.installDriver(); // 安装设备驱动
        usb.start();  // 设备开始工作
        usb.stop();  // 设备停止工作
    }
}

```

```java
package com.singerw.usbdemo;

/**
* @ClassName: TestComputer
* @Description: 4 测试类，我们根据情况，传递子类（接口实现类）的对象；
 *                  最终执行结果，根据子类对象的不同，执行结果也不同
* @Author 张欣
* @Date 2021-05-20 14:20
*/
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 键盘设备
        KeyBoard keyBoard = new KeyBoard();
        // 调用安装的方法
        computer.install(keyBoard);

        // 鼠标设备
        Mouse mouse = new Mouse();
        computer.install(mouse);
    }
}
```



### 8.6 接口和抽象类区别

**在Java中接口是一个比抽象类更加抽象的概念**

**由于只声明行为，因此在接口中的方法均是抽象的,下表中罗列了接口和抽象类的差异：**

|              | **abstract  class**  抽象类 |         **interface**  接口          |
| :----------: | :-------------------------: | :----------------------------------: |
|   **属性**   |          不用限制           |            public静态常量            |
| **构造方法** |          可有可无           |                 没有                 |
| **普通方法** |       可以有具体方法        |         必须是public抽象方法         |
|   **子类**   |          单一继承           | 多重实现（接口继承接口时为多重继承） |







## 九、枚举

> `java.lang.enum`

















## 十、关联与依赖关系

### 10.1 关联关系

关联有两元关系和多元关系。两元关系是指一种一对一的关系，多元关系是一对多或多对一的关系。

**关联表示**`has-a`**关系，如学生拥有一个课程，往往表现为B作为A的**`属性`**存在（A关联B）**

> ​		最典型的一对一关系莫过于人和证件之间的关联，例如：一个人只能有一个驾照，而一个驾照只能归属与一个人。
>
> ​		人还可以跟其他事物构建一对多的关联关系，比如将驾照换为荣誉证书，那么一个人可以有多个荣誉证书，我们可以使用数组或集合来描述这个关系。

* 类与类之间的横向关系较为微妙，大体上可以分为四种：依赖 、关联、聚合、组合。
* 依赖体现了`use a`关系，通常使用方法的参数描述
* 关联体现了`has a`关系，通常使用类的成员属性描述几种关系的强弱如下：依赖 < 关联 < 聚合 < 组合



**1. 聚合**

>  **弱关联**

* 聚合是一种特殊的关联，表示整体对象拥有部分对象。
* 关联关系和聚合关系来语法上是没办法区分的，从语义上才能更好的区分两者的区别。
* 聚合是较强的关联关系，强调的是整体与部分之间的关系。
* 聚合的整体和部分之间在生命周期上没有什么必然的联系，部分对象可以在整体对象创建之前创建，也可以在整体对象销毁之后销毁。



**2.组合**

> **整体和部分的关系，强关联**

* 组合是聚合的一种形式，它具有更强的拥有关系，强调整体与部分的生命周期是一致的，整体负责部分的生命周期的管理。
* 生命周期一致指的是部分必须在组合创建的同时或者之后创建，在组合销毁之前或者同时销毁，部分的生命周期不会超出组合的生命周期。
* 例如Windows的窗口和窗口上的菜单就是组合关系。如果整体被销毁，部分也必须跟着一起被销毁，如果所有者被复制，部分也必须一起被复制。





### 10.2 依赖关系

>  **一个类方法，使用另外一个类的引用**

* 依赖关系是一种使用关系，特定事物的改变有可能会影响到使用该事物的事物，反之不成立。
* 此关系最为简单，也最好理解，所谓依赖就是某个对象的功能依赖于另外的某个对象，而被依赖的对象只是作为一种工具在使用，而并不持有对它的引用
* 依赖体现了 **`use a`**关系
* 依赖关系一般使用**方法的参数**体系



