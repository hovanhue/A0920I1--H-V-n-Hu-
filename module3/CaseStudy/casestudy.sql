

drop DATABASE IF EXISTS caseStudy_module3;
CREATE DATABASE if not EXISTS caseStudy_module3;
USE caseStudy_module3;

CREATE table ViTri(
	IDViTri int PRIMARY key AUTO_INCREMENT,
    TenViTri VARCHAR(45)
);
CREATE TABLE TrinhDo(
	IDTrinhDo int PRIMARY key auto_increment,
    TrinhDo varchar(45)
);
CREATE TABLE BoPhan(
	IDBoPhan int PRIMARY KEY AUTO_INCREMENT,
    TenBoPhan VARCHAR(45)
);
CREATE TABLE NhanVien(
	IDNhanVien int PRIMARY KEY AUTO_INCREMENT,
    HoTen VARCHAR(50),
    IDViTri INT,
    IDTrinhDo INT,
    IDBoPhan INT,
    NgaySinh DATE,
    SoCMND VARCHAR(45),
    Luong VARCHAR(45),
    SDT VARCHAR(45),
    Email VARCHAR(45),
    DiaChi VARCHAR(45),
    foreign key (IDViTri) references Vitri(IDViTri),
    foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
    foreign key (IDBoPhan) references BoPhan(IDBoPhan)
);

CREATE table LoaiKhach(
	IDLoaiKhach int PRIMARY key AUTO_INCREMENT,
    TenKhach VARCHAR(45)
);
CREATE TABLE KhachHang(
	IDKhachHang INT PRIMARY KEY AUTO_INCREMENT,
    IDLoaiKhach INT,
    HoTen VARCHAR(45),
    NgaySinh DATE,
    SoCMND VARCHAR(45),
	SDT VARCHAR(45),
    Email VARCHAR(45),
    DiaChi VARCHAR(45),
    FOREIGN KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach)
);

CREATE table KieuThue(
	IDKieuThue int PRIMARY key AUTO_INCREMENT,
    TenKieuThue VARCHAR(45),
    Gia float
);

CREATE table LoaiDichVu(
	IDLoaiDichVu int PRIMARY key AUTO_INCREMENT,
    TenLoaiDichVu VARCHAR(45)
);

CREATE table DichVu(
	IDDichVu int PRIMARY key AUTO_INCREMENT,
    TenDichVu VARCHAR(45),
    DienTich float,
    SoTang int,
    SoNguuoiToiDa INT,
    ChiPhiThue DOUBLE,
    IDKieuThue INT,
    IDLoaiDichVu INT,
    TrangThai VARCHAR(45),
	foreign key (IDKieuThue) REFERENCES KieuThue(IDKieuThue),
	foreign key (IDLoaiDichVu) REFERENCES LoaiDichVu(IDLoaiDichVu)
);

CREATE table DichVuDiKem(
	IDDichVuDiKem INT PRIMARY KEY AUTO_INCREMENT,
    TenDichVuDiKem VARCHAR(45),
    Gia float,
    DonVi int,
    TrangThaiKhaDung VARCHAR(45)
);

CREATE table HopDong(
	IDHopDong INT PRIMARY KEY AUTO_INCREMENT,
    IDNhanVien INT,
    IDKhachHang int,
    IDDichVu int,
    NgayLapHopDong DATE,
    NgayKetThuc DATE,
    TienDatCoc DOUBLE,
    TongTien DOUBLE,
    FOREIGN KEY (IDNhanVien) REFERENCES NhanVien(IDNhanVien),
    FOREIGN KEY (IDKhachHang) REFERENCES KhachHang(IDKhachHang),
    FOREIGN KEY (IDDichVu) REFERENCES DichVu(IDDichVu)
);

