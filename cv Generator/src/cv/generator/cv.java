
package cv.generator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class cv {
    @Id 
    @GeneratedValue
     private int id;
     private String fname;
     private String sname;
     private String adress1;
     private String address2;
     private String postcode;
     private String nationality;
     private String dob;
     private String contact;
     private String email;
     
     private String cn1;
     private String wd1;
     private String cn2;
     private String wd2 ;
     private String cn3;
     private String wd3;
    
      private String skill1;
      private String skill2;  
      private String skill3;
      private String skill4;
    
     private String univname;
     private String q1;
     private String q2;

     @blob
     private byte[] image;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAdress1() {
        return adress1;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCn1() {
        return cn1;
    }

    public void setCn1(String cn1) {
        this.cn1 = cn1;
    }

    public String getWd1() {
        return wd1;
    }

    public void setWd1(String wd1) {
        this.wd1 = wd1;
    }

    public String getCn2() {
        return cn2;
    }

    public void setCn2(String cn2) {
        this.cn2 = cn2;
    }

    public String getWd2() {
        return wd2;
    }

    public void setWd2(String wd2) {
        this.wd2 = wd2;
    }

    public String getCn3() {
        return cn3;
    }

    public void setCn3(String cn3) {
        this.cn3 = cn3;
    }

    public String getWd3() {
        return wd3;
    }

    public void setWd3(String wd3) {
        this.wd3 = wd3;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getSkill4() {
        return skill4;
    }

    public void setSkill4(String skill4) {
        this.skill4 = skill4;
    }

    public String getUnivname() {
        return univname;
    }

    public void setUnivname(String univname) {
        this.univname = univname;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }
}
