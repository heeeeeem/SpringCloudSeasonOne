package com.mycom.springcloud.service;

import com.mycom.springcloud.entity.Dept;

import java.util.List;

/**
 * @author HeM
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
