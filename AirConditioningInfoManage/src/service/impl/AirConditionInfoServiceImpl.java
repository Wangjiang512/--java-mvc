package service.impl;

import bean.AirConditionInfo;
import dao.IAirConditionInfoDao;
import dao.impl.AirConditionInfoDaoImpl;
import service.IAirConditionInfoService;

import java.util.List;

public class AirConditionInfoServiceImpl implements IAirConditionInfoService {
    IAirConditionInfoDao airConditionInfoDao=new AirConditionInfoDaoImpl();
    @Override
    public List<AirConditionInfo> queryAirConditionInfo() throws Exception {
        return airConditionInfoDao.queryAirConditionInfo();
    }

    @Override
    public boolean insertAirConditionInfo(AirConditionInfo airConditionInfo) throws Exception {
        return airConditionInfoDao.insertAirConditionInfo(airConditionInfo);
    }

    @Override
    public boolean updateAirConditionInfo(AirConditionInfo airConditionInfo) throws Exception {
        return airConditionInfoDao.updateAirConditionInfo(airConditionInfo);
    }

    @Override
    public boolean deleteAirConditionInfo(int id) throws Exception {
        return airConditionInfoDao.deleteAirConditionInfo(id);
    }
}
