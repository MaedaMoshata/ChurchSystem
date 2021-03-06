package Model;
// Generated 25 Feb 2016 5:52:23 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Finance generated by hbm2java
 */
@Entity
@Table(name="finance"
    ,catalog="churchdb"
)
public class Finance  implements java.io.Serializable {


     private String name;
     private String address;
     private Integer contact;
     private String email;

    public Finance() {
    }

	
    public Finance(String name) {
        this.name = name;
    }
    public Finance(String name, String address, Integer contact, String email) {
       this.name = name;
       this.address = address;
       this.contact = contact;
       this.email = email;
    }
   
     @Id 

    
    @Column(name="Name", unique=true, nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Address", length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="Contact")
    public Integer getContact() {
        return this.contact;
    }
    
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    
    @Column(name="Email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


