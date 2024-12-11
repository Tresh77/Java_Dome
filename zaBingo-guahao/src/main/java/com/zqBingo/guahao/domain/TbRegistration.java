package com.zqBingo.guahao.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zqBingo.common.annotation.Excel;
import com.zqBingo.common.core.domain.BaseEntity;

/**
 * 挂号记录对象 tb_registration
 * 
 * @author ZqBingo
 * @date 2024-09-08
 */
public class TbRegistration extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 患者ID */
    @Excel(name = "患者ID")
    private Long patientId;

    /** 科室ID */
    @Excel(name = "科室ID")
    private Long departmentId;

    /** 医生ID */
    @Excel(name = "医生ID")
    private Long doctorId;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date predictTimeBegin;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date predictTimeEnd;

    /** 号源数量 */
    @Excel(name = "号源数量")
    private Long quantity;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPatientId(Long patientId) 
    {
        this.patientId = patientId;
    }

    public Long getPatientId() 
    {
        return patientId;
    }
    public void setDepartmentId(Long departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() 
    {
        return departmentId;
    }
    public void setDoctorId(Long doctorId) 
    {
        this.doctorId = doctorId;
    }

    public Long getDoctorId() 
    {
        return doctorId;
    }
    public void setPredictTimeBegin(Date predictTimeBegin) 
    {
        this.predictTimeBegin = predictTimeBegin;
    }

    public Date getPredictTimeBegin() 
    {
        return predictTimeBegin;
    }
    public void setPredictTimeEnd(Date predictTimeEnd) 
    {
        this.predictTimeEnd = predictTimeEnd;
    }

    public Date getPredictTimeEnd() 
    {
        return predictTimeEnd;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("patientId", getPatientId())
            .append("departmentId", getDepartmentId())
            .append("doctorId", getDoctorId())
            .append("predictTimeBegin", getPredictTimeBegin())
            .append("predictTimeEnd", getPredictTimeEnd())
            .append("quantity", getQuantity())
            .toString();
    }
}
