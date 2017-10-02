package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IDaiLiDao;
import xinmai.game.dao.IOtherDao;
import xinmai.game.model.DaiLi;
import xinmai.game.model.ShaiziYaZhu;
import xinmai.game.model.ShaiziZuozhangPaidui;
import xinmai.game.model.YinHang;
import xinmai.game.service.IOtherService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("otherService")
public class OtherServiceImpl implements IOtherService{

    @Resource
    IOtherDao otherDao;

    @Resource
    IDaiLiDao daiLiDao;

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

    public YinHang getYinHang(String zhanghao) {
        return otherDao.getYinHang(zhanghao);
    }

    public List<Map<String, Object>> shaizi_cc_get_user() {
        return otherDao.shaizi_cc_get_user();
    }

    public DaiLi getDaiLi(String zhanghao, String daili_id) {
        return daiLiDao.getDaiLi(zhanghao, daili_id);
    }

    public void insert(DaiLi daiLi) {
        daiLiDao.insert(daiLi);
    }

    public List<DaiLi> getDaiLis(){
        return daiLiDao.getDaiLis();
    };
}
