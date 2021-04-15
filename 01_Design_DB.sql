drop database if exists qlknd_furama;

create database qlknd_furama;

use qlknd_furama;

create table bo_phan (
	id_bophan int primary key,
    tenbophan varchar(45)
);

create table vi_tri (
	id_vitri int primary key,
    tenvitri varchar(45)
);

create table trinh_do (
	id_trinhdo int primary key,
    tentrinhdo varchar(45)
);

create table nhan_vien (
	id_nhanvien int primary key,
    hoten varchar(45),
    ngaysinh date,
    socmnd varchar(45),
    luong varchar(45),
    sdt varchar(45),
    email varchar(45),
    diachi varchar(45),
    id_vitri int,
    id_bophan int,
    id_trinhdo int,
    foreign key (id_vitri) references vi_tri (id_vitri),
    foreign key (id_bophan) references bo_phan (id_bophan),
    foreign key (id_trinhdo) references trinh_do (id_trinhdo)
);

create table loai_khach (
	id_loaikhach int primary key,
    tenloaikhach varchar(45)
);

create table khach_hang (
	id_khachhang int primary key,
    hoten varchar(45),
    ngaysinh date,
    socmnd varchar(45),
    sdt varchar(45),
    email varchar(45),
    diachi varchar(45),
    id_loaikhach int,
    foreign key (id_loaikhach) references loai_khach(id_loaikhach)
);

create table kieu_thue (
	id_kieuthue int primary key,
    tenkieuthue varchar(45),
    gia int
);

create table loai_dichvu (
	id_loaidichvu int primary key,
    tenloaidichvu varchar(45)
);

create table dich_vu (
	id_dichvu int primary key,
    tendichvu varchar(45),
    songuoitoida varchar(45),
    chiphithue varchar(45),
    trangthai varchar(45),
    sotang int,
    dientich int,
    id_kieuthue int,
    id_loaidichvu int,
    foreign key (id_kieuthue) references kieu_thue(id_kieuthue),
    foreign key (id_loaidichvu) references loai_dichvu(id_loaidichvu)
);

create table dichvu_dikem (
	id_dichvudikem int primary key,
    tendichvu varchar(45),
    gia int,
    donvi varchar(45)
);

create table hop_dong (
	id_hopdong int primary key,
    ngaylamhopdong date,
    ngayketthuc date,
    tiendatcoc int,
    tongtien int,
    id_dichvu int,
    id_khachhang int,
    id_nhanvien int,
	foreign key (id_dichvu) references dich_vu(id_dichvu),
    foreign key (id_nhanvien) references nhan_vien(id_nhanvien),
    foreign key (id_khachhang) references khach_hang(id_khachhang)
);
 
 create table hopdong_chitiet (
	id_hopdongchitiet int primary key,
    soluong int,
    id_dichvudikem int,
    id_hopdong int,
    foreign key (id_dichvudikem) references dichvu_dikem(id_dichvudikem),
    foreign key (id_hopdong) references hop_dong(id_hopdong)
);

insert into bo_phan (id_bophan, tenbophan)
values
('1','Sale-Marketing'),
('2','Hành Chính'),
('3','Phục Vụ'),
('4','Quản Lý');

insert into vi_tri (id_vitri, tenvitri)
values
('1','Lễ Tân'),
('2','Phục Vụ'),
('3','Chuyên Viên'),
('4','Giám Sát'),
('5','Quản Lý'),
('6','Giám Đốc');

insert into trinh_do(id_trinhdo, tentrinhdo)
values
('1','Trung Cấp'),
('2','Cao Đẳng'),
('3','Đại Học');

insert into nhan_vien(id_nhanvien, hoten, id_vitri, id_bophan, id_trinhdo, ngaysinh, socmnd, luong, sdt, email, diachi)
values
('1','Nguyễn Văn Tùng','1','2','3','1991-04-12','2059348','20000000','0439586755','tung@gmail.com','Đà Nẵng'),
('2','Võ Sơn Kim','2','3','1','1993-05-23','2052248','7000000','0487586755','kim@gmail.com','Quảng Trị'),
('3','Trương Thị Hiền','3','1','2','1990-03-12','2099348','25000000','0212238954','hien@gmail.com','Vinh'),
('4','Nguyễn Văn Quý','4','4','2','1988-04-02','2059348','30000000','0439094311','quy@gmail.com','Đà Nẵng'),
('5','Trần Phước Ken','5','4','2','1991-04-07','2059348','26000000','03543328891','ken@gmail.com','Quảng Ngãi'),
('6','Lê Bình','6','4','3','1982-05-01','2059348','40000000','0438768675','binh@gmail.com','Quảng Nam');

insert into loai_khach(id_loaikhach, tenloaikhach)
values
('1','Diamond'),
('2','Platinium'),
('3','Gold'),
('4','Silver'),
('5','Member');

insert into khach_hang(id_khachhang, hoten, ngaysinh, socmnd, sdt, email, diachi, id_loaikhach)
values
('1','Nguyễn Thị Kiều','1998-09-21','2390943','0438574938','kieu@gmail.com','Đà Nẵng','1'),
('2','Nguyễn Văn Tâm','1943-04-20','2390943','0436774938','tam@gmail.com','Quãng Ngãi','5'),
('3','Nguyễn Hưng','1991-04-05','2390943','0434574938','hung1@gmail.com','Đà Nẵng','3'),
('4','Nguyễn Thị','2006-01-21','2390943','04333374938','thi@gmail.com','Quảng Bình','4');

insert into kieu_thue(id_kieuthue, tenkieuthue, gia)
values
('1','giờ','50000'),
('2','ngày','150000'),
('3','tháng','5000000'),
('4','năm','10000000');

insert into loai_dichvu(id_loaidichvu, tenloaidichvu)
values
('1','Villa'),
('2','Home'),
('3','Room');

insert into dich_vu(id_dichvu, tendichvu, songuoitoida, chiphithue, trangthai, sotang, dientich, id_kieuthue, id_loaidichvu)
values
('1','Villa','bảy','15000000','còn','3','9','3','1'),
('2','House','năm','1500000','còn','2','6','2','2'),
('3','Room','hai','150000','còn','1','5','1','3');

insert into dichvu_dikem(id_dichvudikem, tendichvu, gia, donvi)
values
('1','Thức Uống','10000','chai'),
('2','Karaoke','100000','tiếng'),
('3','Massage','400000','phòng');

insert into hop_dong(id_hopdong, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien, id_dichvu, id_khachhang, id_nhanvien)
values
('1','2021-04-18','2021-04-23','1000000','15000000','1','2','1'),
('2','2021-04-19','2021-04-25','1000000','5000000','1','1','3');

insert into hopdong_chitiet(id_hopdongchitiet, soluong, id_dichvudikem, id_hopdong)
values
('1','1','2','2'),
('2','2','1','1');

