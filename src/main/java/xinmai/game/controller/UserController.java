package xinmai.game.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IZhangHaoService zhangHaoService;
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Map<String, ZhangHao> selectUser(@RequestParam("sAccount")String sAccount, @RequestParam("sPassword")String sPassword){
        ZhangHao zhangHao = zhangHaoService.selectZhangHao(sAccount, sPassword);
        Map<String, ZhangHao> result= new HashMap();
        result.put("user", zhangHao);
        if(zhangHao != null){
            return result;
        }else{
            return result;
        }
    }

}