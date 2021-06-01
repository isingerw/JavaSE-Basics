# 泛型

​		泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法。

* Java语言引入泛型的好处是**安全简单**。可以将运行时类型相关错误提前到编译时错误
* 泛型的好处是在**编译的时候检查类型安全**，并且所有的强制转换都是自动和隐式的，提高代码的重用率

```java
package com.singerw.demogen;

public class Goods implements Comparable<Goods> {

	@Override
	public int compareTo(Goods o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int id;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
```

```java
package com.singerw.demogen;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestGoods2
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-01 9:49
 * @Version: 1.0
 */
public class TestGoods2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 存放就是商品
        List list = new ArrayList();
        Goods g = new Goods();
        // ? 一元硬币
        list.add(g);

        // 如果没有使用泛型，我们存进去之后就是Object
        // 当我们取出来的时候，也是object,没办法直接使用
        for (Object object : list) {
            // ???
            Goods obj = (Goods) object;
            System.out.println(obj.getId());
        }

        System.out.println("********************");
        // <一个类型 引用类型>
        List<Goods> list1 = new ArrayList<Goods>();

        Goods g1 = new Goods();
        // ? 一元硬币
        list1.add(g);

        for (Goods goods : list1) {
            System.out.println(goods.getId());
        }
    }
}
```

> 0
> ********************
> 0

