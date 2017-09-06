package xinmai.game.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IJiaoSeService {
    public List<Map<String,Object>> selectJiaoSe(@Param(value="sAccount") String sAccount);//判断手机专区是否有角色
    public void addJiaoSe(String sAccount, String sChrName, int btSex);//添加手机专区角色
}
