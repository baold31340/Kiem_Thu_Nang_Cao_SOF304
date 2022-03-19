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
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		if (tenCD == null || tenCD.equals("")) {
			throw new IllegalArgumentException("TenCD khong duoc null hoac rong !");
		}
		this.tenCD = tenCD;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		if (hocPhi <=0 || hocPhi>=100000000) {
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
		this.hinh = hinh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}
