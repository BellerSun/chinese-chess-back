package cn.sunyc.chinesechess.controller;

import cn.sunyc.chinesechess.domain.PicInfo;
import cn.sunyc.chinesechess.mapper.PicInfoMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author ：sun yu chao
 * @date ：Created in 2021/2/27 10:07
 * @description： desc
 * @modified By：none
 * @version: 1.0.0
 */
@RestController
public class ApiController {
    @Resource
    PicInfoMapper mapper;

    @RequestMapping("/api/getBgUrl")
    public String getBgUrl() {
        List<PicInfo> picInfos = mapper.selectByMap(new HashMap<>());
        Collections.shuffle(picInfos);
        return CollectionUtils.isEmpty(picInfos) ? "" : picInfos.get(0).getPicUrl();
    }

}
