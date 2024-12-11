package com.zqBingo.guahao.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zqBingo.common.annotation.Log;
import com.zqBingo.common.core.controller.BaseController;
import com.zqBingo.common.core.domain.AjaxResult;
import com.zqBingo.common.enums.BusinessType;
import com.zqBingo.guahao.domain.TbRegistration;
import com.zqBingo.guahao.service.ITbRegistrationService;
import com.zqBingo.common.utils.poi.ExcelUtil;
import com.zqBingo.common.core.page.TableDataInfo;

/**
 * 挂号记录Controller
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
@RestController
@RequestMapping("/guahao/registration")
public class TbRegistrationController extends BaseController
{
    @Autowired
    private ITbRegistrationService tbRegistrationService;

    /**
     * 查询挂号记录列表
     */
    @PreAuthorize("@ss.hasPermi('guahao:registration:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbRegistration tbRegistration)
    {
        startPage();
        List<TbRegistration> list = tbRegistrationService.selectTbRegistrationList(tbRegistration);
        return getDataTable(list);
    }

    /**
     * 导出挂号记录列表
     */
    @PreAuthorize("@ss.hasPermi('guahao:registration:export')")
    @Log(title = "挂号记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbRegistration tbRegistration)
    {
        List<TbRegistration> list = tbRegistrationService.selectTbRegistrationList(tbRegistration);
        ExcelUtil<TbRegistration> util = new ExcelUtil<TbRegistration>(TbRegistration.class);
        util.exportExcel(response, list, "挂号记录数据");
    }

    /**
     * 获取挂号记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('guahao:registration:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbRegistrationService.selectTbRegistrationById(id));
    }

    /**
     * 新增挂号记录
     */
    @PreAuthorize("@ss.hasPermi('guahao:registration:add')")
    @Log(title = "挂号记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbRegistration tbRegistration)
    {
        return toAjax(tbRegistrationService.insertTbRegistration(tbRegistration));
    }

    /**
     * 修改挂号记录
     */
    @PreAuthorize("@ss.hasPermi('guahao:registration:edit')")
    @Log(title = "挂号记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbRegistration tbRegistration)
    {
        return toAjax(tbRegistrationService.updateTbRegistration(tbRegistration));
    }

    /**
     * 删除挂号记录
     */
    @PreAuthorize("@ss.hasPermi('guahao:registration:remove')")
    @Log(title = "挂号记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbRegistrationService.deleteTbRegistrationByIds(ids));
    }
}
