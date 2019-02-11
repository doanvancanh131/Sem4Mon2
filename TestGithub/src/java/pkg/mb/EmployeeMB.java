/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg.mb;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pkg.ejb.IEmployeeImp;
import pkg.entity.TbEmployee;

/**
 *
 * @author hp
 */
@ManagedBean
@RequestScoped
public class EmployeeMB {
    @EJB
    private IEmployeeImp employeeSessionBean;
    private TbEmployee employee=null;
    private String id;
   
    public EmployeeMB() {
    }
    
    public List<TbEmployee> findAll(){
        return employeeSessionBean.findAll();
    }
    
    public String delete(String id){
        if (employeeSessionBean.delete(id)) {
            return "index";
        }
        return "error";
    }
    public String displaycreate(){
        employee = new TbEmployee();
        return "create";
    }
    public String create(){
        TbEmployee nemployee = new TbEmployee();
        nemployee.setId(id);
        nemployee.setName(employee.getName());
        nemployee.setPassword(employee.getPassword());
        nemployee.setJob(employee.getJob());
        if (employeeSessionBean.create(nemployee)) {
            return "index";
        }
        return "error";
    }

    public TbEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(TbEmployee employee) {
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
}
