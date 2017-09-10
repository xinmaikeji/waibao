package xinmai.game.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xinmai.game.dao.IZhangHaoDao;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IJiaoSeService;
import xinmai.game.service.IOtherService;
import xinmai.game.service.IYinHangLogService;
import xinmai.game.service.IZhangHaoService;
import xinmai.game.service.impl.YinHangLogServiceImpl;
import xinmai.game.service.impl.ZhangHaoServiceImpl;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class DaoServiceTest {
    @Resource(name = "zhangHaoService")
    IZhangHaoService zhangHaoService;

    @Resource(name = "jiaoSeService")
    IJiaoSeService jiaoSeService;

    @Resource
    private IZhangHaoDao zhangHaoDao;

    @Resource(name = "yinHangLogService")
    private IYinHangLogService yinHangLogService;

    @Resource(name = "otherService")
    private IOtherService otherService;


    @Test
    public void testshaizi_cc_get_zuozhuang(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu","手机专区");
        map.put("zhanghao", "12111");
        map.put("jiaose", "蒙多");
        System.out.print(otherService.shaizi_cc_get_zuozhuang(map));
    }

    @Test
    public void testgetShaiziYaZhu(){
        System.out.print(otherService.getShaiziYaZhu("12111"));
    }

    @Test
    public void testsaizi_cc_yazhu(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu","手机专区");
        map.put("zhanghao", "12111");
        map.put("jiaose", "蒙多");
        map.put("yajin", "100");
        map.put("daxiao", "1");
        System.out.print(otherService.saizi_cc_yazhu(map));
    }

    @Test
    public void testgetShaiziZuozhangPaidui(){
        System.out.print(otherService.getShaiziZuozhangPaidui());
    }

    @Test
    public void testsaizi_cc_zuozhuang_paidui(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu","手机专区");
        map.put("zhanghao", "12111");
        map.put("jiaose", "剑姬");
        System.out.print(otherService.saizi_cc_zuozhuang_paidui(map));
    }

    @Test
    public void testShaizi_cc_get_jieguo(){

        System.out.print(otherService.shaizi_cc_get_jieguo());
    }

    @Test
    public void testExec2(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currPage","1");
        map.put("strCondition", "12111");
        System.out.print(yinHangLogService.getYinHangLog(map));
    }

    @Test
    public void testgetNum(){
        System.out.print(zhangHaoDao.getNum("2014"));
    }

    @Test
    public void testupdateZhangHao(){
        ZhangHao zhangHao = new ZhangHao();
        zhangHao.setsAccount("xinmai");
        zhangHao.setsPassword("58898888");
        zhangHaoService.updateAccount(zhangHao);
    }

    @Test
    public void testfindZhangHao(){
        System.out.print(zhangHaoService.findZhanghao("xinmai", "1995-09-09",
                "最喜欢的动物","熊猫","最喜欢的运动","游泳"));
    }
    @Test
    public void testaddJiaoSe(){
        jiaoSeService.addJiaoSe("121111", "剑姬",0);
    }

    @Test
    public void testSelectJiaoSe(){
        System.out.print(jiaoSeService.selectJiaoSe("yy"));
    }

    @Test
    public void testSelectUser() throws Exception {
        ZhangHao zhangHao = zhangHaoService.selectZhangHao("12111", "11111");
        System.out.println(zhangHao);
    }

    @Test
    public void testExec(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("zhanghao","555555");
        map.put("mima", "555555");
        System.out.print(zhangHaoService.web_login_pd(map));
    }

    @Test
    public void testMain(){
        Object name = "1";
        int num = Integer.parseInt((String)name);
        System.out.print(num);
    }

    @Test
    public void testExist(){
        List<ZhangHao> zhangHaos = zhangHaoService.isExist("555555");
        System.out.print(zhangHaos);
    }

    @Test
    public void testAddAccount(){
        ZhangHao zhangHao = new ZhangHao();
        zhangHao.setsAccount("xinmai");
        zhangHao.setsPassword("8888");
        zhangHao.setsBirthDay("1995-09-09");
        zhangHao.setsQuiz("最喜欢的动物");
        zhangHao.setsAnswer("熊猫");
        zhangHao.setsQuiz2("最喜欢的运动");
        zhangHao.setsAnswer2("游泳");
        zhangHaoService.addAccount(zhangHao);
    }
}
