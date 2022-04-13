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
public class ChuyenDe {

	private String maCD, tenCD;
	private double hocPhi;
	private int thoiLuong;
	private String hinh, moTa;

	public ChuyenDe() {
	}

	public ChuyenDe(String maCD, String tenCD, double hocPhi, int thoiLuong, String hinh, String moTa) {
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.hinh = hinh;
		this.moTa = moTa;
	}

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		if (maCD == null || maCD.equals("")) {
			throw new IllegalArgumentException("MaCD khong duoc null hoac rong !");
		}

		if (!(checkMa(maCD))) {
			throw new IllegalArgumentException("maCD có 3-15 ký tự tự, chữ hoặc số");
		}
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		if (tenCD == null || tenCD.equals("")) {
			throw new IllegalArgumentException("TenCD khong duoc null hoac rong !");
		}
		if (!checkName(tenCD)) {
			throw new IllegalArgumentException("tenCD có 5-100 ký tự và không chứa ký tự đặc biệt !");
		}
		this.tenCD = tenCD;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		if (hocPhi <= 0 || hocPhi >= 100000000) {
			throw new IllegalArgumentException("Hoc phi khong kha dung !");
		}
		this.hocPhi = hocPhi;
	}

	public int getThoiLuong() {

		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		if (thoiLuong < 0 || thoiLuong >= 1000) {
			throw new IllegalArgumentException("Thoi luong khong kha dung");
		}
		this.thoiLuong = thoiLuong;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		if (hinh == null || hinh.equals("")) {
			throw new IllegalArgumentException("Image khong duoc null hoac rong !");
		}
		if (hinh.length() < 5 || hinh.length() > 50) {
			throw new IllegalArgumentException("Image trong khoảng 5-50 ký tự !");
		}
		this.hinh = hinh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		if (moTa.length() > 100) {
			throw new IllegalArgumentException("MoTa trong khoảng 0-100 ký tự !");
		}
		this.moTa = moTa;
	}

	public static boolean checkMa(String str) {

		String rgx = "[a-zA-Z0-9]{3,15}";
		boolean kt = str.matches(rgx);
		return kt;
	}

	public static boolean checkName(String str) {

		String rgx = "^[A-Za-z0-9ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{5,100}$";

		boolean kt = str.matches(rgx);
		return kt;

	}

}
