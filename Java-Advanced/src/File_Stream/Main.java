package File_Stream;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;


public class Main {
	static List<Book> bookList=new ArrayList<>();
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		while(true)
		{
			showMenu();
			int chon=Integer.parseInt(input.nextLine());
			switch(chon) {
				case 1:
					nhapThongTin();
					break;
				case 2:
					hienThongTin();
					break;
				case 3:
					sortByName();
					break;
				case 4:
					save();
					break;
				case 5:
					dataText();
					break;
				case 6:
					deflater();
					break;
				case 7:
					loadSave();
					break;
				case 8:
					System.out.println("Thoát!!");
					System.exit(0);
					break;
				default:
					System.out.println("Nhập sai!");
					break;
			}
		}
	}
	
	static void dataText() throws IOException {
		FileOutputStream fos=new FileOutputStream("data.text");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		
		for (Book book : bookList) {
			String line=book.getTenSach()+","+book.getTacGia()+","+book.getGiaBan()+","+book.getNgayXuatBan()+","+book.getNhaSanXuat();
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		osw.close();
		fos.close();
	}
	
	static void deflater() throws IOException {
		FileInputStream fis=new FileInputStream("data.text");
		FileOutputStream fos=new FileOutputStream("data.dfl");
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
		int read;
		while((read=fis.read())!=-1)
		{
			dos.write((byte)read);
		}
		dos.close();
		fos.close();
		fis.close();
	}
	
	static void loadSave() throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("data.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		bookList=(List<Book>) ois.readObject();
		fis.close();
		ois.close();
	}
	
	static void save() throws IOException {
		FileOutputStream fos=new FileOutputStream("data.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(bookList);
		fos.close();
		oos.close();
	}
	
	static void sortByName() {
		Collections.sort(bookList, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getTacGia().compareTo(o2.getTacGia());
			}
		});
	}

	
	static void hienThongTin() {
		for (Book book : bookList) {
			book.display();
		}
	}
	
	static void nhapThongTin() {
		System.out.println("Nhập số lượng cuốn sách: ");
		int sl=Integer.parseInt(input.nextLine());
		for(int i=0;i<sl;i++) {
			Book book=new Book();
			book.input();
			bookList.add(book);
		}
	}
	
	static void showMenu() {
		System.out.println("1. Nhập thông tin N cuốn sách");
		System.out.println("2. Hiển thị thông tin sách");
		System.out.println("3. Sắp xếp theo tên tác giả");
		System.out.println("4. Lưu thông tin sách vào file data.obj");
		System.out.println("5. Lưu thông tin mỗi cuốn sách vào file data.txt");
		System.out.println("6. Nén file data.txt thành file data.dfl");
		System.out.println("7. Đọc dữ liệu từ file data.obj và hiển thị ra màn hình");
		System.out.println("8. Thoát");
		System.out.println("Chọn: ");
	}
}
