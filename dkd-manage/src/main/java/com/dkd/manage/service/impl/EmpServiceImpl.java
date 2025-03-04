package com.dkd.manage.service.impl;

import java.util.List;
import com.dkd.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.manage.mapper.EmpMapper;
import com.dkd.manage.domain.Emp;
import com.dkd.manage.service.IEmpService;

/**
 * 人员管理Service业务层处理
 * 
 * @author itheima
 * @date 2025-02-28
 */
@Service
public class EmpServiceImpl implements IEmpService 
{
    @Autowired
    private EmpMapper empMapper;

    /**
     * 查询人员管理
     * 
     * @param id 人员管理主键
     * @return 人员管理
     */
    @Override
    public Emp selectEmpById(Long id)
    {
        return empMapper.selectEmpById(id);
    }

    /**
     * 查询人员管理列表
     * 
     * @param emp 人员管理
     * @return 人员管理
     */
    @Override
    public List<Emp> selectEmpList(Emp emp)
    {
        return empMapper.selectEmpList(emp);
    }

    /**
     * 新增人员管理
     * 
     * @param emp 人员管理
     * @return 结果
     */
    @Override
    public int insertEmp(Emp emp)
    {
        emp.setCreateTime(DateUtils.getNowDate());
        return empMapper.insertEmp(emp);
    }

    /**
     * 修改人员管理
     * 
     * @param emp 人员管理
     * @return 结果
     */
    @Override
    public int updateEmp(Emp emp)
    {
        emp.setUpdateTime(DateUtils.getNowDate());
        return empMapper.updateEmp(emp);
    }

    /**
     * 批量删除人员管理
     * 
     * @param ids 需要删除的人员管理主键
     * @return 结果
     */
    @Override
    public int deleteEmpByIds(Long[] ids)
    {
        return empMapper.deleteEmpByIds(ids);
    }

    /**
     * 删除人员管理信息
     * 
     * @param id 人员管理主键
     * @return 结果
     */
    @Override
    public int deleteEmpById(Long id)
    {
        return empMapper.deleteEmpById(id);
    }
}
