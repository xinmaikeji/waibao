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
}
