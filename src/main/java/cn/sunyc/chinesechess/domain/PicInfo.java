package cn.sunyc.chinesechess.domain;

import lombok.Data;

/**
 * @author ：sun yu chao
 * @date ：Created in 2021/2/28 10:49
 * @description： desc
 * @modified By：none
 * @version: 1.0.0
 */
@Data
public class PicInfo {
    Integer id;
    String picName;
    String picUrl;
    Double picWidth;
    Double picHeight;
}