CREATE table HopDongChiTiet(
	IDHopDongChiTiet int PRIMARY KEY AUTO_INCREMENT,
    IDHopDong INT,
    IDDichVuDiKem INT,
    SoLuong INT,
    FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem),
    FOREIGN KEY (IDHopDong) REFERENCES HopDong(IDHopDong)
);

INSERT INTO `caseStudy_module3`.`BoPhan` (`IDBoPhan`, `TenBoPhan`) VALUES ('1', 'quản lí'),('2', 'nhân viên'),('3', 'giám sát'),('4', 'kế toán');

INSERT INTO `caseStudy_module3`.`TrinhDo` (`IDTrinhDo`, `TrinhDo`) VALUES ('1', 'Tiến Sĩ'), ('2', 'Thạc Sĩ'), ('3', 'Cao Học'), ('4 ', 'Đại Học'), 
('5', 'Cao Đẳng'),('6', 'Trung Cấp'), ('7', 'Trung học phổ thông');

INSERT INTO `caseStudy_module3`.`ViTri` (`IDViTri`, `TenViTri`) VALUES ('1', 'Chủ tịch'),('2', 'Giám Đốc'), ('3', 'Trưởng phòng'),('4', 'Quản lí'),
('5', 'Kế toán'),('6', 'nhân viên');
 
INSERT INTO casestudy_module3.kieuthue ( `TenKieuThue`, `Gia`) VALUES ( 'Ngày', 1000000),('Tháng', 20000000);
INSERT INTO casestudy_module3.loaidichvu(`TenLoaiDichVu`) VALUES ('Villa'),('House'),('Room');

INSERT INTO `caseStudy_module3`.`LoaiKhach` (`IDLoaiKhach`, `TenKhach`) VALUES ('1', 'Vip'),('2','Siliver'),('3', 'Gold'),('4','Member');

INSERT INTO `caseStudy_module3`.`DichVuDiKem` (`IDDichVuDiKem`, `TenDichVuDiKem`, `Gia`, `DonVi`) VALUES ('1', 'Karaoke', '100000', '1'),
('2','Car','200000','2'),('3','Ho boi','200000','3');

INSERT INTO `caseStudy_module3`.`KhachHang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`) VALUES ('1', '1', 'Hue', '2001-03-31', '12321', '090554213', 'hovanhue@gmail.com'),
('2', '2', 'Hung', '2000-03-31', '12323121', '0343554213', 'nguyenvanhung@gmail.com'),('3', '4', 'Hue', '2001-03-31', '12321', '090554213', 'hovanhue@gmail.com');

INSERT INTO `caseStudy_module3`.`DichVu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguuoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`,`trangthai`) VALUES('1', 'Villa', '100', '2', '10', '100000', '1', '1','Trong'),('2', 'House', '100', '1', '10', '100000', '2', '2','Trong');


-- yêu cầu 2
SELECT * FROM casestudy_module3.nhanvien WHERE(HoTen LIKE 'h%' OR HoTen LIKE 'k%' OR HoTen LIKE 't%') and length(HoTen) < 15;

-- yêu cầu 3
SELECT * FROM casestudy_module3.khachhang WHERE DiaChi IN('Đà Nẵng' or 'Quảng  Trị') AND (curdate()-NgaySinh>(18*30*365) and curdate()-NgaySinh<(50*30*365));

-- yêu cầu 4
SELECT khachhang.hoten, count(hopdong. idkhachhang) as 'Số Lần Đặt'
from khachhang inner join hopdong on khachhang.idkhachhang = hopdong.idkhachhang
inner join loaikhach on khachhang.idloaikhach = loaikhach.idloaikhach where loaikhach.tenkhach = 'diamond'
GROUP BY khachhang.idkhachhang ORDER BY 'Số Lần Đặt';

