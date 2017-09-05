package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IJiaoSeDao;
import xinmai.game.service.IJiaoSeService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("jiaoSeService")
public class JiaoSeServiceImpl  implements IJiaoSeService {
    @Resource
    private IJiaoSeDao iJiaoSeDao;
    public List<Map<String,Object>> selectJiaoSe(String sAccount) {
        return iJiaoSeDao.selectJiaoSe(sAccount);
    }
}


