/**
 * Copyright (c) 2014 longgen.me
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package me.longgen.web.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基础控制器，作为其他控制器的父类，以便统一提供某些特性
 * 
 * @author Xiao Longgen
 * @date Aug 21, 2014
 */
@Controller
@RequestMapping("/base")
public class BaseController {
    
    /**
     * 用户跳转JSP页面
     * 
     * 此方法不考虑权限控制
     * 
     * @param folder 路径
     * @param jspName JSP名称(不加后缀)
     * @return 指定JSP页面
     */
    @RequestMapping("/{folder}/{jspName}")
    public String redirectJsp(@PathVariable String folder, @PathVariable String jspName) {
        return "/" + folder + "/" + jspName;
    }
    
}