package xinmai.game.dao;

import org.apache.ibatis.annotations.Param;
import xinmai.game.model.ZhangHao;

import java.util.List;
import java.util.Map;


public interface IZhangHaoDao {
    ZhangHao selectZhangHao(@Param(value="sAccount") String sAccount,
                                   @Param(value="sPassword") String sPassword);

    Map<String,Object> web_login_pd(Map<String, Object> map);

    List<ZhangHao> isExist(@Param(value="sAccount")String sAccount);

    void addAccount(ZhangHao zhangHao);

    List<ZhangHao> findZhanghao(@Param(value="sAccount") String sAccount,
                                  @Param(value="sBirthDay") String sBirthDay,
                                  @Param(value="sQuiz") String sQuiz,
                                  @Param(value="sAnswer") String sAnswer,
                                  @Param(value="sQuiz2") String sQuiz2,
                                  @Param(value="sAnswer2") String sAnswer2);

    void updateAccount(ZhangHao zhangHao);

    int getNum(@Param(value="sAccount") String sAccount);
}
