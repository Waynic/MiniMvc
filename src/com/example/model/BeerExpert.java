package com.example.model;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 11642 on 2016/9/22.
 * 啤酒专家的建议：
 * 如果你选择amber类型的啤酒我们会在下面
 * 向用户推荐2款最热销的beer
 */
public class BeerExpert {
    public List getBrands(String color){
        List brands=new ArrayList();
        if (color.equals("amber")){
            brands.add("JAck Amber");
            brands.add("Gout Stout");
        }
        else{
            brands.add("jail Pale Ale");
            brands.add("Gout Stout");
        }
        return(brands);
    }
}
