package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;



@Data
public class FilmInfoVO implements Serializable {

    private String filmId;//影片ID
    private String filmName;//名称
    private String filmLength;//时长
    private String filmType;//类型
    private String filmCats;//类型:剧情 动作等
    private String actors;//演员,都好分割
    private String imgAddress;//图片
    private List<FilmFieldVO> filmFields;//多个场次

}
