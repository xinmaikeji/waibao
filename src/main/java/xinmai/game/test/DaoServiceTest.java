package xinmai.game.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class DaoServiceTest {
    @Resource(name="zhangHaoService")
    IZhangHaoService zhangHaoService;
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
}
