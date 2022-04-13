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
public class HocVien {
	private int maHV, maKH;
	private String maNH;
	private double diem;

	public HocVien() {
	}

	public HocVien(int maHV, int maKH, String maNH, double diem) {
		this.maHV = maHV;
		this.maKH = maKH;
		this.maNH = maNH;
		this.diem = diem;
	}

	public int getMaHV() {
		return maHV;
	}

	public void setMaHV(int maHV) {
		if (maHV <= 0 || maHV >= Integer.MAX_VALUE) {
			throw new IllegalArgumentException("maHV không khả dụng");
		}
		this.maHV = maHV;
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

	public String getMaNH() {
		return maNH;
	}

	public void setMaNH(String maNH) {
		if (maNH == null || maNH.equals("")) {
			throw new IllegalArgumentException("maNH không được null hoặc rỗng !");
		}
		if (!checkMa(maNH)) {
			throw new IllegalArgumentException("maNH từ 5-15 ký tự !");
		}
		this.maNH = maNH;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		if (diem < 0 || diem >= 11) {
			throw new IllegalArgumentException("Điểm không khả dụng");
		}
		this.diem = diem;
	}

	public static boolean checkMa(String str) {

		String rgx = "[a-zA-Z0-9]{5,15}";
		boolean kt = str.matches(rgx);
		return kt;
	}
}
