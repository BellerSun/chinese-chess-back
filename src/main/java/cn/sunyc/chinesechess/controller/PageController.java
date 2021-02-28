package cn.sunyc.chinesechess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：sun yu chao
 * @date ：Created in 2021/2/27 9:33
 * @description： desc
 * @modified By：none
 * @version: 1.0.0
 */
@Controller
public class PageController {
    @RequestMapping(path = "/page/index.html")
    public String jump() {
        return "index";
    }
}
