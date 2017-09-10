package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IYinHangLogDao;
import xinmai.game.dao.IZhangHaoDao;
import xinmai.game.service.IYinHangLogService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("yinHangLogService")
public class YinHangLogServiceImpl implements IYinHangLogService {

    @Resource
    private IYinHangLogDao yinHangLogDao;

    public List<Map<String,Object>> getYinHangLog(Map<String, Object> map) {
        return yinHangLogDao.getYinHangLog(map);
    }
}
