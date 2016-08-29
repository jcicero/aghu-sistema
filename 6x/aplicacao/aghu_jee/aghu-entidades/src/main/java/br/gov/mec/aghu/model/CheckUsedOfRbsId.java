package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CheckUsedOfRbsId generated by hbm2java
 */
@Embeddable
public class CheckUsedOfRbsId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7901008181081516306L;
	private Date myDate;
	private String name;
	private Double extents;
	private Double maxExtents;
	private Double rssize;
	private Double optsize;
	private String username;
	private Double sid;
	private String status;
	private String machine;
	private String sqlText;

	public CheckUsedOfRbsId() {
	}

	public CheckUsedOfRbsId(String name, String username) {
		this.name = name;
		this.username = username;
	}

	public CheckUsedOfRbsId(Date myDate, String name, Double extents, Double maxExtents, Double rssize, Double optsize,
			String username, Double sid, String status, String machine, String sqlText) {
		this.myDate = myDate;
		this.name = name;
		this.extents = extents;
		this.maxExtents = maxExtents;
		this.rssize = rssize;
		this.optsize = optsize;
		this.username = username;
		this.sid = sid;
		this.status = status;
		this.machine = machine;
		this.sqlText = sqlText;
	}

	@Column(name = "MY_DATE", length = 29)
	public Date getMyDate() {
		return this.myDate;
	}

	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}

	@Column(name = "NAME", nullable = false, length = 30)
	@Length(max = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "EXTENTS", precision = 17, scale = 17)
	public Double getExtents() {
		return this.extents;
	}

	public void setExtents(Double extents) {
		this.extents = extents;
	}

	@Column(name = "MAX_EXTENTS", precision = 17, scale = 17)
	public Double getMaxExtents() {
		return this.maxExtents;
	}

	public void setMaxExtents(Double maxExtents) {
		this.maxExtents = maxExtents;
	}

	@Column(name = "RSSIZE", precision = 17, scale = 17)
	public Double getRssize() {
		return this.rssize;
	}

	public void setRssize(Double rssize) {
		this.rssize = rssize;
	}

	@Column(name = "OPTSIZE", precision = 17, scale = 17)
	public Double getOptsize() {
		return this.optsize;
	}

	public void setOptsize(Double optsize) {
		this.optsize = optsize;
	}

	@Column(name = "USERNAME", nullable = false, length = 30)
	@Length(max = 30)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "SID", precision = 17, scale = 17)
	public Double getSid() {
		return this.sid;
	}

	public void setSid(Double sid) {
		this.sid = sid;
	}

	@Column(name = "STATUS", length = 8)
	@Length(max = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "MACHINE", length = 64)
	@Length(max = 64)
	public String getMachine() {
		return this.machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	@Column(name = "SQL_TEXT", length = 1000)
	@Length(max = 1000)
	public String getSqlText() {
		return this.sqlText;
	}

	public void setSqlText(String sqlText) {
		this.sqlText = sqlText;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getName());
		umHashCodeBuilder.append(this.getStatus());
		umHashCodeBuilder.append(this.getMachine());
		umHashCodeBuilder.append(this.getUsername());
		umHashCodeBuilder.append(this.getSid());
		umHashCodeBuilder.append(this.getMyDate());
		umHashCodeBuilder.append(this.getExtents());
		umHashCodeBuilder.append(this.getMaxExtents());
		umHashCodeBuilder.append(this.getRssize());
		umHashCodeBuilder.append(this.getOptsize());
		umHashCodeBuilder.append(this.getSqlText());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CheckUsedOfRbsId)) {
			return false;
		}
		CheckUsedOfRbsId other = (CheckUsedOfRbsId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getName(), other.getName());
		umEqualsBuilder.append(this.getStatus(), other.getStatus());
		umEqualsBuilder.append(this.getMachine(), other.getMachine());
		umEqualsBuilder.append(this.getUsername(), other.getUsername());
		umEqualsBuilder.append(this.getSid(), other.getSid());
		umEqualsBuilder.append(this.getMyDate(), other.getMyDate());
		umEqualsBuilder.append(this.getExtents(), other.getExtents());
		umEqualsBuilder.append(this.getMaxExtents(), other.getMaxExtents());
		umEqualsBuilder.append(this.getRssize(), other.getRssize());
		umEqualsBuilder.append(this.getOptsize(), other.getOptsize());
		umEqualsBuilder.append(this.getSqlText(), other.getSqlText());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
