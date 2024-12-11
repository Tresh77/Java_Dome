package com.zqBingo.guahao.mapper;

import java.util.List;
import com.zqBingo.guahao.domain.TbRegistration;

/**
 * 挂号记录Mapper接口
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
public interface TbRegistrationMapper 
{
    /**
     * 查询挂号记录
     * 
     * @param id 挂号记录主键
     * @return 挂号记录
     */
    public TbRegistration selectTbRegistrationById(Long id);

    /**
     * 查询挂号记录列表
     * 
     * @param tbRegistration 挂号记录
     * @return 挂号记录集合
     */
    public List<TbRegistration> selectTbRegistrationList(TbRegistration tbRegistration);

    /**
     * 新增挂号记录
     * 
     * @param tbRegistration 挂号记录
     * @return 结果
     */
    public int insertTbRegistration(TbRegistration tbRegistration);

    /**
     * 修改挂号记录
     * 
     * @param tbRegistration 挂号记录
     * @return 结果
     */
    public int updateTbRegistration(TbRegistration tbRegistration);

    /**
     * 删除挂号记录
     * 
     * @param id 挂号记录主键
     * @return 结果
     */
    public int deleteTbRegistrationById(Long id);

    /**
     * 批量删除挂号记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbRegistrationByIds(Long[] ids);
}
