package xinmai.game.dao;

import xinmai.game.model.ShaiziYaZhu;
import xinmai.game.model.ShaiziZuozhangPaidui;
import xinmai.game.model.YinHang;

import java.util.List;
import java.util.Map;

public interface IOtherDao {
    List<Map<String,Object>> shaizi_cc_get_jieguo();

    Map<String,Object> saizi_cc_zuozhuang_paidui(Map<String, Object> map);

    List<ShaiziZuozhangPaidui> getShaiziZuozhangPaidui();

    List<Map<String,Object>> saizi_cc_yazhu(Map<String, Object> map);

    List<ShaiziYaZhu> getShaiziYaZhu(String sAccount);

    List<Map<String,Object>> shaizi_cc_get_zuozhuang(Map<String, Object> map);

    YinHang getYinHang(String zhanghao);

    List<Map<String,Object>> shaizi_cc_get_user();
}
