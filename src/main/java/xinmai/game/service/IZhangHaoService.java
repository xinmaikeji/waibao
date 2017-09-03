package xinmai.game.service;


import xinmai.game.model.ZhangHao;

import java.util.Map;

public interface IZhangHaoService {
    public ZhangHao selectZhangHao(String sAccount, String sPassword);

    public Map<String,Object> web_login_pd(Map<String, Object> map);
}

