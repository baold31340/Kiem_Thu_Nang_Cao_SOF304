/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOF304_ASM1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author BUI_QUANG_HIEU
 */
public class KhoaHoc {

	private int maKH;
	private String maCD;
	private double hocPhi;
	private int thoiLuong;
	private Date ngayKG;
	private String ghiChu, maNV;
	private Date ngayTao;

	public KhoaHoc() {
	}

	public KhoaHoc(int maKH, String maCD, double hocPhi, int thoiLuong, Date ngayKG, String ghiChu, String maNV,
			Date ngayTao) {
		this.maKH = maKH;
		this.maCD = maCD;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.ngayKG = ngayKG;
		this.ghiChu = ghiChu;
		this.maNV = maNV;
		this.ngayTao = ngayTao;
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

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		if (maCD == null || maCD.equals("")) {
			throw new IllegalArgumentException("MaCD không được null hoặc rỗng !");
		}
		this.maCD = maCD;
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

	public Date getNgayKG() {
		return ngayKG;
	}

	public void setNgayKG(Date ngayKG) {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(ngayKG);
		c2.setTime(ngayTao);
		long a = (c1.getTime().getTime() - c2.getTime().getTime()) / (24 * 3600 * 1000);
//		System.out.println(a);
		if (a < 5) {
			throw new IllegalArgumentException("Ít nhất là 5 ngày");
		}
		this.ngayKG = ngayKG;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		if (maNV == null || maNV.equals("")) {
			throw new IllegalArgumentException("maNV không được null hoặc rỗng !");
		}
		if (!(checkMa(maNV))) {
			throw new IllegalArgumentException("maNV có 5-15 ký tự tự, chữ hoặc số");
		}
		this.maNV = maNV;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public static boolean checkMa(String str) {

		String rgx = "[a-zA-Z0-9]{5,15}";
		boolean kt = str.matches(rgx);
		return kt;
	}
}
