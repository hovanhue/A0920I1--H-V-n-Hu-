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

INSERT INTO casestudy_module3.nhanvien(`HoTen`,`idvitri`,`idtrinhdo`,`idbophan`,`ngaysinh`,`socmnd`,`luong`,`sdt`,`email`,`diachi`) VALUES ('Nguyễn Văn Linh',1,1,1,'2000-01-01','123456761','30000.0','113313123','hodas@gmail.com','Đà nẵng');
INSERT INTO casestudy_module3.nhanvien(`HoTen`,`idvitri`,`idtrinhdo`,`idbophan`,`ngaysinh`,`socmnd`,`luong`,`sdt`,`email`,`diachi`) VALUES ('Lê Hồng Phong',2,2,2,'2000-01-01','123456761','30000.0','113313123','hodas@gmail.com','Đà nẵng');
INSERT INTO casestudy_module3.nhanvien(`HoTen`,`idvitri`,`idtrinhdo`,`idbophan`,`ngaysinh`,`socmnd`,`luong`,`sdt`,`email`,`diachi`) VALUES ('Bạch Đằng',3,3,3,'2000-01-01','123456761','30000.0','113313123','hodas@gmail.com','Đà nẵng');
INSERT INTO casestudy_module3.kieuthue ( `TenKieuThue`, `Gia`) VALUES ( 'Ngày', 1000000),('Tháng', 20000000);
INSERT INTO casestudy_module3.loaidichvu(`TenLoaiDichVu`) VALUES ('Villa'),('House'),('Room');
INSERT INTO casestudy_module3.dichvu (`TenDichVu`, `DienTich`, `SoTang`, `SoNguuoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('Villa', '10', '2', '10', '100', '1', '1', 'đã đặt');
INSERT INTO casestudy_module3.dichvu (`TenDichVu`, `DienTich`, `SoTang`, `SoNguuoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('House', '10', '2', '10', '100', '2', '2', 'đã đặt');
INSERT INTO casestudy_module3.dichvu (`TenDichVu`, `DienTich`, `SoTang`, `SoNguuoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('Room', '10', '2', '10', '100', '1', '2', 'đã đặt');
INSERT INTO casestudy_module3.dichvu (`TenDichVu`, `DienTich`, `SoTang`, `SoNguuoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('Villa', '10', '2', '10', '100', '2', '1', 'đã đặt');

INSERT INTO `casestudy_module3`.`hopdong` (`IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLapHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('1', '2', '2', '2021-10-03', '2021-03-12', '1000', '2000');
INSERT INTO `casestudy_module3`.`hopdong` (`IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLapHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('1', '3', '3', '2021-10-03', '2021-03-12', '1000', '2000');
INSERT INTO `casestudy_module3`.`hopdong` (`IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLapHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('2', '5', '4', '2021-10-03', '2021-03-12', '1000', '2000');
INSERT INTO `casestudy_module3`.`hopdong` (`IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLapHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('3', '4', '5', '2021-10-03', '2021-03-12', '1000', '2000');
INSERT INTO `casestudy_module3`.`hopdong` (`IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLapHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('1', '2', '2', '2021-10-03', '2021-03-12', '1000', '2000');
INSERT INTO `casestudy_module3`.`hopdong` (`IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLapHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('1', '1', '2', '2021-10-03', '2021-03-12', '1000', '2000');
INSERT INTO `casestudy_module3`.`dichvudikem` (`TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('karaoke', '1000', 1, 'trong');
INSERT INTO `casestudy_module3`.`dichvudikem` (`TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('ăn uống', '1000', 2, 'trong');
INSERT INTO `casestudy_module3`.`dichvudikem` (`TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('thue xe', '1000', 3, 'trong');

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



