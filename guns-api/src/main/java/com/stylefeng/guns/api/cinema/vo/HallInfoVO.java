package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class HallInfoVO implements Serializable {

    private String hallFieldId; //影厅ID
    private String hallName;//影厅名称
    private String price;//价格
    private String seatFile;//座位图片
    // 已售座位必须关联订单才能查询
    private String soldSeats;

}
