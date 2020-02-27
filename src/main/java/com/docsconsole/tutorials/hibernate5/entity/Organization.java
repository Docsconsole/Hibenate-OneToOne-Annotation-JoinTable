package com.docsconsole.tutorials.hibernate5.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZATION")
public class Organization implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 88889999999L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORG_ID")
	private Long orgIdempDetId;

	@Column(name = "ORG_NAME")
	private String orgName;

	public Organization() {
	}

	public Long getOrgIdempDetId() {
		return orgIdempDetId;
	}

	public void setOrgIdempDetId(Long orgIdempDetId) {
		this.orgIdempDetId = orgIdempDetId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
