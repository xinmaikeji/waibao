package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IOtherDao;
import xinmai.game.model.ShaiziYaZhu;
import xinmai.game.model.ShaiziZuozhangPaidui;
import xinmai.game.service.IOtherService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("otherService")
public class OtherServiceImpl implements IOtherService{

    @Resource
    IOtherDao otherDao;

    public List<Map<String,Object>> shaizi_cc_get_jieguo() {
        return otherDao.shaizi_cc_get_jieguo();
    }

    public Map<String, Object> saizi_cc_zuozhuang_paidui(Map<String, Object> map) {
        return otherDao.saizi_cc_zuozhuang_paidui(map);
    }

    public List<ShaiziZuozhangPaidui> getShaiziZuozhangPaidui() {
        return otherDao.getShaiziZuozhangPaidui();
    }

    public List<Map<String, Object>> saizi_cc_yazhu(Map<String, Object> map) {
        return otherDao.saizi_cc_yazhu(map);
    }

    public List<ShaiziYaZhu> getShaiziYaZhu(String sAccount) {
        return otherDao.getShaiziYaZhu(sAccount);
    }

    public List<Map<String, Object>> shaizi_cc_get_zuozhuang(Map<String, Object> map) {
        return otherDao.shaizi_cc_get_zuozhuang(map);
    }
}
