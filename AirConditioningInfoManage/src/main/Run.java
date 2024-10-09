package main;

import bean.AirConditionInfo;
import controller.AirConditionInfoController;

import java.util.Date;
import java.util.List;

public class Run {
    public static void main(String[] args)throws Exception {
        AirConditionInfoController airConditionInfoAction=new AirConditionInfoController();
//       插入
    /*    AirConditionInfo airConditionInfoInsert=new AirConditionInfo();
        airConditionInfoInsert.setId(3);
        airConditionInfoInsert.setCategory("力");
        airConditionInfoInsert.setPrice("2500");
        airConditionInfoInsert.setModel("B2");
        airConditionInfoInsert.setDate("2023.12.1");
        airConditionInfoInsert.setManufacturer("B厂");
        airConditionInfoInsert.setFactory("2023.12.6");
        airConditionInfoInsert.setPutdate("2023.12.15");
        airConditionInfoAction.insertAirConditionInfo(airConditionInfoInsert);*/
//        查询
        List<AirConditionInfo>airConditionInfoList=airConditionInfoAction.queryAirConditionInfo();
        for (AirConditionInfo airConditionInfo:airConditionInfoList){
            System.out.println("id:"+airConditionInfo.getId()+" 类别："+airConditionInfo.getCategory()+" 价格:"+airConditionInfo.getPrice()+" 型号:"+airConditionInfo.getModel()+" 生产日期:"+airConditionInfo.getDate()+" 厂家:"+airConditionInfo.getManufacturer()+" 出厂日期:"+airConditionInfo.getFactory()+" 入库时间:"+airConditionInfo.getPutdate());
        }

//        修改
        AirConditionInfo airConditionInfoUpdate=new AirConditionInfo();
        airConditionInfoUpdate.setId(2);
        airConditionInfoUpdate.setCategory("哈哈哈");
        airConditionInfoAction.updateAirConditionInfo(airConditionInfoUpdate);
//删除
       // airConditionInfoAction.deleteAirConditionInfo(1);
    }
}
