package com.singerw.list.phone.pojo;

/**
 * @ClassName: Phonepojo
 * @Description: TODO(������һ�仰��������������)
 * @Author ����
 * @Date 2021-05-27 21:46
 * 1��phone�� ����: ��� �۸� �ͺ� Ʒ��
 * 2��phoneDao add,delete,getbyid,getall
 * 3��phonetest �����ĸ�����ʵ����ɾ���
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
        return "�ֻ�{" +
                "���='" + id + '\'' +
                ", �۸�='" + prive + '\'' +
                ", �ͺ�='" + model + '\'' +
                ", Ʒ��='" + brand + '\'' +
                '}';
    }
}
