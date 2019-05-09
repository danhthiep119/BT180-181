package File_Stream;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable{
	String tenSach;
	String tacGia;
	float giaBan;
	String ngayXuatBan;
	String nhaSanXuat;
	
	public Book(String tenSach, String tacGia, float giaBan, String ngayXuatBan, String nhaSanXuat) {
		
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.giaBan = giaBan;
		this.ngayXuatBan = ngayXuatBan;
		this.nhaSanXuat = nhaSanXuat;
	}
	
	public Book() {
		
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	public String getNgayXuatBan() {
		return ngayXuatBan;
	}

	public void setNgayXuatBan(String ngayXuatBan) {
		this.ngayXuatBan = ngayXuatBan;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	@Override
	public String toString() {
		return "Book [tenSach=" + tenSach + ", tacGia=" + tacGia + ", giaBan=" + giaBan + ", ngayXuatBan=" + ngayXuatBan
				+ ", nhaSanXuat=" + nhaSanXuat + "]";
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Tên Sách: ");
		tenSach=sc.nextLine();
		System.out.println("Tác Giả: ");
		tacGia=sc.nextLine();
		System.out.println("Giá Bán: ");
		giaBan=Integer.parseInt(sc.nextLine());
		System.out.println("Ngày Xuất Bản: ");
		ngayXuatBan=sc.nextLine();
		System.out.println("Nhà Sản Xuất: ");
		nhaSanXuat=sc.nextLine();
	}
	
	public void display() {
		System.out.println(toString());
	}
}
