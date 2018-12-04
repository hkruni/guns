package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FilmVO  implements Serializable {

    private int filmNum;//数量
    private int nowPage;//当前页编号
    private int totalPage;//总页数
    private List<FilmInfo> filmInfo;

}
