package com.zjq.javabase.base39.service;

import com.zjq.javabase.base39.domain.Province;

import java.util.List;

/**
 * @author zjq
 */
public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}
