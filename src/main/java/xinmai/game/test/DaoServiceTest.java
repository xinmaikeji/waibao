package xinmai.game.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;

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

}
