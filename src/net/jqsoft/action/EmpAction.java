package net.jqsoft.action;

import net.jqsoft.domain.Emp;
import net.jqsoft.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpAction {

    @Autowired
    EmpService empService;

    List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public String list(){
        System.out.println("================"+empService+"================");
        empList= empService.findAll();
        return "success";
    }
}
