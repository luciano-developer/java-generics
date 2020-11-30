package generics.demilitado.entities;

public class User {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uniqueCode == null) ? 0 : uniqueCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uniqueCode == null) {
			if (other.uniqueCode != null)
				return false;
		} else if (!uniqueCode.equals(other.uniqueCode))
			return false;
		return true;
	}

	private Integer uniqueCode;

	public User(Integer uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public Integer getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(Integer uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

}
