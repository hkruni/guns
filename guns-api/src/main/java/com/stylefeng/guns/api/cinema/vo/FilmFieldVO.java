package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmFieldVO implements Serializable {

    private String fieldId;//场次ID
    private String beginTime;//开始时间
    private String endTime;//结束时间
    private String language;//语言
    private String hallName;//影厅名称
    private String price;//价格


}
