package com.zqBingo.keshi.service;

import java.util.List;
import com.zqBingo.keshi.domain.TbDepartment;

/**
 * 科室Service接口
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
public interface ITbDepartmentService 
{
    /**
     * 查询科室
     * 
     * @param id 科室主键
     * @return 科室
     */
    public TbDepartment selectTbDepartmentById(Long id);

    /**
     * 查询科室列表
     * 
     * @param tbDepartment 科室
     * @return 科室集合
     */
    public List<TbDepartment> selectTbDepartmentList(TbDepartment tbDepartment);

    /**
     * 新增科室
     * 
     * @param tbDepartment 科室
     * @return 结果
     */
    public int insertTbDepartment(TbDepartment tbDepartment);

    /**
     * 修改科室
     * 
     * @param tbDepartment 科室
     * @return 结果
     */
    public int updateTbDepartment(TbDepartment tbDepartment);

    /**
     * 批量删除科室
     * 
     * @param ids 需要删除的科室主键集合
     * @return 结果
     */
    public int deleteTbDepartmentByIds(Long[] ids);

    /**
     * 删除科室信息
     * 
     * @param id 科室主键
     * @return 结果
     */
    public int deleteTbDepartmentById(Long id);
}
