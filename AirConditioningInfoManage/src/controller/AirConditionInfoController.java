package controller;

import bean.AirConditionInfo;
import service.IAirConditionInfoService;
import service.impl.AirConditionInfoServiceImpl;

import java.util.List;

public class AirConditionInfoController {
    IAirConditionInfoService airConditionInfoService=new AirConditionInfoServiceImpl();

    public List<AirConditionInfo>queryAirConditionInfo()throws Exception{
        return airConditionInfoService.queryAirConditionInfo();
    }

    public boolean insertAirConditionInfo(AirConditionInfo airConditionInfo)throws Exception{
        boolean flag=airConditionInfoService.insertAirConditionInfo(airConditionInfo);
        if (flag){
            System.out.println("添加成功!");
        }
        else {
            System.out.println("添加失败!");
        }
        return flag;
    }

    public boolean updateAirConditionInfo(AirConditionInfo airConditionInfo)throws Exception{
        boolean flag=airConditionInfoService.updateAirConditionInfo(airConditionInfo);
        if (flag){
            System.out.println("修改成功!");
        }
        else {
            System.out.println("修改失败！");
        }
        return flag;
    }

    public boolean deleteAirConditionInfo(int id)throws Exception{
        boolean flag=airConditionInfoService.deleteAirConditionInfo(id);
        if (flag){
            System.out.println("删除成功!");
        }
        else {
            System.out.println("删除失败！");
        }
        return flag;
    }
}
