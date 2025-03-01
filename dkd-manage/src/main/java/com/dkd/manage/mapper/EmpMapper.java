package com.dkd.manage.mapper;

import java.util.List;
import com.dkd.manage.domain.Emp;

/**
 * 人员管理Mapper接口
 * 
 * @author itheima
 * @date 2025-02-28
 */
public interface EmpMapper 
{
    /**
     * 查询人员管理
     * 
     * @param id 人员管理主键
     * @return 人员管理
     */
    public Emp selectEmpById(Long id);

    /**
     * 查询人员管理列表
     * 
     * @param emp 人员管理
     * @return 人员管理集合
     */
    public List<Emp> selectEmpList(Emp emp);

    /**
     * 新增人员管理
     * 
     * @param emp 人员管理
     * @return 结果
     */
    public int insertEmp(Emp emp);

    /**
     * 修改人员管理
     * 
     * @param emp 人员管理
     * @return 结果
     */
    public int updateEmp(Emp emp);

    /**
     * 删除人员管理
     * 
     * @param id 人员管理主键
     * @return 结果
     */
    public int deleteEmpById(Long id);

    /**
     * 批量删除人员管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmpByIds(Long[] ids);
}
