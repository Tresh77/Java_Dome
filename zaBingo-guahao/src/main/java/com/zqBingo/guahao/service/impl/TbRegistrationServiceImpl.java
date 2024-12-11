package com.zqBingo.guahao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zqBingo.guahao.mapper.TbRegistrationMapper;
import com.zqBingo.guahao.domain.TbRegistration;
import com.zqBingo.guahao.service.ITbRegistrationService;

/**
 * 挂号记录Service业务层处理
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
@Service
public class TbRegistrationServiceImpl implements ITbRegistrationService 
{
    @Autowired
    private TbRegistrationMapper tbRegistrationMapper;

    /**
     * 查询挂号记录
     * 
     * @param id 挂号记录主键
     * @return 挂号记录
     */
    @Override
    public TbRegistration selectTbRegistrationById(Long id)
    {
        return tbRegistrationMapper.selectTbRegistrationById(id);
    }

    /**
     * 查询挂号记录列表
     * 
     * @param tbRegistration 挂号记录
     * @return 挂号记录
     */
    @Override
    public List<TbRegistration> selectTbRegistrationList(TbRegistration tbRegistration)
    {
        return tbRegistrationMapper.selectTbRegistrationList(tbRegistration);
    }

    /**
     * 新增挂号记录
     * 
     * @param tbRegistration 挂号记录
     * @return 结果
     */
    @Override
    public int insertTbRegistration(TbRegistration tbRegistration)
    {
        return tbRegistrationMapper.insertTbRegistration(tbRegistration);
    }

    /**
     * 修改挂号记录
     * 
     * @param tbRegistration 挂号记录
     * @return 结果
     */
    @Override
    public int updateTbRegistration(TbRegistration tbRegistration)
    {
        return tbRegistrationMapper.updateTbRegistration(tbRegistration);
    }

    /**
     * 批量删除挂号记录
     * 
     * @param ids 需要删除的挂号记录主键
     * @return 结果
     */
    @Override
    public int deleteTbRegistrationByIds(Long[] ids)
    {
        return tbRegistrationMapper.deleteTbRegistrationByIds(ids);
    }

    /**
     * 删除挂号记录信息
     * 
     * @param id 挂号记录主键
     * @return 结果
     */
    @Override
    public int deleteTbRegistrationById(Long id)
    {
        return tbRegistrationMapper.deleteTbRegistrationById(id);
    }
}
