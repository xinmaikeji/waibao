package xinmai.game.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IJiaoSeService;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class DaoServiceTest {
    @Resource(name="zhangHaoService")
    IZhangHaoService zhangHaoService;

    @Resource(name="jiaoSeService")
    IJiaoSeService jiaoSeService;

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
