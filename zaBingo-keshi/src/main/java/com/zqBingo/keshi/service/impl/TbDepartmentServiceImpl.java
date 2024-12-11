package com.zqBingo.keshi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zqBingo.keshi.mapper.TbDepartmentMapper;
import com.zqBingo.keshi.domain.TbDepartment;
import com.zqBingo.keshi.service.ITbDepartmentService;

/**
 * 科室Service业务层处理
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
@Service
public class TbDepartmentServiceImpl implements ITbDepartmentService 
{
    @Autowired
    private TbDepartmentMapper tbDepartmentMapper;

    /**
     * 查询科室
     * 
     * @param id 科室主键
     * @return 科室
     */
    @Override
    public TbDepartment selectTbDepartmentById(Long id)
    {
        return tbDepartmentMapper.selectTbDepartmentById(id);
    }

    /**
     * 查询科室列表
     * 
     * @param tbDepartment 科室
     * @return 科室
     */
    @Override
    public List<TbDepartment> selectTbDepartmentList(TbDepartment tbDepartment)
    {
        return tbDepartmentMapper.selectTbDepartmentList(tbDepartment);
    }

    /**
     * 新增科室
     * 
     * @param tbDepartment 科室
     * @return 结果
     */
    @Override
    public int insertTbDepartment(TbDepartment tbDepartment)
    {
        return tbDepartmentMapper.insertTbDepartment(tbDepartment);
    }

    /**
     * 修改科室
     * 
     * @param tbDepartment 科室
     * @return 结果
     */
    @Override
    public int updateTbDepartment(TbDepartment tbDepartment)
    {
        return tbDepartmentMapper.updateTbDepartment(tbDepartment);
    }

    /**
     * 批量删除科室
     * 
     * @param ids 需要删除的科室主键
     * @return 结果
     */
    @Override
    public int deleteTbDepartmentByIds(Long[] ids)
    {
        return tbDepartmentMapper.deleteTbDepartmentByIds(ids);
    }

    /**
     * 删除科室信息
     * 
     * @param id 科室主键
     * @return 结果
     */
    @Override
    public int deleteTbDepartmentById(Long id)
    {
        return tbDepartmentMapper.deleteTbDepartmentById(id);
    }
}
