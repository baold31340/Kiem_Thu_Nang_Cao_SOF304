/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOF304_ASM1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author BUI_QUANG_HIEU
 */
public class NguoiHoc {
	private String maNH, hoTen;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String dienThoai, email, ghiChu, maNV;
	private Date ngayDK;

	public NguoiHoc() {
	}

	public NguoiHoc(String maNH, String hoTen, Date ngaySinh, boolean gioiTinh, String dienThoai, String email,
			String ghiChu, String maNV, Date ngayDK) {
		this.maNH = maNH;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
		this.email = email;
		this.ghiChu = ghiChu;
		this.maNV = maNV;
		this.ngayDK = ngayDK;
	}

	public String getMaNH() {
		return maNH;
	}

	public void setMaNH(String maNH) {
		if (maNH == null || maNH.equals("")) {
			throw new IllegalArgumentException("maNH không được null hoặc rỗng !");
		}
		if (!(checkMa(maNH))) {
			throw new IllegalArgumentException("maNH có 5-15 ký tự tự, chữ hoặc số");
		}
		this.maNH = maNH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen == null || hoTen.equals("")) {
			throw new IllegalArgumentException("hoTen không được null hoặc rỗng !");
		}
		if (!(checkName(hoTen))) {
			throw new IllegalArgumentException("hoTen 3-50 ký tự và không chứa ký tự đặc biệt !");
		}
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(ngaySinh);
		c2.setTime(new Date());
		long a = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
		if (a < 5840) {
			throw new IllegalArgumentException("Phải đủ 16 tuổi !");
		}
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {

		this.gioiTinh = gioiTinh;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		if (dienThoai == null || dienThoai.equals("")) {
			throw new IllegalArgumentException("Phone khong duoc de trong hoac rong");
		}
		if (!checkPhone(dienThoai)) {
			throw new IllegalArgumentException("Phone khong dung dinh dang");
		}
		this.dienThoai = dienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.equals("")) {
			throw new IllegalArgumentException("Email khong duoc de trong hoac rong");
		}

		if (!checkEmail(email)) {
			throw new IllegalArgumentException("Email khong dung dinh dang");
		}

		this.email = email;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		if (ghiChu.length() > 100) {
			throw new IllegalArgumentException("ghiChu trong khoảng 0-100 ký tự !");
		}
		this.ghiChu = ghiChu;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		if (maNV == null || maNV.equals("")) {
			throw new IllegalArgumentException("maNV khong duoc de trong hoac rong");
		}
		if (!(checkMa(maNV))) {
			throw new IllegalArgumentException("maNV có 5-15 ký tự tự, chữ hoặc số");
		}
		this.maNV = maNV;
	}

	public Date getNgayDK() {
		return ngayDK;
	}

	public void setNgayDK(Date ngayDK) {
		this.ngayDK = ngayDK;
	}

	public static boolean checkMa(String str) {

		String rgx = "[a-zA-Z0-9]{5,15}";
		boolean kt = str.matches(rgx);
		return kt;
	}
	
	public static boolean checkName(String str) {

		String rgx = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,50}$";

		boolean kt = str.matches(rgx);
		return kt;

	}

	public boolean checkPhone(String str) {
		// Bieu thuc chinh quy mo ta dinh dang so dien thoai
		String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

		// Kiem tra dinh dang
		boolean kt = str.matches(reg);

		return kt;
	}

	public boolean checkEmail(String str) {
		// Bieu thuc chinh quy mo ta dinh dang so dien thoai
		String rgx = "^[a-zA-Z][a-zA-Z0-9_\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,4}){1,2}$";

		// Kiem tra dinh dang
		boolean kt = str.matches(rgx);

		return kt;
	}

}
