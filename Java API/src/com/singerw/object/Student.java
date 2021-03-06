package com.singerw.object;

public class Student {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //指向相同
        if (this == obj) {
            return true;
        }
        //空对象
        if (obj == null) {
            return false;
        }
        //class类型
        if (getClass() != obj.getClass()) {
            return false;
        }
        //转型
        Student other = (Student) obj;
        //判断id
        if (id != other.id) {
            return false;
        }
        //判断name
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }



}
