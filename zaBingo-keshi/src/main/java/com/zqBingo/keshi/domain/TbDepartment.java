package com.zqBingo.keshi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zqBingo.common.annotation.Excel;
import com.zqBingo.common.core.domain.BaseEntity;

/**
 * 科室对象 tb_department
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
public class TbDepartment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 科室ID */
    @Excel(name = "科室ID")
    private Long departmentId;

    /** 科室电话 */
    @Excel(name = "科室电话")
    private String departmentPhone;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String departmentName;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Long departmentShort;

    /** 科室状态（0正常 1停用） */
    @Excel(name = "科室状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDepartmentId(Long departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() 
    {
        return departmentId;
    }
    public void setDepartmentPhone(String departmentPhone) 
    {
        this.departmentPhone = departmentPhone;
    }

    public String getDepartmentPhone() 
    {
        return departmentPhone;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
    public void setDepartmentShort(Long departmentShort) 
    {
        this.departmentShort = departmentShort;
    }

    public Long getDepartmentShort() 
    {
        return departmentShort;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("departmentId", getDepartmentId())
            .append("departmentPhone", getDepartmentPhone())
            .append("departmentName", getDepartmentName())
            .append("departmentShort", getDepartmentShort())
            .append("status", getStatus())
            .toString();
    }
}
