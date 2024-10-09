package dao.impl;

import bean.AirConditionInfo;
import dao.IAirConditionInfoDao;
import utils.Conn;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirConditionInfoDaoImpl implements IAirConditionInfoDao {
    Conn conn=new Conn();
    @Override
    public List<AirConditionInfo> queryAirConditionInfo() throws Exception {
        List<AirConditionInfo>list=new ArrayList<>();
        String query="select * from air";
        ResultSet rs=conn.query(query);
        while (rs.next()){
            AirConditionInfo airConditionInfo=new AirConditionInfo();
            airConditionInfo.setId(rs.getInt("id"));
            airConditionInfo.setCategory(rs.getString("category"));
            airConditionInfo.setPrice(rs.getString("price"));
            airConditionInfo.setModel(rs.getString("model"));
            airConditionInfo.setDate(rs.getString("date"));
            airConditionInfo.setManufacturer(rs.getString("manufacturer"));
            airConditionInfo.setFactory(rs.getString("factory"));
            airConditionInfo.setPutdate(rs.getString("putdate"));
            list.add(airConditionInfo);
        }
        return list;
    }

    @Override
    public boolean insertAirConditionInfo(AirConditionInfo airConditionInfo) throws Exception {
        int id=airConditionInfo.getId();
        String category=airConditionInfo.getCategory();
        String price=airConditionInfo.getPrice();
        String model=airConditionInfo.getModel();
        String date=airConditionInfo.getDate();
        String manufacturer=airConditionInfo.getManufacturer();
        String factory=airConditionInfo.getFactory();
        String putdate=airConditionInfo.getPutdate();

        String insert="insert into air value("+id+",'"+category+"','"+price+"','"+model+"','"+date+"','"+manufacturer+"','"+factory+"','"+putdate+"')";
        System.out.println(insert);
        return conn.insert(insert);
    }

    @Override
    public boolean updateAirConditionInfo(AirConditionInfo airConditionInfo) throws Exception {
        int id=airConditionInfo.getId();

        String category=airConditionInfo.getCategory();

        String update="update air set category='"+category+"'where id="+id;
        return conn.update(update);
    }

    @Override
    public boolean deleteAirConditionInfo(int id) throws Exception {
        String del="delete from air where id="+id;

        return conn.del(del);
    }
}
