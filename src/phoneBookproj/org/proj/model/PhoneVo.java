package phoneBookproj.org.proj.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PhoneVo implements Externalizable{
	private int no;
	private String name;
	private String tel;
	private String email;
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(no);
		out.writeUTF(name);
		out.writeUTF(tel);
		out.writeUTF(email);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		no = in.read();
		name = in.readUTF();
		tel = in.readUTF();
		email = in.readUTF();
	}
	
	public PhoneVo() {
		this(0, "", "", "");
	}
	
	public PhoneVo(int no, String name, String tel, String email) {
		this.no=no;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
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
		PhoneVo other = (PhoneVo) obj;
		if ((no != other.no)&&(!(name.equals(other.name))))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return no+"  "+name + "  " + tel + "  " + email;
	}
	
	
}