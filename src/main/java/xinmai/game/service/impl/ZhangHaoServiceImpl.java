package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IZhangHaoDao;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;


@Service("zhangHaoService")
public class ZhangHaoServiceImpl implements IZhangHaoService {
    @Resource
    private IZhangHaoDao zhangHaoDao;


    public ZhangHao selectZhangHao(String sAccount, String sPassword) {
        return zhangHaoDao.selectZhangHao(sAccount, sPassword);
    }
}


