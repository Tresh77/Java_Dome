package com.zqBingo.keshi.controller;

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
import com.zqBingo.keshi.domain.TbDepartment;
import com.zqBingo.keshi.service.ITbDepartmentService;
import com.zqBingo.common.utils.poi.ExcelUtil;
import com.zqBingo.common.core.page.TableDataInfo;

/**
 * 科室Controller
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
@RestController
@RequestMapping("/keshi/department")
public class TbDepartmentController extends BaseController
{
    @Autowired
    private ITbDepartmentService tbDepartmentService;

    /**
     * 查询科室列表
     */
    @PreAuthorize("@ss.hasPermi('keshi:department:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbDepartment tbDepartment)
    {
        startPage();
        List<TbDepartment> list = tbDepartmentService.selectTbDepartmentList(tbDepartment);
        return getDataTable(list);
    }

    /**
     * 导出科室列表
     */
    @PreAuthorize("@ss.hasPermi('keshi:department:export')")
    @Log(title = "科室", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbDepartment tbDepartment)
    {
        List<TbDepartment> list = tbDepartmentService.selectTbDepartmentList(tbDepartment);
        ExcelUtil<TbDepartment> util = new ExcelUtil<TbDepartment>(TbDepartment.class);
        util.exportExcel(response, list, "科室数据");
    }

    /**
     * 获取科室详细信息
     */
    @PreAuthorize("@ss.hasPermi('keshi:department:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbDepartmentService.selectTbDepartmentById(id));
    }

    /**
     * 新增科室
     */
    @PreAuthorize("@ss.hasPermi('keshi:department:add')")
    @Log(title = "科室", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbDepartment tbDepartment)
    {
        return toAjax(tbDepartmentService.insertTbDepartment(tbDepartment));
    }

    /**
     * 修改科室
     */
    @PreAuthorize("@ss.hasPermi('keshi:department:edit')")
    @Log(title = "科室", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbDepartment tbDepartment)
    {
        return toAjax(tbDepartmentService.updateTbDepartment(tbDepartment));
    }

    /**
     * 删除科室
     */
    @PreAuthorize("@ss.hasPermi('keshi:department:remove')")
    @Log(title = "科室", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbDepartmentService.deleteTbDepartmentByIds(ids));
    }
}
