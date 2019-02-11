/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg.ejb;

import java.util.List;
import pkg.entity.TbEmployee;

/**
 *
 * @author hp
 */
public interface IEmployeeImp {
    List<TbEmployee> findAll();
    boolean create(TbEmployee employee);
    boolean delete(String id);
}
