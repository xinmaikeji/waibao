package xinmai.game.controller;



import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xinmai.game.dao.IZhangHaoDao;
import xinmai.game.model.ZhangHao;
import xinmai.game.service.IJiaoSeService;
import xinmai.game.service.IZhangHaoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IZhangHaoService zhangHaoService;

    @Resource
    private IJiaoSeService jiaoSeService;

    @Resource
    private IZhangHaoDao zhangHaoDao;

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

    @ResponseBody
    @RequestMapping(value = "/isExist", method = RequestMethod.GET)//判断是账号否存在
    public JSONPObject isExist(@RequestParam("sAccount")String sAccount,
                              @RequestParam("callbackparam")String callbackparam){
        System.out.print(sAccount);
        List<ZhangHao> zhangHaos = zhangHaoService.isExist(sAccount);
        Map<String, Integer> result= new HashMap();
        if(zhangHaos.size() > 0){
            result.put("exits", 1);//存在
        }else{
            result.put("exits", 0);
        }
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody
    @RequestMapping(value = "/regesiter", method = RequestMethod.GET)//注册
    public JSONPObject regesiter(ZhangHao zhangHao, @RequestParam("callbackparam")String callbackparam){
        zhangHaoService.addAccount(zhangHao);
        Map<String, String> result= new HashMap();
        result.put("result", "success");//返回成功
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody
    @RequestMapping(value = "/isJiaoseIsExist", method = RequestMethod.GET)//判断角色是否存在
    public JSONPObject isJiaoseIsExist(String sAccount, @RequestParam("callbackparam")String callbackparam){
        List<Map<String,Object>> list = jiaoSeService.selectJiaoSe(sAccount);
        Map<String, String> result= new HashMap();
        if(list != null && list.size() > 0){
            result.put("result", "yes");//存在
        }else{
            result.put("result", "no");//不存在
        }

        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody
    @RequestMapping(value = "/addJiaoSe", method = RequestMethod.GET)//创建角色
    public JSONPObject addJiaoSe(String sAccount,
                                 String sChrName,
                                 int btSex,//0是男 1是女
                                 @RequestParam("callbackparam")String callbackparam){
        jiaoSeService.addJiaoSe(sAccount, sChrName, btSex);
        Map<String, String> result= new HashMap();
        result.put("result", "success");//返回成功
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody
    @RequestMapping(value = "/findPassword", method = RequestMethod.GET)//找回密码
    public JSONPObject findPassword(String sAccount,
                                    String sBirthDay,
                                    String sQuiz,
                                    String sAnswer,
                                    String sQuiz2,
                                    String sAnswer2,
                                 @RequestParam("callbackparam")String callbackparam){
        List<ZhangHao> list = zhangHaoService.findZhanghao(sAccount, sBirthDay, sQuiz,
                sAnswer, sQuiz2, sAnswer2);
        Map<String, String> result= new HashMap();
        if(list != null && list.size() > 0){
            result.put("result", "yes");//正确
        }else{
            result.put("result", "no");//错误
        }
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody
    @RequestMapping(value = "/updatePassword", method = RequestMethod.GET)//修改密码
    public JSONPObject updatePassword(String sAccount,
                                    String sPassword,
                                    @RequestParam("callbackparam")String callbackparam){

        ZhangHao zhangHao = new ZhangHao();
        zhangHao.setsAccount(sAccount);
        zhangHao.setsPassword(sPassword);
        zhangHaoService.updateAccount(zhangHao);
        Map<String, String> result= new HashMap();
        result.put("result", "success");//成功
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody
    @RequestMapping(value = "/getNum", method = RequestMethod.GET)//测试
    public Integer getNum(String sAccount){
        return zhangHaoDao.getNum(sAccount);
    }
}