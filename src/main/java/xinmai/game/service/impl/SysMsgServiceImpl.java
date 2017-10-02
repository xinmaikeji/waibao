package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IOtherDao;
import xinmai.game.dao.ISysMsgDao;
import xinmai.game.dao.ISysMsgLogDao;
import xinmai.game.model.SysMsg;
import xinmai.game.model.SysMsgLog;
import xinmai.game.service.ISysMsgService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("sysMsgService")
public class SysMsgServiceImpl implements ISysMsgService{
    @Resource
    ISysMsgDao iSysMsgDao;

    @Resource
    ISysMsgLogDao iSysMsgLogDao;

    public List<SysMsg> getSysMsgByNeed() {
        List<SysMsg> sysMsgs = iSysMsgDao.getSysMsg();
        List<SysMsgLog> sysMsgLogs = iSysMsgLogDao.getSysMsgLog("手机专区");
        List<Integer> ids = new ArrayList<Integer>();
        for(int i = 0; i < sysMsgLogs.size(); i++){
            ids.add(sysMsgLogs.get(i).getId());
        }
        List<SysMsg> results = new ArrayList<SysMsg>();
        for(int i = 0; i < sysMsgs.size(); i++){
            if(!ids.contains(sysMsgs.get(i).getId())){
                results.add(sysMsgs.get(i));
                SysMsgLog sysMsgLog = new SysMsgLog();
                sysMsgLog.setId(sysMsgs.get(i).getId());
                sysMsgLog.setServer_msg("手机专区");
                iSysMsgLogDao.insertSysMsgLog(sysMsgLog);
            }
        }
        return results;
    }
}
