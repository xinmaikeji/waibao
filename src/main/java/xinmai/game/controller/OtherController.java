package xinmai.game.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xinmai.game.model.DaiLi;
import xinmai.game.model.YinHang;
import xinmai.game.service.IJiaoSeService;
import xinmai.game.service.IOtherService;
import xinmai.game.service.ISysMsgService;
import xinmai.game.service.IYinHangLogService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/game")
public class OtherController {

    @Resource(name = "otherService")
    private IOtherService otherService;

    @Resource(name = "yinHangLogService")
    private IYinHangLogService yinHangLogService;

    @Resource(name= "sysMsgService")
    private ISysMsgService sysMsgService;

    @Resource
    private IJiaoSeService jiaoSeService;

    @ResponseBody//欢乐豆流水信息  读取prcPageResult存储过程
    @RequestMapping(value = "/getYinHangLog", method = RequestMethod.GET)
    public JSONPObject getYinHangLog(@RequestParam("currPage")String currPage,
                                     @RequestParam("strCondition")String strCondition,
                                     @RequestParam("pageSize")int pageSize,
                                     @RequestParam("callbackparam")String callbackparam){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currPage",currPage);
        map.put("strCondition", strCondition);
        map.put("pageSize", pageSize);
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, Object>> results = yinHangLogService.getYinHangLog(map);
        System.out.println(results);
        for(Map result:results){
            result.put("riqi", sdf.format((Timestamp)result.get("riqi")));
        }
        return new JSONPObject(callbackparam, results);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//查看历史开奖信息 执行 shaizi_cc_get_jieguo存储过程
    @RequestMapping(value = "/shaizi_cc_get_jieguo", method = RequestMethod.GET)
    public JSONPObject shaizi_cc_get_jieguo(@RequestParam("callbackparam")String callbackparam){
        return new JSONPObject(callbackparam, otherService.shaizi_cc_get_jieguo());//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//我要上庄按钮  执行 saizi_cc_zuozhuang_paidui存储过程
    @RequestMapping(value = "/saizi_cc_zuozhuang_paidui", method = RequestMethod.GET)
    public JSONPObject saizi_cc_zuozhuang_paidui(@RequestParam("daqu")String daqu,
                                                 @RequestParam("zhanghao")String zhanghao,
                                                 @RequestParam("jiaose")String jiaose,
                                                 @RequestParam("callbackparam")String callbackparam){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu",daqu);
        map.put("zhanghao", zhanghao);
        map.put("jiaose", jiaose);
        return new JSONPObject(callbackparam, otherService.saizi_cc_zuozhuang_paidui(map));//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//查看庄家排队信息  读取 shaizi_zuozhang_paidui表
    @RequestMapping(value = "/getShaiziZuozhangPaidui", method = RequestMethod.GET)
    public JSONPObject getShaiziZuozhangPaidui(@RequestParam("callbackparam")String callbackparam){
        return new JSONPObject(callbackparam, otherService.getShaiziZuozhangPaidui());//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//我要下注大  下注小按钮 执行 saizi_cc_yazhu存储过程
    @RequestMapping(value = "/saizi_cc_yazhu", method = RequestMethod.GET)
    public JSONPObject saizi_cc_yazhu(@RequestParam("daqu")String daqu,
                                      @RequestParam("zhanghao")String zhanghao,
                                      @RequestParam("jiaose")String jiaose,
                                      @RequestParam("yajin")String yajin,
                                      @RequestParam("daxiao")String daxiao,
                                      @RequestParam("callbackparam")String callbackparam){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu",daqu);
        map.put("zhanghao", zhanghao);
        map.put("jiaose", jiaose);
        map.put("yajin", yajin);
        map.put("daxiao", daxiao);
        return new JSONPObject(callbackparam, otherService.saizi_cc_yazhu(map));//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//获取当前账号下注的信息
    @RequestMapping(value = "/getShaiziYaZhu", method = RequestMethod.GET)
    public JSONPObject getShaiziYaZhu(@RequestParam("zhanghao")String zhanghao,
                                      @RequestParam("callbackparam")String callbackparam){
        return new JSONPObject(callbackparam, otherService.getShaiziYaZhu(zhanghao));//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//倒计时  下注大 可下载大  下注小 可下注小  庄家  等信息  执行 shaizi_cc_get_zuozhuang 存储过程
    @RequestMapping(value = "/shaizi_cc_get_zuozhuang", method = RequestMethod.GET)
    public JSONPObject shaizi_cc_get_zuozhuang(@RequestParam("daqu")String daqu,
                                      @RequestParam("zhanghao")String zhanghao,
                                      @RequestParam("jiaose")String jiaose,
                                      @RequestParam("callbackparam")String callbackparam){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu",daqu);
        map.put("zhanghao", zhanghao);
        map.put("jiaose", jiaose);
        return new JSONPObject(callbackparam, otherService.shaizi_cc_get_zuozhuang(map));//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//获取SysMsg表数据
    @RequestMapping(value = "/getSysMsg", method = RequestMethod.GET)
    public JSONPObject getSysMsg(@RequestParam("callbackparam")String callbackparam){
        return new JSONPObject(callbackparam, sysMsgService.getSysMsgByNeed());//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//执行 shaizi_cc_get_user存储过程
    @RequestMapping(value = "/shaizi_cc_get_user", method = RequestMethod.GET)
    public JSONPObject shaizi_cc_get_user(@RequestParam("callbackparam")String callbackparam){
        List<Map<String, Object>>results = otherService.shaizi_cc_get_user();
        for(int i = 0; i < results.size(); i++){
            results.get(i).put("zb_id", i+1);
        }
        return new JSONPObject(callbackparam, results);//解决JSON跨域问题，使用JSONP
    }

    @RequestMapping(value="/daili")
    public ModelAndView showData_1(){
        List<DaiLi> daiLis = otherService.getDaiLis();
        /*其中第一个参数为url,第二个参数为要传递的数据的key,第三个参数为数据对象。在这里要注意的是:数据是默认被存放在request中的。*/
        return new ModelAndView("/index","daiLis",daiLis);
    }

    @ResponseBody//
    @RequestMapping(value = "/shaizi_cc_get_user_basic_info", method = RequestMethod.GET)
    public JSONPObject shaizi_cc_get_user_basic_info(@RequestParam("sAccount")String sAccount,
                                                     @RequestParam("callbackparam")String callbackparam){
        List<Map<String, Object>>results = otherService.shaizi_cc_get_user();
        for(int i = 0; i < results.size(); i++){
            results.get(i).put("zb_id", i+1);
        }
        YinHang yinHang = otherService.getYinHang(sAccount);
        List<Map<String,Object>> jiaoses = jiaoSeService.selectJiaoSe(sAccount);
        Map<String,Object> basicinfo = null;
        if(jiaoses != null && jiaoses.size() != 0){
            basicinfo = jiaoses.get(0);
            basicinfo.put("yuanbao", yinHang.getYuanbao());
        }
        Map<String, Object> result= new HashMap();
        result.put("basic_info", basicinfo);
        result.put("get_user", results);
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//
    @RequestMapping(value = "/shaizi_cc_get_user_zuozhuang", method = RequestMethod.GET)
    public JSONPObject shaizi_cc_get_user_zuozhuang(@RequestParam("daqu")String daqu,
                                                    @RequestParam("zhanghao")String zhanghao,
                                                    @RequestParam("jiaose")String jiaose,
                                                    @RequestParam("callbackparam")String callbackparam){
        List<Map<String, Object>>results = otherService.shaizi_cc_get_user();
        for(int i = 0; i < results.size(); i++){
            results.get(i).put("zb_id", i+1);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu",daqu);
        map.put("zhanghao", zhanghao);
        map.put("jiaose", jiaose);

        Map<String, Object> result= new HashMap();
        result.put("shaizi_cc_get_zuozhuang", otherService.shaizi_cc_get_zuozhuang(map));
        result.put("shaizi_cc_get_user", results);
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }

    @ResponseBody//
    @RequestMapping(value = "/shaizi_cc_get_user_zuozhuang_sys_msg", method = RequestMethod.GET)
    public JSONPObject shaizi_cc_get_user_zuozhuang_sys_msg(@RequestParam("daqu")String daqu,
                                                    @RequestParam("zhanghao")String zhanghao,
                                                    @RequestParam("jiaose")String jiaose,
                                                    @RequestParam("callbackparam")String callbackparam){
        List<Map<String, Object>>results = otherService.shaizi_cc_get_user();
        for(int i = 0; i < results.size(); i++){
            results.get(i).put("zb_id", i+1);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daqu",daqu);
        map.put("zhanghao", zhanghao);
        map.put("jiaose", jiaose);

        Map<String, Object> result= new HashMap();
        result.put("shaizi_cc_get_zuozhuang", otherService.shaizi_cc_get_zuozhuang(map));
        result.put("shaizi_cc_get_user", results);
        result.put("Sys_Msg", sysMsgService.getSysMsgByNeed());
        return new JSONPObject(callbackparam, result);//解决JSON跨域问题，使用JSONP
    }
}
