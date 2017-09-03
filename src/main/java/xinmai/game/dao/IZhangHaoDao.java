package xinmai.game.dao;

import org.apache.ibatis.annotations.Param;
import xinmai.game.model.ZhangHao;



public interface IZhangHaoDao {
    public ZhangHao selectZhangHao(@Param(value="sAccount") String sAccount, @Param(value="sPassword") String sPassword);
}
