package xinmai.game.service;

import org.apache.ibatis.annotations.Param;
import xinmai.game.model.DaiLi;
import xinmai.game.model.ShaiziYaZhu;
import xinmai.game.model.ShaiziZuozhangPaidui;
import xinmai.game.model.YinHang;

import java.util.List;
import java.util.Map;

public interface IOtherService {
    public List<Map<String,Object>> shaizi_cc_get_jieguo();//查看历史开奖信息 执行 shaizi_cc_get_jieguo存储过程


    public Map<String,Object> saizi_cc_zuozhuang_paidui(Map<String, Object> map);//我要上庄按钮  执行 saizi_cc_zuozhuang_paidui存储过程

    public List<ShaiziZuozhangPaidui> getShaiziZuozhangPaidui();//查看庄家排队信息  读取 shaizi_zuozhang_paidui表

    public List<Map<String,Object>> saizi_cc_yazhu(Map<String, Object> map);//我要下注大  下注小按钮 执行 saizi_cc_yazhu存储过程

    public List<ShaiziYaZhu> getShaiziYaZhu(String sAccount);//获取当前账号下注的信息

    public List<Map<String,Object>> shaizi_cc_get_zuozhuang(Map<String, Object> map);//倒计时  下注大 可下载大  下注小 可下注小  庄家  等信息  执行 shaizi_cc_get_zuozhuang 存储过程

    public YinHang getYinHang(String zhanghao);//获取银行信息

    public List<Map<String,Object>> shaizi_cc_get_user();//执行存储过程shaizi_cc_get_user

    public DaiLi getDaiLi(@Param(value="zhanghao")String zhanghao, @Param(value="daili_id")String daili_id);

    public void insert(DaiLi daiLi);

    public List<DaiLi> getDaiLis();
}
