package Model;
// Generated 25 Feb 2016 5:52:23 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Events generated by hbm2java
 */
@Entity
@Table(name="events"
    ,catalog="churchdb"
)
public class Events  implements java.io.Serializable {


     private int memberId;
     private String name;
     private String title;
     private String location;
     private Date date;

    public Events() {
    }

	
    public Events(int memberId) {
        this.memberId = memberId;
    }
    public Events(int memberId, String name, String title, String location, Date date) {
       this.memberId = memberId;
       this.name = name;
       this.title = title;
       this.location = location;
       this.date = date;
    }
   
     @Id 

    
    @Column(name="MemberID", unique=true, nullable=false)
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    
    @Column(name="Name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Title", length=45)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="Location", length=45)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


