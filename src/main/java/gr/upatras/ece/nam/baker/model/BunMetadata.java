/**
 * Copyright 2014 University of Patras 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and limitations under the License.
 */

package gr.upatras.ece.nam.baker.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Entity(name = "BunMetadata")
public class BunMetadata {


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id = 0;
	
	@GeneratedValue( strategy = GenerationType.AUTO, generator = "uuid-hex"  )
	private String uuid;
	

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumns({ @JoinColumn() })
	private BakerUser owner = null;

	@Basic()
	private String name = null;
	@Basic()
	private String iconsrc = null;
	@Basic()
	private String shortDescription = null;
	@Basic()
	private String longDescription = null;
	@Basic()
	private String version = null;
	@Basic()
	private String packageLocation = null;


	public BunMetadata() {
	}
	
	public BunMetadata(String uuid, String name) {
		super();
		this.name = name;
		this.uuid = uuid;
	}
	
	public BakerUser getOwner() {
		return owner;
	}
	
	public void setOwner(BakerUser newOwner) {
		owner = newOwner;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getIconsrc() {
		return iconsrc;
	}
	public void setIconsrc(String iconsrc) {
		this.iconsrc = iconsrc;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPackageLocation() {
		return packageLocation;
	}
	public void setPackageLocation(String packageLocation) {
		this.packageLocation = packageLocation;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


}