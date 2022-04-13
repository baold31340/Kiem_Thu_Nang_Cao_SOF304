/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOF304_ASM1;

/**
 *
 * @author BUI_QUANG_HIEU
 */
public class NhanVien {
	private String maNV, hoTen, matKhau;
	boolean vaiTro;

	public NhanVien() {
	}

	public NhanVien(String maNV, String hoTen, String matKhau, boolean vaiTro) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.matKhau = matKhau;
		this.vaiTro = vaiTro;
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

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		if (matKhau == null || matKhau.equals("")) {
			throw new IllegalArgumentException("matKhau không được null hoặc rỗng !");
		}

		if (matKhau.length() < 8 || matKhau.length() > 50) {
			throw new IllegalArgumentException("matKhau trong khoảng 8-50 ký tự");
		}

		this.matKhau = matKhau;
	}

	public boolean isVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(boolean vaiTro) {
		this.vaiTro = vaiTro;
	}

	public static boolean checkName(String str) {

		String rgx = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,50}$";

		boolean kt = str.matches(rgx);
		return kt;

	}

	public static boolean checkMa(String str) {

		String rgx = "[a-zA-Z0-9]{5,15}";
		boolean kt = str.matches(rgx);
		return kt;
	}

}
