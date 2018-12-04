package com.stylefeng.guns.rest.modular.film.vo;

import com.stylefeng.guns.api.film.vo.BannerVO;
import com.stylefeng.guns.api.film.vo.FilmInfo;
import com.stylefeng.guns.api.film.vo.FilmVO;
import lombok.Data;

import java.util.List;

@Data
public class FilmIndexVO {

    private List<BannerVO> banners;//获取banner信息
    private FilmVO hotFilms;//正在热映的电影
    private FilmVO soonFilms;//即将上映的电影
    private List<FilmInfo> boxRanking;//票房排行榜
    private List<FilmInfo> expectRanking;//受欢迎的榜单
    private List<FilmInfo> top100;//获取前一百
}
