package net.jqsoft.domain;

public class Emp {
    private Integer empno;
    private String name;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                '}';
    }

}
