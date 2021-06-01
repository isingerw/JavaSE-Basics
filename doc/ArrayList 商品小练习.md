# ArrayList 小练习

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/30/129de1451d371.png" style="zoom:75%;" />

### **BookEntity**

```java
package com.singerw.book.entity;

/**
 * @ClassName: BookEntity
 * @Description: //TODO 完成Book的管理，查询，修改，删除，增加操作(ArrayList来存储)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookEntity {

    private String bookid;
    private String title;
    private String writer;
    private double price;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookEntity() {
    }

    public BookEntity(String bookid, String title, String writer, double price) {
        this.bookid = bookid;
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "ISBN:" + bookid +
                ", 书名：'" + title + '\'' +
                ", 作者: '" + writer + '\'' +
                ", 价格: " + price +
                '}';
    }
}
```

### **BookDao**

```java
package com.singerw.book.dao;

import com.singerw.book.entity.BookEntity;

import java.util.ArrayList;

/**
 * @ClassName: BookDao
 * @Description: //TODO 查询，修改，删除，增加操作(ArrayList来存储)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookDao {

    /**
     * ArrayList来存储
     */
    ArrayList<BookEntity> list = new ArrayList<>();


    // 增加、删除、修改、查询操作

    /**
     * @param book
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:43
     * @Description: //TODO 添加书
     */
    public boolean addBook(BookEntity book) {
        //条件判断
        if (book == null) {
            return false;
        }
        list.add(book);
        return true;
    }

    /**
     * @param id
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:49
     * @Description: //TODO 查找并删除书
     */
    public boolean deleteBook(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 将集合中已存在的元素，临时变量赋值给find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())) {
                // 如果找到了删除这个元素
                list.remove(i);
                // 删除后，执行到return，方法体结束
                return true;
            }
        }
        // 如果没找到也没有做删除操作，则返回false,方法体结束
        return false;
    }

    /**
     * @param id
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:55
     * @Description: //TODO 查找元素并返回查找结果
     */
    public BookEntity getBookById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 将集合中已存在的元素，赋值给临时变量find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())) {
                // 如果找到了这个元素返回这个元素，方法体结束
                return find;
            }
        }
        // 如果没有找到这个元素则返回null,方法体结束
        return null;
    }

    /**
     * @param book
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 23:04
     * @Description: //TODO 查找并修改集合中的元素
     */
    public boolean updateBook(BookEntity book) {
        // 根据id查询是否包含这个p对象
        for (int i = 0; i < list.size(); i++) {
            // 集合中的元素 赋值给临时变量 find
            BookEntity find = list.get(i);
            if (book.getBookid().equals(find.getBookid())) {
                //用新的 p对象 把 pfind给替换掉
                list.set(i, book);
                // 如果执行到了return 那么方法结束
                return true;
            }
        }
        // 修改失败
        return false;
    }

    /**
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-30 16:18
     * @Description: //TODO
     */
    public ArrayList<BookEntity> getBookList() {
        return list;
    }
}
```

### **BookTest**

