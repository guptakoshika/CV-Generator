package cv.generator;

import javax.persistence.Embeddable;

@Embeddable
public class workexperience {
    
    private String cn1;
     private String wd1;
     private String cn2;
     private String wd2 ;
     private String cn3;
     private String wd3;

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
}
