package com.singerw.review;

/**
 * Collection:接口
 *     -- List->子接口(有序，可重复，可以为null,长度可变)
 *         -- ArrayList 底层数组，查找效率比较高
 *         -- LinkedList 底层链表 ，添加和删除效率高
 *         -- Vector     线程安全 
 *     -- Set->子接口(无序，不能重复，可以为null，长度可变)
 *         -- HashSet 无序 底层hashmap
 *         -- TreeSet 自然顺序
 *
 * Map: 接口  键值对，键不可以重复，值可以重复. 键和值 可以为null
 *     -- HashMap				非线程安全
 *     -- ConcurrentHashMap     线程安全
 *     -- HashTable             线程安全
 *     
 *     
 *   t工具类：
 *   Arrays:针对数组操作
 *      Arrays.sort(T[] array);
 *      
 *      Arrays.sort(T[] array,Comparator); //外部
 *   Collections:针对集合操作类
 *   
 *      Collections.sort(list, c); //c 外部比较器对象
 *   
 *   内部比较器：自定义实体类 实现 Comparable接口。
 *   外部比较器:    自定义独立的类去实现Comparator ,外部比较器
 * @author Administrator
 *
 */
public class Review01 {

	public static void main(String[] args) {
		//sort(T[] a, Comparator<? super T> c) {
		//Arrays.sort(a, c);
		
		//Collections.sort(list, c);

	}

}
