package service;

import bean.AirConditionInfo;

import java.util.List;

public interface IAirConditionInfoService {
    //    查询接口
    public List<AirConditionInfo> queryAirConditionInfo()throws Exception;
    //    增加接口
    public boolean insertAirConditionInfo(AirConditionInfo airConditionInfo)throws Exception;
    //    修改接口
    public boolean updateAirConditionInfo(AirConditionInfo airConditionInfo)throws Exception;
    //    删除接口
    public boolean deleteAirConditionInfo(int id) throws Exception;
}
