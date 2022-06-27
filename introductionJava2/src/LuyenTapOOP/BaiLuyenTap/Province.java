package LuyenTapOOP.BaiLuyenTap;

import java.io.Serializable;

public class Province implements Serializable {
    private String name;
    private int gdp, popular, area;
    private Country country;


    public Province(String name, int gdp, int popular, int area, Country country) {
        this.name = name;
        this.gdp = gdp;
        this.popular = popular;
        this.area = area;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public int getPopular() {
        return popular;
    }

    public void setPopular(int popular) {
        this.popular = popular;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Province{" +
                "ProvinceName='" + name + '\'' +
                ", gdp=" + gdp +
                ", popular=" + popular +
                ", area=" + area + ", " +
                country +
                '}';
    }
}

