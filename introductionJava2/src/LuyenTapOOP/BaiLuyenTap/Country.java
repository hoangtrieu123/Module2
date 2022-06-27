package LuyenTapOOP.BaiLuyenTap;

import java.io.Serializable;

public class Country implements Serializable {
    public String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country" +
                ": " + "'" + name + '\''
                ;
    }
}
