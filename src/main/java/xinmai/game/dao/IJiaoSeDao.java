package xinmai.game.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IJiaoSeDao {
    List<Map<String,Object>> selectJiaoSe(@Param(value="sAccount") String sAccount,
                                          @Param(value="sServerName") String sServerName);

    void addJiaoSe(@Param(value="sServerName") String sServerName,
                   @Param(value="sAccount") String sAccount,
                   @Param(value="sChrName") String sChrName,
                   @Param(value="btSex") int btSex);
}
