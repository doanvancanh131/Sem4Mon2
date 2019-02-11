/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "tbEmployee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEmployee.findAll", query = "SELECT t FROM TbEmployee t"),
    @NamedQuery(name = "TbEmployee.findById", query = "SELECT t FROM TbEmployee t WHERE t.id = :id"),
    @NamedQuery(name = "TbEmployee.findByName", query = "SELECT t FROM TbEmployee t WHERE t.name = :name"),
    @NamedQuery(name = "TbEmployee.findByPassword", query = "SELECT t FROM TbEmployee t WHERE t.password = :password"),
    @NamedQuery(name = "TbEmployee.findByJob", query = "SELECT t FROM TbEmployee t WHERE t.job = :job")})
public class TbEmployee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Id")
    private String id;
    @Size(max = 50)
    @Column(name = "Name")
    private String name;
    @Size(max = 50)
    @Column(name = "Password")
    private String password;
    @Size(max = 30)
    @Column(name = "Job")
    private String job;

    public TbEmployee() {
    }

    public TbEmployee(String id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEmployee)) {
            return false;
        }
        TbEmployee other = (TbEmployee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg.entity.TbEmployee[ id=" + id + " ]";
    }

    public TbEmployee(String id, String name, String password, String job) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.job = job;
    }
    
    
}
