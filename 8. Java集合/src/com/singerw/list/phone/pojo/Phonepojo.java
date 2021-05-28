package com.singerw.list.phone.pojo;

/**
 * @ClassName: Phonepojo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-27 21:46
 * 1、phone类 属性: 编号 价格 型号 品牌
 * 2、phoneDao add,delete,getbyid,getall
 * 3、phonetest 调用四个方法实现增删查改
 */
public class Phonepojo {
    private String id;
    private String prive;
    private String model;
    private String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrive() {
        return prive;
    }

    public void setPrive(String prive) {
        this.prive = prive;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Phonepojo() {
    }

    public Phonepojo(String id, String prive, String model, String brand) {
        this.id = id;
        this.prive = prive;
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "手机{" +
                "编号='" + id + '\'' +
                ", 价格='" + prive + '\'' +
                ", 型号='" + model + '\'' +
                ", 品牌='" + brand + '\'' +
                '}';
    }
}
