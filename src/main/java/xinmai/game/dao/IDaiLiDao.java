package xinmai.game.dao;

import org.apache.ibatis.annotations.Param;
import xinmai.game.model.DaiLi;

import java.util.List;

public interface IDaiLiDao {
    DaiLi getDaiLi(@Param(value="zhanghao")String zhanghao, @Param(value="daili_id")String daili_id);

    void insert(DaiLi daiLi);

    List<DaiLi> getDaiLis();
}
