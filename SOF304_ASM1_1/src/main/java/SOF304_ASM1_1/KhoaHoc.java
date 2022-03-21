/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOF304_ASM1_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author BUI_QUANG_HIEU
 */
public class KhoaHoc {

	private int maKH;
	private String TenKH;
	private double hocPhi;
	private int thoiLuong;
	private String ghiChu;
	private int soLuongHV;

	public KhoaHoc() {
	}

	public KhoaHoc(int maKH, String tenKH, double hocPhi, int thoiLuong, String ghiChu, int soLuongHV) {
		super();
		this.maKH = maKH;
		TenKH = tenKH;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.ghiChu = ghiChu;
		this.soLuongHV = soLuongHV;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		if (maKH <= 0 || maKH >= Integer.MAX_VALUE) {
			throw new IllegalArgumentException("maKH không khả dụng");
		}
		this.maKH = maKH;
	}

	public String getTenKH() {
		return TenKH;
	}

	public void setTenKH(String tenKH) {
		if (tenKH == null || tenKH.equals("")) {
			throw new IllegalArgumentException("tenKH không được null hoặc rỗng !");
		}
		System.out.println(tenKH.length());
		if (!(checkName(tenKH))) {
			throw new IllegalArgumentException("tenKH 3-50 ký tự và không chứa ký tự đặc biệt !");
		}
		TenKH = tenKH;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		if (hocPhi <= 0 || hocPhi > 50000000) {
			throw new IllegalArgumentException("Hoc phi khong kha dung !");
		}
		this.hocPhi = hocPhi;
	}

	public int getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		if (thoiLuong <= 0 || thoiLuong > 120) {
			throw new IllegalArgumentException("Thoi luong khong kha dung");
		}
		this.thoiLuong = thoiLuong;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public int getSoLuongHV() {
		return soLuongHV;
	}

	public void setSoLuongHV(int soLuongHV) {
		if (soLuongHV < 0 || soLuongHV > 25) {
			throw new IllegalArgumentException("So luong HV khong kha dung");
		}
		this.soLuongHV = soLuongHV;
	}

	
	public static boolean checkName(String str) {

		String rgx = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,50}$";

		boolean kt = str.matches(rgx);
		return kt;

	}
	
}
