package xinmai.game.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xinmai.game.service.IOtherService;
import xinmai.game.service.IYinHangLogService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/game")
public class OtherController {

    @Resource(name = "otherService")
    private IOtherService otherService;

    @Resource(name = "yinHangLogService")
    private IYinHangLogService yinHangLogService;

    @ResponseBody//欢乐豆流水信息  读取prcPageResult存储过程
    @RequestMapping(value = "/getYinHangLog", method = RequestMethod.GET)
    public JSONPObject getYinHangLog(@RequestParam("currPage")String currPage,
                                     @RequestParam("strCondition")String strCondition,
                               @RequestParam("callbackparam")String callbackparam){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currPage",currPage);
        map.put("strCondition", strCondition);
        return new JSONPObject(callbackparam, yinHangLogService.getYinHangLog(map));//解决JSON跨域问题，使用JSONP
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
}
