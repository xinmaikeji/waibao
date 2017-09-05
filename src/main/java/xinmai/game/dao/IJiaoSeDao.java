package xinmai.game.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IJiaoSeDao {
    List<Map<String,Object>> selectJiaoSe(@Param(value="sAccount") String sAccount);
}
