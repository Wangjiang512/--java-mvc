package bean;

import java.util.Date;

public class AirConditionInfo {
    private Integer id;
    private String category;//类别
    private String price;//价格
    private String model;//模型
    private String date;//生产日期
    private String manufacturer;//制造商
    private String factory;//厂商
    private String putdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getPutdate() {
        return putdate;
    }

    public void setPutdate(String putdate) {
        this.putdate = putdate;
    }
}