-- yêu cầu 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, 
-- NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia,
--  với SoLuong và Giá là từ bảng DichVuDiKem)
--  cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra
 SELECT khachhang.idkhachhang, khachhang.hoten, loaikhach.tenkhach, hopdong.idhopdong, dichvu.tendichvu, hopdong.ngaylaphopdong, hopdong.ngayketthuc,
 sum(dichvu.chiphithue+hopdongchitiet.soluong*dichvudikem.gia) as TongTien FROM khachhang
 LEFT JOIN loaikhach on khachhang.idloaikhach = loaikhach.idloaikhach
 LEFT JOIN hopdong on khachhang.idkhachhang = hopdong.idkhachhang
 LEFT JOIN dichvu on hopdong.iddichvu = dichvu.iddichvu
 LEFT JOIN hopdongchitiet on hopdong.idhopdong = hopdongchitiet.idhopdong
 LEFT JOIN dichvudikem on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
 GROUP BY hopdong.idhopdong;
 
 -- yêu cầu 6
SELECT dichvu.iddichvu, dichvu.tendichvu, dichvu.dientich, dichvu.chiphithue, loaidichvu.tenloaidichvu
FROM dichvu
INNER JOIN loaidichvu on dichvu.iddichvu=loaidichvu.idloaidichvu
WHERE not EXISTS (SELECT hopdong.idhopdong from hopdong where (hopdong.ngaylaphopdong BETWEEN "2019-01-01" and "2019-03-31") and hopdong.iddichvu = dichvu.iddichvu);

-- yeu cau 7
-- Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các 
-- loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select dichvu.iddichvu, dichvu.tendichvu, dichvu.dientich, dichvu.songuoitoida, dichvu.chiphithue, loaidichvu.tenloaidichvu
from dichvu 
inner join loaidichvu on dichvu.iddichvu=loaidichvu.idloaidichvu 
where exists (select hopdong.idhopdong from hopdong where(hopdong.ngaylaphopdong) = "2018" and hopdong.iddichvu = dichvu.iddichvu)
and not exists (select hopdong.idhopdong from hopdong where(hopdong.ngaylaphopdong) = "201" and hopdong.iddichvu = dichvu.iddichvu);

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct khachhang.hoten from khachhang;
select khachhang.hoten from khachhang group by khachhang.hoten;
select khachhang.hoten from khachhang  union select khachhang.hoten from khachhang ;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select temp.month, count(month(hopdong.ngaylaphopdong)) as so_khach_hang_dang_ki, sum(hopdong.tongtien) as tong_tien
from(
	select 1 as month
	union select 2 as month
	union select 3 as month
	union select 4 as month
	union select 5 as month
	union select 6 as month
	union select 7 as month
	union select 8 as month
	union select 9 as month
	union select 10 as month
	union select 11 as month
	union select 12 as month) as temp
left join hopdong on month(hopdong.ngaylaphopdong) = temp.month
left join khachhang on khachhang.idkhachhang = hopdong.idkhachhang
where year(hopdong.ngaylaphopdong) ='2019' or year (hopdong.ngaylaphopdong) is null or year (hopdong.ngaylaphopdong)
group by temp.month

-- yeu cau 10
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hopdong.idhopdong, hopdong.ngaylaphopdong, hopdong.ngayketthuc, hopdong.tiendatcoc, count(hopdongchitiet.iddichvudikem) as So_luong_dich_vu_di_kem
from hopdong
inner join hopdongchitiet on hopdong.idhopdong = hopdongchitiet.idhopdong
group by hopdong.idhopdong;

-- yeu cau 11
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hà	ng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select distinct dichvudikem.tendichvudikem, dichvudikem.gia, dichvudikem.donvi from hopdong
inner join hopdongchitiet on hopdong.idhopdong = hopdongchitiet.idhopdong
inner join dichvudikem on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
inner join khachhang on khachhang.idkhachhang = hopdong.idkhachhang
inner join loaikhach on loaikhach.idloaikhach = khachhang.idloaikhach
where loaikhach.tenkhach="Diamond" and khachhang.diachi in ("Vinh","Quang Ngai");
