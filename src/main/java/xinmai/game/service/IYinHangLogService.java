package xinmai.game.service;

import java.util.List;
import java.util.Map;

public interface IYinHangLogService {
    public List<Map<String,Object>> getYinHangLog(Map<String, Object> map);//欢乐豆流水信息  读取prcPageResult存储过程
}
