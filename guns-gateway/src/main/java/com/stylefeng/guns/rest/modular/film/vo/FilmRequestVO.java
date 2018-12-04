package com.stylefeng.guns.rest.modular.film.vo;


import lombok.Data;

@Data
public class FilmRequestVO {

    private Integer showType=1;//1: 正在热映 2 : 即将上映  3: 经典
    private Integer sortId=1;//1:热门 2:时间 3:评价
    private Integer sourceId=99;
    private Integer catId=99;
    private Integer yearId=99;
    private Integer nowPage=1;
    private Integer pageSize=18;

}
