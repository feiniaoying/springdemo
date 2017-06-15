package com.chenwt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by feini on 2017/6/15.
 */
public abstract class BaseController {
    //添加一个日志器
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
}
