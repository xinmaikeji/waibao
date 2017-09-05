package xinmai.game.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IJiaoSeService {
    public List<Map<String,Object>> selectJiaoSe(@Param(value="sAccount") String sAccount);
}
