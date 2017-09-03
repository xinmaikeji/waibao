package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IZhangHaoDao;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;
import java.util.Map;


@Service("zhangHaoService")
public class ZhangHaoServiceImpl implements IZhangHaoService {
    @Resource
    private IZhangHaoDao zhangHaoDao;


    public ZhangHao selectZhangHao(String sAccount, String sPassword) {
        return zhangHaoDao.selectZhangHao(sAccount, sPassword);
    }

    public Map<String, Object> web_login_pd(Map<String, Object> map) {
        return zhangHaoDao.web_login_pd(map);
    }
}


