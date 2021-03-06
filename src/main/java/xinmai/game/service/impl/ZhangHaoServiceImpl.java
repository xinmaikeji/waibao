package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IZhangHaoDao;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("zhangHaoService")
public class ZhangHaoServiceImpl implements IZhangHaoService {
    @Resource
    private IZhangHaoDao zhangHaoDao;


    public ZhangHao selectZhangHao(String sAccount, String sPassword) {
        return zhangHaoDao.selectZhangHao(sAccount, sPassword);
    }

    public List<ZhangHao> isExist(String sAccount) {
        return zhangHaoDao.isExist(sAccount);
    }

    public void addAccount(ZhangHao zhangHao) {
        zhangHaoDao.addAccount(zhangHao);
    }

    public List<ZhangHao> findZhanghao(String sAccount, String sBirthDay, String sQuiz,
                                       String sAnswer, String sQuiz2, String sAnswer2) {
        return zhangHaoDao.findZhanghao(sAccount, sBirthDay, sQuiz, sAnswer, sQuiz2, sAnswer2);
    }

    public void updateAccount(ZhangHao zhangHao) {
        zhangHaoDao.updateAccount(zhangHao);
    }

    public Map<String, Object> web_login_pd(Map<String, Object> map) {
        return zhangHaoDao.web_login_pd(map);
    }
}


