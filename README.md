# BT180-181
BT180
Viết chương trình thực hiện yêu cầu sau

- Thiết kế 1 class SharedData có chứa biến nguyên total

- Thiết kế thread 1 thực hiện sinh ngẫu nhiên các số từ 0 - 100 -> Sau đó thêm số ngẫu nhiên này vào biến total trong SharedData (Ví dụ : Số ngẫu nhiên rad khi đó total = total + rad)

- Thiết kế thread 2 thực hiện sinh ngẫu nhiên các số từ -100 - 0 -> Sau đó thêm số ngẫu nhiên này vào biến total trong SharedData (Ví dụ : Số ngẫu nhiên rad khi đó total = total + rad)

Khi giá trị total của SharedData <= -100 hoặc >= 100 thì thực hiện dừng 2 thread trên.

BT181
Viết chương trình thực hiện yêu cầu sau

- Thread 1 thực hiện sinh ngẫu nhiên các ký tự a-z, cứ 2s thì sinh 1 lần

- Thread 2 thực hiện biến các ký tự thường được sinh ra từ Thread 1 thành ký tự hoa, cứ sau 1s thì thực hiện 1 lần.

Yêu cầu đồng bộ 2 Thread (wait, notify)

- Nếu tổng thời gian xử lý của 2 Thread là 20s thì dừng 2 thread lại.