```java
package com.singerw.book.test;

import com.singerw.book.dao.BookDao;
import com.singerw.book.entity.BookEntity;

import java.util.ArrayList;

/**
 * @ClassName: BookTest
 * @Description: //TODO Book测试类
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        // 实例化BookDao对象
        BookDao bookDao = new BookDao();
        // 定义一个集合用于存放
        ArrayList<BookEntity> list = new ArrayList<>();


        // 1、添加操作
        // String bookid, String title, String writer, double price
        BookEntity book1 = new BookEntity("876-3-123-232572-5","Java开发者手册","孙雪莹",45.00);
        BookEntity book2 = new BookEntity("345-2-432-123452-4","神的操作","里尔",78.00);
        BookEntity book3 = new BookEntity("123-5-321-768954-2","用户手册","张虎",23.00);
        BookEntity book4 = new BookEntity("467-1-876-987645-1","醉风堂主","宋三",123.00);
        // 调用bookDao中的addBook方法将元素添加至集合中
        bookDao.addBook(book1);
        bookDao.addBook(book2);
        bookDao.addBook(book3);
        bookDao.addBook(book4);
        // 添加后输出集合
        System.out.println("———————————————————————————————添加后———————————————————————————————");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("集合中无元素");
        }else {
            list.forEach(System.out::println);
        }


        // 2、删除操作
        System.out.println("———————————————————————————————删除前———————————————————————————————");
        // 删除前输出集合元素
        list = bookDao.getBookList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }

        System.out.println("———————————————————————————————删除后———————————————————————————————");
        // 调用BookDao方法进行删除操作
        bookDao.deleteBook("876-3-123-232572-5");
        // 删除前输出集合元素
        list = bookDao.getBookList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }


        // 3、查询操作
        // 调用bookDao中的getBookById方法查询
        System.out.println("———————————————————————————————查询———————————————————————————————");
        System.out.println(bookDao.getBookById("123-5-321-768954-2"));
        System.out.println(bookDao.getBookById("876-3-1-5"));


        // 4、修改操作
        // 修改前输出
        System.out.println("———————————————————————————————修改前———————————————————————————————");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("集合中无元素");
        }else {
            list.forEach(System.out::println);
        }

        // 调用bookDao中的update方法进行修改操作
        BookEntity book = new BookEntity("345-2-432-123452-4", "Python", "张校长", 323.00);
        // 修改book  先查询再修改
        boolean flag = bookDao.updateBook(book);
        System.out.println(flag);
        // 修改后输出
        System.out.println("———————————————————————————————修改后———————————————————————————————");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("集合中无元素");
        }else {
            list.forEach(System.out::println);
        }
    }
}
```

### **控制台输出结果**

> ———————————————添加后———————————————
> BookDao{ISBN:876-3-123-232572-5, 书名：'Java开发者手册', 作者: '孙雪莹', 价格: 45.0}
> BookDao{ISBN:345-2-432-123452-4, 书名：'神的操作', 作者: '里尔', 价格: 78.0}
> BookDao{ISBN:123-5-321-768954-2, 书名：'用户手册', 作者: '张虎', 价格: 23.0}
> BookDao{ISBN:467-1-876-987645-1, 书名：'醉风堂主', 作者: '宋三', 价格: 123.0}
> ———————————————删除前———————————————
> BookDao{ISBN:876-3-123-232572-5, 书名：'Java开发者手册', 作者: '孙雪莹', 价格: 45.0}
> BookDao{ISBN:345-2-432-123452-4, 书名：'神的操作', 作者: '里尔', 价格: 78.0}
> BookDao{ISBN:123-5-321-768954-2, 书名：'用户手册', 作者: '张虎', 价格: 23.0}
> BookDao{ISBN:467-1-876-987645-1, 书名：'醉风堂主', 作者: '宋三', 价格: 123.0}
> ———————————————删除后———————————————
> BookDao{ISBN:345-2-432-123452-4, 书名：'神的操作', 作者: '里尔', 价格: 78.0}
> BookDao{ISBN:123-5-321-768954-2, 书名：'用户手册', 作者: '张虎', 价格: 23.0}
> BookDao{ISBN:467-1-876-987645-1, 书名：'醉风堂主', 作者: '宋三', 价格: 123.0}
> ———————————————查询———————————————
> BookDao{ISBN:123-5-321-768954-2, 书名：'用户手册', 作者: '张虎', 价格: 23.0}
> null
> ———————————————修改前———————————————
> BookDao{ISBN:345-2-432-123452-4, 书名：'神的操作', 作者: '里尔', 价格: 78.0}
> BookDao{ISBN:123-5-321-768954-2, 书名：'用户手册', 作者: '张虎', 价格: 23.0}
> BookDao{ISBN:467-1-876-987645-1, 书名：'醉风堂主', 作者: '宋三', 价格: 123.0}
> true
> ———————————————修改后———————————————
> BookDao{ISBN:345-2-432-123452-4, 书名：'Python', 作者: '张校长', 价格: 323.0}
> BookDao{ISBN:123-5-321-768954-2, 书名：'用户手册', 作者: '张虎', 价格: 23.0}
> BookDao{ISBN:467-1-876-987645-1, 书名：'醉风堂主', 作者: '宋三', 价格: 123.0}

