/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pkg.entity.TbEmployee;

/**
 *
 * @author hp
 */
@Stateless
public class EmployeeSessionBean implements IEmployeeImp{
    @PersistenceContext(unitName = "pretest3PU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<TbEmployee> findAll() {
        Query q = em.createQuery("SELECT t FROM TbEmployee t", TbEmployee.class);
        return q.getResultList();
    }

    @Override
    public boolean create(TbEmployee employee) {
        TbEmployee newEmployee = em.find(TbEmployee.class, employee.getId());
        if (newEmployee==null) {
            newEmployee = new TbEmployee();
            
            newEmployee.setId(employee.getId());
            newEmployee.setJob(employee.getJob());
            newEmployee.setName(employee.getName());
            newEmployee.setPassword(employee.getPassword());
            
            em.persist(newEmployee);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        TbEmployee employee = em.find(TbEmployee.class, id);
        if (employee!=null) {
            em.remove(employee);
            return true;
        }
        return false;
    }

    
}
