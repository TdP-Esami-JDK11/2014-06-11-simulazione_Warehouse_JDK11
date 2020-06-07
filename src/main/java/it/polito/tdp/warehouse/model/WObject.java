package it.polito.tdp.warehouse.model;

public class WObject {
	int id;
	String description;
	int size;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public WObject(int id, String description, int size) {
		super();
		this.id = id;
		this.description = description;
		this.size = size;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WObject other = (WObject) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WObject [id=" + id + ", description='" + description + "', size="
				+ size + "]";
	}

}

