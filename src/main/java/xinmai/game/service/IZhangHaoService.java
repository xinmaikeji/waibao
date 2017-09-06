package xinmai.game.service;


import org.apache.ibatis.annotations.Param;
import xinmai.game.model.ZhangHao;

import java.util.List;
import java.util.Map;

public interface IZhangHaoService {
    public ZhangHao selectZhangHao(String sAccount, String sPassword);

    public Map<String,Object> web_login_pd(Map<String, Object> map);

    public List<ZhangHao> isExist(String sAccount);

    public void addAccount(ZhangHao zhangHao);

    public List<ZhangHao> findZhanghao(@Param(value="sAccount") String sAccount,
                                       @Param(value="sBirthDay") String sBirthDay,
                                       @Param(value="sQuiz") String sQuiz,
                                       @Param(value="sAnswer") String sAnswer,
                                       @Param(value="sQuiz2") String sQuiz2,
                                       @Param(value="sAnswer2") String sAnswer2);

    public void updateAccount(ZhangHao zhangHao);
}

