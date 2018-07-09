package cv.generator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
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
     @Lob
     private byte[] image;
    
     //@Embedded 
     private skills skill;
     private workexperience work;
     private qualifications qual;

    public skills getSkill() {
        return skill;
    }

    public void setSkill(skills skill) {
        this.skill = skill;
    }

    public workexperience getWork() {
        return work;
    }

    public void setWork(workexperience work) {
        this.work = work;
    }

    public qualifications getQual() {
        return qual;
    }

    public void setQual(qualifications qual) {
        this.qual = qual;
    }
     
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
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

}
