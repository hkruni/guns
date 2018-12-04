package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CinemaQueryVO implements Serializable {

    private Integer brandId=99;//影院品牌
    private Integer districtId=99;//地区
    private Integer hallType=99;//特殊厅: IMAX 4D 巨幕 杜比
    private Integer pageSize=12;
    private Integer nowPage=1;

}
