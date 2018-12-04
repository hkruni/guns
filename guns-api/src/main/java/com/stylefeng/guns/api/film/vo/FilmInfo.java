package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmInfo implements Serializable {

    private String filmId;//影片id
    private int filmType;//类型
    private String imgAddress;//图片路径
    private String filmName;//名称
    private String filmScore;//评分
    private int expectNum;//受欢迎榜单
    private String showTime;//放映时间
    private int boxNum;//票房排行
    private String score;//评分

}
