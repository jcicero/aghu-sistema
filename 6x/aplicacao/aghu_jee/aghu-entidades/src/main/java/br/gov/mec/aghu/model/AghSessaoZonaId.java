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
 * AghSessaoZonaId generated by hbm2java
 */
@Embeddable
public class AghSessaoZonaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3795016165798746730L;
	private String machine;
	private Date dateTime;
	private String program;
	private Double logicalReads;
	private Double sid;
	private String username;
	private Date logonTime;
	private Integer version;

	public AghSessaoZonaId() {
	}

	public AghSessaoZonaId(Integer version) {
		this.version = version;
	}

	public AghSessaoZonaId(String machine, Date dateTime, String program, Double logicalReads, Double sid, String username,
			Date logonTime, Integer version) {
		this.machine = machine;
		this.dateTime = dateTime;
		this.program = program;
		this.logicalReads = logicalReads;
		this.sid = sid;
		this.username = username;
		this.logonTime = logonTime;
		this.version = version;
	}

	@Column(name = "MACHINE", length = 30)
	@Length(max = 30)
	public String getMachine() {
		return this.machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	@Column(name = "DATE_TIME", length = 29)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "PROGRAM", length = 40)
	@Length(max = 40)
	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Column(name = "LOGICAL_READS", precision = 17, scale = 17)
	public Double getLogicalReads() {
		return this.logicalReads;
	}

	public void setLogicalReads(Double logicalReads) {
		this.logicalReads = logicalReads;
	}

	@Column(name = "SID", precision = 17, scale = 17)
	public Double getSid() {
		return this.sid;
	}

	public void setSid(Double sid) {
		this.sid = sid;
	}

	@Column(name = "USERNAME", length = 30)
	@Length(max = 30)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "LOGON_TIME", length = 29)
	public Date getLogonTime() {
		return this.logonTime;
	}

	public void setLogonTime(Date logonTime) {
		this.logonTime = logonTime;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getMachine());
		umHashCodeBuilder.append(this.getUsername());
		umHashCodeBuilder.append(this.getSid());
		umHashCodeBuilder.append(this.getLogonTime());
		umHashCodeBuilder.append(this.getDateTime());
		umHashCodeBuilder.append(this.getProgram());
		umHashCodeBuilder.append(this.getLogicalReads());
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
		if (!(obj instanceof AghSessaoZonaId)) {
			return false;
		}
		AghSessaoZonaId other = (AghSessaoZonaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getMachine(), other.getMachine());
		umEqualsBuilder.append(this.getUsername(), other.getUsername());
		umEqualsBuilder.append(this.getSid(), other.getSid());
		umEqualsBuilder.append(this.getLogonTime(), other.getLogonTime());
		umEqualsBuilder.append(this.getDateTime(), other.getDateTime());
		umEqualsBuilder.append(this.getProgram(), other.getProgram());
		umEqualsBuilder.append(this.getLogicalReads(), other.getLogicalReads());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
