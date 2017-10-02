package xinmai.game.dao;

import xinmai.game.model.SysMsg;
import xinmai.game.model.SysMsgLog;

import java.util.List;

public interface ISysMsgLogDao {
    List<SysMsgLog> getSysMsgLog(String sys_msg_log);
    void insertSysMsgLog(SysMsgLog sysMsgLog);
}
