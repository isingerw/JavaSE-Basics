package com.singerw.product;
/**
* @ClassName: Product
* @Description: 实现商品信息的增删查改
* @Author 张欣
* @Date 2021-05-27 16:14
*/
public class Product {
    private String id;
    private String name;
    private double prive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrive() {
        return prive;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }

    public Product() {
    }

    public Product(String id, String name, double prive) {
        this.id = id;
        this.name = name;
        this.prive = prive;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", prive=" + prive +
                '}';
    }
}
