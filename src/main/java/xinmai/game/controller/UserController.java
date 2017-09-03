package xinmai.game.controller;



import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IZhangHaoService zhangHaoService;
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)//登录判断
    public JSONPObject selectUser(@RequestParam("sAccount")String sAccount,
                                            @RequestParam("sPassword")String sPassword,
                                            @RequestParam("callbackparam")String callbackparam
                                            ){
        ZhangHao zhangHao = zhangHaoService.selectZhangHao(sAccount, sPassword);
        /*Map<String, Object> map = new HashMap<String, Object>();
        map.put("zhanghao","555555");
        map.put("mima", "555555");
        Map<String, Object> resultmap = zhangHaoService.web_login_pd(map);
        */
        Map<String, Object> result= new HashMap();
        result.put("user", zhangHao);
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

}